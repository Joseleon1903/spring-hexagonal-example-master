package hexagonaldemo.repositories;

import hexagonaldemo.entity.TipoEventoSistemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEventoSistemaRepo extends JpaRepository<TipoEventoSistemaEntity, Long> {

}