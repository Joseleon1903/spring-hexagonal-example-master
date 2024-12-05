package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.ports.EjecucionIntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarEjecucionesIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarExcepcionesEjecucionIntercambioInformacionType;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarUltimoIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.BuscarExcepcionesEjecucionIntercambioInformacionResponseType;

import java.util.Collections;
import java.util.List;

public class EjecucionIntercambioInformacionAdapter  implements EjecucionIntercambioInformacionES {

    @Override
    public EjecucionIntercambioInformacion registrarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion parameters) throws InternalServiceException {
        return null;
    }

    @Override
    public EjecucionIntercambioInformacion actualizarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion parameters) throws InternalServiceException {
        return null;
    }

    @Override
    public EjecucionIntercambioInformacion buscarEjecucionIntercambioInformacionPorId(Long buscarIntercambioInformacionPorId) throws InternalServiceException {
        return null;
    }

    @Override
    public EjecucionIntercambioInformacion buscarUltimoIntercambioInformacionPorServicio(BuscarUltimoIntercambioInformacionPorServicioType buscarUltimoIntercambioInformacionPorServicioInput) throws InternalServiceException {
        return null;
    }

    @Override
    public List<EjecucionIntercambioInformacion> buscarEjecucionesIntercambioInformacionPorServicio(BuscarEjecucionesIntercambioInformacionPorServicioType buscarEjecucionesIntercambioInformacionPorServicioInput) throws InternalServiceException {
        return Collections.emptyList();
    }

    @Override
    public BuscarExcepcionesEjecucionIntercambioInformacionResponseType buscarExcepcionesEjecucionIntercambioInformacion(BuscarExcepcionesEjecucionIntercambioInformacionType buscarExcepcionesEjecucionIntercambioInformacionInput) throws InternalServiceException {
        return null;
    }

}
