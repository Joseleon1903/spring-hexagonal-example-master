package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import hexagonaldemo.entity.EjecucionConsultaEntity;

import java.util.ArrayList;
import java.util.List;

public class EjecucionConsultaMapper {

    public static EjecucionConsulta mapToDomain(EjecucionConsultaEntity entity){

        EjecucionConsulta ejecucion = new EjecucionConsulta();
        ejecucion.setEjecucionConsultaId(entity.getEjecucionConsultaId());
        ejecucion.setEntidadId(entity.getEntidadId());
        ejecucion.setUsuarioId(entity.getUsuarioId());
        ejecucion.setServicioId(entity.getServicioId());
        ejecucion.setFecha(entity.getFecha());
        ejecucion.setFechaFin(entity.getFechaFin());
        ejecucion.setCriterios(entity.getCriterios());
        ejecucion.setEstado(entity.getEstado());

        ejecucion.getListaMotivoEstado().addAll(entity.getListaMotivoEstado());
        return ejecucion;
    }

    public static EjecucionConsultaEntity mapToEntity(EjecucionConsulta entity){

        EjecucionConsultaEntity ejecucion = new EjecucionConsultaEntity();
        ejecucion.setEjecucionConsultaId(entity.getEjecucionConsultaId());
        ejecucion.setEntidadId(entity.getEntidadId());
        ejecucion.setUsuarioId(entity.getUsuarioId());
        ejecucion.setServicioId(entity.getServicioId());
        ejecucion.setFecha(entity.getFecha());
        ejecucion.setFechaFin(entity.getFechaFin());
        ejecucion.setCriterios(entity.getCriterios());
        ejecucion.setEstado(entity.getEstado());

        ejecucion.getListaMotivoEstado().addAll(entity.getListaMotivoEstado());
        return ejecucion;
    }

    public static List<EjecucionConsulta> mapListToDomain(List<EjecucionConsultaEntity> jecucionConsultaEntity){

        List<EjecucionConsulta> listOut =  new ArrayList<>();

        jecucionConsultaEntity.forEach( entiy ->{
            listOut.add(mapToDomain(entiy));

        });
        return listOut;
    }

}
