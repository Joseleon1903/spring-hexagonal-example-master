package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.SolicitudServicioES;

public class SolicitudServicioServiceAdapter implements SolicitudServicioES {


    @Override
    public SolicitudServicio registrarSolicitudServicio(SolicitudServicio solicitudServicio) {
        System.out.println("registrarSolicitudServicio");

        System.out.println("solicitudServicio: "+solicitudServicio);


        System.out.println("finalizando registro solicitud servicio: ");
        return solicitudServicio;
    }

    @Override
    public Boolean esServicioProxyPermitidoEntidad(String codigoUsuario, String nombreServicioProxy) {
        return null;
    }
}
