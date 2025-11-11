package com.soap.api.adapter.endpoints;

import com.soap.api.adapter.utils.XMLConversionUtil;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoResponseType;
import com.unisigma.epbd.consultarcarteraafiliadoperiodo.ConsultarCarteraAfiliadoPorPeriodoType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class ConsultaCarteraEndpoint {

    private static final String NAMESPACE_URI = "http://www.unisigma.com/epbd/ConsultarCarteraAfiliadoPeriodo";

    private final ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort;

    @Autowired
    public ConsultaCarteraEndpoint(ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort) {
        this.consultarCarteraAfiliadoPorPeriodoPort = consultarCarteraAfiliadoPorPeriodoPort;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "ConsultarCarteraAfiliadoPorPeriodoType")
    @ResponsePayload
    public ConsultarCarteraAfiliadoPorPeriodoResponseType ConsultarCarteraAfiliadoPorPeriodo(@RequestPayload ConsultarCarteraAfiliadoPorPeriodoType request) {
        ConsultarCarteraAfiliadoPorPeriodoResponse response = consultarCarteraAfiliadoPorPeriodoPort.consultarCarteraAfiliadoPorPeriodo(XMLConversionUtil.createRequest(request));
        return XMLConversionUtil.crearResponse(response);
    }


}
