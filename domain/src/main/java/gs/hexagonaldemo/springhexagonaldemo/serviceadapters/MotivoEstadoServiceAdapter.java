package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.MotivoEstadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.MotivoEstadoES;
import java.util.List;
import java.util.Optional;

public class MotivoEstadoServiceAdapter implements MotivoEstadoES {


    private MotivoEstadoRepository motivoEstadoRepository;

    public MotivoEstadoServiceAdapter(MotivoEstadoRepository motivoEstadoRepository) {
        this.motivoEstadoRepository = motivoEstadoRepository;
    }

    @Override
    public Optional<MotivoEstado> buscarMotivoEstadoPorId(Integer id) {
        return motivoEstadoRepository.getById(id);
    }

    @Override
    public Optional<List<MotivoEstado>> buscarMotivosEstado(String estado){
        return Optional.of(motivoEstadoRepository.buscarMotivosEstado(estado));
    }
}
