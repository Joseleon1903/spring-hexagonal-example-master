package com.unipago.unisigma.usecase.tasks.proceso;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.IntercambioInformacion;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ContextData {
    //Datos para almacenar resultados de procesamientos.
    private IntercambioInformacion intercambio;
    private SolicitudIntercambioInformacion solicitud;
    private LocalDate fechaEjecucion = LocalDate.now();
    private List<Integer> motivos;
    private short tipoIntercambio;
    private Map<String, String> valoresParametros;
    private Map<String, Integer> idParametrosIntercambio;
    private EjecucionIntercambioInformacion ejecucionIntercambioRegistrada;
    private boolean procesoExitiso = true;
    private String mensajeErrorInternoProceso;
    private Integer servicioId;


    public ContextData(SolicitudIntercambioInformacion solicitud) {
        super();
        this.solicitud = solicitud;
    }


    public List<Integer> getMotivos() {
        if(motivos == null){
            motivos = new ArrayList<Integer>();
        }
        return motivos;
    }


    public void setMotivos(List<Integer> motivos) {
        this.motivos = motivos;
    }

    public IntercambioInformacion getIntercambio() {
        return intercambio;
    }


    public void setIntercambio(IntercambioInformacion intercambio) {
        this.intercambio = intercambio;
    }


    public SolicitudIntercambioInformacion getSolicitud() {
        return solicitud;
    }


    public void setSolicitud(SolicitudIntercambioInformacion solicitud) {
        this.solicitud = solicitud;
    }


    public short getTipoIntercambio() {
        return tipoIntercambio;
    }


    public void setTipoIntercambio(short tipoIntercambio) {
        this.tipoIntercambio = tipoIntercambio;
    }

    public Map<String, String> getValoresParametros() {
        if(valoresParametros == null){
            valoresParametros = new HashMap<String, String>();
        }
        return valoresParametros;
    }


    public Map<String, Integer> getIdParametrosIntercambio() {
        if(idParametrosIntercambio == null){
            idParametrosIntercambio = new HashMap<String, Integer>();
        }
        return idParametrosIntercambio;
    }


    public LocalDate getFechaEjecucion() {
        return fechaEjecucion;
    }


    public void setFechaEjecucion(LocalDate fechaEjecucion) {
        this.fechaEjecucion = fechaEjecucion;
    }


    public EjecucionIntercambioInformacion getEjecucionIntercambioRegistrada() {
        return ejecucionIntercambioRegistrada;
    }


    public void setEjecucionIntercambioRegistrada(
            EjecucionIntercambioInformacion ejecucionIntercambioRegistrada) {
        this.ejecucionIntercambioRegistrada = ejecucionIntercambioRegistrada;
    }


    public String getMensajeErrorInternoProceso() {
        return mensajeErrorInternoProceso;
    }


    public void setMensajeErrorInternoProceso(String mensajeErrorInternoProceso) {
        this.mensajeErrorInternoProceso = mensajeErrorInternoProceso;
    }


    public boolean isProcesoExitiso() {
        return procesoExitiso;
    }


    public void setProcesoExitiso(boolean procesoExitiso) {
        this.procesoExitiso = procesoExitiso;
    }


    public Integer getServicioId() {
        return servicioId;
    }


    public void setServicioId(Integer servicioId) {
        this.servicioId = servicioId;
    }

}