package hexagonaldemo.repositories;

import hexagonaldemo.entity.IntercambioInformacionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IntercambioInformacionRep extends JpaRepository<IntercambioInformacionEntity, Integer> {

    @Query("SELECT i FROM IntercambioInformacion i " +
            "LEFT JOIN FETCH i.parametros p " +
            "WHERE i.servicioId = :servicioId " +
            "  AND i.tipoIntercambioInformacion = COALESCE(:tipoIntercambioInformacion, i.tipoIntercambioInformacion) " +
            "  AND i.estado = COALESCE(:estado, i.estado) " +
            "  AND (p.estado = :estado OR p.estado IS NULL)")
    List<IntercambioInformacionEntity> buscarIntercambiosInformacionPorServicio(Integer servicioId,
                                                                          Short tipoIntercambioInformacion, String estado);
}
