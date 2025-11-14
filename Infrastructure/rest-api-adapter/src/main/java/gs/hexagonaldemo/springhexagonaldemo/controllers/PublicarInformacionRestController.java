package gs.hexagonaldemo.springhexagonaldemo.controllers;


import gs.hexagonaldemo.springhexagonaldemo.models.PublicarInformacion;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.PublicarInformacionPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PublicarInformacionRestController {

    private PublicarInformacionPort publicarInformacionPort;

    @Autowired
    public PublicarInformacionRestController(PublicarInformacionPort publicarInformacionPort) {
        this.publicarInformacionPort = publicarInformacionPort;
    }

    @PostMapping(value = "/publicarInformacion")
    public ResponseEntity<Void> publicarInformacion(@RequestBody PublicarInformacion publicarInformacion) {
        System.out.println("Entring publicarInformacion: "+publicarInformacion);
        publicarInformacionPort.publicarInformacion(publicarInformacion);
        return ResponseEntity.ok().build();
    }


}
