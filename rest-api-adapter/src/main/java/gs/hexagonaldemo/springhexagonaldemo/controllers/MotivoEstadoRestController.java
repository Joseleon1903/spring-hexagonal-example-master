package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MotivoEstadoRestController {

    private MotivoEstadoService motivoEstadoService;

    @Autowired
    public MotivoEstadoRestController(MotivoEstadoService motivoEstadoService) {
        this.motivoEstadoService = motivoEstadoService;
    }

    @GetMapping(value = "/motivoEstado/{id}")
    public ResponseEntity<MotivoEstado> getMotivoEstado(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Long motivoId = Long.parseLong(id);
        MotivoEstado motivo  = motivoEstadoService.buscarMotivoEstadoPorId(motivoId).get();
        //MotivoEstado motivo = new MotivoEstado(1L,"ejemplo", true, 1L, "AC" );
        return ResponseEntity.ok(motivo);

    }


}
