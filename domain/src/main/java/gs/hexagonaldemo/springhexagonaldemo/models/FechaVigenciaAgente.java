package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class FechaVigenciaAgente {

    private Long fechaVigenciaAgenteId;
    private LocalDate fechaIngreso;
    private LocalDate fechaSalida;
    private Agente agenteId;


}
