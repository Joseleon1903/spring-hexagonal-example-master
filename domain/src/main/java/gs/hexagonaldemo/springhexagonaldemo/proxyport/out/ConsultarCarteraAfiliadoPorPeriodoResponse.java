package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class ConsultarCarteraAfiliadoPorPeriodoResponse {

    private List<RespuestaCarteraAfiliado> respuestaCarteraAfiliados = new ArrayList<>();
    private RespuestaPaginacion registrosRestantes;

    public ConsultarCarteraAfiliadoPorPeriodoResponse(List<RespuestaCarteraAfiliado> respuestaCarteraAfiliados, RespuestaPaginacion registrosRestantes) {
        this.respuestaCarteraAfiliados = respuestaCarteraAfiliados;
        this.registrosRestantes = registrosRestantes;
    }

    public ConsultarCarteraAfiliadoPorPeriodoResponse() {
    }

    public List<RespuestaCarteraAfiliado> getRespuestaCarteraAfiliados() {
        return respuestaCarteraAfiliados;
    }

    public void setRespuestaCarteraAfiliados(List<RespuestaCarteraAfiliado> respuestaCarteraAfiliados) {
        this.respuestaCarteraAfiliados = respuestaCarteraAfiliados;
    }

    public RespuestaPaginacion getRegistrosRestantes() {
        return registrosRestantes;
    }

    public void setRegistrosRestantes(RespuestaPaginacion registrosRestantes) {
        this.registrosRestantes = registrosRestantes;
    }

    @Override
    public String toString() {
        return "ConsultarCarteraAfiliadoPorPeriodoResponse{" +
                "respuestaCarteraAfiliados=" + respuestaCarteraAfiliados +
                ", registrosRestantes=" + registrosRestantes +
                '}';
    }
}