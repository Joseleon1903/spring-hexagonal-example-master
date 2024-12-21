package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import hexagonaldemo.entity.EntidadEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.ArrayList;
import java.util.List;

public class  EntidadMapper {

    public static Entidad toDto(EntidadEntity entity) {
        if (entity == null) {
            return null;
        }

        Entidad dto = new Entidad();
        dto.setEntidadId(entity.getEntidadId());
        dto.setClaveEntidad(entity.getClaveEntidad());
        dto.setSigla(entity.getSigla());
        dto.setDescripcion(entity.getDescripcion());
        dto.setParticipaAfiliacionAutomatica(entity.getParticipaAfiliacionAutomatica());
        dto.setEstado(entity.getEstado());
        dto.setTipoEntidadId(entity.getTipoEntidadId());
        dto.setRnc(entity.getRnc());
        dto.setFechaInscripcion(entity.getFechaInscripcion());
        dto.setNumeroAcreditacion(entity.getNumeroAcreditacion());
        dto.setEntidadSupervisoraId(entity.getEntidadSupervisoraId());
        dto.setRegimenId(entity.getRegimenId());
        dto.setLdapOrganizationUnit(entity.getLdapOrganizationUnit());
        dto.setUsuarioId(entity.getUsuarioId());
        dto.setTipoFondoId(entity.getTipoFondoId());
        dto.setTipoEmpleadorId(entity.getTipoEmpleadorId());
        dto.setTipoAdministracionId(entity.getTipoAdministracionId());
        dto.setTipoEstanciaInfantilId(entity.getTipoEstanciaInfantilId());
        dto.setMunicipioId(entity.getMunicipioId());
      //  dto.setDominiosCorreo(DominioCorreoEntidadMapper.toDtoList(entity.getDominiosCorreo()));
        dto.setGrupoEconomicoId(entity.getGrupoEconomicoId());
        dto.setComparteContactosGrupoEconomico(entity.getComparteContactosGrupoEconomico());
        dto.setComparteAgentesGrupoEconomico(entity.getComparteAgentesGrupoEconomico());
        dto.setCodigoClienteFacturacion(entity.getCodigoClienteFacturacion());
        dto.setAccionista(entity.getAccionista());
        dto.setAplicaMembresia(entity.getAplicaMembresia());
        dto.setAplicaFacturacion(entity.getAplicaFacturacion());
        dto.setRequiereAprobacionAplicarBajaAutomatica(entity.getRequiereAprobacionAplicarBajaAutomatica());
        dto.setValidaEdadIndividualizacionSeguroVida(entity.getValidaEdadIndividualizacionSeguroVida());
        dto.setInstitucionesPensionados(entity.getInstitucionesPensionados());
        dto.setAplicaParticipacionMovimientoFondo(entity.getAplicaParticipacionMovimientoFondo());
        dto.setValidaAntiguedadIndividualizacionSeguroVida(entity.getValidaAntiguedadIndividualizacionSeguroVida());
        return dto;
    }

    // Convertir de Entidad a EntidadEntity
    public static EntidadEntity toEntity(Entidad dto) {
        if (dto == null) {
            return null;
        }

        EntidadEntity entity = new EntidadEntity();
        entity.setEntidadId(dto.getEntidadId());
        entity.setClaveEntidad(dto.getClaveEntidad());
        entity.setSigla(dto.getSigla());
        entity.setDescripcion(dto.getDescripcion());
        entity.setParticipaAfiliacionAutomatica(dto.getParticipaAfiliacionAutomatica());
        entity.setEstado(dto.getEstado());
        entity.setTipoEntidadId(dto.getTipoEntidadId());
        entity.setRnc(dto.getRnc());
        entity.setFechaInscripcion(dto.getFechaInscripcion());
        entity.setNumeroAcreditacion(dto.getNumeroAcreditacion());
        entity.setEntidadSupervisoraId(dto.getEntidadSupervisoraId());
        entity.setRegimenId(dto.getRegimenId());
        entity.setLdapOrganizationUnit(dto.getLdapOrganizationUnit());
        entity.setUsuarioId(dto.getUsuarioId());
        entity.setTipoFondoId(dto.getTipoFondoId());
        entity.setTipoEmpleadorId(dto.getTipoEmpleadorId());
        entity.setTipoAdministracionId(dto.getTipoAdministracionId());
        entity.setTipoEstanciaInfantilId(dto.getTipoEstanciaInfantilId());
        entity.setMunicipioId(dto.getMunicipioId());
      //  entity.setDominiosCorreo(DominioCorreoEntidadMapper.toEntityList(dto.getDominiosCorreo()));
        entity.setGrupoEconomicoId(dto.getGrupoEconomicoId());
        entity.setComparteContactosGrupoEconomico(dto.getComparteContactosGrupoEconomico());
        entity.setComparteAgentesGrupoEconomico(dto.getComparteAgentesGrupoEconomico());
        entity.setCodigoClienteFacturacion(dto.getCodigoClienteFacturacion());
        entity.setAccionista(dto.getAccionista());
        entity.setAplicaMembresia(dto.getAplicaMembresia());
        entity.setAplicaFacturacion(dto.getAplicaFacturacion());
        entity.setRequiereAprobacionAplicarBajaAutomatica(dto.getRequiereAprobacionAplicarBajaAutomatica());
        entity.setValidaEdadIndividualizacionSeguroVida(dto.getValidaEdadIndividualizacionSeguroVida());
        entity.setInstitucionesPensionados(dto.getInstitucionesPensionados());
        entity.setAplicaParticipacionMovimientoFondo(dto.getAplicaParticipacionMovimientoFondo());
        entity.setValidaAntiguedadIndividualizacionSeguroVida(dto.getValidaAntiguedadIndividualizacionSeguroVida());
        return entity;
    }

    // Convertir una lista de EntidadEntity a una lista de Entidad
    public static List<Entidad> toDtoList(List<EntidadEntity> entityList) {
        if (entityList == null) {
            return null;
        }
        List<Entidad> dtoList = new ArrayList<>();
        for (EntidadEntity entity : entityList) {
            dtoList.add(toDto(entity));
        }
        return dtoList;
    }

    // Convertir una lista de Entidad a una lista de EntidadEntity
    public static List<EntidadEntity> toEntityList(List<Entidad> dtoList) {
        if (dtoList == null) {
            return null;
        }
        List<EntidadEntity> entityList = new ArrayList<>();
        for (Entidad dto : dtoList) {
            entityList.add(toEntity(dto));
        }
        return entityList;
    }

}
