package com.unipago.suirsigma.afiliacion.services.tasks.exception;

import lombok.Data;

@Data
public class ServicesFault extends RuntimeException{

    public Integer motivoId = 10001;
    public String descripcion = "EXISTEN DATOS REQUERIDOS NO PROPORCIONADOS";

    public ServicesFault(Integer motivoId, String descripcion) {
        this.motivoId = motivoId;
        this.descripcion = descripcion;
    }

}
