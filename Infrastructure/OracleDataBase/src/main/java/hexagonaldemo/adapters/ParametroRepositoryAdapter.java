package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import gs.hexagonaldemo.springhexagonaldemo.ports.ParametroRepository;
import hexagonaldemo.entity.ParametroEntity;
import hexagonaldemo.mapper.ParametroMapper;
import hexagonaldemo.repositories.ParametroRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ParametroRepositoryAdapter implements ParametroRepository {

    @Autowired
    private ParametroRep parametroRep;


    @Override
    public Parametro findById(String parametroId) {
        ParametroEntity param = parametroRep.findById(parametroId).get();
        return ParametroMapper.toEntity(param);
    }

    @Override
    public Parametro findValorParametro(String parametroId, Integer entidadId, Integer servicioId) {
        return parametroRep.findValorParametro(parametroId, entidadId, servicioId);
    }
}
