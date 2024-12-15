package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarteraAfiliadoRestController {

    private CarteraAfiliadoES carteraAfiliadoES;

    @Autowired
    public CarteraAfiliadoRestController(CarteraAfiliadoES carteraAfiliadoES) {
        this.carteraAfiliadoES = carteraAfiliadoES;
    }

    @PostMapping(value = "/carteraAfiliado")
    public ResponseEntity<CarteraAfiliado> createCarteraAfiliado(@RequestBody CarteraAfiliado carteraAfiliado) {
        System.out.println("Entring createCarteraAfiliado: "+carteraAfiliado);
        CarteraAfiliado cartera  = carteraAfiliadoES.registrarCarteraAfiliado(
                carteraAfiliado).get();
        return ResponseEntity.ok(cartera);
    }

}
