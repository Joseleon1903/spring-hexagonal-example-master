package com.unipago.suirsigma.afiliacion.services.tasks.util;


import com.unipago.suirsigma.afiliacion.services.tasks.adapter.out.*;
import com.unipago.suirsigma.afiliacion.services.tasks.exception.DatoRequeridoNoProporcionadoException;
import com.unipago.suirsigma.afiliacion.services.tasks.exception.ServicesFault;
import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaCarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.FechaES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.DetalleCarteraAfiliadoPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.utils.ParametrosUSConstantes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class ConsultarCarteraAfiliadoPorPeriodoTSUtil {


	private FechaES fechaUS;
	private EjecucionConsultaES ejecucionConsultaES;

	private ConsultarCarteraAfiliadoPorPeriodoTSUtil(FechaES fechaUS) {
		this.fechaUS = fechaUS;
	}

	private ConsultarCarteraAfiliadoPorPeriodoTSUtil(EjecucionConsultaES ejecucionConsultaES) {
		this.ejecucionConsultaES = ejecucionConsultaES;
	}

	public static ConsultarCarteraAfiliadoPorPeriodoTSUtil obtenerInstancia(FechaES fechaUS) {
		return new ConsultarCarteraAfiliadoPorPeriodoTSUtil(fechaUS);
	}

	public static ConsultarCarteraAfiliadoPorPeriodoTSUtil obtenerInstancia(EjecucionConsultaES ejecucionConsultaES) {
		return new ConsultarCarteraAfiliadoPorPeriodoTSUtil(ejecucionConsultaES);
	}

	public boolean aplicarValidacionesAlPeriodo(Integer periodo, Integer periodoMinimoPermitido, List<MotivoEstado> listaMotivoEstado) throws ServicesFault {
		
		if (!fechaUS.esPeriodoValido(periodo).isEsPeriodoValido()) {
			System.out.println("Periodo proporcionado es invalido.");
			listaMotivoEstado.add(new MotivoEstado(ParametrosUSConstantes.Motivos.EXISTEN_DATOS_REQUERIDOS_NO_PROPORCIONADOS));
			throw new ServicesFault(ParametrosUSConstantes.Motivos.PERIODO_PROPORCIONADO_INVALIDO, "EL PERIODO PROPORCIONADO ES INVALIDO");
		}

		if (periodo.compareTo(periodoMinimoPermitido) < 0) {
			System.out.println("Periodo proporcionado es mayor al periodo corriente.");
			listaMotivoEstado.add(new MotivoEstado(ParametrosUSConstantes.Motivos.EXISTEN_DATOS_REQUERIDOS_NO_PROPORCIONADOS));
			throw new ServicesFault(ParametrosUSConstantes.Motivos.EL_ANIO_CONTENIDO_EN_EL_PERIODO_PROPORCIONADO_DEBE_SER_MAYOR_AL_2002, "EL A�O CONTENIDO EN EL PERIODO PROPORCIONADO DEBE SER MAYOR AL 2002");
		}

		if (periodo.compareTo(fechaUS.buscarPeriodoCorriente(null)) > 0) {
			System.out.println("Periodo proporcionado es mayor al periodo corriente.");
			listaMotivoEstado.add(new MotivoEstado(ParametrosUSConstantes.Motivos.EXISTEN_DATOS_REQUERIDOS_NO_PROPORCIONADOS));
			throw new ServicesFault(ParametrosUSConstantes.Motivos.PERIODO_PROPORCIONADO_NO_PUEDE_SER_MAYOR_AL_CORRIENTE, "EL PERIODO PROPORCIONADO NO PUEDE SER MAYOR AL PERIODO CORRIENTE");
		}
		return Boolean.TRUE;
	}

	public void registrarEjecucionConsulta(Integer usuarioId, LocalDateTime fechaInicio , LocalDateTime fechaFin, Integer entidadId, int servicioId, Integer periodo, Integer indice, String estadoAfiliacion, List<MotivoEstado> listaMotivoEstado) {
		
		String criterios = "{ periodo: " + periodo + ", estadoAfiliacion: " + estadoAfiliacion + ", indice: " + indice + " }";
		System.out.println("criterios: "+criterios);
		EjecucionConsulta ejecucionConsulta = new EjecucionConsulta(null, entidadId, usuarioId,servicioId, fechaInicio,
				 fechaFin, criterios,
				(listaMotivoEstado != null && listaMotivoEstado.isEmpty()) ?
						ParametrosUSConstantes.Estados.ESTADO_OK : ParametrosUSConstantes.Estados.ESTADO_RE
						, listaMotivoEstado.stream()
				.map(MotivoEstado::getMotivoId) // Transformar Persona en su edad
				.collect(Collectors.toList()));
		try {
			ejecucionConsultaES.registrarEjecucionConsulta(ejecucionConsulta);
		} catch (DatoRequeridoNoProporcionadoException e1) {
			System.out.println("No se pudo guardar registro de ejecucion consulta. "+e1.getMessage());
		}
		
	}

	public static List<RespuestaCarteraAfiliado> generarRespuestaPorSeguro(Short seguroId, Short regimenId, List<DetalleCarteraAfiliadoPeriodo> detallesCartera) {

		System.out.println("Generar respuesta seguro");
		System.out.println("seguroId: "+seguroId);
		System.out.println("regimenId: "+regimenId);
		System.out.println("detallesCartera: "+detallesCartera);

		if (detallesCartera == null) {
			return Collections.emptyList();
		}
		
		List<RespuestaCarteraAfiliado> respuestaCartera = new ArrayList<>();
		for (DetalleCarteraAfiliadoPeriodo detalle : detallesCartera) {
			respuestaCartera.add(crearRespuestaCartera(seguroId,regimenId, detalle));		
		}		
		return respuestaCartera;
	}

	public static RespuestaCarteraAfiliado crearRespuestaCartera(Short seguroId,Short regimenId, DetalleCarteraAfiliadoPeriodo detalle) {
		RespuestaCarteraAfiliado respuesta = inicializarRespuestaCartera(seguroId, regimenId,detalle);
		return completarRespuestaCartera(seguroId,regimenId, respuesta, detalle); 
	}

	public static RespuestaCarteraAfiliado inicializarRespuestaCartera(Short seguroId,Short regimenId, DetalleCarteraAfiliadoPeriodo detalle) {
		RespuestaCarteraAfiliado respuesta = obtenerInstanciaPorSeguro(seguroId,regimenId);
		respuesta.setSolicitudId(detalle.getSolicitudId());
		respuesta.setNss(detalle.getNss());
		respuesta.setNombre(detalle.getNombre());
		respuesta.setPrimerApellido(detalle.getPrimerApellido());
		respuesta.setEstadoAfiliacion(detalle.getEstadoAfiliacion());
		respuesta.setMotivoEstadoId(detalle.getMotivoEstadoId());
		respuesta.setFechaEfectividadAfiliacion(detalle.getFechaEfectividadAfiliacion());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(Short seguroId, Short regimenId, RespuestaCarteraAfiliado respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		switch (seguroId) {
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_PENSIONES:
				return completarRespuestaCartera((RespuestaCarteraAfiliadoAFP) respuesta, detalle);
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_SALUD:
				if (regimenId.equals(ParametrosUSConstantes.Regimenes.CONTRIBUTIVO)) {
					return completarRespuestaCartera((RespuestaCarteraAfiliadoARSContributivo) respuesta, detalle);
				}else if (regimenId.equals(ParametrosUSConstantes.Regimenes.SUBSIDIADO)) {
					return completarRespuestaCartera((RespuestaCarteraAfiliadoARSSubsidiado) respuesta, detalle);
				}else if(regimenId.equals(ParametrosUSConstantes.Regimenes.PENSIONADOS)){
					return completarRespuestaCartera((RespuestaCarteraAfiliadoARSPensionados) respuesta, detalle);
				}
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_ESTANCIAS_INFANTILES:
				return completarRespuestaCartera((RespuestaCarteraAfiliadoAEISS) respuesta, detalle);
		}		
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(RespuestaCarteraAfiliadoAFP respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		respuesta.setCedula(detalle.getCedula());
		respuesta.setNumeroContrato(detalle.getNumeroContrato());
		respuesta.setFechaNacimiento(detalle.getFechaNacimiento());
		respuesta.setGenero(detalle.getGenero());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(RespuestaCarteraAfiliadoARSContributivo respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		respuesta.setTipoAfiliado(detalle.getTipoAfiliado());
		respuesta.setTipoDependiente(detalle.getTipoDependiente());
		respuesta.setParentescoId(detalle.getParentescoId());
		respuesta.setCedula(detalle.getCedula());
		respuesta.setNui(detalle.getNui());
		respuesta.setActaNacimiento(detalle.getActaNacimiento());
		respuesta.setNumeroDocumentoIdentificacionExtranjero(detalle.getNumeroDocumentoIdentificacionExtranjero());
		respuesta.setExtranjero(detalle.getExtranjero());
		respuesta.setNacionalidadId(detalle.getNacionalidadId());
		respuesta.setNssTitular(detalle.getNssTitular());
		respuesta.setCedulaTitular(detalle.getCedulaTitular());
		respuesta.setNumeroContrato(detalle.getNumeroContrato());
		respuesta.setEstudiante(detalle.getEstudiante());
		respuesta.setDiscapacitado(detalle.getDiscapacitado());
		respuesta.setFechaNacimiento(detalle.getFechaNacimiento());
		respuesta.setGenero(detalle.getGenero());
		respuesta.setFechaEfectividadAfiliacion(detalle.getFechaEfectividadAfiliacion());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(RespuestaCarteraAfiliadoAEISS respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		respuesta.setTipoDependiente(detalle.getTipoDependiente());
		respuesta.setParentescoId(detalle.getParentescoId());
		respuesta.setNui(detalle.getNui());
		respuesta.setActaNacimiento(detalle.getActaNacimiento());
		respuesta.setNssTitular(detalle.getNssTitular());
		respuesta.setCedulaTitular(detalle.getCedulaTitular());
		respuesta.setClaveEstanciaInfantil(detalle.getClaveEstanciaInfantil());
		//agregando nuevos campo orden 23
		respuesta.setExcluirConsolidado(detalle.getExcluirConsolidado());
		respuesta.setFechaNacimiento(detalle.getFechaNacimiento());
		respuesta.setGenero(detalle.getGenero());
		respuesta.setParentescoId(detalle.getParentescoId());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(RespuestaCarteraAfiliadoARSSubsidiado respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		respuesta.setTipoAfiliado(detalle.getTipoAfiliado());
		respuesta.setTipoDependiente(detalle.getTipoDependiente());
		respuesta.setParentescoId(detalle.getParentescoId());
		respuesta.setCedula(detalle.getCedula());
		respuesta.setNui(detalle.getNui());
		respuesta.setActaNacimiento(detalle.getActaNacimiento());
		respuesta.setNacionalidadId(detalle.getNacionalidadId());
		respuesta.setNssTitular(detalle.getNssTitular());
		respuesta.setCedulaTitular(detalle.getCedulaTitular());
		respuesta.setNumeroContrato(detalle.getNumeroContrato());
		//agregando nuevos campo orden 23
		respuesta.setEstudiante(detalle.getEstudiante());
		respuesta.setDiscapacitado(detalle.getDiscapacitado());
		respuesta.setFechaNacimiento(detalle.getFechaNacimiento());
		respuesta.setGenero(detalle.getGenero());
		respuesta.setFechaEfectividadAfiliacion(detalle.getFechaEfectividadAfiliacion());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado completarRespuestaCartera(RespuestaCarteraAfiliadoARSPensionados respuesta, DetalleCarteraAfiliadoPeriodo detalle) {
		respuesta.setTipoAfiliado(detalle.getTipoAfiliado());
		respuesta.setTipoDependiente(detalle.getTipoDependiente());
		respuesta.setParentescoId(detalle.getParentescoId());
		respuesta.setCedula(detalle.getCedula());
		respuesta.setNui(detalle.getNui());
		respuesta.setActaNacimiento(detalle.getActaNacimiento());
		respuesta.setNacionalidadId(detalle.getNacionalidadId());
		respuesta.setNssTitular(detalle.getNssTitular());
		respuesta.setCedulaTitular(detalle.getCedulaTitular());
		respuesta.setNumeroContrato(detalle.getNumeroContrato());
		//agregando nuevos campo orden 23
		respuesta.setInstitucionPensionadoId(detalle.getInstitucionPensionadoId());
		respuesta.setEstudiante(detalle.getEstudiante());
		respuesta.setDiscapacitado(detalle.getDiscapacitado());
		respuesta.setFechaNacimiento(detalle.getFechaNacimiento());
		respuesta.setGenero(detalle.getGenero());
		respuesta.setFechaEfectividadAfiliacion(detalle.getFechaEfectividadAfiliacion());
		return respuesta;
	}

	public static RespuestaCarteraAfiliado obtenerInstanciaPorSeguro(Short seguroId,Short regimenId) {
		switch (seguroId) {
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_PENSIONES:
				return new RespuestaCarteraAfiliadoAFP();
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_SALUD:
				if (regimenId.equals(ParametrosUSConstantes.Regimenes.CONTRIBUTIVO)) {
					return new RespuestaCarteraAfiliadoARSContributivo();
				}else if (regimenId.equals(ParametrosUSConstantes.Regimenes.SUBSIDIADO)) {
					return new RespuestaCarteraAfiliadoARSSubsidiado();
				}
				return new RespuestaCarteraAfiliadoARSPensionados();
			case ParametrosUSConstantes.Seguros.ID_SEGURO_DE_ESTANCIAS_INFANTILES:
				return new RespuestaCarteraAfiliadoAEISS();
		}
		return null;
	}
	
}
