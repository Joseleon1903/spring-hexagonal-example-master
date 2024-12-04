package gs.hexagonaldemo.springhexagonaldemo.ports;



import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

import java.util.List;
import java.util.Optional;

public interface MotivoEstadoRepository {

    int create(MotivoEstado motivoEstado);

    List<MotivoEstado> getList();

    void delete(int id);

    Optional<MotivoEstado> getById(Long motivoId);
}
