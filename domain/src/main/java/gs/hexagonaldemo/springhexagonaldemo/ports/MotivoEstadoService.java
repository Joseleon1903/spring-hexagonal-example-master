package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

import java.util.Optional;

public interface MotivoEstadoService {

    Optional<MotivoEstado> buscarMotivoEstadoPorId(Long id);
}
