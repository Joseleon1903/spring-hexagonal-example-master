package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExcepcionParametroRequeridoIntercambioInformacion {

    private Integer excepcionParametroRequeridoIntercambioInformacionId;
    private ParametroIntercambioInformacion parametroIntercambioInformacionId;
    private Integer parametroCondicionaRequeridoId;
    private boolean valorEspecifico;
    private String valorParametroCondicionaRequerido;


}
