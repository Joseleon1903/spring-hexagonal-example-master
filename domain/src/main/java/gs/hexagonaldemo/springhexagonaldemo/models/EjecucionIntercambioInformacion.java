package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EjecucionIntercambioInformacion {

    private Long ejecucionIntercambioInfoId;
    private IntercambioInformacion intercambioInformacionId;
    private Integer usuarioId;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private LocalDate fechaRespuesta;
    private List<ParametroEjecucionIntercambioInformacion> parametrosEjecucion = new ArrayList<>();
    private List<Integer> entidadesAfectadas;
    private String estado;
    private Integer motivoId;
    private Integer codigoServicio;
    private Integer servicioId;

}
