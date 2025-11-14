package hexagonaldemo.mapper;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import hexagonaldemo.entity.BitacoraEventoEntity;

public class BitacoraEventoMapper {

    public static BitacoraEvento mapToDomain(BitacoraEventoEntity type) {

        BitacoraEvento bitacoraEvento = new BitacoraEvento();

        bitacoraEvento.setBitacoraEventoId(type.getBitacoraEventoId());
        bitacoraEvento.setDescripcion(type.getDescripcion());
        bitacoraEvento.setDireccionIp(type.getDireccionIp());
        bitacoraEvento.setEventoPadreId(type.getEventoPadreId());
        bitacoraEvento.setFecha(type.getFecha());
        bitacoraEvento.setInstanciaBpel(type.getInstanciaBpel());
        bitacoraEvento.setServicioId(type.getServicioId());
        bitacoraEvento.setTipoEventoId(type.getTipoEventoId());
        bitacoraEvento.setUsuarioId(type.getUsuarioId());

        return bitacoraEvento;
    }

    public static BitacoraEventoEntity mapToEntity(BitacoraEvento type) {

        BitacoraEventoEntity bitacoraEvento = new BitacoraEventoEntity();

        bitacoraEvento.setBitacoraEventoId(type.getBitacoraEventoId());
        bitacoraEvento.setDescripcion(type.getDescripcion());
        bitacoraEvento.setDireccionIp(type.getDireccionIp());
        bitacoraEvento.setEventoPadreId(type.getEventoPadreId());
        bitacoraEvento.setFecha(type.getFecha());
        bitacoraEvento.setInstanciaBpel(type.getInstanciaBpel());
        bitacoraEvento.setServicioId(type.getServicioId());
        bitacoraEvento.setTipoEventoId(type.getTipoEventoId());
        bitacoraEvento.setUsuarioId(type.getUsuarioId());

        return bitacoraEvento;
    }

}
