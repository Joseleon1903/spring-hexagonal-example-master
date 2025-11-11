package com.unipago.unisigma.usecase.tasks.adapter;

import com.unipago.unisigma.usecase.tasks.impl.PublicarInformacionTS;
import com.unipago.unisigma.usecase.tasks.impl.PublicarInformacionTSImpl;
import gs.hexagonaldemo.springhexagonaldemo.models.PublicarInformacion;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.PublicarInformacionPort;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PublicarInformacionServicePortAdapter implements PublicarInformacionPort {

    @Autowired
    private IntercambioInformacionES intercambioInformacionES;

    @Autowired
    private EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

    @Autowired
    private SolicitudServicioES solicitudServicioES;

    @Autowired
    private ServicioSistemaES servicioES;

    @Autowired
    private BitacoraEventoES bitacoraEventoUS;

    @Autowired
    private NotificacionES notificacionUS;

    @Autowired
    private ParametroES parametroES;

    @Autowired
    private MotivoEstadoES motivoEstadoES;

    @Autowired
    private UsuarioES usuarioES;


    @Override
    public void publicarInformacion(PublicarInformacion solicitud) {
        System.out.println("Entering in publicarInformacion");

        PublicarInformacionTS publicarInformacionTS = new PublicarInformacionTSImpl(intercambioInformacionES,ejecucionIntercambioInformacionES,
                        solicitudServicioES,servicioES,bitacoraEventoUS,notificacionUS,parametroES,motivoEstadoES,usuarioES);

        publicarInformacionTS.publicarInformacion(solicitud);
        System.out.println("Exiting in publicarInformacion");
    }
}
