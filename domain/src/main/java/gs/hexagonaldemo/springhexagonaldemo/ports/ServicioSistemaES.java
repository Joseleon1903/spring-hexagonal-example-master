package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.ServicioSistema;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarServiciosPorDatosGeneralesType;

import java.util.Collection;
import java.util.List;

public interface ServicioSistemaES {

    /**
     * Permite obtener los datos de un servicio utilizando el id de proceso y
     * subproceso enviados como parametros. <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el catálogo de servicios utilizando
     * el id de proceso y subproceso provistos como parámetros, y retorna los
     * datos del servicio obtenido.
     *
     */
    public ServicioSistema buscarServicioPorProcesoSubproceso(Short procesoId,Integer subProceso);

    /**
     * Permite obtener los datos de un servicio utilizando el id enviado como
     * parametro. <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el catálogo de servicios utilizando
     * el id de servicio provisto como parámetro, y retorna los datos del
     * servicio obtenido.
     * @return
     */
    public ServicioSistema buscarServicioPorId(Integer servicioId);

    /**
     * Permite guardar registro de un servicio del sistema. <br/>
     * <br/>
     * La Capacidad registra el catálogo de servicios del sistema los datos del
     * servicio provisto como parámetro y retorna un indicador de si fue
     * registrado exitosamente, de lo contrario, arrojará un mensaje por
     * cualquier excepción ocurrida en el proceso.
     *
     */
    public ServicioSistema registrarServicio(ServicioSistema servicioSistema);

    /**
     * Permite obtener un listado de los datos de los servicios. <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el catálogo de servicios, y retorna
     * el listado de los datos de los servicios obtenidos.
     *
     */
    public Collection<ServicioSistema> buscarServicios();

    /**
     * Permite obtener una lista de sub-servicios en base al servicio padre
     * provisto como parámetro. <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el repositorio de servicios del
     * sistema y retorna una lista de los servicios que coincidan con el ID del
     * Servicio Padre provisto por parámetro.
     */
    public Collection<ServicioSistema> buscarServiciosPorServicioPadreId(Integer servicioPadreId);

    /**
     * Permite obtener una lista de servicios que coincida con los parámetros
     * proporcionados. <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el repositorio de servicios del
     * sistema y retorna una lista de los servicios que coincidan con todos los
     * criterios provistos por parámetro.
     */
    public Collection<ServicioSistema> buscarServiciosPorDatosGenerales(
            BuscarServiciosPorDatosGeneralesType buscarServiciosPorDatosGeneralesInput);

    /**
     *
     * Permite obtener una lista de servicios disponibles para el usuario provisto como parámetro.
     *
     * La Capacidad realiza una búsqueda en el repositorio de servicios del sistema
     * y retorna una lista de los servicios que se encuentren asociados a las Areas de Negocio
     * que guardan relación con el contacto del usuario proporcionado.
     */
    public Collection<ServicioSistema> buscarServiciosPermitidosPorUsuario(Integer usuarioId,List<Short> tipoServicioId,Short tipoEntidadId,
                                                                           Integer entidadId,Boolean aplicaGeneracionLote );

    /**
     *
     * Permite obtener la lista de servicios a excluir para un servicio en especifico.
     *
     * La Capacidad realiza una búsqueda en el catálogo de exclusión de servicios por
     * servicio sistema de que aquellos servicios a excluir que se encuentran en estado
     * AC (Activo) y que correspondan al ID de Servicio provisto como parámetro,
     * y retorna la lista de servicios a excluir
     */
    public List<Integer> buscarServiciosExcluirPorServicio(int servicioId);


}