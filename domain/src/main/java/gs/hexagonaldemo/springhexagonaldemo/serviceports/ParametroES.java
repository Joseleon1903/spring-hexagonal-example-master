package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Parametro;

public interface ParametroES {

    /**
     * Permite asignar a una entidad del SDSS los pagos asociados a un ciudadano
     * que se encuentren sin bloquear y sin asignar a ninguna entidad
     *
     */
    Parametro buscarParametroPorId(String ParametroId);

    /**
     * Permite obtener el valor un parámetro del sistema, aplicable para una entidad y/o servicio específico
     * <br/>
     * <br/>
     * La Capacidad realiza una búsqueda en el catálogo de parámetros del sistema utilizando el id del parámetro provisto,
     * y retorna el valor aplicable al parámetro, considerando la lista de excepciones definidas para el parámetro en
     * cuestión para la entidad o servicio proporcionado
     */
    Parametro buscarValorParametro(String parametroId, Integer entidadId,Integer servicioId);

}
