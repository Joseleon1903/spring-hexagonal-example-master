package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.EsPeriodoValidoResponseType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

/**
 * <b>Perfil de Servicio</b>
 *
 * <dl>
 * <dt><b>Nombre:</b></dt>
 * <dd>FechaUS</dd>
 *
 * <dt><b>Descripcion:</b></dt>
 * <dd>Este servicio provee las operaciones asociadas a Fechas</dd>
 *
 * <dt><b>Versi�n:</b></dt>
 * <dd>0.01</dd>
 *
 * <dt><b>Custodio:</b></dt>
 * <dd>Carlos V�squez</dd>
 *
 * <dt><b>Modelo:</b></dt>
 * <dd>Utilidad</dd>
 * </dl>
 *
 * @since ALFA 8
 */
public interface FechaES {

    /**
     * Permite calcular la edad de un ciudadano.
     *
     * @return la {@link Integer edad calculada} de un ciudadano
     * @author cfabian
     */
    public BigDecimal calcularEdad(LocalDate fechaNacimiento, LocalDate fechaCorte, boolean consideraFraccionAnios);

    /**
     * Retorna el periodo corriente a la fecha provista por par�metro, si no se pasa ninguna fecha, se determina en base a la fecha actual.
     *
     * @return El {@link Integer periodo}
     */
    public Integer buscarPeriodoCorriente(LocalDate fecha);

    /**
     * </br> Permite determinar la cantidad de d�as existentes entre un rango de fechas en particular </br>
     *
     * @param {@link calcularDiasEntreFechasInput  entrada} con {@link LocalDate fechaInicial} y {@link LocalDate fechaFinal}
     * @return {@link Integer catidad} de dias entre las fechas proporcionadas
     * @author aortiz
     */
    public Integer calcularDiasEntreFechas(LocalDate fechaInicial,LocalDate fechaFinal);

    /**
     * La Capacidad determina, tomando como par�metro la fecha de nacimiento del ciudadano, y retorna una respuesta indicando si es mayor de edad o no.
     *
     * @return la verificacion de si un ciudadano es mayor de edad basado en su fecha de nacimiento.
     * @author aortiz<aortiz@unipago.com.do>
     */
    public Boolean esMayorEdad(LocalDate fechaNacimiento);

    /**
     * </br> La Capacidad Recibe una fecha como parametro y la convierte al estandar de fecha ISO8601(yyyy-MM-dd HH:mm:ss)
     *
     * @return la fecha formateada
     */
    public String formatearFechaISO8601(LocalDate fecha);

    /**
     * Permite crear una lista de periodos a partir de un periodo base y una cantidad de periodos proporcionados como par�metros.
     *
     *
     * @return una lista de {@link Integer periodos} creados
     */
    public List<Integer> calcularPeriodos(Integer periodoBase, Integer cantidadPeriodos);

    /**
     * Permite validar un periodo de acuerdo a las reglas establecidas.
     *
     * <br/><br/>
     *
     * <b>Reglas de Validaci�n del Periodo: </b><br/><br/>

     El periodo debe poseer 6 digitos.<br/>
     Los cuatro (4) primeros d�gitos correspondan a un a�o v�lido y posterior o igual al a�o del Periodo M�nimo Permitido.<br/>
     Los dos (2) ultimos d�gitos corresponden a un mes v�lido. (1-12).<br/>
     *
     * @return el {@link Boolean indicador }de si un {@link Integer perido} es valido,
     * 			en cado de ser invalido tambien retorna el {@link Integer id} del motivo.
     */
    public EsPeriodoValidoResponseType esPeriodoValido(Integer periodo);

    /**
     *  Permite obtener la pr�xima fecha h�bil a partir de una fecha base provista como par�metro.
     *
     * @return la proxima  fecha habil}
     */
    public LocalDate buscarProximaFechaHabil(LocalDate fechaBase, Short cantidadDiasHabiles);

    /**
     *  Permite obtener la fecha h�bil anterior a partir de una fecha base provista como par�metro.
     *
     * @return la  fecha habil anterior
     */
    public LocalDate buscarFechaHabilAnterior(LocalDate fechaBase, Short cantidadDiasHabiles);

    /**
     * La capacidad valida la vigencia del envio de un documento
     *
     * @return el {@link Boolean indicador} de si un plazo es vigente
     */
    public Boolean esPlazoVigente(    LocalDate fechaBase,LocalDate fechaRecepcion, Short diasPlazo, Short tipoDia);


}
