package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEspecifico;

import java.util.List;
import java.util.Optional;

public interface ParametroEspecificoRepository {
    Optional<List<ParametroEspecifico>> buscarParametrosEspecificos();

    Optional<ParametroEspecifico> buscarParametrosEspecificoPorId(String parametroEspecificoId);

}
