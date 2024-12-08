package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

import java.util.List;
import java.util.Optional;

public interface MotivoEstadoES {

    Optional<MotivoEstado> buscarMotivoEstadoPorId(Integer id);

    /**
     *
     * @param estado
     * @return List<MotivoEstado>
     * @throws InternalServiceException
     */
    Optional<List<MotivoEstado>> buscarMotivosEstado(String estado);
}
