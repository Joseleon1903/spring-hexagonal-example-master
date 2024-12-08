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
import org.springframework.beans.factory.annotation.Autowired;


public class PublicarInformacionTSImpl implements PublicarInformacionTS{

	@Autowired
	private IntercambioInformacionES intercambioInformacionES;

	@Autowired
	private EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

	@Autowired
	private SolicitudServicioES solicitudServicioES;

	@Autowired
	private ServicioSistemaES servicioES;

	@Autowired
	private BitacoraEventoES bitacoraEventoUS;

	@Autowired
	private NotificacionES notificacionUS;

	@Autowired
	private ParametroES parametroES;

	@Autowired
	private MotivoEstadoES motivoEstadoES;

	@Autowired
	private UsuarioES usuarioES;

	@Override
	public void publicarInformacion(PublicarInformacion solicitud) {

		System.out.println("solicitud"+ solicitud);
		
		try{
			IControlador controlador = new ControladorProcesos();
			System.out.println("Obteniendo el proceso...");
			IProceso proceso = PublicarInformacionFactory.obtenerInstaciaProceso(Proceso.PROCESAR_ENVIO_INFORMACION, PublicarInformacionFactory.obtenerInstaciaReglas());
			
			System.out.println("Instaciando el contexto de data...");
			String codigoUsuario = "EPBDTEST";//HandlerChainHelper.obtenerDatosUsuario(sesionContext).getCodigoUsuario();
			
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
