package hexagonaldemo.repositories;

import hexagonaldemo.entity.AgenteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgenteRep extends JpaRepository<AgenteEntity, Long> {
}
