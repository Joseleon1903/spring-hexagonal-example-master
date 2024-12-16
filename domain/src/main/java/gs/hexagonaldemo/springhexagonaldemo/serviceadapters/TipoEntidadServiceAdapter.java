package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.TipoEntidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.TipoEntidadES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.TipoEntidadRepository;

import java.util.List;
import java.util.Optional;

public class TipoEntidadServiceAdapter implements TipoEntidadES {

    private TipoEntidadRepository tipoEntidadRepository;

    public TipoEntidadServiceAdapter(TipoEntidadRepository tipoEntidadRepository) {
        this.tipoEntidadRepository = tipoEntidadRepository;
    }

    @Override
    public Optional<TipoEntidad> buscarTipoEntidadPorId(Short tipoEntidadId) {
        return tipoEntidadRepository.buscarTipoEntidadPorId(tipoEntidadId);
    }

    @Override
    public Optional<List<TipoEntidad>> buscarTipoEntidadPorDatosGenerales(String descripcion, Short seguroId, String estado, Boolean poseeLDAPOrganizationUnit, Boolean aplicaAfiliacion) {
        return Optional.empty();
    }
}
