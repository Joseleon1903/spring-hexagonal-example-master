package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponseType;
import hexagonaldemo.entity.CarteraAfiliadoEntity;
import hexagonaldemo.entity.DetalleCarteraAfiliadoEntity;
import hexagonaldemo.mapper.CarteraAfiliadoMapper;
import hexagonaldemo.repositories.CarteraAfiliadoRep;
import hexagonaldemo.repositories.DetalleCarteraAfiliadoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Component
public class CarteraAfiliadoRepositoryAdapter implements CarteraAfiliadoRepository {

    @Autowired
    private CarteraAfiliadoRep carteraAfiliadoRep;

    @Autowired
    private DetalleCarteraAfiliadoRep detalleCarteraAfiliadoRep;

    @Override
    public Optional<CarteraAfiliado> registrarCarteraAfiliado(CarteraAfiliado carteraAfiliado) {

        CarteraAfiliadoEntity entity = Objects.requireNonNull(CarteraAfiliadoMapper.toEntity(carteraAfiliado));
        List<DetalleCarteraAfiliadoEntity> entityList = entity.getDetalleCartera();
        entity.setDetalleCartera(null);

        entity = carteraAfiliadoRep.save(entity);

        CarteraAfiliadoEntity finalEntity = entity;
        entityList.forEach(ent ->{
            ent.setCarteraAfiliadoId(finalEntity);
            detalleCarteraAfiliadoRep.save(ent);
        });

        return Optional.ofNullable(CarteraAfiliadoMapper.toDto(entity));
    }

    @Override
    public Boolean existeCarteraAfiliadoPeriodoServicio(Integer periodo, Integer servicioId) {
        return null;
    }

    @Override
    public BuscarCarteraAfiliadosPorEntidadPeriodoResponseType buscarCarteraAfiliadosPorEntidadPeriodo(Integer entidadId, Integer periodo, String estadoAfiliacion, Integer indice, Integer cantidadRegistrosParticion) {
        return null;
    }
}
