package com.unipago.unisigma.usecase.tasks.proceso;


import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.local.IReglasIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;


public class ProcesoPublicarInformacion extends AbstractProcess {

	IReglasIntercambioInformacion reglas;
	
	
	public ProcesoPublicarInformacion(IReglasIntercambioInformacion reglas) {
		super();
		this.reglas = reglas;
	}

	@Override
	public void procesar(ContextData context, ServiciosContext serviceContext) throws InternalServiceException {
		System.out.println("Entering procesar");
		
		System.out.println("Asignando los datos de contexto a las reglas...");
		reglas.setContextData(context);
		
		System.out.println("Asignando el services context...");
		reglas.setServiciosContext(serviceContext);
		
		System.out.println("Realizando las validaciones...");
		
		boolean exitoso = reglas.estaServicioCatalogado();
		if(exitoso && (exitoso = reglas.existeIntercambioInformacion()));
		if(exitoso && (exitoso = reglas.validarEjecucionPreviaIntercambio()));
		if(exitoso && (exitoso = reglas.esCorrespondenciaTipoDatoParametrosValida()));
		if(exitoso && (exitoso = reglas.parametrosRequeridosProporcionados()));
		if(exitoso && (exitoso = reglas.esExcepcionParametroRequerido()));
		if(exitoso && (exitoso = reglas.esvalidoRangoIntercambio()));
		if(exitoso && (exitoso = reglas.validaTiempoRetencionInformacion()));
	
		System.out.println("Registrando la ejecucion de intercambio de informacion..");
		reglas.registrarEjecucionIntercambioInformacion();
		if(exitoso &&  reglas.ponerIntercambioInformacionEnCola());
		
		if(!exitoso){
			System.out.println("Registrando la bitacoras y notificacion fallidas...");
			reglas.registrarBitacora();
			reglas.enviarNotificacion();
		}
	}

}
