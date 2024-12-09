package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjecucionIntercambioInformacionRestController {

    private EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

    @Autowired
    public EjecucionIntercambioInformacionRestController(EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES) {
        this.ejecucionIntercambioInformacionES = ejecucionIntercambioInformacionES;
    }

    @GetMapping(value = "/ejecucionIntercambioInformacion/{id}")
    public ResponseEntity<EjecucionIntercambioInformacion> getIntercambios(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Long interId = Long.parseLong(id);
        EjecucionIntercambioInformacion intercambios  = ejecucionIntercambioInformacionES.buscarEjecucionIntercambioInformacionPorId(interId).get();
        return ResponseEntity.ok(intercambios);
    }

}
