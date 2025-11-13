package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

public class RespuestaPaginacion {

    protected Integer indice;
    protected Long registrosRestantes;

    public RespuestaPaginacion(Integer indice, Long registrosRestantes) {
        this.indice = indice;
        this.registrosRestantes = registrosRestantes;
    }

    public RespuestaPaginacion() {
    }

    public Long getRegistrosRestantes() {
        return registrosRestantes;
    }

    public void setRegistrosRestantes(Long registrosRestantes) {
        this.registrosRestantes = registrosRestantes;
    }

    public Integer getIndice() {
        return indice;
    }

    public void setIndice(Integer indice) {
        this.indice = indice;
    }

    @Override
    public String toString() {
        return "RespuestaPaginacion{" +
                "indice=" + indice +
                ", registrosRestantes=" + registrosRestantes +
                '}';
    }
}
