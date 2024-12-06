package gs.hexagonaldemo.springhexagonaldemo.ports;

import gs.hexagonaldemo.springhexagonaldemo.models.HorarioServicio;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.BuscarHorariosServicioPorDatosGeneralesType;
import gs.hexagonaldemo.springhexagonaldemo.ports.out.BuscarHorariosServicioPorDatosGeneralesResponseType;

import java.time.LocalDate;

public interface HorarioServicioES {

    /**
     * Permite registrar un horario de servicio con los datos suministrados.
     *
     * <br/><br/>
     *
     * @param horarioServicio Objeto tipo HorarioServicio que contiene la información del servicio a registrar.
     */
    public HorarioServicio registrarHorario(HorarioServicio horarioServicio);

    /**
     * Permite validar si el servicio consultado está disponible para la fecha especificada.
     *
     * <br/><br/>
     *
     * El sistema realiza una búsqueda en el catálogo de HorarioServicio utilizando el servicioId y la fecha provistos como parámetros,
     * y retorna true si el servicio está disponible.
     *
     */
    public Boolean estaServicioDisponible(int servicioId, LocalDate fecha);

    /**
     *Permite modificar el horario de atención de un servicio provisto por parametro.
     */
    HorarioServicio actualizarHorarioServicio(HorarioServicio actualizarHorarioServicio);

    /**
     *Permite obtener los Horarios de Servicios en base a los datos generales suministrados por parametro.
     * @param buscarHorariosServicioPorDatosGeneralesInput
     * @return BuscarHorariosServicioPorDatosGeneralesResponseType
     */
    BuscarHorariosServicioPorDatosGeneralesResponseType buscarHorariosServicioPorDatosGenerales(BuscarHorariosServicioPorDatosGeneralesType buscarHorariosServicioPorDatosGeneralesInput);

    /**
     *La Capacidad realiza una busqueda en el catálogo de Horario Servicio utilizando el ID provisto como parametro, y retorna los datos del Horario de Servicio obtenido
     * @return
     *     returns BuscarHorarioServicioPorIdResponseType
     */
    HorarioServicio buscarHorarioServicioPorId(Long horarioServicioId);

}
