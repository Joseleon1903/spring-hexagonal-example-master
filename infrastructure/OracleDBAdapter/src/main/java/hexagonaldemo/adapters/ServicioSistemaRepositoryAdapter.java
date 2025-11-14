package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ServicioSistemaRepository;
import hexagonaldemo.entity.ServicioSistemaEntity;
import hexagonaldemo.mapper.ServicioSistemaMapper;
import hexagonaldemo.repositories.ServicioSistemaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Component
public class ServicioSistemaRepositoryAdapter implements ServicioSistemaRepository {

    @Autowired
    private ServicioSistemaRep servicioSistemaRep;

    @Override
    public Optional<ServicioSistema> findById(Integer servicioid) {
        ServicioSistemaEntity outEntity =servicioSistemaRep.findById(servicioid).get();
        return Optional.of(ServicioSistemaMapper.mapToDomain(outEntity));
    }

    @Override
    public Optional<Collection<ServicioSistema>> findAllServicioSisatema() {
        List<ServicioSistemaEntity> outEntity =servicioSistemaRep.findAll();
        return Optional.of(ServicioSistemaMapper.toDomainList(outEntity));
    }
}
