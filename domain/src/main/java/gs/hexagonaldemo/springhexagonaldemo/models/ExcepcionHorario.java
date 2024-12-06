package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ExcepcionHorario {

    private Long excepcionHorarioId;
    private Integer servicioSistemaId;
    private String tipo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaUltimoCambio;
    private Integer usuarioCreacionId;
    private Integer usuarioUltimoCambioId;
    private LocalDate fechaCreacion;
    private String estado;

}
