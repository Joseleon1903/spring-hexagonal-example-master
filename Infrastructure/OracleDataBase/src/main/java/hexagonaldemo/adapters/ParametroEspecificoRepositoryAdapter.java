package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEspecifico;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ParametroEspecificoRepository;
import hexagonaldemo.mapper.ParametroEspecificoMapper;
import hexagonaldemo.repositories.ParametroEspecificoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class ParametroEspecificoRepositoryAdapter implements ParametroEspecificoRepository {

    @Autowired
    private ParametroEspecificoRep parametroEspecificoRep;

    @Override
    public Optional<List<ParametroEspecifico>> buscarParametrosEspecificos() {
        return Optional.of(ParametroEspecificoMapper.toDomainList(parametroEspecificoRep.findAll()));
    }

    @Override
    public Optional<ParametroEspecifico> buscarParametrosEspecificoPorId(String parametroEspecificoId) {
        return Optional.of(ParametroEspecificoMapper.mapDomain(parametroEspecificoRep.getById(parametroEspecificoId)));
    }
}
