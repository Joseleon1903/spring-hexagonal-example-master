package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaPaginacion;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarCarteraAfiliadosPorEntidadPeriodoResponse {

    protected List<DetalleCarteraAfiliadoPeriodo> respuestaCarteraAfiliados;
    protected RespuestaPaginacion registrosRestantes;


}
