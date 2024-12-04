package gs.hexagonaldemo.mapper;

import gs.hexagonaldemo.entity.MotivoEstadoEntity;
import gs.hexagonaldemo.springhexagonaldemo.models.MotivoEstado;

public class MotivoEstadoMapper {

    public static MotivoEstado mapToDomain(MotivoEstadoEntity motivoEstadoEntity){

        return new MotivoEstado(motivoEstadoEntity.getMotivoId(),
                motivoEstadoEntity.getDescripcion(),
                motivoEstadoEntity.getPermiteDuplicidad(),
                motivoEstadoEntity.getServicioPrincipalProcesaId(),
                motivoEstadoEntity.getEstado());
    }

}
