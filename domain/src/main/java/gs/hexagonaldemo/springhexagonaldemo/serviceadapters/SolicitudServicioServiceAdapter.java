package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.models.SolicitudServicio;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecutarProcedimientoJDBCRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.RabbitJms;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.SolicitudServicioES;

public class SolicitudServicioServiceAdapter implements SolicitudServicioES {

    private RabbitJms rabbitJms;

    private EjecutarProcedimientoJDBCRepository ejecutarProcedimientoJDBCRepository;

    public SolicitudServicioServiceAdapter(RabbitJms rabbitJms, EjecutarProcedimientoJDBCRepository ejecutarProcedimientoJDBCRepository) {
        this.rabbitJms = rabbitJms;
        this.ejecutarProcedimientoJDBCRepository = ejecutarProcedimientoJDBCRepository;
    }

    @Override
    public SolicitudServicio registrarSolicitudServicio(SolicitudServicio solicitudServicio) {
        System.out.println("registrarSolicitudServicio");

        System.out.println("solicitudServicio: "+solicitudServicio);

        rabbitJms.publishMessage(solicitudServicio);

        System.out.println("finalizando registro solicitud servicio: ");
        return solicitudServicio;
    }

    @Override
    public Boolean esServicioProxyPermitidoEntidad(String codigoUsuario, String nombreServicioProxy) {
        return null;
    }

    @Override
    public Boolean procesarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion ejecucionIntercambioInformacion) {
        return ejecutarProcedimientoJDBCRepository.executeQuery(ejecucionIntercambioInformacion.getIntercambioInformacionId().getProcedimiento(),
                ejecucionIntercambioInformacion.getEjecucionIntercambioInfoId() );
    }
}
