package gs.hexagonaldemo.repositories;

import gs.hexagonaldemo.entity.MotivoEstadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoEstadoRep extends JpaRepository<MotivoEstadoEntity, Long> {


}
