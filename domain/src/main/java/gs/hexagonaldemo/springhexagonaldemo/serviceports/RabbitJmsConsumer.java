package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;

public interface RabbitJmsConsumer {

    void consumerMessage(SolicitudServicio solicitudServicio);
}
