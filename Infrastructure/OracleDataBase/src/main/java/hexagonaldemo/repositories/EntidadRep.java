package hexagonaldemo.repositories;

import hexagonaldemo.entity.EntidadEntity;
import org.springframework.data.repository.CrudRepository;

public interface EntidadRep extends CrudRepository<EntidadEntity, Integer> {
}
