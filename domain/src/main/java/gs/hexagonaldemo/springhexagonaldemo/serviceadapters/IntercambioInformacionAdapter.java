package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.IntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.IntercambioInformacionRepository;

import java.util.Collections;
import java.util.List;

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
