package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.TipoEntidad;
import hexagonaldemo.entity.TipoEntidadEntity;

import java.util.List;
import java.util.stream.Collectors;

public class TipoEntidadMapper {

        /**
         * Convierte una instancia de TipoEventoSistemaEntity a TipoEntidad.
         *
         * @param entity la entidad a convertir
         * @return una instancia de TipoEntidad
         */
        public static TipoEntidad toDto(TipoEntidadEntity entity) {
            if (entity == null) {
                return null;
            }
            return new TipoEntidad(
                    entity.getTipoEntidadId(),
                    entity.getDescripcion(),
                    entity.getSigla(),
                    entity.getEstado(),
                    entity.getSeguroId(),
                    entity.getLdapOrganizationUnit()
            );
        }

        /**
         * Convierte una instancia de TipoEntidad a TipoEventoSistemaEntity.
         *
         * @param dto el DTO a convertir
         * @return una instancia de TipoEventoSistemaEntity
         */
        public static TipoEntidadEntity toEntity(TipoEntidad dto) {
            if (dto == null) {
                return null;
            }
            TipoEntidadEntity entity = new TipoEntidadEntity();
            entity.setTipoEntidadId(dto.getTipoEntidadId());
            entity.setDescripcion(dto.getDescripcion());
            entity.setSigla(dto.getSigla());
            entity.setEstado(dto.getEstado());
            entity.setSeguroId(dto.getSeguroId());
            entity.setLdapOrganizationUnit(dto.getLdapOrganizationUnit());
            return entity;
        }

        /**
         * Convierte una lista de TipoEventoSistemaEntity a una lista de TipoEntidad.
         *
         * @param entities la lista de entidades a convertir
         * @return una lista de TipoEntidad
         */
        public static List<TipoEntidad> toDtoList(List<TipoEntidadEntity> entities) {
            if (entities == null || entities.isEmpty()) {
                return List.of();
            }
            return entities.stream()
                    .map(TipoEntidadMapper::toDto)
                    .collect(Collectors.toList());
        }

        /**
         * Convierte una lista de TipoEntidad a una lista de TipoEventoSistemaEntity.
         *
         * @param dtos la lista de DTOs a convertir
         * @return una lista de TipoEventoSistemaEntity
         */
        public static List<TipoEntidadEntity> toEntityList(List<TipoEntidad> dtos) {
            if (dtos == null || dtos.isEmpty()) {
                return List.of();
            }
            return dtos.stream()
                    .map(TipoEntidadMapper::toEntity)
                    .collect(Collectors.toList());
        }
}
