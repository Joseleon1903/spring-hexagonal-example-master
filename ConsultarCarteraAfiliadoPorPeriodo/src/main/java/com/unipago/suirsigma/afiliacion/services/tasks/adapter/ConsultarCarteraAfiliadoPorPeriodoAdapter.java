package com.unipago.suirsigma.afiliacion.services.tasks.adapter;

import com.unipago.suirsigma.afiliacion.services.tasks.impl.ConsultarCarteraAfiliadoPorPeriodoTSImpl;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodoType;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponseType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ConsultarCarteraAfiliadoPorPeriodoAdapter implements ConsultarCarteraAfiliadoPorPeriodoPort {


    @Autowired
    private CarteraAfiliadoES carteraAfiliadoES;

    @Autowired
    private ParametroES parametroES;

    @Autowired
    private EjecucionConsultaES ejecucionConsultaES;

    @Autowired
    private ContactoES contactoES;

    @Autowired
    private UsuarioES usuarioES;

    @Autowired
    private TipoEntidadES tipoEntidadES;


    @Override
    public ConsultarCarteraAfiliadoPorPeriodoResponseType consultarCarteraAfiliadoPorPeriodo(ConsultarCarteraAfiliadoPorPeriodoType consultarCarteraAfiliadoPorPeriodoInput) {
        System.out.println("Entering in consultarCarteraAfiliadoPorPeriodo");
        System.out.println("consultarCarteraAfiliadoPorPeriodoInput: "+consultarCarteraAfiliadoPorPeriodoInput);

        ConsultarCarteraAfiliadoPorPeriodoTSImpl consultarCarteraAfiliadoPorPeriodoTS = new ConsultarCarteraAfiliadoPorPeriodoTSImpl(tipoEntidadES, carteraAfiliadoES,  contactoES,
                ejecucionConsultaES,  parametroES,  usuarioES );
        System.out.println("procesando consulta..");
        ConsultarCarteraAfiliadoPorPeriodoResponseType response = consultarCarteraAfiliadoPorPeriodoTS.consultarCarteraAfiliadoPorPeriodo(consultarCarteraAfiliadoPorPeriodoInput);
        System.out.println("terminando consulta..");
        return response;
    }
}
