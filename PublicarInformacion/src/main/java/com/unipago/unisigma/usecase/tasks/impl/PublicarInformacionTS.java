package com.unipago.unisigma.usecase.tasks.impl;

import gs.hexagonaldemo.springhexagonaldemo.models.PublicarInformacion;
import org.springframework.stereotype.Service;

@Service
public interface PublicarInformacionTS {

    void publicarInformacion(PublicarInformacion solicitud);
}
