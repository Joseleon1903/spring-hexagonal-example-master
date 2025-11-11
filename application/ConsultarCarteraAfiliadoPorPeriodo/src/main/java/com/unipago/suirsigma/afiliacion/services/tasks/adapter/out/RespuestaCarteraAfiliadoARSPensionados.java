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
public class RespuestaCarteraAfiliadoARSPensionados extends RespuestaCarteraAfiliado {

    private LocalDate fechaNacimiento;
    private String genero;
    private String tipoAfiliado;
    private String tipoDependiente;
    private Short parentescoId;
    private String cedula;
    private String nui;
    private ActaNacimientoType actaNacimiento;
    private Short nacionalidadId;
    private Integer nssTitular;
    private String cedulaTitular;
    private Long numeroContrato;
    private Short institucionPensionadoId;
    private Boolean estudiante;
    private Boolean discapacitado;
    private LocalDate fechaRecepcionSolicitudAfiliacion;
    private Short tipoAfiliacionId;
    private LocalDate fechaAfiliacion;
    private LocalDate fechaEfectividadAfiliacion;

}
