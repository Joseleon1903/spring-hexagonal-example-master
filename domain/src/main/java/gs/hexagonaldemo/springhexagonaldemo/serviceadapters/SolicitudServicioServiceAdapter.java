package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.SolicitudServicioES;

public class SolicitudServicioServiceAdapter implements SolicitudServicioES {


    @Override
    public SolicitudServicio registrarSolicitudServicio(SolicitudServicio solicitudServicio) {
        return null;
    }

    @Override
    public Boolean esServicioProxyPermitidoEntidad(String codigoUsuario, String nombreServicioProxy) {
        return null;
    }
}
