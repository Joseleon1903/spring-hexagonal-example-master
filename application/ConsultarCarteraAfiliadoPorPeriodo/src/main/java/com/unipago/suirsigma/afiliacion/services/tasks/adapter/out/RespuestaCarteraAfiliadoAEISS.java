package com.unipago.suirsigma.afiliacion.services.tasks.adapter.out;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaCarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.ActaNacimientoType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespuestaCarteraAfiliadoAEISS extends RespuestaCarteraAfiliado {

    protected LocalDate fechaNacimiento;
    protected String genero;
    private String tipoDependiente;
    private Short parentescoId;
    private String nui;
    private ActaNacimientoType actaNacimiento;
    private Integer nssTitular;
    private String cedulaTitular;
    private Short claveEstanciaInfantil;
    protected Boolean excluirConsolidado;
    private LocalDate fechaRecepcionSolicitudAfiliacion;
    private Short tipoAfiliacionId;
    private LocalDate fechaAfiliacion;
}
