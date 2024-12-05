package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoES;
import java.util.List;
import java.util.Optional;

public class MotivoEstadoServiceAdapter implements MotivoEstadoES {


    private MotivoEstadoRepository motivoEstadoRepository;

    public MotivoEstadoServiceAdapter(MotivoEstadoRepository motivoEstadoRepository) {
        this.motivoEstadoRepository = motivoEstadoRepository;
    }

    @Override
    public Optional<MotivoEstado> buscarMotivoEstadoPorId(Long id) {
        return motivoEstadoRepository.getById(id);
    }

    @Override
    public Optional<List<MotivoEstado>> buscarMotivosEstado(String estado){
        return Optional.empty();
    }
}
