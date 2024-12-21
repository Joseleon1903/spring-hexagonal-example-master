package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;

import java.util.Collection;
import java.util.Optional;

public interface ServicioSistemaRepository {

    Optional<ServicioSistema> findById(Integer servicioid);

    Optional<Collection<ServicioSistema>> findAllServicioSisatema();
}
