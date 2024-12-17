package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Entidad;

import java.util.Optional;

/**
 * <b>Perfil de Servicio</b>
 *
 * <dl>
 * <dt><b>Nombre:</b></dt>
 * <dd>EntidadES</dd>
 *
 * <dt><b>Descripcion:</b></dt>
 * <dd>Este servicio provee las capacidades asociadas a la entidad Entidad</dd>
 *
 * <dt><b>Versi�n:</b></dt>
 * <dd>0.01</dd>
 *
 * <dt><b>Custodio:</b></dt>
 * <dd>Ramon Rodriguez</dd>
 *
 * <dt><b>Modelo:</b></dt>
 * <dd>Entidad</dd>
 * </dl>
 *
 * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
 * @since Alfa 1
 *
 */
public interface EntidadES {


//    /**
//     * <b>3.3</b> Permite determinar si una entidad pertenece a un seguro
//     * especificado
//     *
//     * <br/>
//     * <br/>
//     *
//     * El sistema realiza una b�squeda de la entidad provista como par�metro , y
//     * retorna un indicador de si la entidad pertenece al seguro proporcionado o
//     * no
//     *
//     */
//
//    ValidarSeguroEntidadResponseType validarSeguroEntidad(
//            ValidarSeguroEntidadType validarSeguroEntidadInput)
//            throws DatoRequeridoNoProporcionadoException, InternalServiceException;
//
//    /**
//     * <b>3.3</b> Permite identificar si una entidad del SDSS est� acreditada
//     * como entidad recaudadora o no
//     *
//     * <br/>
//     * <br/>
//     *
//     * El sistema realiza una b�squeda en el cat�logo de entidades utilizando la
//     * entidad provista como par�metro, y retorna una respuesta indicando si la
//     * misma es una entidad recaudadora o no
//     *
//     * @param entidad
//     *            Instancia de la entidad a la cual se le realizara la
//     *            comparacion de si es Entidad Recaudadora.
//     * @return Un booleano si es true es correspondida, false no se corresponde.
//     * @throws InternalServiceException
//     * 					Si ocurre algun problema en la consultando una entidad,
//     */
//
//    EsEntidadRecaudadoraResponseType esEntidadRecaudadora(
//            EsEntidadRecaudadoraType esEntidadRecaudadoraInput)
//            throws DatoRequeridoNoProporcionadoException, InternalServiceException;

    /**
     * <b>3.3</b> Permite buscar una entidad por su codigo de entidad.
     *
     * <br/>
     * <br/>
     *
     * El sistema realiza una b�squeda de la entidad por el campo id de la
     * entidad que tiene en la base de datos.
     *
     */

    Optional<Entidad> buscarEntidadPorId(Integer entidadId);

//    /**
//     * <b>3.3</b> Permite obtener una entidad, utilizando como par�metro de
//     * b�squeda la clave de entidad y el tipo entidad.
//     *
//     * <br/>
//     * <br/>
//     *
//     * El sistema realiza una b�squeda en el cat�logo de Entidades por medio de
//     * la clave de entidad y el tipo entidad provistos como parametros y retorna
//     * los datos generales de la Entidad.
//     *
//     * @param claveEntidad
//     *            de la entidad que se buscara en la base de datos.
//     * @return Una entidad
//     * @throws InternalServiceException
//     * 				Si ocurre algun problema en la consultando una entidad,
//     */
//
//
//    BuscarEntidadPorClaveEntidadTipoEntidadResponseType buscarEntidadPorClaveEntidadTipoEntidad(
//            BuscarEntidadPorClaveEntidadTipoEntidadType buscarEntidadPorClaveEntidadTipoEntidadInput)
//            throws DatoRequeridoNoProporcionadoException,
//            NoExistenDatosException, InternalServiceException;
//
//    /**
//     * @author Ramon Rodriguez <i>rerodriguez@unipago.com.do<i> /** <b>3.3</b>
//     *         Permite identificar la entidad del SDSS que est� acreditada como
//     *         entidad concentradora
//     *
//     * <br/>
//     * <br/>
//     *
//     *         El sistema realiza una b�squeda en el cat�logo de entidades
//     *         tomando en cuenta que el tipo actividad financiera sea
//     *         concentrador, y retorna una respuesta indicando la entidad Id
//     *         concentradora.
//     *
//     * @return Id de la Entidad Banco Concentrador encontrado.
//     * @throws InternalServiceException
//     * 				Si ocurre algun problema en la consultando una entidad,
//     */
//
//    BuscarEntidadPorTipoActividadFinancieraResponseType buscarEntidadPorTipoActividadFinanciera(
//            BuscarEntidadPorTipoActividadFinancieraType buscarEntidadPorTipoActividadFinancieraInput)
//            throws DatoRequeridoNoProporcionadoException, InternalServiceException, ValorNoPermitidoException;
//
//    /**
//     * @author cfabian Permite obtener la lista de entidades que participan en
//     *         la para afiliaci�n autom�tica en base al seguro en ingresado como
//     *         par�metro.
//     * @param seguroId
//     * @return Una lista de entidades que participan en la para afiliaci�n
//     *         autom�tica.
//     * @throws InternalServiceException
//     * 				Si ocurre algun problema en la consultando una entidad,
//     */
//
//    BuscarEntidadesAfiliacionAutomaticaResponseType buscarEntidadesAfiliacionAutomatica(
//            BuscarEntidadesAfiliacionAutomaticaType buscarEntidadesAfiliacionAutomaticaInput)
//            throws DatoRequeridoNoProporcionadoException, InternalServiceException, ValorNoPermitidoException;
//
//    /**
//     * @author Elias Grullon <i>egrullon@unipago.com.do<i>
//     *
//     * Permite obtener la entidad supervisora de el seguro Proporcionado
//     * par�metro.
//     * @param seguroId
//     * @return La entidad Supervisora del Serguro.
//     * @throws InternalServiceException TODO
//     */
//
//    BuscarEntidadSupervisoraPorSeguroResponseType buscarEntidadSupervisoraPorSeguro(
//            BuscarEntidadSupervisoraPorSeguroType buscarEntidadSupervisoraPorSeguroInput)
//            throws DatoRequeridoNoProporcionadoException, NoExistenDatosException,
//            InternalServiceException;
//
//
//    /**
//     * @author Elias Grullon egrullon@unipago.com.do
//     * @since BETA 7
//     *
//     * La Capacidad realiza una b�squeda en el cat�logo de entidades y retorna todas las entidades.
//     *
//     * @param parameters
//     * @return BuscarEntidadesResponseType
//     * @throws InternalServiceException
//     */
//    public BuscarEntidadesResponseType buscarEntidades(
//            BuscarEntidadesType parameters) throws ValorNoPermitidoException, InternalServiceException;
//
//    /**
//     * @author Jose Ure�a jurena@unipago.com.do
//     * @since OA 25
//     *
//     * La Capacidad realiza una b�squeda en el cat�logo de entidades financieras y retorna todas las entidades.
//     *
//     * @param parameters id de la entidad financiera a realizar la busqueda
//     * @return La entidad financiera correspondiente al id suministrado
//     * @throws DatoRequeridoNoProporcionadoException, InternalServiceException, NoExistenDatosException
//     */
//    public BuscarEntidadFinancieraPorIdResponseType buscarEntidadFinancieraPorId(
//            BuscarEntidadFinancieraPorIdType parameters) throws DatoRequeridoNoProporcionadoException, InternalServiceException, NoExistenDatosException;
//
//    /**
//     * @author Jose De Leon jodeleon@unipago.com.do
//     * @since OAT 17
//     *
//     * Descripci�n: Permite obtener un resumen de las entidades por el Tipo de Entidad provisto por par�metros.
//     *
//     * Descripci�n de la L�gica: La Capacidad realiza una b�squeda en el cat�logo de entidades cuyo Tipo de Entidad se corresponda con el
//     * provisto por par�metro y retorna un resumen agrupado por Entidad,
//     * de aquellas que apliquen con los par�metros proporcionados.
//     *
//     * @param BuscarResumenEntidadPorTipoEntidadType
//     * @return BuscarResumenEntidadPorTipoEntidadResponseType
//     * @throws InternalServiceException
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws ValorNoPermitidoException
//     */
//    public BuscarResumenEntidadPorTipoEntidadResponseType buscarResumenEntidadPorTipoEntidad(
//            BuscarResumenEntidadPorTipoEntidadType parameters) throws  InternalServiceException,DatoRequeridoNoProporcionadoException,ValorNoPermitidoException;
//
//    /**
//     * @author Einstein Olivo eoliov@unipago.com.do
//     *
//     * Descripci�n: Permite obtener un resumen de las entidades por el Tipo de Entidad provisto por par�metros.
//     *
//     * Descripci�n de la L�gica: La Capacidad realiza una b�squeda en el cat�logo de entidades cuyo Tipo de Entidad se corresponda con el
//     * provisto por par�metro y retorna un resumen agrupado por Entidad,
//     * de aquellas que apliquen con los par�metros proporcionados.
//     *
//     * @param BuscarEntidadesDestinoConsultaPorTipoParticipacionType
//     * @return BuscarEntidadesDestinoConsultaPorTipoParticipacionResponseType
//     * @throws InternalServiceException
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws ValorNoPermitidoException
//     */
//    public BuscarEntidadesDestinoConsultaPorTipoParticipacionResponseType buscarEntidadesDestinoConsultaPorTipoParticipacion (
//            BuscarEntidadesDestinoConsultaPorTipoParticipacionType buscarEntidadesDestinoConsultaPorTipoParticipacion)
//            throws InternalServiceException, ValorNoPermitidoException, DatoRequeridoNoProporcionadoException;


}
