package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.ports.IntercambioInformacionES;

import java.util.Collections;
import java.util.List;

public class IntercambioInformacionAdapter implements IntercambioInformacionES {


    @Override
    public IntercambioInformacion buscarIntercambioInformacionPorId(Long IntercambioInformacionId) throws InternalServiceException {
        return null;
    }

    @Override
    public List<IntercambioInformacion> buscarIntercambiosInformacionPorServicio(Integer servicioId, Short tipoIntercambioInformacion, String estado) throws InternalServiceException {
        return Collections.emptyList();
    }

    @Override
    public Boolean validarParametrosEjecucion(List<ParametroIntercambioInformacion> parametros) throws InternalServiceException {
        return null;
    }
}
