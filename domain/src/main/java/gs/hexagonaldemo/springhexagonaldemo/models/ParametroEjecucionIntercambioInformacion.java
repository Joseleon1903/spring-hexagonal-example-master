package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParametroEjecucionIntercambioInformacion {

    private Long parametroEjecucionIntercambioInformacionId;
    private EjecucionIntercambioInformacion ejecucionIntercambioInformacionId;
    private Integer parametroIntercambioInformacionId;
    private String valor;
    private String codigoParametro;

}
