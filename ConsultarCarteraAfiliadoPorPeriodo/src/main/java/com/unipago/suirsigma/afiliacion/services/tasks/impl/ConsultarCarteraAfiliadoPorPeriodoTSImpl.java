package com.unipago.suirsigma.afiliacion.services.tasks.impl;

import com.unipago.suirsigma.afiliacion.services.tasks.util.ConsultarCarteraAfiliadoPorPeriodoTSUtil;
import com.unipago.suirsigma.afiliacion.services.tasks.exception.DatoRequeridoNoProporcionadoException;
import com.unipago.suirsigma.afiliacion.services.tasks.exception.ServicesFault;
import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodoType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponseType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponseType;
import gs.hexagonaldemo.springhexagonaldemo.utils.ParametrosUSConstantes;
import gs.hexagonaldemo.springhexagonaldemo.utils.ValidationUtil;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class ConsultarCarteraAfiliadoPorPeriodoTSImpl {

	private CarteraAfiliadoES carteraAfiliadoES;	
	
	private ParametroES parametroES;
	
	private EjecucionConsultaES ejecucionConsultaES;
	
	private ContactoES contactoES;
	
	private UsuarioES usuarioES;

	private TipoEntidadES tipoEntidadES;


	public ConsultarCarteraAfiliadoPorPeriodoTSImpl(TipoEntidadES tipoEntidadES, CarteraAfiliadoES carteraAfiliadoES, ContactoES contactoES, EjecucionConsultaES ejecucionConsultaES, ParametroES parametroES, UsuarioES usuarioES) {
		this.carteraAfiliadoES = carteraAfiliadoES;
		this.contactoES = contactoES;
		this.ejecucionConsultaES = ejecucionConsultaES;
		this.parametroES = parametroES;
		this.usuarioES = usuarioES;
		this.tipoEntidadES = tipoEntidadES;
	}

	public ConsultarCarteraAfiliadoPorPeriodoResponseType consultarCarteraAfiliadoPorPeriodo(
			ConsultarCarteraAfiliadoPorPeriodoType consultarCarteraAfiliadoPorPeriodoInput) {
		System.out.println("consultarCarteraAfiliadoPorPeriodo()");
		System.out.println("consultarCarteraAfiliadoPorPeriodoInput: " + consultarCarteraAfiliadoPorPeriodoInput);

		String datosUsuario = "UNISIGMA";
		System.out.println("Header datosUsuario : " + datosUsuario);

		Entidad entidad = new Entidad();
		Integer cantidadRegistrosParticion = null;
		System.out.println("Caller Principal: " + datosUsuario);
		List<MotivoEstado> listaMotivoEstado = new ArrayList<>();
		LocalDate fechaInicio = LocalDate.now();
		Integer usuarioId = null;
		Short seguroId = null;


		try {

			usuarioId = usuarioES.buscarUsuarioPorCodigo(datosUsuario, null).get().getUsuarioId();
			entidad = contactoES.buscarEntidadContactoPorCodigoUsuario(datosUsuario);
			seguroId = tipoEntidadES.buscarTipoEntidadPorId(entidad.getTipoEntidadId()).get().getSeguroId();

			if (ValidationUtil.validateNotNull(consultarCarteraAfiliadoPorPeriodoInput)
					|| ValidationUtil.validateEmtpyInteger(consultarCarteraAfiliadoPorPeriodoInput.getPeriodo(),
					consultarCarteraAfiliadoPorPeriodoInput.getIndice())) {
				System.out.println("Existen datos requeridos no proporcionados");
				listaMotivoEstado.add(new MotivoEstado(DatoRequeridoNoProporcionadoException.CODIGO, DatoRequeridoNoProporcionadoException.DESCRIPCION));
				throw new ServicesFault(DatoRequeridoNoProporcionadoException.CODIGO, DatoRequeridoNoProporcionadoException.DESCRIPCION);
			}

			Parametro response = parametroES.buscarValorParametro(ParametrosUSConstantes.Parametros.CANTIDAD_MAXIMA_REGISTROS_CONSULTA, entidad.getEntidadId(), ParametrosUSConstantes.Servicios.CONSULTAR_CARTERA_DE_AFILIADOS_POR_PERIODO);
			cantidadRegistrosParticion = Integer.valueOf(response.getValor());


			ConsultarCarteraAfiliadoPorPeriodoResponseType output = new ConsultarCarteraAfiliadoPorPeriodoResponseType();
			BuscarCarteraAfiliadosPorEntidadPeriodoResponseType buscarCarteraAfiliadosPorEntidadPeriodoOutput = null;


			buscarCarteraAfiliadosPorEntidadPeriodoOutput = carteraAfiliadoES.buscarCarteraAfiliadosPorEntidadPeriodo(entidad.getEntidadId(), consultarCarteraAfiliadoPorPeriodoInput.getPeriodo(),
					consultarCarteraAfiliadoPorPeriodoInput.getEstadoAfiliacion(), consultarCarteraAfiliadoPorPeriodoInput.getIndice(), cantidadRegistrosParticion);

			output.setRegistrosRestantes(buscarCarteraAfiliadosPorEntidadPeriodoOutput.getRegistrosRestantes());


			output.getRespuestaCarteraAfiliados().addAll(ConsultarCarteraAfiliadoPorPeriodoTSUtil.generarRespuestaPorSeguro(seguroId, entidad.getRegimenId(), buscarCarteraAfiliadosPorEntidadPeriodoOutput.getRespuestaCarteraAfiliados()));

			return output;

		}catch (Exception ex){
			System.out.println(ex.getMessage());
			listaMotivoEstado.add(new MotivoEstado(ParametrosUSConstantes.Motivos.ERROR_INTERNO_DEL_SERVICIO));
		}finally {
			ConsultarCarteraAfiliadoPorPeriodoTSUtil
					.obtenerInstancia(ejecucionConsultaES)
					.registrarEjecucionConsulta(usuarioId, fechaInicio, LocalDate.now(), entidad.getEntidadId(),
							ParametrosUSConstantes.Servicios.CONSULTAR_CARTERA_DE_AFILIADOS_POR_PERIODO,
							consultarCarteraAfiliadoPorPeriodoInput.getPeriodo(),
							consultarCarteraAfiliadoPorPeriodoInput.getIndice(),
							consultarCarteraAfiliadoPorPeriodoInput.getEstadoAfiliacion(),
							listaMotivoEstado);
			System.out.println("exiting consultarCarteraAfiliadoPorPeriodo...");

		}
        return null;
    }
}