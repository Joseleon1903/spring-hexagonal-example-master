package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import hexagonaldemo.entity.HorarioServicioEntity;

import java.util.ArrayList;
import java.util.List;

public class HorarioServicioMapper {

    public static HorarioServicio mapToDomain(HorarioServicioEntity type) {

        HorarioServicio horarioServicio = new HorarioServicio();

        horarioServicio.setHorarioServicioId(type.getHorarioServicioId());
        horarioServicio.setServicioSistemaId(type.getServicioSistemaId());
        horarioServicio.setDiaAplicacion(type.getDiaAplicacion());
        horarioServicio.setEstado(type.getEstado());
        horarioServicio.setHoraInicio(type.getHoraInicio());
        horarioServicio.setHoraFin(type.getHoraFin());
        horarioServicio.setEstado(type.getEstado());
        horarioServicio.setUsuarioCreacionId(type.getUsuarioCreacionId());
        horarioServicio.setFechaCreacion(type.getFechaCreacion());
        horarioServicio.setUsuarioUltimoCambioId(type.getUsuarioUltimoCambioId());
        horarioServicio.setFechaUltimoCambio(type.getFechaUltimoCambio());

        return horarioServicio;
    }

    public static HorarioServicioEntity mapToEntity(HorarioServicio type) {

        HorarioServicioEntity horarioServicio = new HorarioServicioEntity();

        horarioServicio.setHorarioServicioId(type.getHorarioServicioId());
        horarioServicio.setServicioSistemaId(type.getServicioSistemaId());
        horarioServicio.setDiaAplicacion(type.getDiaAplicacion());
        horarioServicio.setEstado(type.getEstado());
        horarioServicio.setHoraInicio(type.getHoraInicio());
        horarioServicio.setHoraFin(type.getHoraFin());
        horarioServicio.setEstado(type.getEstado());
        horarioServicio.setUsuarioCreacionId(type.getUsuarioCreacionId());
        horarioServicio.setFechaCreacion(type.getFechaCreacion());
        horarioServicio.setUsuarioUltimoCambioId(type.getUsuarioUltimoCambioId());
        horarioServicio.setFechaUltimoCambio(type.getFechaUltimoCambio());

        return horarioServicio;
    }

    public static List<HorarioServicio> mapListToDomain(List<HorarioServicioEntity> intercambioInformacionEntityList){

        List<HorarioServicio> listOut =  new ArrayList<>();

        intercambioInformacionEntityList.forEach( entiy ->{
            listOut.add(HorarioServicioMapper.mapToDomain(entiy));

        });
        return listOut;
    }

}
