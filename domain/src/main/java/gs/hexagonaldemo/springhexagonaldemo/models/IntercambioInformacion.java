package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class IntercambioInformacion {

    private Integer intercambioInformacionId;
    private String descripcion;
    private String estado;
    private String nombre;
    private String esquema;
    private String procedimiento;
    private Integer servicioId;
    private Integer servicioEnvioId;
    private String rutaServicioTareaEspecifico;
    private Short tipoIntercambioInformacion;
    private Integer entidadRelacionadaId;
    private Boolean validaEjecucionPrevia;
    protected Boolean validaTiempoRetencionInformacion;
    private Boolean asincrono;
    private List<ParametroIntercambioInformacion> parametros;

}
