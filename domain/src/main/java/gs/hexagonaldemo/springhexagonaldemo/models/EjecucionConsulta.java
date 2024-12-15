package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EjecucionConsulta {

    private Long ejecucionConsultaId;
    private Integer entidadId;
    private Integer usuarioId;
    private Integer servicioId;
    private LocalDate fecha;
    private LocalDate fechaFin;
    private String criterios;
    private String estado;
    private List<Integer> listaMotivoEstado = new ArrayList<>();


}
