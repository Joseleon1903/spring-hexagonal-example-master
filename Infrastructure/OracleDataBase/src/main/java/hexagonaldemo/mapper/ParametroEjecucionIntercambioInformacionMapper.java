package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEjecucionIntercambioInformacion;
import hexagonaldemo.entity.HorarioServicioEntity;
import hexagonaldemo.entity.ParametroEjecucionIntercambioInformacionEntity;

public class ParametroEjecucionIntercambioInformacionMapper {

    public static ParametroEjecucionIntercambioInformacion mapToDomain(ParametroEjecucionIntercambioInformacionEntity type) {

        ParametroEjecucionIntercambioInformacion param = new ParametroEjecucionIntercambioInformacion();
        //param.setEjecucionIntercambioInformacionId(EjecucionIntercambioInformacionMapper.mapToDomain(type.getEjecucionIntercambioInformacionId()));
        param.setParametroEjecucionIntercambioInformacionId(type.getParametroEjecucionIntercambioInformacionId());
        param.setValor(type.getValor());
        param.setCodigoParametro(type.getCodigoParametro());
        param.setParametroIntercambioInformacionId(type.getParametroIntercambioInformacionId());

        return param;
    }

    public static ParametroEjecucionIntercambioInformacionEntity mapToEntity(ParametroEjecucionIntercambioInformacion type) {

        ParametroEjecucionIntercambioInformacionEntity param = new ParametroEjecucionIntercambioInformacionEntity();

        param.setEjecucionIntercambioInformacionId(EjecucionIntercambioInformacionMapper.mapToEntity(type.getEjecucionIntercambioInformacionId()));
        param.setParametroEjecucionIntercambioInformacionId(type.getParametroEjecucionIntercambioInformacionId());
        param.setValor(type.getValor());
        param.setCodigoParametro(type.getCodigoParametro());
        param.setParametroIntercambioInformacionId(type.getParametroIntercambioInformacionId());

        return param;
    }
}
