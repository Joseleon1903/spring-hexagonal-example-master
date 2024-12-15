package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class CarteraAfiliado {

    private Long carteraAfiliadoId;
    private Long ejecucionAfiliacionId;
    private Integer servicioId;
    private Integer periodo;
    private LocalDate fechaGeneracion;

    private List<DetalleCarteraAfiliado> detalleCartera;
}
