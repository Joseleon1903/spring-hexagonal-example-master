package gs.hexagonaldemo.springhexagonaldemo.serviceports;

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
     */
    IntercambioInformacion buscarIntercambioInformacionPorId(Integer IntercambioInformacionId);

    /**
     *
     * @return returns
     *         com.unipago.suirsigma.commons.intercambioinformaciones.types
     *         .BuscarIntercambioInformacionPorServicioResponseType
     * @throws InternalServiceException
     */
    List<IntercambioInformacion> buscarIntercambiosInformacionPorServicio( Integer servicioId,Short tipoIntercambioInformacion,String estado);

    /**
     *
     * @return returns
     *         com.unipago.suirsigma.commons.intercambioinformaciones.types
     *         .ValidarParametrosEjecucionResponseType
     * @throws InternalServiceException
     */
    @Deprecated
    Boolean validarParametrosEjecucion(List<ParametroIntercambioInformacion> parametros);

}
