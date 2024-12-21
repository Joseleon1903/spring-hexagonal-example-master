package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarUltimoIntercambioInformacionPorServicioType {

    protected int servicioId;
    protected List<String> estados;
    protected Boolean pendienteRespuesta;
}
