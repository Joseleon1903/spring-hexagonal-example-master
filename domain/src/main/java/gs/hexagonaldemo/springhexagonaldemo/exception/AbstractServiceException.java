package gs.hexagonaldemo.springhexagonaldemo.exception;


/**
 * Clase Abstracta que toma control del Motivo que una excepcion maneja, para centralizar los datos.
 *
 *
 */
public abstract class AbstractServiceException extends Exception {

    private static final long serialVersionUID = 4610967887256121541L;
    protected Motivo motivo;

    public AbstractServiceException() {
        //constructor por defecto
    }

    /**
     * Iniciando proceso de desmonte del uso de este constructor que puede permitir
     * pasar descripcion de excepciones.
     *
     * TODO @author Carlos Vásquez<i>[cjvasquez@unipago.com.do]</i>
     */

    public AbstractServiceException(int codigo, String descripcion) {
        super(formatearMensaje(codigo, descripcion));
        this.motivo = new Motivo(codigo, descripcion);
    }

    /**
     * Iniciando proceso de desmonte del uso de este constructor que puede permitir
     * pasar descripcion de excepciones.
     *
     */
    public AbstractServiceException(String descripcion, Throwable cause) {
        super(descripcion, cause);
        motivo = new Motivo(descripcion);
    }

    public AbstractServiceException(int codigo, String descripcion, Throwable cause) {
        super(formatearMensaje(codigo, descripcion), cause );
        this.motivo = new Motivo(codigo, descripcion);
    }

    public AbstractServiceException(Motivo motivo) {
        super(formatearMensaje(motivo.getCodigo(), motivo.getDescripcion()));
        this.motivo = motivo;
    }

    public Motivo getFaultInfo() {
        return this.motivo;
    }

    public int getCodigo() {
        return this.motivo.getCodigo();
    }

    public String getDescripcion() {
        return this.motivo.getDescripcion();
    }

    /**
     * Retorna el mensaje de la excepción en el formato CODIGO - DESCRIPCION
     *
     * @param codigo código del motivo
     * @param descripción del motivo
     *
     */
    private static final String formatearMensaje(int codigo, String descripcion) {
        return "".concat(String.valueOf(codigo)).concat(" - ").concat(descripcion);
    }

}
