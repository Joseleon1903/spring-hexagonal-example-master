package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.BitacoraEvento;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.BitacoraEventoRepository;
import hexagonaldemo.entity.BitacoraEventoEntity;
import hexagonaldemo.mapper.BitacoraEventoMapper;
import hexagonaldemo.repositories.BitacoraEventoRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BitacoraEventoRepositoryAdapter implements BitacoraEventoRepository {


    @Autowired
    private BitacoraEventoRep bitacoraEventoRep;

    @Override
    public BitacoraEvento registrarBitacora(BitacoraEvento bitacoraEvento) {
        BitacoraEventoEntity out = bitacoraEventoRep.save(BitacoraEventoMapper.mapToEntity(bitacoraEvento));
        return BitacoraEventoMapper.mapToDomain(out);
    }
}
