package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import gs.hexagonaldemo.springhexagonaldemo.models.ExcepcionEjecucionIntercambioInformacion;

import java.util.List;
import java.util.Optional;

public class BuscarExcepcionesEjecucionIntercambioInformacionResponseType {

    protected Boolean tieneExcepciones;

    protected Optional<List<ExcepcionEjecucionIntercambioInformacion>> detalleExcepciones;
}
