package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Contacto;
import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarContactosPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.DatosContactoType;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public interface ContactoES {

    /**
     *
     */
    Optional<Entidad> buscarEntidadContactoPorCodigoUsuario(String codigoUsuario);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactoPorIdResponseType
     */
    Optional<Contacto> buscarContactoPorId(Integer contactoId);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.RegistrarContactoResponseType
     */
    Optional<Contacto> registrarContacto(Contacto contacto);

    /**
     *
     * @param parameter
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.ActualizarContactoResponseType
     */
    Optional<Contacto> actualizarContacto(Contacto parameter);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactosPorCedulaResponseType
     */
    Optional<Contacto> buscarContactosPorCedula(String cedula,Integer entidadId,String estado);

    /**
     *
     * @param parameter
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactosPorDatosGeneralesResponseType
     */
    Collection<DatosContactoType> buscarContactosPorDatosGenerales(
            BuscarContactosPorDatosGeneralesType parameter);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactosPorEntidadFechaResponseType
     */
    Collection<Contacto> buscarContactosPorEntidadFecha(
             Integer entidadId,
     LocalDate fechaCreacionInicial,
    LocalDate fechaCreacionFinal);

}
