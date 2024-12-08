package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEjecucion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarEjecucionesIntercambioInformacionPorServicioType {

    private Integer servicioId;
    private List<String> estados;
    private List<ParametroEjecucion> parametros;

}
