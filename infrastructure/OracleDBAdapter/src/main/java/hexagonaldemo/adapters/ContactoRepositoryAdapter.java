package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Contacto;
import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ContactoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarContactosPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.DatosContactoType;
import hexagonaldemo.entity.ContactoEntity;
import hexagonaldemo.entity.EntidadEntity;
import hexagonaldemo.mapper.EntidadMapper;
import hexagonaldemo.repositories.BitacoraEventoRep;
import hexagonaldemo.repositories.ContactoRep;
import hexagonaldemo.repositories.EntidadRep;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ContactoRepositoryAdapter implements ContactoRepository {


    @Autowired
    private ContactoRep contactoRep;

    @Autowired
    private EntidadRep entidadRep;


    @Override
    public Optional<Entidad> buscarEntidadContactoPorCodigoUsuario(String codigoUsuario) {
        ContactoEntity contacto = contactoRep.buscarContactoPorCodigoUsuario(codigoUsuario).get();
        Optional<EntidadEntity> ent = entidadRep.findById(contacto.getEntidadId());
        return Optional.of(EntidadMapper.toDto(ent.get()));
    }

    @Override
    public Optional<Contacto> buscarContactoPorId(Integer contactoId) {
        return Optional.empty();
    }

    @Override
    public Optional<Contacto> registrarContacto(Contacto contacto) {
        return Optional.empty();
    }

    @Override
    public Optional<Contacto> actualizarContacto(Contacto parameter) {
        return Optional.empty();
    }

    @Override
    public Optional<Contacto> buscarContactosPorCedula(String cedula, Integer entidadId, String estado) {
        return Optional.empty();
    }

    @Override
    public Collection<DatosContactoType> buscarContactosPorDatosGenerales(BuscarContactosPorDatosGeneralesType parameter) {
        return List.of();
    }

    @Override
    public Collection<Contacto> buscarContactosPorEntidadFecha(Integer entidadId, LocalDate fechaCreacionInicial, LocalDate fechaCreacionFinal) {
        return List.of();
    }
}
