package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;

public interface SolicitudServicioES {

    /**
     */
    SolicitudServicio registrarSolicitudServicio(
            SolicitudServicio solicitudServicio);

    /**
     */
    Boolean esServicioProxyPermitidoEntidad(String codigoUsuario, String nombreServicioProxy);


    Boolean procesarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion ejecucionIntercambioInformacion);
}
