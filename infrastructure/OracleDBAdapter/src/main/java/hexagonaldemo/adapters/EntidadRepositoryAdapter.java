package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EntidadRepository;
import hexagonaldemo.entity.EntidadEntity;
import hexagonaldemo.mapper.EntidadMapper;
import hexagonaldemo.repositories.EntidadRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class EntidadRepositoryAdapter implements EntidadRepository {

    @Autowired
    private EntidadRep entidadRep;

    @Override
    public Optional<Entidad> buscarEntidadPorId(Integer entidadId) {
        EntidadEntity ent = entidadRep.findById(entidadId).get();
        return Optional.of(EntidadMapper.toDto(ent));
    }
}
