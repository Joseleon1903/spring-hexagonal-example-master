package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;
import hexagonaldemo.entity.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;

public class UsuarioMapper {


    public static Usuario mapToDomain(UsuarioEntity type){
        Usuario entity = new Usuario();
        entity.setUsuarioId(type.getUsuarioId());
        entity.setCodigo(type.getCodigo());
        entity.setEstado(type.getEstado());
        entity.setContactoId(type.getContactoId());
        entity.setTipoUsuarioId(type.getTipoUsuarioId());
        entity.setLlaveEncriptacionClave(type.getLlaveEncriptacionClave());
        entity.setUsuarioUltimoCambioId(type.getUsuarioUltimoCambioId());
        entity.setCantidadAvisosProximoVencimientoClave(type.getCantidadAvisosProximoVencimientoClave());
        entity.setFechaUltimaAutenticacion(type.getFechaUltimaAutenticacion());
        entity.setFechaUltimoAvisoProximoVencimientoClave(type.getFechaUltimoAvisoProximoVencimientoClave());
        entity.setFechaAvisoVencimientoClave(type.getFechaAvisoVencimientoClave());
        entity.setFechaUltimoCambio(type.getFechaUltimoCambio());
        entity.setFechaNotificacionBloqueo(type.getFechaNotificacionBloqueo());
        return entity;
    }

    public static List<Usuario> mapListToDomain(List<UsuarioEntity> usuarioEntities){

        List<Usuario> listOut =  new ArrayList<>();

        usuarioEntities.forEach( entiy ->{
            listOut.add(mapToDomain(entiy));

        });
        return listOut;
    }
}
