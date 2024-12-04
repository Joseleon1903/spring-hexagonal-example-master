package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.TipoEventoSistema;

public interface TipoEventoSistemaES {

    /**
     * <b>Descripci�n de la L�gica:</b> La Capacidad realiza una b�squeda en el cat�logo de tipo Evento Sistema por el id ,
     *  y retorna los datos del catalogo detipo Evento Sistema correspondiente al Id
     *
     * @return datos Generales del tipo evento sistema.
     * @throws InternalServiceException
     *
     */
    TipoEventoSistema buscarTipoEventoSistemaPorId(Short TipoEventoSistemaId)
            throws InternalServiceException;

}
