package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.ports.BitacoraEventoES;
import gs.hexagonaldemo.springhexagonaldemo.ports.HorarioServicioES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class BitacoraEventoRestController {

    private BitacoraEventoES bitacoraEventoES;

    @Autowired
    public BitacoraEventoRestController(BitacoraEventoES bitacoraEventoES) {
        this.bitacoraEventoES = bitacoraEventoES;
    }

    @PostMapping(value = "/bitacoraEvento")
    public ResponseEntity<BitacoraEvento> getMotivoEstado(@RequestBody BitacoraEvento bitacoraEvento) {
        System.out.println("Entering bitacoraEvento: "+bitacoraEvento);
        BitacoraEvento bitacora  = bitacoraEventoES.registrarBitacora(bitacoraEvento);
        return ResponseEntity.ok(bitacora);
    }


}
