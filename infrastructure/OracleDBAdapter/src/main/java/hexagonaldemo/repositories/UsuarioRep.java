package hexagonaldemo.repositories;

import hexagonaldemo.entity.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UsuarioRep extends JpaRepository<UsuarioEntity, Integer> {

    @Query("SELECT u FROM Usuario u WHERE u.codigo = :codigo")
    Optional<UsuarioEntity> BuscarUsuarioPorCodigo(String codigo);

}
