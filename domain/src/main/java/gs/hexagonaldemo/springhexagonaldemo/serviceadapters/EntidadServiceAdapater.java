package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EntidadES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EntidadRepository;

import java.util.Optional;

public class EntidadServiceAdapater implements EntidadES {

    private EntidadRepository entidadRepository;

    public EntidadServiceAdapater(EntidadRepository entidadRepository) {
        this.entidadRepository = entidadRepository;
    }

    @Override
    public Optional<Entidad> buscarEntidadPorId(Integer entidadId) {
        return entidadRepository.buscarEntidadPorId(entidadId);
    }
}
