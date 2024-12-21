package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExcepcionEjecucionIntercambioInformacion {

    private Long exepcionEjecucionIntercambioInformacionId;
    private Long ejecucionIntercambioInformacionId;
    private String referencia;
    private String datoInvalido;
    private Integer motivoId;
}
