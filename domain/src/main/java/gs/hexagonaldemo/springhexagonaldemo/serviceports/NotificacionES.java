package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.GenerarSolicitudNotificacionType;

public interface NotificacionES {

    /**
     * <dl>
     * <dt><b>Descripci�n de la L�gica:</b></dt>
     * <dd>La Capacidad compone los diferentes elementos de una solicitud de notificaci�n: validando la suscripci�n de la entidad a ser notificada,
     *	las v�as de notificaci�n de la suscripci�n , busca las definiciones de notificaci�n para el tipo de notificaci�n, entidad y servicio y reliza las validaciones correspondientes
     *	para las mismas y  prepara la lista de destinatarios.</dd>
     *
     * </dl>
     * @param generarSolicitudNotificacionInput - Datos de la Solicitud de Notificacion
     * @Asynchronous
     * @return
     */
    void generarSolicitudNotificacion(GenerarSolicitudNotificacionType generarSolicitudNotificacionInput);
}
