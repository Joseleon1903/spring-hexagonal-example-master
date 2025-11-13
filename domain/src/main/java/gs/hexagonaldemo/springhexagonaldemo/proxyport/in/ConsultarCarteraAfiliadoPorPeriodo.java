package gs.hexagonaldemo.springhexagonaldemo.proxyport.in;

public class ConsultarCarteraAfiliadoPorPeriodo {


    protected Integer periodo;
    protected String estadoAfiliacion;
    protected Integer indice;

    public ConsultarCarteraAfiliadoPorPeriodo(Integer periodo, String estadoAfiliacion, Integer indice) {
        this.periodo = periodo;
        this.estadoAfiliacion = estadoAfiliacion;
        this.indice = indice;
    }

    public ConsultarCarteraAfiliadoPorPeriodo() {
    }

    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public String getEstadoAfiliacion() {
        return estadoAfiliacion;
    }

    public void setEstadoAfiliacion(String estadoAfiliacion) {
        this.estadoAfiliacion = estadoAfiliacion;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "ConsultarCarteraAfiliadoPorPeriodo{" +
                "periodo=" + periodo +
                ", estadoAfiliacion='" + estadoAfiliacion + '\'' +
                ", indice=" + indice +
                '}';
    }
}
