package com.unipago.unisigma.usecase.tasks.util;


import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.local.IControlador;
import com.unipago.unisigma.usecase.tasks.local.IProceso;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;

public class ControladorProcesos implements IControlador {

	@Override
	public void ejecutarProceso(IProceso procesoAEjecutar, ContextData contextData, ServiciosContext serviceContext) throws InternalServiceException {
		procesoAEjecutar.controlador(this);
		procesoAEjecutar.procesar(contextData, serviceContext);

	}

}
