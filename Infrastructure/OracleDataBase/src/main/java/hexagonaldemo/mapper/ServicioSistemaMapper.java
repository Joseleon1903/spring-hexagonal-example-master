package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import hexagonaldemo.entity.ServicioSistemaEntity;

import java.util.ArrayList;
import java.util.List;

import static hexagonaldemo.mapper.ParametroEspecificoMapper.mapDomain;

public class ServicioSistemaMapper {

    public static ServicioSistema mapToDomain(ServicioSistemaEntity type) {

        ServicioSistema servicioSistema = new ServicioSistema();
        servicioSistema.setServicioId(type.getServicioId());
        servicioSistema.setDescripcion(type.getDescripcion());
        servicioSistema.setAreasNegocio(type.getAreasNegocio());
        servicioSistema.setProcesoSubprocesoId(type.getProcesoSubprocesoId());
        servicioSistema.setRegimenId(type.getRegimenId());
        servicioSistema.setSeguroId(type.getSeguroId());
        servicioSistema.setNombreCola(type.getNombreCola());
        servicioSistema.setHorarioRequerido(type.isHorarioRequerido());
        servicioSistema.setFechaInicioDisponibilidad(type.getFechaInicioDisponibilidad());
        servicioSistema.setTipoServicioId(type.getTipoServicioId());
        servicioSistema.setOrdenEjecucion(type.getOrdenEjecucion());
        servicioSistema.setClaveProcesoArchivo(type.getClaveProcesoArchivo());
        servicioSistema.setClaveSubprocesoArchivo(type.getClaveSubprocesoArchivo());
        servicioSistema.setEstado(type.getEstado());
        servicioSistema.setServicioPadreId(type.getServicioPadreId());
        servicioSistema.setFacturable(type.isFacturable());
        servicioSistema.setParticionaRespuesta(type.isParticionaRespuesta());
        servicioSistema.setAplicaCargaDocumento(type.isAplicaCargaDocumento());
        servicioSistema.setAplicaRespuestaInmediata(type.isAplicaRespuestaInmediata());
        servicioSistema.setAplicaGeneracionLote(type.isAplicaGeneracionLote());

        return servicioSistema;
    }

    public static ServicioSistemaEntity mapToEntity(ServicioSistema type) {

        ServicioSistemaEntity servicioSistema = new ServicioSistemaEntity();

        servicioSistema.setServicioId(type.getServicioId());
        servicioSistema.setDescripcion(type.getDescripcion());
        servicioSistema.setAreasNegocio(type.getAreasNegocio());
        servicioSistema.setProcesoSubprocesoId(type.getProcesoSubprocesoId());
        servicioSistema.setRegimenId(type.getRegimenId());
        servicioSistema.setSeguroId(type.getSeguroId());
        servicioSistema.setNombreCola(type.getNombreCola());
        servicioSistema.setHorarioRequerido(type.isHorarioRequerido());
        servicioSistema.setFechaInicioDisponibilidad(type.getFechaInicioDisponibilidad());
        servicioSistema.setTipoServicioId(type.getTipoServicioId());
        servicioSistema.setOrdenEjecucion(type.getOrdenEjecucion());
        servicioSistema.setClaveProcesoArchivo(type.getClaveProcesoArchivo());
        servicioSistema.setClaveSubprocesoArchivo(type.getClaveSubprocesoArchivo());
        servicioSistema.setEstado(type.getEstado());
        servicioSistema.setServicioPadreId(type.getServicioPadreId());
        servicioSistema.setFacturable(type.isFacturable());
        servicioSistema.setParticionaRespuesta(type.isParticionaRespuesta());
        servicioSistema.setAplicaCargaDocumento(type.isAplicaCargaDocumento());
        servicioSistema.setAplicaRespuestaInmediata(type.isAplicaRespuestaInmediata());
        servicioSistema.setAplicaGeneracionLote(type.isAplicaGeneracionLote());

        return servicioSistema;
    }

    public static List<ServicioSistema> toDomainList(List<ServicioSistemaEntity> entityList) {
        List<ServicioSistema> listOut =  new ArrayList<>();

        entityList.forEach( entity ->{
            listOut.add(mapToDomain(entity));

        });
        return listOut;
    }

}
