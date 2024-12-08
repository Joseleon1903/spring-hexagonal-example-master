package com.unipago.unisigma.usecase.tasks.proceso;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEjecucion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SolicitudIntercambioInformacion {

    protected int servicioId;
    protected List<ParametroEjecucion> parametrosEjecucion;
    protected String codigoUsuario;

}
