package com.unipago.unisigma.usecase.tasks.local;

import com.unipago.unisigma.usecase.tasks.impl.ServiciosContext;
import com.unipago.unisigma.usecase.tasks.proceso.ContextData;

public interface IReglasIntercambioInformacion {

    boolean estaServicioCatalogado();

    boolean existeIntercambioInformacion();

    boolean validaTiempoRetencionInformacion();

    /** @deprecated */
    @Deprecated
    boolean esIntercambioInformacionDeTipoValido();

    boolean validarEjecucionPreviaIntercambio();

    boolean esCorrespondenciaTipoDatoParametrosValida();

    boolean parametrosRequeridosProporcionados();

    boolean esvalidoRangoIntercambio();

    boolean esExcepcionParametroRequerido();

    boolean registrarEjecucionIntercambioInformacion();

    boolean ponerIntercambioInformacionEnCola();

    void registrarBitacora();

    void enviarNotificacion();

    void setContextData(ContextData var1);

    ContextData getContextData();

    void setServiciosContext(ServiciosContext var1);

    ServiciosContext getServiciosContext();
}
