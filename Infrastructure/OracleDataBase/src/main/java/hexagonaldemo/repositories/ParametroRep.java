package hexagonaldemo.repositories;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import hexagonaldemo.entity.ParametroEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface ParametroRep extends JpaRepository<ParametroEntity, String> {

    @Query("SELECT pa FROM Parametro pa WHERE pa.parametroId = :parametroId")
    ParametroEntity findValorParametro(String parametroId, Integer entidadId, Integer servicioId);
}
