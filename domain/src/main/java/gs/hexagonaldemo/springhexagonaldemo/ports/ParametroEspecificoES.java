package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEspecifico;

import java.util.List;
import java.util.Optional;

public interface ParametroEspecificoES {

    Optional<List<ParametroEspecifico>> buscarParametrosEspecificos();

    Optional<ParametroEspecifico> buscarParametrosEspecificoPorId(String parametroEspecificoId);

}
