package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ServicioSistemaES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ServicioSistemaRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarServiciosPorDatosGeneralesType;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ServicioSistemaServiceAdapter implements ServicioSistemaES {

    private ServicioSistemaRepository servicioSistemaRepository;

    public ServicioSistemaServiceAdapter(ServicioSistemaRepository servicioSistemaRepository) {
        this.servicioSistemaRepository = servicioSistemaRepository;
    }

    @Override
    public Optional<ServicioSistema> buscarServicioPorProcesoSubproceso(Short procesoId, Integer subProceso) {
        return Optional.empty();
    }

    @Override
    public Optional<ServicioSistema> buscarServicioPorId(Integer servicioId) {
        return servicioSistemaRepository.findById(servicioId);
    }

    @Override
    public Optional<ServicioSistema> registrarServicio(ServicioSistema servicioSistema) {
        return Optional.empty();
    }

    @Override
    public Optional<Collection<ServicioSistema>> buscarServicios() {
        return servicioSistemaRepository.findAllServicioSisatema();
    }

    @Override
    public Optional<Collection<ServicioSistema>> buscarServiciosPorServicioPadreId(Integer servicioPadreId) {
        return Optional.empty();
    }

    @Override
    public Optional<Collection<ServicioSistema>> buscarServiciosPorDatosGenerales(BuscarServiciosPorDatosGeneralesType buscarServiciosPorDatosGeneralesInput) {
        return Optional.empty();
    }

    @Override
    public Optional<Collection<ServicioSistema>> buscarServiciosPermitidosPorUsuario(Integer usuarioId, List<Short> tipoServicioId, Short tipoEntidadId, Integer entidadId, Boolean aplicaGeneracionLote) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Integer>> buscarServiciosExcluirPorServicio(int servicioId) {
        return Optional.empty();
    }
}
