package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioES;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarHorariosServicioPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.BuscarHorariosServicioPorDatosGeneralesResponseType;

import java.time.LocalDate;

public class HorarioServicioAdapter implements HorarioServicioES {


    @Override
    public HorarioServicio registrarHorario(HorarioServicio horarioServicio) {
        return null;
    }

    @Override
    public Boolean estaServicioDisponible(int servicioId, LocalDate fecha) {
        return null;
    }

    @Override
    public HorarioServicio actualizarHorarioServicio(HorarioServicio actualizarHorarioServicio) {
        return null;
    }

    @Override
    public BuscarHorariosServicioPorDatosGeneralesResponseType buscarHorariosServicioPorDatosGenerales(BuscarHorariosServicioPorDatosGeneralesType buscarHorariosServicioPorDatosGeneralesInput) {
        return null;
    }

    @Override
    public HorarioServicio buscarHorarioServicioPorId(Long horarioServicioId) {
        return null;
    }
}
