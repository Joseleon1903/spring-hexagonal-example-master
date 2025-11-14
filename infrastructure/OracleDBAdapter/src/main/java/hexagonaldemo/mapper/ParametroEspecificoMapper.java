package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.ParametroEspecifico;
import hexagonaldemo.entity.ParametroEspecificoEntity;

import java.util.ArrayList;
import java.util.List;

public class ParametroEspecificoMapper {

    public static ParametroEspecifico mapDomain(ParametroEspecificoEntity entity) {
        ParametroEspecifico parametroEspecifico = new ParametroEspecifico();
        parametroEspecifico.setParametroEspecificoId(entity.getParametroEspecificoId());
        parametroEspecifico.setParametroId(entity.getParametroId());
        parametroEspecifico.setEntidadId(entity.getEntidadId());
        parametroEspecifico.setServicioId(entity.getServicioId());
        parametroEspecifico.setValor(entity.getValor());
        return parametroEspecifico;
    }

    public static List<ParametroEspecifico> toDomainList( List<ParametroEspecificoEntity> entityList) {
        List<ParametroEspecifico> listOut =  new ArrayList<>();

        entityList.forEach( entity ->{
            listOut.add(mapDomain(entity));

        });
        return listOut;
    }

}
