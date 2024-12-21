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

    @Override
    public Optional<EjecucionIntercambioInformacion> actualizar(EjecucionIntercambioInformacion parameters) {
        EjecucionIntercambioInformacionEntity entity = ejecucionIntercambioInformacionRep.findById(parameters.getEjecucionIntercambioInfoId()).get();

        entity.setUsuarioId(parameters.getUsuarioId());
        entity.setFechaInicio(parameters.getFechaInicio());
        entity.setFechaFin(parameters.getFechaFin());
        entity.setFechaRespuesta(parameters.getFechaRespuesta());
        entity.setEstado(parameters.getEstado());
        entity.setMotivoId(parameters.getMotivoId());
        entity.setCodigoServicio(parameters.getCodigoServicio());
        entity.setServicioId(parameters.getServicioId());

        return Optional.of(EjecucionIntercambioInformacionMapper.mapToDomain(ejecucionIntercambioInformacionRep.save(entity)));
    }
}
