package com.soap.api.adapter.endpoints;


import com.howtodoinjava.xml.school.StudentDetailsRequest;
import com.howtodoinjava.xml.school.StudentDetailsResponse;
import com.soap.api.adapter.utils.XMLConversionUtil;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

@Endpoint
public class StudentEndpoint {

    private static final String NAMESPACE_URI = "http://www.howtodoinjava.com/xml/school";

    private final ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort;

    @Autowired
    public StudentEndpoint(ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort) {
        this.consultarCarteraAfiliadoPorPeriodoPort = consultarCarteraAfiliadoPorPeriodoPort;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "StudentDetailsRequest")
    @ResponsePayload
    public StudentDetailsResponse getStudent(@RequestPayload StudentDetailsRequest request) {
        StudentDetailsResponse response = new StudentDetailsResponse();
        ConsultarCarteraAfiliadoPorPeriodo input = new ConsultarCarteraAfiliadoPorPeriodo();
        input.setIndice(request.getIndice());
        input.setEstadoAfiliacion(request.getEstadoAfiliacion());
        input.setPeriodo(request.getPeriodo());
        ConsultarCarteraAfiliadoPorPeriodoResponse reponse = consultarCarteraAfiliadoPorPeriodoPort.consultarCarteraAfiliadoPorPeriodo(input);
        response = XMLConversionUtil.crearResponse(reponse);
        return response;
    }


}
