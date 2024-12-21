package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarResumenEjecucionesConsultaPorFechaType;

import java.util.List;
import java.util.Optional;

public interface EjecucionConsultaES {

    /**
     *
     * @param ejecucionConsulta
     * @return
     */
    Optional<EjecucionConsulta> registrarEjecucionConsulta(EjecucionConsulta ejecucionConsulta);


    /**
     *
     * @param buscarResumenEjecucionesConsultaPorFechaType
     * @return
     */
    List<EjecucionConsulta> buscarResumenEjecucionesConsultaPorFecha(BuscarResumenEjecucionesConsultaPorFechaType buscarResumenEjecucionesConsultaPorFechaType);


}
