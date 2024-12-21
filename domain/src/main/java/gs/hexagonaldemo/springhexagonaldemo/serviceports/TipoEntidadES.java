package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.TipoEntidad;

import java.util.List;
import java.util.Optional;

public interface TipoEntidadES {

    /**
     * Permite obtener los datos de un Tipo de Entidad utilizando el ID enviado
     * como parametro.
     * <br/>
     * <br/>
     * La Capacidad realiza una b�squeda en el cat�logo de tipos de entidades
     * utilizando el ID del Tipo de Entidad provisto como par�metro, y retorna
     * los datos del tipo de entidad obtenido.
     *
     * @return
     */
    Optional<TipoEntidad> buscarTipoEntidadPorId(Short tipoEntidadId);
    /**
     * Busca en el cat�logo de tipos de entidad y retorna una lista que coincidan con todos los criterios provistos por par�metro,
     * cuando se especifique como par�metro una descripci�n, se considerar� aquellos registros que sean igual o coincidan parcialmente con el valor,
     * ademas de ello cuando no sea provisto ningun par�metro, la capacidad retorna todos los registros existentes en el cat�logo.
     *
     * @return
     */
    Optional<List<TipoEntidad>> buscarTipoEntidadPorDatosGenerales(String descripcion, Short seguroId, String estado,
                                                                   Boolean poseeLDAPOrganizationUnit, Boolean aplicaAfiliacion);
}
