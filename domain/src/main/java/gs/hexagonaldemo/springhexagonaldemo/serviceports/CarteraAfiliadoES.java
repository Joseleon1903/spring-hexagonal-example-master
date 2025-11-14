package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponse;

import java.util.Optional;

public interface CarteraAfiliadoES {

    /**
     * Permite guardar registros de la generacion de cartera de cada una de las entidades administradora del SDSS.
     * <br/><br/>
     * La capacidad guarda los datos relacionados a la cartera provista por par�metro,  en el repositorio de cartera de afiliados,
     * y retorna el ID de la cartera registrada
     *
     *
     * @return
     */
    Optional<CarteraAfiliado> registrarCarteraAfiliado(CarteraAfiliado carteraAfiliado);

    /**
     * Permite validar si existe una cartera para el periodo y servicio especificado como par�metros.
     * <br/><br/>
     * La Capacidad realiza una b�squeda en el repositorio de Cartera con un periodo y ID de servicio provistos como par�metro,
     * retornando el resultado de la validaci�n.
     *
     * @return
     */
    Boolean existeCarteraAfiliadoPeriodoServicio(Integer periodo,Integer servicioId);

    /**
     * La capacidad busca en el repositorio de cartera de afiliados, los afiliados que guarden relaci�n con la
     * entidad y el periodo  provistos por par�metro, y retorna un listado de los afiliados en la cartera identificada.
     * <br/><br/>
     * La informaci�n extraida se ordena en base al N�mero de Solicitud de Afiliaci�n del Titular y posteriormente, por el
     * N�mero de Solicitud de Afiliaci�n del Dependiente, y se particiona en base a la cantidad m�xima de registros
     * establecida como par�metro para la entidad que realiza la consulta, y el ID de servicio que corresponda.
     * En base a esta partici�n, se retorna el conjunto de registros comprendidos entre el valor m�nimo y m�ximo
     * del rango correspondiente al �ndice especificado como par�metro.
     *
     */
    BuscarCarteraAfiliadosPorEntidadPeriodoResponse buscarCarteraAfiliadosPorEntidadPeriodo(Integer entidadId, Integer periodo, String estadoAfiliacion,
                                                                                            Integer indice, Integer cantidadRegistrosParticion);


}
