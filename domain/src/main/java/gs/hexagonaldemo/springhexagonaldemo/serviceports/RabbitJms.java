package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;

public interface RabbitJms {

    void publishMessage(SolicitudServicio solicitudServicio);

}


