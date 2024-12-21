package com.unipago.suirsigma.afiliacion.services.tasks.exception;

import lombok.Data;

import static gs.hexagonaldemo.springhexagonaldemo.utils.ParametrosUSConstantes.ParametrosNotificacion.DESCRIPCION;

@Data
public class DatoRequeridoNoProporcionadoException extends RuntimeException{

    public Integer codigo = 10001;
    public String descripcion = "EXISTEN DATOS REQUERIDOS NO PROPORCIONADOS";

    public static Integer CODIGO = 10001;
    public static String DESCRIPCION = "EXISTEN DATOS REQUERIDOS NO PROPORCIONADOS";

    /**
     * El constructor recibe como par�metro el mensaje y la causa de la excepci�n
     *
     * @param message
     * @param cause
     */
    public DatoRequeridoNoProporcionadoException(String message, Throwable cause) {
        super(message, cause);
    }


    /**
     * El constructor recibe por par�metro la causa de la excepci�n
     *
     * @param cause
     * @since Orden Atencion 4
     * @author Carlos V�squez <i>[cjvasquez@unipago.com.do]</i>
     */
    public DatoRequeridoNoProporcionadoException(Throwable cause) {
        super();
    }

    public DatoRequeridoNoProporcionadoException() {

    }


    /**
     *
     * @return
     * @throws DatoRequeridoNoProporcionadoException
     */
    public static DatoRequeridoNoProporcionadoException rethrow(Throwable e) {

        return new DatoRequeridoNoProporcionadoException(e);

    }

    /**
     * Retorna el mensaje por defecto de la excepci�n en el formato CODIGO - DESCRIPCION
     *
     * @return
     */
    public String getMensajePorDefecto() {
        return codigo + " - " +descripcion ;
    }

}
