package gs.hexagonaldemo.springhexagonaldemo.controllers;


import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ServicioSistemaES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

@RestController
public class ServicioSistemaRestController {


    private ServicioSistemaES servicioSistemaES;

    @Autowired
    public ServicioSistemaRestController(ServicioSistemaES servicioSistemaES) {
        this.servicioSistemaES = servicioSistemaES;
    }

    @GetMapping(value = "/servicioSistema/{id}")
    public ResponseEntity<ServicioSistema> getservicioSistemaById(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Integer motivoId = Integer.parseInt(id);
        ServicioSistema servicioSistema  = servicioSistemaES.buscarServicioPorId(motivoId).get();
        return ResponseEntity.ok(servicioSistema);
    }

    @GetMapping(value = "/servicioSistema")
    public ResponseEntity<List<ServicioSistema>> getServicioSistema() {
        System.out.println("Entring getServicioSistema: ");
        Collection<ServicioSistema> servicios  = servicioSistemaES.buscarServicios().get();
        return ResponseEntity.ok(servicios.stream().toList());

    }

}
