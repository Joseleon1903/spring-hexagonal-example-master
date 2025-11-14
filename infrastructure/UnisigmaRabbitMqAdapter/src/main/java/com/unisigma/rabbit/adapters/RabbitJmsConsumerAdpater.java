package com.unisigma.rabbit.adapters;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.RabbitJmsConsumer;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.SolicitudServicioES;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Optional;

public class RabbitJmsConsumerAdpater implements RabbitJmsConsumer {

    public static final String queueName = "unisigma_message_queue";

    private SolicitudServicioES solicitudServicioES;

    EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

    @Autowired
    public RabbitJmsConsumerAdpater(SolicitudServicioES solicitudServicioES, EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES) {
        this.solicitudServicioES = solicitudServicioES;
        this.ejecucionIntercambioInformacionES = ejecucionIntercambioInformacionES;
    }

    @RabbitListener(queues = queueName)
    @Override
    public void consumerMessage(SolicitudServicio solicitudServicio)  {
        System.out.println("Entering consuming queue: "+queueName);
        EjecucionIntercambioInformacion ejecucion =  null;
        try{
            ObjectMapper objectMapper = new ObjectMapper();
            objectMapper.registerModule(new JavaTimeModule()); // Registrar soporte para LocalDate

            // Convertir el JSON String a un objeto
            ejecucion = objectMapper.readValue(solicitudServicio.getMensaje(), EjecucionIntercambioInformacion.class);
        } catch (JsonProcessingException e) {
            System.out.println("Error procesando intercambio : "+ e.getMessage() );
            throw new RuntimeException(e);
        }

        try{
            System.out.println("procesando ejecucion intercambio");
            solicitudServicioES.procesarEjecucionIntercambioInformacion(ejecucion);
        }catch (Exception ex){
            System.out.println("Error procesando intercambio : "+ ex.getMessage() );
            System.out.println("rechazando ejecucion Intercambio  : "+ ejecucion.getEjecucionIntercambioInfoId() );
            ejecucion = ejecucionIntercambioInformacionES.buscarEjecucionIntercambioInformacionPorId(ejecucion.getEjecucionIntercambioInfoId()).get();
            ejecucion.setEstado("RE");
            ejecucion.setFechaFin(LocalDate.now());
            ejecucion.setMotivoId(1607);
            ejecucion.setFechaRespuesta(LocalDate.now());
            System.out.println("actualizando  "+ ejecucion);
            ejecucionIntercambioInformacionES.actualizarEjecucionIntercambioInformacion(ejecucion).get();
        }
        System.out.println("exiting consumerMessage...");
    }


}
