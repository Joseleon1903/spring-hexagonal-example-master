package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class HorarioServicio {

    private Long horarioServicioId;
    private Integer servicioSistemaId;
    private String diaAplicacion;
    private LocalDate horaInicio;
    private LocalDate horaFin;
    private String estado;
    private Integer usuarioCreacionId;
    private LocalDate fechaCreacion;
    private Integer usuarioUltimoCambioId;
    private LocalDate fechaUltimoCambio;


}