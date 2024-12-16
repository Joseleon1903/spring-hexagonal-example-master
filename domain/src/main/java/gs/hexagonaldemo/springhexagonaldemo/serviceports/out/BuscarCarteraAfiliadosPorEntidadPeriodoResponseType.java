package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaPaginacionType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarCarteraAfiliadosPorEntidadPeriodoResponseType {

    protected List<DetalleCarteraAfiliadoPeriodoType> respuestaCarteraAfiliados;
    protected RespuestaPaginacionType registrosRestantes;


}
