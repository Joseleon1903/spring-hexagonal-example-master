package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.TipoEventoSistema;
import gs.hexagonaldemo.springhexagonaldemo.ports.TipoEventoSistemaES;

public class TipoEventoSistemaAdapter implements TipoEventoSistemaES {


    @Override
    public TipoEventoSistema buscarTipoEventoSistemaPorId(Short TipoEventoSistemaId) throws InternalServiceException {
        return null;
    }


}
