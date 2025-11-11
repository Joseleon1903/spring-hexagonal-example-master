package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsultarCarteraAfiliadoPorPeriodoRestController {


    private final ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort;

    @Autowired
    public ConsultarCarteraAfiliadoPorPeriodoRestController( ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort) {
        this.consultarCarteraAfiliadoPorPeriodoPort = consultarCarteraAfiliadoPorPeriodoPort;
    }

    @GetMapping(value = "/consultarCarteraAfiliadoPorPeriodo")
    public ResponseEntity<ConsultarCarteraAfiliadoPorPeriodoResponse> getIntercambiosByParams(@RequestParam("periodo") Integer periodo,
                                                                                              @RequestParam("estadoAfiliacion") String estadoAfiliacion,
                                                                                              @RequestParam("indice") Integer indice) {
        ConsultarCarteraAfiliadoPorPeriodoResponse response = consultarCarteraAfiliadoPorPeriodoPort.consultarCarteraAfiliadoPorPeriodo(
                new ConsultarCarteraAfiliadoPorPeriodo(periodo, estadoAfiliacion, indice));
        return ResponseEntity.ok(response);
    }
}