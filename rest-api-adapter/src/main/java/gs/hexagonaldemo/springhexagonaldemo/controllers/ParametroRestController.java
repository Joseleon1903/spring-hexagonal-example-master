package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import gs.hexagonaldemo.springhexagonaldemo.ports.ParametroES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParametroRestController {


    private ParametroES parametroES;

    @Autowired
    public ParametroRestController(ParametroES parametroES) {
        this.parametroES = parametroES;
    }

    @GetMapping(value = "/parametro/{id}")
    public ResponseEntity<Parametro> getParametro(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Parametro param  = parametroES.buscarParametroPorId(id);
        return ResponseEntity.ok(param);
    }

    @GetMapping(value = "/parametro")
    public ResponseEntity<Parametro> getParametroByParams(@RequestParam("parametroId") String parametroId,
                                                          @RequestParam("entidadId") Integer entidadId,
                                                          @RequestParam("servicioId") Integer servicioId) {
        System.out.println("Entring parametroId: "+parametroId);
        System.out.println("Entring entidadId: "+entidadId);
        System.out.println("Entring entidadIdInteger: "+servicioId);

        Parametro param  = parametroES.buscarValorParametro(parametroId, entidadId, servicioId);
        return ResponseEntity.ok(param);
    }


}
