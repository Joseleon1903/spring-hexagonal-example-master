package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;

public interface ParametroRepository {


    Parametro findById(String ParametroId);

    Parametro findValorParametro(String parametroId, Integer entidadId,Integer servicioId);
}