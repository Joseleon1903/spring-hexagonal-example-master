package hexagonaldemo.repositories;


import hexagonaldemo.entity.TipoEntidadEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TipoEntidadRep extends JpaRepository<TipoEntidadEntity, Short> {
}
