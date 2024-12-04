package gs.hexagonaldemo.springhexagonaldemo.exception;

public class Motivo {

    private int codigo;
    private String descripcion;

    public Motivo() {
        //constructor por defecto
    }

    public Motivo(int codigo) {
        this.codigo = codigo;
    }

    public Motivo(String descripcion) {
        super();
        this.descripcion = descripcion;
    }

    public Motivo(int codigo, String descripcion) {
        super();
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public Motivo(Motivo motivo) {
        this(motivo.codigo, motivo.descripcion);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setMotivoBean(Motivo motivo) {
        this.codigo = motivo.codigo;
        this.descripcion = motivo.descripcion;
    }

    @Override
    public String toString() {
        return "MotivoBean [codigo=" + codigo + ", descripcion=" + descripcion
                + "]";
    }

    /**
     *
     * @return un string con la descripcion y el codigo del motivo en el siguiente formato:<br/>
     *         decripcion_motivo (Codigo: codigo_motivo)
     */
    public String toMensajeString() {
        return String.format("%s (C\u00f3digo: %d)", descripcion, codigo);
    }



}
