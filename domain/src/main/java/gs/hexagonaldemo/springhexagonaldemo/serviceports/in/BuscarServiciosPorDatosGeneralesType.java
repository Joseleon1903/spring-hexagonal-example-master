package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarServiciosPorDatosGeneralesType {

    protected String descripcion;
    private Short areaNegocioId;
    protected String nombreCola;
    protected Boolean horarioRequerido;
    protected LocalDate fechaInicioDisponibilidad;
    protected LocalDate fechaFinDisponibilidad;
    protected Short procesoId;
    protected Integer subprocesoId;
    protected Short tipoServicioId;
    protected Boolean aplicaCargaDocumento;
    protected Integer usuarioId;
    protected String estado;

}
