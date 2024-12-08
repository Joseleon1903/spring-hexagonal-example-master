package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;

public interface BitacoraEventoRepository {

    BitacoraEvento registrarBitacora(BitacoraEvento bitacoraEvento);
}
