package com.soap.api.adapter.endpoints;


import com.soap.api.adapter.utils.XMLConversionUtil;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoOutput;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoRequest;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultarCarteraAfiliadoPeriodoEndpoint {

    private static final String NAMESPACE_URI = "http://www.unisigma.com/epbd/ConsultarCarteraAfiliadoPeriodo";

    private final ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort;

    @Autowired
    public ConsultarCarteraAfiliadoPeriodoEndpoint(ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort) {
        this.consultarCarteraAfiliadoPorPeriodoPort = consultarCarteraAfiliadoPorPeriodoPort;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarCarteraAfiliadoPorPeriodoRequest")
    @ResponsePayload
    public ConsultarCarteraAfiliadoPorPeriodoOutput consultarCarteraAfiliadoPorPeriodoResponse(@RequestPayload ConsultarCarteraAfiliadoPorPeriodoRequest request) {
        ConsultarCarteraAfiliadoPorPeriodoOutput response = new ConsultarCarteraAfiliadoPorPeriodoOutput();
        ConsultarCarteraAfiliadoPorPeriodo input = new ConsultarCarteraAfiliadoPorPeriodo();
        input.setIndice(request.getIndice());
        input.setEstadoAfiliacion(request.getEstadoAfiliacion());
        input.setPeriodo(request.getPeriodo());
        ConsultarCarteraAfiliadoPorPeriodoResponse reponse = consultarCarteraAfiliadoPorPeriodoPort.consultarCarteraAfiliadoPorPeriodo(input);
        response = XMLConversionUtil.crearResponse(reponse);
        return response;
    }


}
