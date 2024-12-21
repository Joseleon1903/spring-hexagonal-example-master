package com.unipago.suirsigma.afiliacion.services.tasks.adapter.out;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaCarteraAfiliadoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespuestaCarteraAfiliadoAFPType  extends RespuestaCarteraAfiliadoType {

    protected LocalDate fechaNacimiento;
    protected String genero;
    private String cedula;
    private Long numeroContrato;
    private LocalDate fechaRecepcionSolicitudAfiliacion;
    private Short tipoAfiliacionId;
    private LocalDate fechaAfiliacion;
}
