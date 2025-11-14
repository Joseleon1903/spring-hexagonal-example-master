package com.unipago.unisigma.usecase.tasks.util;

import com.unipago.unisigma.usecase.tasks.local.IProceso;
import com.unipago.unisigma.usecase.tasks.local.IReglasIntercambioInformacion;
import com.unipago.unisigma.usecase.tasks.proceso.ProcesoPublicarInformacion;
import com.unipago.unisigma.usecase.tasks.reglas.ReglasPublicarInformacion;

public class PublicarInformacionFactory {
	
public static IProceso obtenerInstaciaProceso(Proceso proceso, IReglasIntercambioInformacion reglas)throws UnsupportedOperationException{
		
		switch(proceso){
			
		case PROCESAR_ENVIO_INFORMACION:
			return new ProcesoPublicarInformacion(reglas);
			
		 default: 
			 throw new UnsupportedOperationException();
		}
		
	}
	
	public static IReglasIntercambioInformacion obtenerInstaciaReglas(){
		return new ReglasPublicarInformacion();
	}
}
