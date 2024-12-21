package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodoType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponseType;
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
    public ResponseEntity<ConsultarCarteraAfiliadoPorPeriodoResponseType> getIntercambiosByParams(@RequestParam("periodo") Integer periodo,
                                                                                                  @RequestParam("estadoAfiliacion") String estadoAfiliacion,
                                                                                                  @RequestParam("indice") Integer indice) {
        ConsultarCarteraAfiliadoPorPeriodoResponseType response = consultarCarteraAfiliadoPorPeriodoPort.consultarCarteraAfiliadoPorPeriodo(
                new ConsultarCarteraAfiliadoPorPeriodoType(periodo, estadoAfiliacion, indice));
        return ResponseEntity.ok(response);
    }
}