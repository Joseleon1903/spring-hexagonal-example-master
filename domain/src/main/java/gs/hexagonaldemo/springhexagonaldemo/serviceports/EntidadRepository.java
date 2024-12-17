package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;

import java.util.Optional;

public interface EntidadRepository {

    Optional<Entidad> buscarEntidadPorId(Integer entidadId);

}
