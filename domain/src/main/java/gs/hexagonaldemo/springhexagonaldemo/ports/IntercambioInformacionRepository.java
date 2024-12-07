package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;

import java.util.Optional;

public interface IntercambioInformacionRepository {

    Optional<IntercambioInformacion> buscarIntercambioInformacionPorId(Integer id);


}
