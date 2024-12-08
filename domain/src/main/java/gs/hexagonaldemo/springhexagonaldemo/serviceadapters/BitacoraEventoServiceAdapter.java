package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import gs.hexagonaldemo.springhexagonaldemo.ports.BitacoraEventoES;
import gs.hexagonaldemo.springhexagonaldemo.ports.BitacoraEventoRepository;

public class BitacoraEventoServiceAdapter implements BitacoraEventoES {

    private BitacoraEventoRepository bitacoraEventoRepository;

    public BitacoraEventoServiceAdapter(BitacoraEventoRepository bitacoraEventoRepository) {
        this.bitacoraEventoRepository = bitacoraEventoRepository;
    }

    @Override
    public BitacoraEvento registrarBitacora(BitacoraEvento bitacoraEvento) {
        return bitacoraEventoRepository.registrarBitacora(bitacoraEvento);
    }

}