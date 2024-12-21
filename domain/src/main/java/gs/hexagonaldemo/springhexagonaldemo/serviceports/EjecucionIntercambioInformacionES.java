package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.EjecucionIntercambioInformacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarEjecucionesIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarExcepcionesEjecucionIntercambioInformacionType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.in.BuscarUltimoIntercambioInformacionPorServicioType;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarExcepcionesEjecucionIntercambioInformacionResponseType;

import java.util.List;
import java.util.Optional;

public interface EjecucionIntercambioInformacionES {

    /**
     *
     * Permite almacenar un registro de ejecucion de intercambio de informaci�n
     *
     * La Capacidad guarda en el repositorio de ejecuci�n de intercambio de Informaci�n un registro nuevo,
     * provisto por parametro; y retorna el ID del nuevo registro guardado de ejecuci�n de intercambio de informaci�n
     *
     */
    Optional<EjecucionIntercambioInformacion> registrarEjecucionIntercambioInformacion(
            EjecucionIntercambioInformacion parameters);

    /**
     *
     * Permite actualizar un registro de ejecucion de intercambio de informaci�n
     *
     * La Capacidad actualiza un registro de Ejecuci�n de Intercambio de Informaci�n, con los datos provisto
     * en el objeto proporcionado; y retorna una respuesta booleana indicando si fue actualizado (true) o no
     * se pudo actualizar (false)
     *
     */

    public Optional<EjecucionIntercambioInformacion> actualizarEjecucionIntercambioInformacion( EjecucionIntercambioInformacion parameters);

    /**
     *
     * @param buscarIntercambioInformacionPorId
     * @return
     * @throws InternalServiceException
     */
    public Optional<EjecucionIntercambioInformacion> buscarEjecucionIntercambioInformacionPorId(
            Long buscarIntercambioInformacionPorId);

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
     */
    public Optional<EjecucionIntercambioInformacion> buscarUltimoIntercambioInformacionPorServicio(
            BuscarUltimoIntercambioInformacionPorServicioType buscarUltimoIntercambioInformacionPorServicioInput);

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
     Optional<List<EjecucionIntercambioInformacion>> buscarEjecucionesIntercambioInformacionPorServicio(
            BuscarEjecucionesIntercambioInformacionPorServicioType buscarEjecucionesIntercambioInformacionPorServicioInput);

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
     BuscarExcepcionesEjecucionIntercambioInformacionResponseType buscarExcepcionesEjecucionIntercambioInformacion(
            BuscarExcepcionesEjecucionIntercambioInformacionType buscarExcepcionesEjecucionIntercambioInformacionInput);

}