package gs.hexagonaldemo.mapper;

import gs.hexagonaldemo.entity.MotivoEstadoEntity;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

import java.util.ArrayList;
import java.util.List;

public class MotivoEstadoMapper {

    private MotivoEstadoMapper(){}

    public static MotivoEstado mapToDomain(MotivoEstadoEntity motivoEstadoEntity){

        return new MotivoEstado(motivoEstadoEntity.getMotivoId(),
                motivoEstadoEntity.getDescripcion(),
                motivoEstadoEntity.getPermiteDuplicidad(),
                motivoEstadoEntity.getServicioPrincipalProcesaId(),
                motivoEstadoEntity.getEstado());
    }

    public static List<MotivoEstado> mapListToDomain(List<MotivoEstadoEntity> motivoEstadoEntity){

        List<MotivoEstado> listOut =  new ArrayList<>();

        motivoEstadoEntity.forEach( entiy ->{
            listOut.add(mapToDomain(entiy));

        });
        return listOut;
    }

}
