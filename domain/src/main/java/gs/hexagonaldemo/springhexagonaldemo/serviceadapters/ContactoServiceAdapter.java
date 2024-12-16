package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Contacto;
import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ContactoES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.ContactoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecucionConsultaRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarContactosPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.DatosContactoType;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ContactoServiceAdapter implements ContactoES {

    private ContactoRepository contactoRepository;

    public ContactoServiceAdapter(ContactoRepository contactoRepository) {
        this.contactoRepository = contactoRepository;
    }

    @Override
    public Optional<Entidad> buscarEntidadContactoPorCodigoUsuario(String codigoUsuario) {
        return Optional.empty();
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
