package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;

import java.time.LocalDate;

public interface HorarioServicioRepository {

    HorarioServicio registrarHorario(HorarioServicio horarioServicio);

    Boolean estaServicioDisponible(int servicioId, LocalDate fecha);

    HorarioServicio buscarHorarioServicioPorId(Long horarioServicioId);

    HorarioServicio actualizarHorario(HorarioServicio horarioServicio);

}
