package hexagonaldemo.repositories;

import hexagonaldemo.entity.ServicioSistemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioSistemaRep extends JpaRepository<ServicioSistemaEntity, Integer> {

}
