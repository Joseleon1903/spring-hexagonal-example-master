package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarResumenEjecucionesConsultaPorFechaType;

import java.util.List;

public interface EjecucionConsultaRepository {


    EjecucionConsulta registrarEjecucionConsulta(EjecucionConsulta ejecucionConsulta);


    List<EjecucionConsulta> buscarResumenEjecucionesConsultaPorFecha(BuscarResumenEjecucionesConsultaPorFechaType buscarResumenEjecucionesConsultaPorFechaType);


}
