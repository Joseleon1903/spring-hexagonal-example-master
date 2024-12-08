package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.BitacoraEventoES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.BitacoraEventoRepository;

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