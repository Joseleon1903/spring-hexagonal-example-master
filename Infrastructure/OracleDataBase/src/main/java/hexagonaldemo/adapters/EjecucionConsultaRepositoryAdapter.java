package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarResumenEjecucionesConsultaPorFechaType;
import hexagonaldemo.entity.EjecucionConsultaEntity;
import hexagonaldemo.mapper.EjecucionConsultaMapper;
import hexagonaldemo.repositories.EjecucionConsultaRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class EjecucionConsultaRepositoryAdapter implements EjecucionConsultaRepository {

    @Autowired
    private EjecucionConsultaRep ejecucionConsultaRep;


    @Override
    public EjecucionConsulta registrarEjecucionConsulta(EjecucionConsulta ejecucionConsulta) {
        EjecucionConsultaEntity ejecucion = ejecucionConsultaRep.save(EjecucionConsultaMapper.mapToEntity(ejecucionConsulta));
        return EjecucionConsultaMapper.mapToDomain(ejecucion);
    }

    @Override
    public List<EjecucionConsulta> buscarResumenEjecucionesConsultaPorFecha(BuscarResumenEjecucionesConsultaPorFechaType buscarResumenEjecucionesConsultaPorFechaType) {
        return List.of();
    }
}
