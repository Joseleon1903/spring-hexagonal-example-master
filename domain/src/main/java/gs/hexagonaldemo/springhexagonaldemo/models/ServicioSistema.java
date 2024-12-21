package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ServicioSistema {

    private Integer servicioId;
    private String descripcion;
    private Long procesoSubprocesoId;
    private Short regimenId;
    private Short seguroId;
    private String nombreCola;
    private boolean horarioRequerido;
    private LocalDate fechaInicioDisponibilidad;
    private Short tipoServicioId;
    private Short ordenEjecucion;
    private String estado;
    private Integer servicioPadreId;
    private List<Short> areasNegocio;
    private String claveProcesoArchivo;
    private String claveSubprocesoArchivo;
    private boolean facturable;
    private boolean particionaRespuesta;
    private boolean aplicaCargaDocumento;
    private boolean aplicaRespuestaInmediata;
    private boolean aplicaGeneracionLote;

}
