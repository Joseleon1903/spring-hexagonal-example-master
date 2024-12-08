package com.unipago.unisigma.usecase.tasks.local;


import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;

public interface IControlador {
	
	void ejecutarProceso(IProceso procesoAEjecutar, ContextData contextData, ServiciosContext serviceContext) throws InternalServiceException;

}
