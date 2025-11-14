package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;
import hexagonaldemo.entity.ParametroEntity;

public class ParametroMapper {

    public static Parametro toEntity(ParametroEntity entity) {
        Parametro parametro = new Parametro();
        parametro.setParametroId(entity.getParametroId());
        parametro.setDescripcion(entity.getDescripcion());
        parametro.setValor(entity.getValor());
        parametro.setTipoDato(entity.getTipoDato());
        return parametro;
    }

//    public ParametroType toType(Parametro entity) {
//        this.parametroId = entity.getParametroId();
//        this.descripcion = entity.getDescripcion();
//        this.valor = entity.getValor();
//        this.tipoDato = entity.getTipoDato();
//        return this;
//    }


}
