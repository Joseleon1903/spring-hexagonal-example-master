package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.Contacto;
import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarContactosPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.DatosContactoType;

import java.time.LocalDate;
import java.util.Collection;

public interface ContactoES {

    /**
     *
     */
    Entidad buscarEntidadContactoPorCodigoUsuario(String codigoUsuario);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactoPorIdResponseType
     */
    Contacto buscarContactoPorId(Integer contactoId);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.RegistrarContactoResponseType
     */
    Contacto registrarContacto(Contacto contacto);

    /**
     *
     * @param parameter
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.ActualizarContactoResponseType
     */
    Contacto actualizarContacto(Contacto parameter);

    /**
     *
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactosPorCedulaResponseType
     */
    Contacto buscarContactosPorCedula(String cedula,Integer entidadId,String estado);

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
     * @param parameter
     * @return
     *     returns com.unipago.suirsigma.commons.contactoes.types.BuscarContactosPorEntidadFechaResponseType
     * @throws DatoRequeridoNoProporcionadoException
     * @throws FechaInvalidaException
     * @throws InternalServiceException
     */
    Collection<Contacto> buscarContactosPorEntidadFecha(
             Integer entidadId,
     LocalDate fechaCreacionInicial,
    LocalDate fechaCreacionFinal);

}
