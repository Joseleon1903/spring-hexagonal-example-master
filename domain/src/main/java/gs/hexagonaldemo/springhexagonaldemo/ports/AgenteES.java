package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.Agente;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.*;

import java.util.List;

public interface AgenteES {

    /**
     * Permite cambiar los datos de un agente promotor o representante existente en el catï¿½logo de agente <br/>
     * <br/>
     * El sistema realiza la modificacion de los datos del agente promotor o representante provisto como parametro, y retorna el valor indicando si la actualizaciï¿½n fue exitosa o no
     *
     */
    Agente actualizarAgente(Agente actualizarAgente) throws InternalServiceException;

    /**
     * Permite obtener los datos de un agente promotor o representante utilizando como parï¿½metro de bï¿½squeda sus datos de identificaciï¿½n <br/>
     * <br/>
     * El sistema realiza una bï¿½squeda en el catï¿½logo de agentes promotores y representantes utilizando el tipo de agente, tipo de identificaciï¿½n y nï¿½mero de identificaciï¿½n provistos como parï¿½metros,
     * y retorna los datos generales del agente al que corresponda
     *
     * @param tipoAgente
     * @param tipoIdentificacion
     * @param numeroIdentificacion
     * @return
     * @throws ServicesFault
     */
    Agente buscarAgentePorIdentificacion(BuscarAgentePorIdentificacionType buscarAgentePorIdentificacionInput) throws InternalServiceException;

    /**
     * Permite identificar si un agente promotor o representante se encuentra activo para un seguro en particular utilizando como parï¿½metro de bï¿½squeda sus datos de identificaciï¿½n y el seguro <br/>
     * <br/>
     * El sistema realiza una bï¿½squeda en el catï¿½logo de agente utilizando el tipo de agente, tipo de identificaciï¿½n, nï¿½mero de identificaciï¿½n y seguro provistos como parï¿½metros, y retorna los datos
     * generales del agente a la que corresponda si existiese
     *
     * @param tipoAgente
     * @param tipoIdentificacion
     * @param seguro
     * @param numeroIdentificacion
     * @return
     * @throws ServicesFault
     *
     * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
     * @throws ValorNoPermitidoException
     */
    @Deprecated
    List<Agente> buscarAgenteActivoPorSeguro(BuscarAgenteActivoPorSeguroType buscarAgenteActivoPorSeguroInput) throws InternalServiceException;

    /**
     * Permite identificar si un agente promotor o representante se encuentra activo para una entidad en particular utilizando como parï¿½metro de bï¿½squeda sus datos de identificaciï¿½n y la entidad <br/>
     * <br/>
     * El sistema realiza una bï¿½squeda en el catï¿½logo de agente utilizando el tipo de agente, tipo de identificaciï¿½n, nï¿½mero de identificaciï¿½n y entidad provistos como parï¿½metros, y retorna los datos
     * generales del agente a la que corresponda si existiese
     *
     * @param tipoAgente
     * @param tipoIdentificacion
     * @param numeroIdentificacion
     * @param claveTipoEntidad
     * @param claveEntidad
     * @return
     * @throws ServicesFault
     *
     * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
     * @throws InternalServiceException
     */
    @Deprecated
    List<Agente> buscarAgenteActivoPorEntidad(BuscarAgenteActivoPorEntidadType buscarAgenteActivoPorEntidadInput) throws InternalServiceException;

    /**
     * <b>3.2</b> Permite identificar si un Agente se encontraba vigente para una fecha en particular
     *
     * <br/>
     * <br/>
     * El sistema realiza una bï¿½squeda del Agente provisto como parï¿½metro, y retorna un indicador de si el Agente se encontraba activo para la fecha proporcionada o no
     *
     * @param Un
     *            objeto Agente
     * @param La
     *            fecha de afiliacion
     * @return un boolean, si es true es porque la fecha de afiliacion esta dentro del rango del Agente, si es false, es porque las fecha de afiliacion no estan dentro del rango en que el Agente
     *         estubo activo
     * @throws ServicesFault
     *             Si ocurre algun problema en la consultando una entidad,
     */
    Agente esAgenteVigente(EsAgenteVigenteType esAgenteVigenteInput) throws InternalServiceException;

    /**
     * Permite guardar registro de un agente promotor o representante del SDSS <br/>
     * <br/>
     * El sistema guarda el agente promotor o representante provisto como parï¿½metro, y retorna una respuesta indicando si fue registrado exitosamente o no
     *
     * @param agente
     * @return
     * @throws ServicesFault
     *
     */
    Agente registrarAgente(Agente registrarAgenteType) throws InternalServiceException;

    /**
     * Permite obtener los datos de un agente promotor o representante utilizando como parÃ¡metro de bÃºsqueda sus datos de identificaciÃ³n<br/>
     * <br/>
     * La Capacidad realiza una bÃºsqueda en el catÃ¡logo de agentes promotores y representantes utilizando el tipo de identificaciÃ³n y nÃºmero de identificaciÃ³n provistos como parÃ¡metros,
     *  y retorna los datos generales del agente al que corresponda
     *
     * @param agente
     * @return
     * @throws ServicesFault
     *
     * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
     */
    List<Agente> buscarAgentesPorDatosGenerales(BuscarAgentesPorDatosGeneralesType buscarAgentesPorDatosGeneralesInput) throws InternalServiceException;



}
