package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class BuscarAgenteActivoPorEntidadType {

    protected Short tipoAgente;
    protected Short tipoPersona;
    protected Short tipoIdentificacionId;
    protected String numeroIdentificacion;
    protected Short claveTipoEntidad;
    protected Short claveEntidad;


}
