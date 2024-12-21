package com.unisigma.rabbit.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.RabbitJms;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class RabbitJmsProducerAdpater implements RabbitJms {


    @Value("${rabbit.queue.exchange}")
    private String exchangeName;
    @Value("${rabbit.queue.route-key}")
    private String routingKey;

    @Autowired
    private RabbitTemplate rabbitTemplate;


    @Override
    public void publishMessage(SolicitudServicio solicitudServicio) {
        System.out.println("Entering in publishMessage");
        System.out.println("SolicitudServicio : "+solicitudServicio);

        System.out.println("EXCHANGE "+exchangeName);
        System.out.println("ROUTING_KEY "+routingKey);

        rabbitTemplate.convertAndSend(exchangeName,
                routingKey, solicitudServicio);
    }
}
