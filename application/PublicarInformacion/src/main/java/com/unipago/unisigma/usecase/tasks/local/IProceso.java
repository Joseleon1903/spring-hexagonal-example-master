package com.unipago.unisigma.usecase.tasks.local;


import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;

public interface IProceso {
	
	int PROCESAR_RECEPCION_INFORMACION = 1;
	
	void controlador(IControlador controlador);

	void procesar(ContextData context, ServiciosContext serviceContext) throws InternalServiceException;

}
