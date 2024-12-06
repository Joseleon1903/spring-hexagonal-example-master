package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MotivoEstadoRestController {

    private MotivoEstadoES motivoEstadoES;

    @Autowired
    public MotivoEstadoRestController(MotivoEstadoES motivoEstadoES) {
        this.motivoEstadoES = motivoEstadoES;
    }

    @GetMapping(value = "/motivoEstado/{id}")
    public ResponseEntity<MotivoEstado> getMotivoEstado(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Long motivoId = Long.parseLong(id);
        MotivoEstado motivo  = motivoEstadoES.buscarMotivoEstadoPorId(motivoId).get();
        return ResponseEntity.ok(motivo);
    }

    @GetMapping(value = "/motivoEstado/estado/{estado}")
    public ResponseEntity<List<MotivoEstado>> getMotivoEstadoByEstado(@PathVariable("estado") String estado) {
        System.out.println("Entring id: "+estado);
        List<MotivoEstado> motivos  = motivoEstadoES.buscarMotivosEstado(estado).get();
        return ResponseEntity.ok(motivos);

    }

}
