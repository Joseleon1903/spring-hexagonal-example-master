package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionConsulta;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EjecucionConsultaRestController {

    private EjecucionConsultaES ejecucionConsultaES;

    @Autowired
    public EjecucionConsultaRestController(EjecucionConsultaES ejecucionConsultaES) {
        this.ejecucionConsultaES = ejecucionConsultaES;
    }

    @PostMapping(value = "/ejecucionConsulta")
    public ResponseEntity<EjecucionConsulta> createEjecucionConsulta(@RequestBody EjecucionConsulta ejecucionConsulta) {
        System.out.println("Entring createEjecucionConsulta: "+ejecucionConsulta);
        EjecucionConsulta ejecucion  = ejecucionConsultaES.registrarEjecucionConsulta(
                ejecucionConsulta).get();
        return ResponseEntity.ok(ejecucion);
    }
}
