package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class HorarioServicioRestController {

    private HorarioServicioES horarioServicioES;

    @Autowired
    public HorarioServicioRestController(HorarioServicioES horarioServicioES) {
        this.horarioServicioES = horarioServicioES;
    }

    @PostMapping(value = "/horarioServicio")
    public ResponseEntity<HorarioServicio> createIntercambios(@RequestBody HorarioServicio horarioServicio) {
        System.out.println("Entring horarioServicio: "+horarioServicio);
        HorarioServicio horarioServicioOut  = horarioServicioES.registrarHorario(horarioServicio);
        return ResponseEntity.ok(horarioServicioOut);
    }

    @GetMapping(value = "/horarioServicio/{id}")
    public ResponseEntity<HorarioServicio> getHorarioServicio(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Long interId = Long.parseLong(id);
        HorarioServicio horario  = horarioServicioES.buscarHorarioServicioPorId(interId);
        return ResponseEntity.ok(horario);
    }

    @PutMapping(value = "/horarioServicio")
    public ResponseEntity<HorarioServicio> updateIntercambios(@RequestBody HorarioServicio horarioServicio) {
        System.out.println("Entering horarioServicio: "+horarioServicio);
        HorarioServicio horarioServicioOut  = horarioServicioES.actualizarHorarioServicio(horarioServicio);
        return ResponseEntity.ok(horarioServicioOut);
    }

   // Boolean estaServicioDisponible(int servicioId, LocalDate fecha);




}
