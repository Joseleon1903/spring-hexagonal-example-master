package com.unipago.unisigma.usecase.tasks.reglas;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.GenerarSolicitudNotificacionType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.ParametroGeneracionSolicitudNotificacionType;
import gs.hexagonaldemo.springhexagonaldemo.utils.ParametrosUSConstantes;
import gs.hexagonaldemo.springhexagonaldemo.utils.ValidationUtil;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;


public class ReglasPublicarInformacion extends AbstractReglasIntercambioInformacion {


	@Override
	public void registrarBitacora() {
		BitacoraEvento bitacora = new BitacoraEvento();
		
		bitacora.setDireccionIp(ParametrosUSConstantes.DIRECCION_IP_LOCAL);
		bitacora.setFecha(LocalDate.now());
		bitacora.setUsuarioId(ParametrosUSConstantes.USUARIO_SISTEMA);
		bitacora.setServicioId(ParametrosUSConstantes.Servicios.PUBLICAR_INFORMACION_MASIVA);
		StringBuffer descripcion = new StringBuffer();
		
		if(ValidationUtil.validateNotNull(contextData.getIntercambio()) || !ValidationUtil.validateNullOrEmtpyStrings(contextData.getMensajeErrorInternoProceso())){
			descripcion.append("La solicitud de envio de informacion para el ID ").append(contextData.getSolicitud().getServicioId()).append(" genero el error ");
			String descripcionError = "ERROR INESPERADO EN EL SERVICIO";
			if(ValidationUtil.isNullOrEmptyList(contextData.getMotivos()) && !ValidationUtil.validateNullOrEmtpyStrings(contextData.getMensajeErrorInternoProceso())){
				descripcionError = contextData.getMensajeErrorInternoProceso().length() <= 400 ? contextData.getMensajeErrorInternoProceso() : contextData.getMensajeErrorInternoProceso().substring(0,400);
			}else{
				descripcionError = contextData.getMotivos().get(0) + "-" + obtenerDescripcionMotivo(contextData.getMotivos().get(0));
			}
			descripcion.append(descripcionError);
		}else{
			descripcion.append("El envio de informacion ").append(contextData.getIntercambio().getEsquema()).append(".").append(contextData.getIntercambio().getNombre()).append(" genero el error ");
			descripcion.append(contextData.getMotivos().get(0)).append("-").append(obtenerDescripcionMotivo(contextData.getMotivos().get(0)));
		}
		
		bitacora.setDescripcion(descripcion.toString());
		bitacora.setTipoEventoId(ParametrosUSConstantes.TipoEventoSistema.RESULTADO_FALLIDO);
		
		System.out.println("Registrando bitacora..");
		serviciosContext.getBitacoraEventoUS().registrarBitacora(bitacora);
		System.out.println("Exiting");
	}

	@Override
	public void enviarNotificacion() {
		System.out.println("Entering");
		GenerarSolicitudNotificacionType solicitud = new GenerarSolicitudNotificacionType();
		List<ParametroGeneracionSolicitudNotificacionType> parametros = new ArrayList<>();
		
		if(!ValidationUtil.validateNotNull(contextData.getIntercambio())){

			String codigoError = String.valueOf("1607");
			String descripcionError = "Error interno del servicio";

			if(!ValidationUtil.isNullOrEmptyList(contextData.getMotivos())){
				codigoError = contextData.getMotivos().get(0).toString();
				descripcionError = obtenerDescripcionMotivo(contextData.getMotivos().get(0));
			}
			
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.FECHA_HORA, new SimpleDateFormat(ParametrosUSConstantes.Formatos.FORMATO_NOTIFICACION).format(new Date())));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.ESQUEMA_INTERCAMBIO,contextData.getIntercambio().getEsquema()));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.NOMBRE_INTERCAMBIO_INFORMACION, contextData.getIntercambio().getNombre()));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.DESCRIPCION_INTERCAMBIO_INFORMACION, contextData.getIntercambio().getDescripcion()));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.CODIGO_ERROR, codigoError));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.DESCRIPCION_ERROR, descripcionError));
			solicitud.setTipoNotificacionId(ParametrosUSConstantes.TipoNotificacion.FALLIDA);
			
		}else{
			//Parametro y defincion para cuando el intercambio informacion no esta catalogado.
			solicitud.setTipoNotificacionId(ParametrosUSConstantes.TipoNotificacion.ADVERTENCIA);
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.FECHA_HORA, new SimpleDateFormat(ParametrosUSConstantes.Formatos.FORMATO_NOTIFICACION).format(new Date())));
			parametros.add(new ParametroGeneracionSolicitudNotificacionType(ParametrosUSConstantes.ParametrosNotificacion.CODIGO_INTERCAMBIO_INFORMACION, String.valueOf(contextData.getSolicitud().getServicioId())));
		}
		solicitud.getParametrosSolicitudNotificacion().addAll(parametros);
		solicitud.setServicioId(ParametrosUSConstantes.Servicios.PUBLICAR_INFORMACION_MASIVA);
		solicitud.setEntidadId(ParametrosUSConstantes.Entidades.ENTIDAD_UNIPAGO);
		
		System.out.println("Enviando Solicitud de Notificacion..");
		serviciosContext.getNotificacionUS().generarSolicitudNotificacion(solicitud);

		System.out.println("Exiting PublicarInformacionTS.enviarNotificacion()");
		
	}

	@Override
	public String obtenerNombreCola()  {
		System.out.println("Entering");
		System.out.println("Buscando el nombre de la cola de recibir informacion...");
		Optional<ServicioSistema> servicio = Optional.of(serviciosContext.getServicioES().buscarServicioPorId(ParametrosUSConstantes.Servicios.PUBLICAR_INFORMACION_MASIVA).get());
		String nombreCola = servicio.get().getNombreCola();
		System.out.println("Se obtuvo el nombre: " + nombreCola);
		System.out.println("Exiting");
		return nombreCola;
	}

	@Override
	public short obtenerTipoIntercambio() {
		System.out.println("Entering obtenerTipoIntercambio");

		System.out.println("Exiting obtenerTipoIntercambio");
		return ParametrosUSConstantes.TipoIntercambioInformacion.ENVIAR_INFORMACION;
	}
	
	protected String obtenerDescripcionMotivo(int motivoId){
		System.out.println("Entering obtenerDescripcionMotivo");
		String descripcion = "";
	    System.out.println("Buscando el motivo...");
		descripcion = serviciosContext.getMotivoEstadoES().buscarMotivoEstadoPorId(motivoId).get().getDescripcion();
		System.out.println("Descripcon obtenida: " + descripcion );
		return descripcion;
	}
}
