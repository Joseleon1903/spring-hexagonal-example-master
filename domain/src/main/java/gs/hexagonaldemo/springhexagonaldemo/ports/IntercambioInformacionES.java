package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.exception.DatoRequeridoNoProporcionadoException;
import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.ParametroIntercambioInformacion;

import java.util.List;

public interface IntercambioInformacionES {

    /**
     *
     * @return returns
     *         com.unipago.suirsigma.commons.intercambioinformaciones.types
     *         .BuscarIntercambioInformacionPorIdResponseType
     * @throws InternalServiceException
     * @throws DatoRequeridoNoProporcionadoException
     */
    IntercambioInformacion buscarIntercambioInformacionPorId(Long IntercambioInformacionId) throws InternalServiceException;

    /**
     *
     * @return returns
     *         com.unipago.suirsigma.commons.intercambioinformaciones.types
     *         .BuscarIntercambioInformacionPorServicioResponseType
     * @throws DatoRequeridoNoProporcionadoException
     * @throws InternalServiceException
     */
    List<IntercambioInformacion> buscarIntercambiosInformacionPorServicio( Integer servicioId,Short tipoIntercambioInformacion,String estado)
            throws InternalServiceException;

    /**
     *
     * @return returns
     *         com.unipago.suirsigma.commons.intercambioinformaciones.types
     *         .ValidarParametrosEjecucionResponseType
     * @throws InternalServiceException
     */
    @Deprecated
    Boolean validarParametrosEjecucion(List<ParametroIntercambioInformacion> parametros)throws InternalServiceException;

}
