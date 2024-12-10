package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.serviceports.NotificacionES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.GenerarSolicitudNotificacionType;

public class NotificacionServiceAdapter implements NotificacionES{

    @Override
    public void generarSolicitudNotificacion(GenerarSolicitudNotificacionType generarSolicitudNotificacionInput) {
        System.out.println("Entering generarSolicitudNotificacion");

        System.out.println("generarSolicitudNotificacionInput :"+generarSolicitudNotificacionInput);

        System.out.println("Solicitud notificacion generada con exito.....");

    }
}
