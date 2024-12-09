package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionRepository;
import hexagonaldemo.mapper.EjecucionIntercambioInformacionMapper;
import hexagonaldemo.repositories.EjecucionIntercambioInformacionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EjecucionIntercambioInformacionRepositoryAdapter implements EjecucionIntercambioInformacionRepository {

    @Autowired
    private EjecucionIntercambioInformacionRep ejecucionIntercambioInformacionRep;

    @Override
    public Optional<EjecucionIntercambioInformacion> buscarEjecucionIntercambioInformacionPorId(Long buscarIntercambioInformacionPorId) {
        return Optional.of(
                EjecucionIntercambioInformacionMapper.mapToDomain(ejecucionIntercambioInformacionRep.findById(buscarIntercambioInformacionPorId).get())
        ) ;
    }
}
