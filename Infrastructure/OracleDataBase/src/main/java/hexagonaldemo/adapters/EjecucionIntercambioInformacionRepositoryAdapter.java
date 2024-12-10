package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionRepository;
import hexagonaldemo.entity.EjecucionIntercambioInformacionEntity;
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

    @Override
    public Optional<EjecucionIntercambioInformacion> registrar(EjecucionIntercambioInformacion parameters) {
        EjecucionIntercambioInformacionEntity entity= EjecucionIntercambioInformacionMapper.mapToEntity(parameters);

//        Long ejecucionId =

        return Optional.of(EjecucionIntercambioInformacionMapper.mapToDomain(ejecucionIntercambioInformacionRep.save(entity)));
    }
}
