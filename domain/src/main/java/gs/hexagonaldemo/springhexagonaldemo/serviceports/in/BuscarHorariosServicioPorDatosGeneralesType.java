package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarHorariosServicioPorDatosGeneralesType {

    protected Short procesoId;
    protected Integer subProcesoId;
    protected Short tipoServicioId;
    protected Integer servicioId;
    protected String diaAplicacion;
    protected String descripcionServicio;
    protected LocalDate horaInicio;
    protected LocalDate horaFin;
    protected String estado;


}
