package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionIntercambioInformacionRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarEjecucionesIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarExcepcionesEjecucionIntercambioInformacionType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarUltimoIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarExcepcionesEjecucionIntercambioInformacionResponseType;

import java.util.List;
import java.util.Optional;

public class EjecucionIntercambioInformacionAdapter  implements EjecucionIntercambioInformacionES {


    private EjecucionIntercambioInformacionRepository ejecucionIntercambioInformacionRepository;

    public EjecucionIntercambioInformacionAdapter(EjecucionIntercambioInformacionRepository ejecucionIntercambioInformacionRepository) {
        this.ejecucionIntercambioInformacionRepository = ejecucionIntercambioInformacionRepository;
    }

    @Override
    public Optional<EjecucionIntercambioInformacion> registrarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion parameters) {
        return  Optional.empty();
    }

    @Override
    public Optional<EjecucionIntercambioInformacion> actualizarEjecucionIntercambioInformacion(EjecucionIntercambioInformacion parameters) {
        return  Optional.empty();
    }

    @Override
    public Optional<EjecucionIntercambioInformacion> buscarEjecucionIntercambioInformacionPorId(Long buscarIntercambioInformacionPorId) {
        return  Optional.empty();
    }

    @Override
    public Optional<EjecucionIntercambioInformacion> buscarUltimoIntercambioInformacionPorServicio(BuscarUltimoIntercambioInformacionPorServicioType buscarUltimoIntercambioInformacionPorServicioInput) {
        return Optional.empty();
    }

    @Override
    public Optional<List<EjecucionIntercambioInformacion>> buscarEjecucionesIntercambioInformacionPorServicio(BuscarEjecucionesIntercambioInformacionPorServicioType buscarEjecucionesIntercambioInformacionPorServicioInput) {
        return Optional.empty();
    }

    @Override
    public BuscarExcepcionesEjecucionIntercambioInformacionResponseType buscarExcepcionesEjecucionIntercambioInformacion(BuscarExcepcionesEjecucionIntercambioInformacionType buscarExcepcionesEjecucionIntercambioInformacionInput) {
        return null;
    }

}
