package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import gs.hexagonaldemo.springhexagonaldemo.ports.ParametroES;
import gs.hexagonaldemo.springhexagonaldemo.ports.ParametroRepository;

public class ParametroServicioAdapter implements ParametroES {

    private ParametroRepository parametroRepository;

    public ParametroServicioAdapter(ParametroRepository parametroRepository) {
        this.parametroRepository = parametroRepository;
    }

    @Override
    public Parametro buscarParametroPorId(String parametroId) {
        return parametroRepository.findById(parametroId);
    }

    @Override
    public Parametro buscarValorParametro(String parametroId, Integer entidadId, Integer servicioId) {
        return parametroRepository.findValorParametro(parametroId, entidadId, servicioId);
    }
}
