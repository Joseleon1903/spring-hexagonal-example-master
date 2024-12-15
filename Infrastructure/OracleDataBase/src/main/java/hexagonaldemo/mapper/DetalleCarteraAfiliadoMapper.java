package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.DetalleCarteraAfiliado;
import hexagonaldemo.entity.DetalleCarteraAfiliadoEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class DetalleCarteraAfiliadoMapper {

    // Método para mapear de Entity a DTO
    public static DetalleCarteraAfiliado toDto(DetalleCarteraAfiliadoEntity entity) {
        if (Objects.isNull(entity)) {
            return null;
        }

        DetalleCarteraAfiliado dto = new DetalleCarteraAfiliado();
        dto.setDetalleCarteraAfiliadoId(entity.getDetalleCarteraAfiliadoId());
        dto.setCarteraAfiliadoId( CarteraAfiliadoMapper.toDto(entity.getCarteraAfiliadoId()) );
        dto.setPeriodo(entity.getPeriodo());
        dto.setNombre(entity.getNombre());
        dto.setPrimerApellido(entity.getPrimerApellido());

        dto.setEntidadId(entity.getEntidadId());
        dto.setEstanciaInfantilId(entity.getEstanciaInfantilId());
        dto.setInstitucionPensionadoId(entity.getInstitucionPensionadoId());
        dto.setCiudadanoId(entity.getCiudadanoId());
        dto.setSolicitudId(entity.getSolicitudId());
        dto.setAfiliacionId(entity.getAfiliacionId());
        dto.setTipoAfiliado(entity.getTipoAfiliado());
        dto.setCiudadanoTitularId(entity.getCiudadanoTitularId());
        dto.setParentescoId(entity.getParentescoId());
        dto.setTipoDependiente(entity.getTipoDependiente());
        dto.setEstudiante(entity.getEstudiante());
        dto.setDiscapacitado(entity.getDiscapacitado());
        dto.setExcluirConsolidado(entity.getExcluirConsolidado());
        dto.setEstadoAfiliacion(entity.getEstadoAfiliacion());
        dto.setMotivoId(entity.getMotivoId());
        dto.setFechaEfectividadAfiliacion(entity.getFechaEfectividadAfiliacion());

        return dto;
    }

    // Método para mapear de DTO a Entity
    public static DetalleCarteraAfiliadoEntity toEntity(DetalleCarteraAfiliado dto) {
        if (Objects.isNull(dto)) {
            return null;
        }

        DetalleCarteraAfiliadoEntity entity = new DetalleCarteraAfiliadoEntity();
        entity.setDetalleCarteraAfiliadoId(dto.getDetalleCarteraAfiliadoId());
        entity.setNombre(dto.getNombre());
        entity.setPrimerApellido(dto.getPrimerApellido());

        entity.setCarteraAfiliadoId(CarteraAfiliadoMapper.toEntity(dto.getCarteraAfiliadoId()));
        entity.setPeriodo(dto.getPeriodo());
        entity.setEntidadId(dto.getEntidadId());
        entity.setEstanciaInfantilId(dto.getEstanciaInfantilId());
        entity.setInstitucionPensionadoId(dto.getInstitucionPensionadoId());
        entity.setCiudadanoId(dto.getCiudadanoId());
        entity.setSolicitudId(dto.getSolicitudId());
        entity.setAfiliacionId(dto.getAfiliacionId());
        entity.setTipoAfiliado(dto.getTipoAfiliado());
        entity.setCiudadanoTitularId(dto.getCiudadanoTitularId());
        entity.setParentescoId(dto.getParentescoId());
        entity.setTipoDependiente(dto.getTipoDependiente());
        entity.setEstudiante(dto.getEstudiante());
        entity.setDiscapacitado(dto.getDiscapacitado());
        entity.setExcluirConsolidado(dto.getExcluirConsolidado());
        entity.setEstadoAfiliacion(dto.getEstadoAfiliacion());
        entity.setMotivoId(dto.getMotivoId());
        entity.setFechaEfectividadAfiliacion(dto.getFechaEfectividadAfiliacion());

        return entity;
    }

    public static List<DetalleCarteraAfiliado> mapListToDomain(List<DetalleCarteraAfiliadoEntity> detalleCarteraAfiliadoEntities){

        List<DetalleCarteraAfiliado> listOut =  new ArrayList<>();

        detalleCarteraAfiliadoEntities.forEach( entiy ->{
            listOut.add(toDto(entiy));

        });
        return listOut;
    }

}
