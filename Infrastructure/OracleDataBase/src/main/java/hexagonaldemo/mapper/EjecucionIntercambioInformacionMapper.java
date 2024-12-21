package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEjecucionIntercambioInformacion;
import hexagonaldemo.entity.EjecucionIntercambioInformacionEntity;
import hexagonaldemo.entity.ParametroEjecucionIntercambioInformacionEntity;

import java.util.ArrayList;
import java.util.List;

public class EjecucionIntercambioInformacionMapper {

    public static EjecucionIntercambioInformacion mapToDomain(EjecucionIntercambioInformacionEntity type) {

        EjecucionIntercambioInformacion eii = new EjecucionIntercambioInformacion();
        eii.setEjecucionIntercambioInfoId(type.getEjecucionIntercambioInfoId());
        eii.setIntercambioInformacionId(type.getIntercambioInformacionId() != null ? IntercambioInformacionMapper.mapToDomain(type.getIntercambioInformacionId())  : null);
        eii.setUsuarioId(type.getUsuarioId());
        eii.setFechaInicio(type.getFechaInicio());
        eii.setFechaFin(type.getFechaFin());
        eii.setFechaRespuesta(type.getFechaRespuesta());
        if(type.getParametrosEjecucion() != null){
            List<ParametroEjecucionIntercambioInformacion> parametros = new ArrayList<>();
            for (ParametroEjecucionIntercambioInformacionEntity paramType : type.getParametrosEjecucion()) {

                parametros.add(ParametroEjecucionIntercambioInformacionMapper.mapToDomain(paramType));
            }
            eii.setParametrosEjecucion(parametros);
        }

        if(type.getEntidadesAfectadas() != null){
            eii.setEntidadesAfectadas(type.getEntidadesAfectadas());
        }
        eii.setCodigoServicio(type.getCodigoServicio());
        eii.setServicioId(type.getServicioId());
        eii.setEstado(type.getEstado());
        eii.setMotivoId(type.getMotivoId());
        return eii;
    }

    public static EjecucionIntercambioInformacionEntity mapToEntity(EjecucionIntercambioInformacion type) {

        EjecucionIntercambioInformacionEntity eii = new EjecucionIntercambioInformacionEntity();
        eii.setEjecucionIntercambioInfoId(type.getEjecucionIntercambioInfoId() != null ? type.getEjecucionIntercambioInfoId() : null );
        eii.setIntercambioInformacionId(type.getIntercambioInformacionId() != null ? IntercambioInformacionMapper.mapToEntity(type.getIntercambioInformacionId())  : null);
        eii.setUsuarioId(type.getUsuarioId());
        eii.setFechaInicio(type.getFechaInicio());
        eii.setFechaFin(type.getFechaFin());
        eii.setFechaRespuesta(type.getFechaRespuesta());
        if(type.getParametrosEjecucion() != null){
            List<ParametroEjecucionIntercambioInformacionEntity> parametros = new ArrayList<>();
            for (ParametroEjecucionIntercambioInformacion paramType : type.getParametrosEjecucion()) {

                ParametroEjecucionIntercambioInformacionEntity entityParam = new ParametroEjecucionIntercambioInformacionEntity();
                entityParam.setParametroEjecucionIntercambioInformacionId(null);
                entityParam.setEjecucionIntercambioInformacionId(eii);
                entityParam.setValor(paramType.getValor());
                entityParam.setParametroIntercambioInformacionId(type.getIntercambioInformacionId() != null ? type.getIntercambioInformacionId().getIntercambioInformacionId() : null);
                entityParam.setCodigoParametro(paramType.getCodigoParametro());
                parametros.add(entityParam);
            }
            eii.setParametrosEjecucion(parametros);
        }

        if(type.getEntidadesAfectadas() != null){
            eii.setEntidadesAfectadas(type.getEntidadesAfectadas());
        }
        eii.setCodigoServicio(type.getCodigoServicio());
        eii.setServicioId(type.getServicioId());
        eii.setEstado(type.getEstado());
        eii.setMotivoId(type.getMotivoId());
        return eii;
    }
}
