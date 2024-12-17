package hexagonaldemo.repositories;

import hexagonaldemo.entity.ContactoEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ContactoRep extends CrudRepository<ContactoEntity, Long> {

    @Query("SELECT c FROM Contacto c JOIN Usuario usu ON c.contactoId = usu.contactoId WHERE UPPER(usu.codigo) = UPPER(:codigo)")
    Optional<ContactoEntity> buscarContactoPorCodigoUsuario(String codigo);
}
