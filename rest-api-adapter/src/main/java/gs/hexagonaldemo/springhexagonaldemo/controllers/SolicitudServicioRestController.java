package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.SolicitudServicioES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SolicitudServicioRestController {

    private SolicitudServicioES solicitudServicioES;

    @Autowired
    public SolicitudServicioRestController(SolicitudServicioES solicitudServicioES) {
        this.solicitudServicioES = solicitudServicioES;
    }

    @PostMapping(value = "/solicitudServicio")
    public ResponseEntity<Void> postSolicitudServicio(@RequestBody SolicitudServicio solicitudServicio) {
        System.out.println("Entering postSolicitudServicio... ");
        solicitudServicioES.registrarSolicitudServicio(solicitudServicio);
        return ResponseEntity.ok().build();
    }
}
