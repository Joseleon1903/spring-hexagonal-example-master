package hexagonaldemo.repositories;

import hexagonaldemo.entity.MotivoEstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MotivoEstadoRep extends JpaRepository<MotivoEstadoEntity, Long> {

    List<MotivoEstadoEntity> findByEstado(String estado);
}
