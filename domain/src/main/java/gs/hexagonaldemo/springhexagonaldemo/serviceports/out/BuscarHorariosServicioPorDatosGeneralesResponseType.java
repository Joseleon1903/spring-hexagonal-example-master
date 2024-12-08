package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarHorariosServicioPorDatosGeneralesResponseType {

    protected Long excepcionHorarioId;
    protected Integer servicioSistemaId;
    protected String tipo;
    protected LocalDate fechaInicio;
    protected LocalDate fechaFin;
    protected LocalDate fechaUltimoCambio;
    protected Integer usuarioUltimoCambioId;
    protected Integer usuarioCreacionId;
    protected LocalDate fechaCreacion;
    protected String estado;


}
