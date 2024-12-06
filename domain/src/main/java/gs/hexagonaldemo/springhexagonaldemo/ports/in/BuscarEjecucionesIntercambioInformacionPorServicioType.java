package gs.hexagonaldemo.springhexagonaldemo.ports.in;

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
    private List<ParametroEjecucionType> parametros;

}
