package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EntidadES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EntidadRestController {

    private EntidadES entidadES;

    @Autowired
    public EntidadRestController(EntidadES entidadES) {
        this.entidadES = entidadES;
    }

    @GetMapping(value = "/entidad/{id}")
    public ResponseEntity<Entidad> getEntidadById(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Integer entidadId = Integer.parseInt(id);
        Entidad entidad  = entidadES.buscarEntidadPorId(entidadId).get();
        return ResponseEntity.ok(entidad);
    }

}
