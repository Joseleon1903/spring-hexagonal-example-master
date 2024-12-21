package com.unipago.unisigma.usecase.tasks.impl;

import com.unipago.unisigma.usecase.tasks.local.IControlador;
import com.unipago.unisigma.usecase.tasks.local.IProceso;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;
import com.unipago.unisigma.usecase.tasks.proceso.SolicitudIntercambioInformacion;
import com.unipago.unisigma.usecase.tasks.util.ControladorProcesos;
import com.unipago.unisigma.usecase.tasks.util.Proceso;
import com.unipago.unisigma.usecase.tasks.util.PublicarInformacionFactory;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.PublicarInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;


public class PublicarInformacionTSImpl implements PublicarInformacionTS{

	private IntercambioInformacionES intercambioInformacionES;

	private EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

	private SolicitudServicioES solicitudServicioES;

	private ServicioSistemaES servicioES;

	private BitacoraEventoES bitacoraEventoUS;

	private NotificacionES notificacionUS;

	private ParametroES parametroES;

	private MotivoEstadoES motivoEstadoES;

	private UsuarioES usuarioES;

	public PublicarInformacionTSImpl(IntercambioInformacionES intercambioInformacionES, EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES, SolicitudServicioES solicitudServicioES, ServicioSistemaES servicioES, BitacoraEventoES bitacoraEventoUS, NotificacionES notificacionUS, ParametroES parametroES, MotivoEstadoES motivoEstadoES, UsuarioES usuarioES) {
		this.intercambioInformacionES = intercambioInformacionES;
		this.ejecucionIntercambioInformacionES = ejecucionIntercambioInformacionES;
		this.solicitudServicioES = solicitudServicioES;
		this.servicioES = servicioES;
		this.bitacoraEventoUS = bitacoraEventoUS;
		this.notificacionUS = notificacionUS;
		this.parametroES = parametroES;
		this.motivoEstadoES = motivoEstadoES;
		this.usuarioES = usuarioES;
	}

	@Override
	public void publicarInformacion(PublicarInformacion solicitud) {

		System.out.println("solicitud"+ solicitud);
		
		try{
			IControlador controlador = new ControladorProcesos();
			System.out.println("Obteniendo el proceso...");
			IProceso proceso = PublicarInformacionFactory.obtenerInstaciaProceso(Proceso.PROCESAR_ENVIO_INFORMACION, PublicarInformacionFactory.obtenerInstaciaReglas());
			
			System.out.println("Instaciando el contexto de data...");
			String codigoUsuario = "UNISIGMA";//HandlerChainHelper.obtenerDatosUsuario(sesionContext).getCodigoUsuario();



			ContextData context = new ContextData(new SolicitudIntercambioInformacion(solicitud.getServicioId(), solicitud.getParametrosEjecucion(), codigoUsuario));
			
			System.out.println("Instanciando el services context...");
			ServiciosContext serviceContext = new ServiciosContext().setBitacoraEventoUS(bitacoraEventoUS).setEjecucionIntercambioInformacionES(ejecucionIntercambioInformacionES)
					.setIntercambioInformacionES(intercambioInformacionES).setNotificacionUS(notificacionUS)
					.setParametroES(parametroES).setServicioSistemaES(servicioES).setSolicitudServicioUS(solicitudServicioES).setMotivoEstadoES(motivoEstadoES).setUsuarioES(usuarioES);
			
			
			System.out.println("Ejecutando el proceso...");
			controlador.ejecutarProceso(proceso, context, serviceContext);
			System.out.println("Proceso ejecutado exitosamente!");
			
		}catch(InternalServiceException e){
			System.out.println("Error irrecuperable !"+e);
		}
	}
}
