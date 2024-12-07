package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.ports.IntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.ports.IntercambioInformacionRepository;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class IntercambioInformacionAdapter implements IntercambioInformacionES {

    private IntercambioInformacionRepository intercambioInformacionRepository;

    public IntercambioInformacionAdapter(IntercambioInformacionRepository intercambioInformacionRepository) {
        this.intercambioInformacionRepository = intercambioInformacionRepository;
    }

    @Override
    public IntercambioInformacion buscarIntercambioInformacionPorId(Integer IntercambioInformacionId) {
        return intercambioInformacionRepository.buscarIntercambioInformacionPorId(IntercambioInformacionId).get();
    }

    @Override
    public List<IntercambioInformacion> buscarIntercambiosInformacionPorServicio(Integer servicioId, Short tipoIntercambioInformacion, String estado)  {
        return Collections.emptyList();
    }

    @Override
    public Boolean validarParametrosEjecucion(List<ParametroIntercambioInformacion> parametros) {
        return null;
    }
}
