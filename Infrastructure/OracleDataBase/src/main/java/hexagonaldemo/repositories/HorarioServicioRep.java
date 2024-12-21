package hexagonaldemo.repositories;

import hexagonaldemo.entity.HorarioServicioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HorarioServicioRep extends JpaRepository<HorarioServicioEntity, Long> {
}
