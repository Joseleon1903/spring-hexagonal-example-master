package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.IntercambioInformacionRepository;
import hexagonaldemo.mapper.IntercambioInformacionMapper;
import hexagonaldemo.repositories.IntercambioInformacionRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class IntercambioInformacionRepositoryAdapter implements IntercambioInformacionRepository {

    @Autowired
    private IntercambioInformacionRep intercambioInformacionRep;

    @Override
    public Optional<IntercambioInformacion> buscarIntercambioInformacionPorId(Integer id) {
        return Optional.of(IntercambioInformacionMapper.mapToDomain(intercambioInformacionRep.findById(id).get()));
    }

    @Override
    public Optional<List<IntercambioInformacion>> buscarIntercambiosInformacionPorServicio(Integer servicioId, Short tipoIntercambioInformacion, String estado) {
        return Optional.of(IntercambioInformacionMapper.mapListToDomain(
                intercambioInformacionRep.buscarIntercambiosInformacionPorServicio(servicioId, tipoIntercambioInformacion, estado)));
    }
}
