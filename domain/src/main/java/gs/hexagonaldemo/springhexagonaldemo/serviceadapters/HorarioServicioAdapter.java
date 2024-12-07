package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioES;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioRepository;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarHorariosServicioPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.BuscarHorariosServicioPorDatosGeneralesResponseType;

import java.time.LocalDate;

public class HorarioServicioAdapter implements HorarioServicioES {

    private HorarioServicioRepository horarioServicioRepository;

    public HorarioServicioAdapter(HorarioServicioRepository horarioServicioRepository) {
        this.horarioServicioRepository = horarioServicioRepository;
    }

    @Override
    public HorarioServicio registrarHorario(HorarioServicio horarioServicio) {
        return horarioServicioRepository.registrarHorario(horarioServicio);
    }

    @Override
    public Boolean estaServicioDisponible(int servicioId, LocalDate fecha) {
        return horarioServicioRepository.estaServicioDisponible(servicioId, fecha);
    }

    @Override
    public HorarioServicio actualizarHorarioServicio(HorarioServicio actualizarHorarioServicio) {
        return horarioServicioRepository.actualizarHorario(actualizarHorarioServicio);
    }

    @Override
    public BuscarHorariosServicioPorDatosGeneralesResponseType buscarHorariosServicioPorDatosGenerales(BuscarHorariosServicioPorDatosGeneralesType buscarHorariosServicioPorDatosGeneralesInput) {
        return null;
    }

    @Override
    public HorarioServicio buscarHorarioServicioPorId(Long horarioServicioId) {
        return horarioServicioRepository.buscarHorarioServicioPorId(horarioServicioId);
    }
}
