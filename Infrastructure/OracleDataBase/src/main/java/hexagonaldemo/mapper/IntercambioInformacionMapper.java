package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import hexagonaldemo.entity.IntercambioInformacionEntity;

import java.util.ArrayList;
import java.util.List;

public class IntercambioInformacionMapper {

    public static IntercambioInformacion mapToDomain(IntercambioInformacionEntity intercambioInformacionEntity){

        IntercambioInformacion inter =  new IntercambioInformacion();

        inter.setIntercambioInformacionId(intercambioInformacionEntity.getIntercambioInformacionId());
        inter.setDescripcion(intercambioInformacionEntity.getDescripcion());
        inter.setEstado(intercambioInformacionEntity.getEstado());
        inter.setNombre(intercambioInformacionEntity.getNombre());
        inter.setEsquema(intercambioInformacionEntity.getEsquema());
        inter.setProcedimiento(intercambioInformacionEntity.getProcedimiento());
        inter.setServicioId(intercambioInformacionEntity.getServicioId());
        inter.setServicioEnvioId(intercambioInformacionEntity.getServicioEnvioId());
        inter.setRutaServicioTareaEspecifico(intercambioInformacionEntity.getRutaServicioTareaEspecifico());
        inter.setTipoIntercambioInformacion(intercambioInformacionEntity.getTipoIntercambioInformacion());
        inter.setEntidadRelacionadaId(intercambioInformacionEntity.getEntidadRelacionadaId());
        inter.setValidaEjecucionPrevia(intercambioInformacionEntity.isValidaEjecucionPrevia());
        inter.setValidaTiempoRetencionInformacion(intercambioInformacionEntity.isValidaTiempoRetencionInformacion());
        inter.setAsincrono(intercambioInformacionEntity.isAsincrono());
        //inter.setParametros(intercambioInformacionEntity.getParametros());


        return inter;
    }

    public static IntercambioInformacionEntity mapToDomain(IntercambioInformacion intercambioInformacionEntity){

        IntercambioInformacionEntity inter =  new IntercambioInformacionEntity();

        inter.setIntercambioInformacionId(intercambioInformacionEntity.getIntercambioInformacionId());
        inter.setDescripcion(intercambioInformacionEntity.getDescripcion());
        inter.setEstado(intercambioInformacionEntity.getEstado());
        inter.setNombre(intercambioInformacionEntity.getNombre());
        inter.setEsquema(intercambioInformacionEntity.getEsquema());
        inter.setProcedimiento(intercambioInformacionEntity.getProcedimiento());
        inter.setServicioId(intercambioInformacionEntity.getServicioId());
        inter.setServicioEnvioId(intercambioInformacionEntity.getServicioEnvioId());
        inter.setRutaServicioTareaEspecifico(intercambioInformacionEntity.getRutaServicioTareaEspecifico());
        inter.setTipoIntercambioInformacion(intercambioInformacionEntity.getTipoIntercambioInformacion());
        inter.setEntidadRelacionadaId(intercambioInformacionEntity.getEntidadRelacionadaId());
        inter.setValidaEjecucionPrevia(intercambioInformacionEntity.getValidaEjecucionPrevia());
        inter.setValidaTiempoRetencionInformacion(intercambioInformacionEntity.getValidaTiempoRetencionInformacion());
        inter.setAsincrono(intercambioInformacionEntity.getAsincrono());
        //inter.setParametros(intercambioInformacionEntity.getParametros());

        return inter;
    }

    public static List<IntercambioInformacion> mapListToDomain(List<IntercambioInformacionEntity> intercambioInformacionEntityList){

        List<IntercambioInformacion> listOut =  new ArrayList<>();

        intercambioInformacionEntityList.forEach( entiy ->{
            listOut.add(mapToDomain(entiy));

        });
        return listOut;
    }
}
