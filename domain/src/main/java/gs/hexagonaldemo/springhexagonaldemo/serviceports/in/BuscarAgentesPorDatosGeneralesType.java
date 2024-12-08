package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarAgentesPorDatosGeneralesType {

    private Short tipoAgente;
    private Short tipoPersona;
    private Short tipoIdentificacionId;
    private String numeroIdentificacion;
    private Short seguroId;
    private Short tipoEntidadId;
    private Integer entidadId;
    private Boolean incluirAgentesSinEntidadAsignada;
    private String estado;
    private Integer indice;
    private Integer cantidadRegistrosParticion;


}
