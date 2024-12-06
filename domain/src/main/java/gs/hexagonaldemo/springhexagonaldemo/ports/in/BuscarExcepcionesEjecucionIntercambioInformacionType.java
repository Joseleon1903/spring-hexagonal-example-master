package gs.hexagonaldemo.springhexagonaldemo.ports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarExcepcionesEjecucionIntercambioInformacionType {

    protected long ejecucionIntercambioInformacionId;
    protected Boolean incluirDetalleExcepciones;

}
