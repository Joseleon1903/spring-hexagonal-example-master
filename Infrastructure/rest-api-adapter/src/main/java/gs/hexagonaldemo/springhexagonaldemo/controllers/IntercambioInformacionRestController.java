package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.IntercambioInformacionES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class IntercambioInformacionRestController {

    private IntercambioInformacionES intercambioInformacionES;

    @Autowired
    public IntercambioInformacionRestController(IntercambioInformacionES intercambioInformacionES) {
        this.intercambioInformacionES = intercambioInformacionES;
    }

    @GetMapping(value = "/intercambioInformacion/{id}")
    public ResponseEntity<IntercambioInformacion> getIntercambios(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Integer interId = Integer.parseInt(id);
        IntercambioInformacion intercambios  = intercambioInformacionES.buscarIntercambioInformacionPorId(interId);
        return ResponseEntity.ok(intercambios);
    }

    @GetMapping(value = "/intercambioInformacion")
    public ResponseEntity<List<IntercambioInformacion>> getIntercambiosByParams(@RequestParam("servicioId") Integer servicioId,
                                                                                @RequestParam("tipoIntercambioInformacion") Short tipoIntercambioInformacion,
                                                                                @RequestParam("estado") String estado) {
        List<IntercambioInformacion> intercambios  = intercambioInformacionES.buscarIntercambiosInformacionPorServicio(servicioId, tipoIntercambioInformacion, estado);
        return ResponseEntity.ok(intercambios);
    }

}
