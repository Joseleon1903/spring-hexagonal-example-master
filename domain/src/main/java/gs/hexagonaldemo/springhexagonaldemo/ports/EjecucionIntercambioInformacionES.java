package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarEjecucionesIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarExcepcionesEjecucionIntercambioInformacionType;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarUltimoIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.BuscarExcepcionesEjecucionIntercambioInformacionResponseType;

import java.util.List;

public interface EjecucionIntercambioInformacionES {

    /**
     *
     * Permite almacenar un registro de ejecucion de intercambio de informaci�n
     *
     * La Capacidad guarda en el repositorio de ejecuci�n de intercambio de Informaci�n un registro nuevo,
     * provisto por parametro; y retorna el ID del nuevo registro guardado de ejecuci�n de intercambio de informaci�n
     *
     * @param ejecucionIntercambioInformacion
     * @return
     * @throws ServicesFault
     */

    EjecucionIntercambioInformacion registrarEjecucionIntercambioInformacion(
            EjecucionIntercambioInformacion parameters)
            throws InternalServiceException;

    /**
     *
     * Permite actualizar un registro de ejecucion de intercambio de informaci�n
     *
     * La Capacidad actualiza un registro de Ejecuci�n de Intercambio de Informaci�n, con los datos provisto
     * en el objeto proporcionado; y retorna una respuesta booleana indicando si fue actualizado (true) o no
     * se pudo actualizar (false)
     *
     * @param ejecucionIntercambioInformacion
     * @return
     * @throws ServicesFault
     */

    public EjecucionIntercambioInformacion actualizarEjecucionIntercambioInformacion( EjecucionIntercambioInformacion parameters)
            throws InternalServiceException;

    /**
     *
     * @param buscarIntercambioInformacionPorId
     * @return
     * @throws InternalServiceException
     */
    public EjecucionIntercambioInformacion buscarEjecucionIntercambioInformacionPorId(
            Long buscarIntercambioInformacionPorId) throws InternalServiceException;

    /**
     * Permite obtener el �ltimo registro de la ejecuci�n de Intercambio de
     * Informaci�n para un Servicio en particular
     *
     * <br/>
     * <br/>
     *
     * La Capacidad realiza una b�squeda en el repotorio de Ejecuci�n de
     * Intercambio de Informaci�n, procurando obtener el �ltimo registro en base
     * a la Fecha Fin de Ejecuci�n y que se corresponda con el servicio provisto
     * por par�metro, y retorna el registro de la ejecuci�n correspondiente
     *
     * @param buscarUltimoIntercambioInformacionPorServicioInput
     * @return buscarUltimoIntercambioInformacionPorServicioOutput
     * @throws InternalServiceException
     */
    public EjecucionIntercambioInformacion buscarUltimoIntercambioInformacionPorServicio(
            BuscarUltimoIntercambioInformacionPorServicioType buscarUltimoIntercambioInformacionPorServicioInput)
            throws InternalServiceException;

    /**
     * Permite obtener las Ejecuciones de Intercambio de Informaci�n para un Servicio en particular y otros datos de manera opcional.
     *
     * <br/>
     * <br/>
     *
     * La Capacidad realiza una b�squeda en el repotorio de Ejecuci�n de Intercambio de Informaci�n de los registros se corresponda con el servicio
     * provisto por par�metro, y retorna aquellos registros que correspondan con el servicio.
     *
     * @param buscarEjecucionesIntercambioInformacionPorServicioInput
     * @return buscarEjecucionesIntercambioInformacionPorServicioOutput
     * @throws InternalServiceException
     */
    public List<EjecucionIntercambioInformacion> buscarEjecucionesIntercambioInformacionPorServicio(
            BuscarEjecucionesIntercambioInformacionPorServicioType buscarEjecucionesIntercambioInformacionPorServicioInput)
            throws InternalServiceException;

    /*
     * <br/>
     * <br/>
     *
     * La Capacidad realiza una b�squeda en el repositorio de excepciones de ejecuci�n de intercambio de informaci�n aquellas que corresponda
     * al ID de la Ejecuci�n del Intercambio de Informaci�n proporcionado, y retorna una respuesta indicando si existen excepciones o no para dicha ejecuci�n.
     * Adicionalmente, ser� incluida o no una lista de las excepciones generadas durante la ejecuci�n en base al valor indicado en el par�metro "incluirDetalleExcepciones".
     *
     * @param buscarExcepcionesEjecucionIntercambioInformacionInput
     * @return BuscarExcepcionesEjecucionIntercambioInformacionResponseType
     * @throws DatoRequeridoNoProporcionadoException
     * @throws InternalServiceException
     */
    public BuscarExcepcionesEjecucionIntercambioInformacionResponseType buscarExcepcionesEjecucionIntercambioInformacion(
            BuscarExcepcionesEjecucionIntercambioInformacionType buscarExcepcionesEjecucionIntercambioInformacionInput)throws InternalServiceException;


}