package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarResumenEjecucionesConsultaPorFechaType;

import java.util.List;
import java.util.Optional;

public class EjecucionConsultaServiceAdapter implements EjecucionConsultaES {

    private EjecucionConsultaRepository ejecucionConsultaRepository;

    public EjecucionConsultaServiceAdapter(EjecucionConsultaRepository ejecucionConsultaRepository) {
        this.ejecucionConsultaRepository = ejecucionConsultaRepository;
    }

    @Override
    public Optional<EjecucionConsulta> registrarEjecucionConsulta(EjecucionConsulta ejecucionConsulta) {
        return Optional.of(ejecucionConsultaRepository.registrarEjecucionConsulta(ejecucionConsulta));
    }

    @Override
    public List<EjecucionConsulta> buscarResumenEjecucionesConsultaPorFecha(BuscarResumenEjecucionesConsultaPorFechaType buscarResumenEjecucionesConsultaPorFechaType) {
        return List.of();
    }
}
