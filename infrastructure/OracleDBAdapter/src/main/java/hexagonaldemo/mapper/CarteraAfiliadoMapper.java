package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import hexagonaldemo.entity.CarteraAfiliadoEntity;

import java.util.Objects;
import java.util.stream.Collectors;

public class CarteraAfiliadoMapper {

    // Método para mapear de Entity a DTO
    public static CarteraAfiliado toDto(CarteraAfiliadoEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }

        CarteraAfiliado dto = new CarteraAfiliado();
        dto.setCarteraAfiliadoId(entity.getCarteraAfiliadoId());
        dto.setEjecucionAfiliacionId(entity.getEjecucionAfiliacionId());
        dto.setServicioId(entity.getServicioId());
        dto.setPeriodo(entity.getPeriodo());
        dto.setFechaGeneracion(entity.getFechaGeneracion());

        // Mapear la lista anidada de DetalleCarteraAfiliadoEntity a DetalleCarteraAfiliado
        if (entity.getDetalleCartera() != null) {
            dto.setDetalleCartera(
                    entity.getDetalleCartera()
                            .stream()
                            .map(DetalleCarteraAfiliadoMapper::toDto) // Usamos el mapper de DetalleCarteraAfiliado
                            .collect(Collectors.toList())
            );
        }

        return dto;
    }

    // Método para mapear de DTO a Entity
    public static CarteraAfiliadoEntity toEntity(CarteraAfiliado dto) {
        if (Objects.isNull(dto)) {
            return null;
        }

        CarteraAfiliadoEntity entity = new CarteraAfiliadoEntity();
        entity.setCarteraAfiliadoId(dto.getCarteraAfiliadoId());
        entity.setEjecucionAfiliacionId(dto.getEjecucionAfiliacionId());
        entity.setServicioId(dto.getServicioId());
        entity.setPeriodo(dto.getPeriodo());
        entity.setFechaGeneracion(dto.getFechaGeneracion());

        // Mapear la lista anidada de DetalleCarteraAfiliado a DetalleCarteraAfiliadoEntity
        if (dto.getDetalleCartera() != null) {
            entity.setDetalleCartera(
                    dto.getDetalleCartera()
                            .stream()
                            .map(DetalleCarteraAfiliadoMapper::toEntity) // Usamos el mapper de DetalleCarteraAfiliado
                            .collect(Collectors.toList())
            );
        }

        return entity;
    }

}
