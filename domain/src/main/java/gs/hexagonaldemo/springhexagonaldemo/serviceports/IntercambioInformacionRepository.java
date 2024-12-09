package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;

import java.util.List;
import java.util.Optional;

public interface IntercambioInformacionRepository {

    Optional<IntercambioInformacion> buscarIntercambioInformacionPorId(Integer id);

    Optional<List<IntercambioInformacion>> buscarIntercambiosInformacionPorServicio(Integer servicioId, Short tipoIntercambioInformacion, String estado);
}
