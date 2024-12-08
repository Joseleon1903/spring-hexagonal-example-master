package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioRepository;
import hexagonaldemo.entity.HorarioServicioEntity;
import hexagonaldemo.mapper.HorarioServicioMapper;
import hexagonaldemo.repositories.HorarioServicioRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class HorarioServicioRepositoryAdapter implements HorarioServicioRepository {

    @Autowired
    private HorarioServicioRep horarioServicioRep;

    @Override
    public HorarioServicio registrarHorario(HorarioServicio horarioServicio) {
        HorarioServicioEntity hora = horarioServicioRep.save(HorarioServicioMapper.mapToEntity(horarioServicio));
        return HorarioServicioMapper.mapToDomain(hora);
    }

    @Override
    public Boolean estaServicioDisponible(int servicioId, LocalDate fecha) {
        return null;
    }

    @Override
    public HorarioServicio buscarHorarioServicioPorId(Long horarioServicioId) {
        HorarioServicioEntity hora = horarioServicioRep.getById(horarioServicioId);
        return HorarioServicioMapper.mapToDomain(hora);
    }

    @Override
    public HorarioServicio actualizarHorario(HorarioServicio horarioServicio) {
        HorarioServicioEntity hora = horarioServicioRep.save(HorarioServicioMapper.mapToEntity(horarioServicio));
        return HorarioServicioMapper.mapToDomain(hora);
    }
}
