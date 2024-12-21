package com.unipago.unisigma.usecase.tasks.proceso;

import com.unipago.unisigma.usecase.tasks.local.IControlador;
import com.unipago.unisigma.usecase.tasks.local.IProceso;
import com.unipago.unisigma.usecase.tasks.local.IReglasIntercambioInformacion;

public abstract class AbstractProcess implements IProceso{
	
	IControlador controlador;
	IReglasIntercambioInformacion proceso;

	@Override
	public void controlador(IControlador controlador) {
		this.controlador = controlador;		
	}
	
	
	

}
