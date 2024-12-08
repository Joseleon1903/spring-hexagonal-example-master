package gs.hexagonaldemo.springhexagonaldemo.utils;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

public class FechaUtil {

    private static final String REDONDEAR_AL_INICIO = "inicio";
    private static final String REDONDEAR_AL_FINAl = "final";
    public static final int FECHAS_IGUALES = 0;
    public static final int FECHA_INICIAL_POSTERIOR_FECHA_FINAL = -1;
    public static final int FECHA_INICIAL_ANTERIOR_FECHA_FINAL = 1;

    private static final SimpleDateFormat formatoPeriodoCorriente = new SimpleDateFormat("yyyyMM");

    private FechaUtil(){}

    public static long diferenciaEnDiasEntreFechas(LocalDate fechaInicial, LocalDate fechaFinal) {
        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }

    public static LocalDate convertirStringALocalDate(String fecha, String formato) {
        if (fecha == null || formato == null) {
            return null;
        }
        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formato);
            return LocalDate.parse(fecha, formatter);
        } catch (DateTimeParseException e) {
            System.err.println("Error al parsear la fecha: " + e.getMessage());
            return null;
        }
    }

//    /**
//     * @author cfabian
//     * Capacidad que recibe dos rangos de tiempo y determina si se solapan. Para asegurar la uniformidad de
//     *  las fechas le asigna la misma fecha a los 2 rangos de tiempo.
//     * @param horaInicio1
//     * @param horaFin1
//     * @param horaInicio2
//     * @param horaFin2
//     * @return true si los rangos de tiempo se solapan
//     */
//    public static boolean overlap(LocalDate horaInicio1, LocalDate horaFin1, LocalDate horaInicio2, LocalDate horaFin2){
//
//        horaInicio1 = reiniciarFecha(horaInicio1);
//        horaFin1 = reiniciarFecha(horaFin1);
//        horaInicio2 = reiniciarFecha(horaInicio2);
//        horaFin2 = reiniciarFecha(horaFin2);
//
//        return horaInicio1.getTime() < horaFin2.getTime() && horaInicio2.getTime() < horaFin1.getTime();
//    }
//
//    public static Integer moverPeriodos(Integer periodos, Integer cantidad){
//        GregorianCalendar calendar = new GregorianCalendar();
//        SimpleDateFormat sdf = new SimpleDateFormat(ParametrosUSConstantes.Formatos.FORMATO_PERIODO);
//        StringBuilder str = new StringBuilder();
//        try {
//            calendar.setTime(sdf.parse(periodos.toString()));
//            calendar.add(Calendar.MONTH, cantidad);
//            str.append(calendar.get(Calendar.YEAR)).append(calendar.get(Calendar.MONTH));
//            return new Integer(str.toString());
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return Integer.valueOf(1);
//        }
//    }
//
//    private static LocalDate reiniciarFecha(LocalDate fecha) {
//        Calendar calendar = Calendar.getInstance();
//
//        calendar.setTime(LocalDate.now());
//        int anioActual = calendar.get(Calendar.YEAR);
//        int mesActual = calendar.get(Calendar.MONTH);
//        int diaActual = calendar.get(Calendar.DAY_OF_MONTH);
//
//        calendar.setTime(fecha);
//        calendar.set(anioActual, mesActual, diaActual);
//
//        return calendar.getTime();
//
//    }
//
//    public static int diferenciaEnAnosEntreFechas(LocalDate fechaInicial, LocalDate fechaFinal) throws ValidationException, Exception {
//
//
//        try {
//            Calendar init = Calendar.getInstance();
//            init.setTime(fechaInicial);
//
//            Calendar end = Calendar.getInstance();
//            init.setTime(fechaFinal);
//
//            return end.get(Calendar.YEAR) - init.get(Calendar.YEAR);
//
//        } catch (ArrayIndexOutOfBoundsException e) {
//            throw e;
//        }
//    }
//
//    public static int diferenciaEnMesesEntreFechas(Date fechaInicial, Date fechaFinal) throws DatoRequeridoNoProporcionadoException {
//        GregorianCalendar calendarInicial = new GregorianCalendar();
//        calendarInicial.setTime(fechaInicial);
//
//        GregorianCalendar calendarFinal = new GregorianCalendar();
//        calendarFinal.setTime(fechaFinal);
//
//        int diffYear = calendarFinal.get(Calendar.YEAR) - calendarInicial.get(Calendar.YEAR);
//        return (diffYear * 12) + (calendarFinal.get(Calendar.MONTH) - calendarInicial.get(Calendar.MONTH));
//    }
//
//    public static int calcularEdadPorFecha(Date fecha) throws ValidationException {
//
//        if (ValidationUtil.validateNotNull(fecha)) {
//            throw new ValidationException("Fecha a procesar no puede ser nula.");
//        }
//
//        Calendar dob = Calendar.getInstance();
//        dob.setTime(fecha);
//
//        Calendar today = Calendar.getInstance();
//
//        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
//
//        if (today.get(Calendar.MONTH) < dob.get(Calendar.MONTH)) {
//            System.out.println("Differentes Months");
//            age--;
//        } else if (today.get(Calendar.MONTH) == dob.get(Calendar.MONTH) && today.get(Calendar.DAY_OF_MONTH) < dob.get(Calendar.DAY_OF_MONTH)) {
//            System.out.println("Differentes Months and Days");
//            age--;
//        }
//
//        return age;
//    }
//
//    public static int buscarPeriodoCorriente(Date fecha) {
//        Calendar calendario = Calendar.getInstance();
//
//        if (!Objects.isNull(fecha)) {
//            calendario.setTime(fecha);
//        }
//
//        //retorceder un mes a la fecha determinada
//        calendario.add(Calendar.MONTH, -1);
//
//        int periodoCorriente = Integer.parseInt(formatoPeriodoCorriente.format(calendario.getTime()));
//
//        BuscarPeriodoCorrienteResponseType respuesta = new BuscarPeriodoCorrienteResponseType();
//        respuesta.setPeriodoCorriente(periodoCorriente);
//
//        return periodoCorriente;
//    }
//
//    public static int buscarPeriodoCorriente() {
//        return buscarPeriodoCorriente(null);
//    }
//
//
//
//
//    public static Date removerTiempo(Date date) {
//        Calendar cal = Calendar.getInstance();
//        cal.setTime(date);
//        cal.set(Calendar.HOUR_OF_DAY, 0);
//        cal.set(Calendar.MINUTE, 0);
//        cal.set(Calendar.SECOND, 0);
//        cal.set(Calendar.MILLISECOND, 0);
//        return cal.getTime();
//    }
//
//    public static String obtenerDuracionProcesoLegible(LocalDateTime start, LocalDateTime end) {
//        long s = ChronoUnit.SECONDS.between(start, end);
//        return String.format("%02d:%02d:%02d", s/3600, (s%3600)/60, (s%60));
//    }
//
//    /**
//     * <pre>Redondea la fecha al inicio del d�a.
//     * Ej: La fecha pasada por par�metro es llevada en su la hora, minutos y
//     * segundos a 00:00:00 para representar el inicio del d�a.
//     *
//     * Si la fecha de entrada es null retorna null
//     *
//     * </pre>
//     * @author Carlos V�squez <i>cjvasquez@unipago.com.do</i>
//     * @param fecha fecha pasada por par�metro que debe ser redondeada
//     * @since hallazgos
//     * @return {@link Date}
//     */
//    public static Date redondearFechaAlInicio(Date fecha){
//        return fecha != null ? redondearFecha(fecha, REDONDEAR_AL_INICIO) : null;
//    }
//
//    /**
//     * <pre>Redondea la fecha al final del d�a.
//     * Ej: La fecha pasada por par�metro es llevada en su hora, minutos y
//     * segundos a 23:59:59 para representar el final del d�a.
//     *
//     * Si la fecha de entrada es null retorna null
//     *
//     * </pre>
//     * @author Carlos V�squez <i>cjvasquez@unipago.com.do</i>
//     * @param fecha fecha pasada por par�metro que debe ser redondeada
//     * @since hallazgos
//     * @return {@link Date}
//     */
//    public static Date redondearFechaAlFinal(Date fecha){
//        return fecha != null ? redondearFecha(fecha, REDONDEAR_AL_FINAl) : null;
//    }
//
//    public static int buscarPeriodoCalendario() {
//        Calendar cal = Calendar.getInstance();
//        StringBuilder str = new StringBuilder();
//        str.append(cal.get(Calendar.YEAR)).append((cal.get(Calendar.MONTH) + 1) > 9 ? "" : "0").append(cal.get(Calendar.MONTH) + 1);
//        return Integer.valueOf(str.toString());
//    }
//    /**
//     * Recibe por par�metro una fecha la cual puede ser redondeada.
//     * En caso de no ser pasada una orientaci�n la fecha es retornada integra.
//     *
//     * @author Carlos V�squez <i>cjvasquez@unipago.com.do</i>
//     * @param fecha fecha a formatear
//     * @param orientacion indica al lado que ser� redondeada
//     * @since hallazgos
//     * @return {@link Date}
//     */
//    public static Date redondearFecha(Date fecha, String orientacion){
//
//        Calendar calendario = Calendar.getInstance();
//        if(REDONDEAR_AL_INICIO.equals(orientacion)){
//            calendario.setTime(fecha);
//            calendario.set(Calendar.HOUR_OF_DAY, 0);
//            calendario.set(Calendar.MINUTE, 0);
//            calendario.set(Calendar.SECOND, 0);
//            return calendario.getTime();
//        }else if(REDONDEAR_AL_FINAl.equals(orientacion)){
//            calendario.setTime(fecha);
//            calendario.set(Calendar.HOUR_OF_DAY, 23);
//            calendario.set(Calendar.MINUTE, 59);
//            calendario.set(Calendar.SECOND, 59);
//            return calendario.getTime();
//        }
//        return fecha;
//    }
//
//    /**
//     * <pre>
//     * Compara dos fechas pasadas por par�metro.
//     *
//     * returna 0 si las fechas pasadas por par�metro son iguales.
//     * returna 1 si la segunda fecha pasada por par�metro es mayor.
//     * returna -1 si la primera fecha pasada por par�metro es mayor.
//     * </pre>
//     *
//     * @param fecha1
//     * @param fecha2
//     *
//     * @author Carlos V�squez <i>cjvasquez@unipago.com.do</i>
//     * @since Pruebas Aceptaci�n OA1
//     *
//     * @return
//     */
//    public static int compare(Date fecha1, Date fecha2){
//
//        if(fecha1.equals(fecha2)){
//            return FECHAS_IGUALES;
//        }
//
//        if(fecha1.before(fecha2)){
//            return FECHA_INICIAL_ANTERIOR_FECHA_FINAL;
//        }
//
//        if(fecha1.after(fecha2)){
//            return FECHA_INICIAL_POSTERIOR_FECHA_FINAL;
//        }
//
//        return FECHAS_IGUALES;
//    }
//
//    /**
//     * Retorna {@link Boolean#TRUE true} cuando la fecha1 pasada por par�metro es posterior a la fecha2 pasada por par�metro
//     *
//     * @param fecha1
//     * @param fecha2
//     * @return
//     */
//    public static boolean fechaInicialPosteriorFechaFinal(LocalDate fecha1, LocalDate fecha2){
//
//        return compare(fecha1, fecha2) == FECHA_INICIAL_POSTERIOR_FECHA_FINAL;
//
//    }
//
//    /**
//     * Retorna {@link Boolean#TRUE true} cuando la fecha1 pasada por par�metro es anterior a la fecha2 pasada por par�metro
//     *
//     *
//     * @param fecha1
//     * @param fecha2
//     * @return
//     */
//    public static boolean fechaInicialAnteriorFechaFinal(LocalDate fecha1, LocalDate fecha2){
//
//        return compare(fecha1, fecha2) == FECHA_INICIAL_ANTERIOR_FECHA_FINAL ||
//                compare(fecha1, fecha2) == FECHAS_IGUALES;
//
//    }


}
