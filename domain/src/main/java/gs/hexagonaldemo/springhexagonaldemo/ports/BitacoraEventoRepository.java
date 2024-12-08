package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;

public interface BitacoraEventoRepository {

    BitacoraEvento registrarBitacora(BitacoraEvento bitacoraEvento);
}
