package hexagonaldemo.adapters;

import hexagonaldemo.entity.MotivoEstadoEntity;
import hexagonaldemo.mapper.MotivoEstadoMapper;
import hexagonaldemo.repositories.MotivoEstadoRep;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class MotivoEstadoRepositoryAdapter implements MotivoEstadoRepository {

    @Autowired
    private MotivoEstadoRep motivoEstadoRep;


    @Override
    public int create(MotivoEstado motivoEstado) {
        return 0;
    }

    @Override
    public List<MotivoEstado> getList() {
        return null;
    }

    @Override
    public void delete(int id) {
        System.out.println("entering delete");
    }

    @Override
    public Optional<MotivoEstado> getById(Long motivoId) {
        System.out.println("entering getById");
        System.out.println("motivoId: "+motivoId);

        //MotivoEstadoEntity motivo = new MotivoEstadoEntity(1L, "Ejemplo",true, 1L , "AC" );
        MotivoEstadoEntity motivo = motivoEstadoRep.getById(motivoId);
        return Optional.of(MotivoEstadoMapper.mapToDomain(motivo));
    }

    @Override
    public List<MotivoEstado> buscarMotivosEstado(String estado) {
        System.out.println("entering buscarMotivosEstado");
        System.out.println("estado: "+estado);
        List<MotivoEstadoEntity> listMotivo = motivoEstadoRep.findByEstado(estado);
        return MotivoEstadoMapper.mapListToDomain(listMotivo);
    }
}
