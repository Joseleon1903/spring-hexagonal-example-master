package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultarCarteraAfiliadoPorPeriodoResponseType {

    private List<RespuestaCarteraAfiliadoType> respuestaCarteraAfiliados;
    private RespuestaPaginacionType registrosRestantes;

}