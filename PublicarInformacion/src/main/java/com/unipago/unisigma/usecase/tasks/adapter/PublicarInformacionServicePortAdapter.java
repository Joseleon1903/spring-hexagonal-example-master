package com.unipago.unisigma.usecase.tasks.adapter;

import com.unipago.unisigma.usecase.tasks.impl.PublicarInformacionTS;
import com.unipago.unisigma.usecase.tasks.impl.PublicarInformacionTSImpl;
import gs.hexagonaldemo.springhexagonaldemo.models.PublicarInformacion;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.PublicarInformacionPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicarInformacionServicePortAdapter implements PublicarInformacionPort {

//    @Autowired
    private PublicarInformacionTS publicarInformacionTS =  new PublicarInformacionTSImpl();


    @Override
    public void publicarInformacion(PublicarInformacion solicitud) {
        System.out.println("Entering in publicarInformacion");
        publicarInformacionTS.publicarInformacion(solicitud);
        System.out.println("Exiting in publicarInformacion");
    }
}
