package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

import java.util.List;
import java.util.Optional;

public interface MotivoEstadoRepository {

    MotivoEstado create(MotivoEstado motivoEstado);

    List<MotivoEstado> getList();

    void delete(int id);

    Optional<MotivoEstado> getById(Integer motivoId);

    List<MotivoEstado> buscarMotivosEstado(String estado);

}
