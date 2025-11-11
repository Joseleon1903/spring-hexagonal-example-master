package com.unipago.unisigma.usecase.tasks.impl;

import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;

public class ServiciosContext {

    private IntercambioInformacionES intercambioInformacionES;

    private EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES;

    private SolicitudServicioES solicitudServicioES;

    private ServicioSistemaES servicioES;

    private BitacoraEventoES bitacoraEventoUS;

    private NotificacionES notificacionUS;

    private ParametroES parametroES;

    private MotivoEstadoES motivoEstadoES;

    private UsuarioES usuarioES;


    public ServiciosContext setIntercambioInformacionES(IntercambioInformacionES intercambioInformacionES){
        this.intercambioInformacionES = intercambioInformacionES;

        return this;
    }

    public ServiciosContext setEjecucionIntercambioInformacionES(EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES){
        this.ejecucionIntercambioInformacionES = ejecucionIntercambioInformacionES;

        return this;
    }

    public ServiciosContext setSolicitudServicioUS(SolicitudServicioES solicitudServicioES){
        this.solicitudServicioES = solicitudServicioES;

        return this;
    }

    public ServiciosContext setServicioSistemaES(ServicioSistemaES servicioES){
        this.servicioES = servicioES;

        return this;
    }

    public ServiciosContext setBitacoraEventoUS(BitacoraEventoES bitacoraEventoUS){
        this.bitacoraEventoUS = bitacoraEventoUS;

        return this;
    }

    public ServiciosContext setNotificacionUS(NotificacionES notificacionUS){
        this.notificacionUS = notificacionUS;

        return this;
    }

    public ServiciosContext setParametroES(ParametroES parametroES) {
        this.parametroES = parametroES;

        return this;
    }

    public IntercambioInformacionES getIntercambioInformacionES() {
        return intercambioInformacionES;
    }

    public EjecucionIntercambioInformacionES getEjecucionIntercambioInformacionES() {
        return ejecucionIntercambioInformacionES;
    }

    public SolicitudServicioES getSolicitudServicioUS() {
        return solicitudServicioES;
    }

    public ServicioSistemaES getServicioES() {
        return servicioES;
    }

    public BitacoraEventoES getBitacoraEventoUS() {
        return bitacoraEventoUS;
    }

    public NotificacionES getNotificacionUS() {
        return notificacionUS;
    }

    public ParametroES getParametroES() {
        return parametroES;
    }

    public MotivoEstadoES getMotivoEstadoES() {
        return motivoEstadoES;
    }

    public ServiciosContext setMotivoEstadoES(MotivoEstadoES motivoEstadoES) {
        this.motivoEstadoES = motivoEstadoES;

        return this;
    }

    public UsuarioES getUsuarioES() {
        return usuarioES;
    }

    public ServiciosContext setUsuarioES(UsuarioES usuarioES) {
        this.usuarioES = usuarioES;

        return this;
    }

}
