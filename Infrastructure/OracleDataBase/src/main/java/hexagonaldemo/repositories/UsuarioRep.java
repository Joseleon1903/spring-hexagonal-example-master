package hexagonaldemo.repositories;

import hexagonaldemo.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRep extends JpaRepository<UsuarioEntity, Integer> {
}
