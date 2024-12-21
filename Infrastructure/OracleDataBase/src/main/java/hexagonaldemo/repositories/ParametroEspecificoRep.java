package hexagonaldemo.repositories;

import hexagonaldemo.entity.ParametroEspecificoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParametroEspecificoRep extends JpaRepository<ParametroEspecificoEntity, String> {
}
