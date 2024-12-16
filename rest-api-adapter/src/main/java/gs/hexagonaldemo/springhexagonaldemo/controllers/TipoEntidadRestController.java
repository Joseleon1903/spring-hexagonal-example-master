package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.TipoEntidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.TipoEntidadES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TipoEntidadRestController {

    private TipoEntidadES tipoEntidadES;

    @Autowired
    public TipoEntidadRestController(TipoEntidadES tipoEntidadES) {
        this.tipoEntidadES = tipoEntidadES;
    }

    @GetMapping(value = "/tipoEntidad/{id}")
    public ResponseEntity<TipoEntidad> getParametro(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Short tipoId = Short.parseShort(id);
        TipoEntidad param  = tipoEntidadES.buscarTipoEntidadPorId(tipoId).get();
        return ResponseEntity.ok(param);
    }


}