package gs.hexagonaldemo.springhexagonaldemo.ports.out;

import gs.hexagonaldemo.springhexagonaldemo.models.ExcepcionEjecucionIntercambioInformacion;

import java.util.List;

public class BuscarExcepcionesEjecucionIntercambioInformacionResponseType {

    protected Boolean tieneExcepciones;

    protected List<ExcepcionEjecucionIntercambioInformacion> detalleExcepciones;
}
