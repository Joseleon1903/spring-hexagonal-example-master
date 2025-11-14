package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class  CarteraAfiliadoRestController {

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

    @GetMapping(value = "/carteraAfiliado/periodo")
    public ResponseEntity<BuscarCarteraAfiliadosPorEntidadPeriodoResponse> createCarteraAfiliado(@RequestParam("entidadId") Integer entidadId,
                                                                                                 @RequestParam("periodo") Integer periodo,
                                                                                                 @RequestParam("estadoAfiliacion") String estadoAfiliacion,
                                                                                                 @RequestParam("indice") Integer indice,
                                                                                                 @RequestParam("cantidadRegistrosParticion") Integer cantidadRegistrosParticion


    ) {
        System.out.println("param entidadId: "+entidadId);
        System.out.println("param periodo: "+periodo);
        System.out.println("param estadoAfiliacion: "+estadoAfiliacion);
        System.out.println("param indice: "+indice);
        System.out.println("param cantidadRegistrosParticion: "+cantidadRegistrosParticion);

        BuscarCarteraAfiliadosPorEntidadPeriodoResponse cartera  = carteraAfiliadoES.buscarCarteraAfiliadosPorEntidadPeriodo( entidadId,  periodo,  estadoAfiliacion,
                 indice,  cantidadRegistrosParticion);
        return ResponseEntity.ok(cartera);
    }

}
