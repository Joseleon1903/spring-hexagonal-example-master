package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;

import java.util.Optional;

public interface EjecucionIntercambioInformacionRepository {

    Optional<EjecucionIntercambioInformacion> buscarEjecucionIntercambioInformacionPorId(
            Long buscarIntercambioInformacionPorId);

    Optional<EjecucionIntercambioInformacion> registrar(EjecucionIntercambioInformacion parameters);

    Optional<EjecucionIntercambioInformacion> actualizar(EjecucionIntercambioInformacion parameters);


}