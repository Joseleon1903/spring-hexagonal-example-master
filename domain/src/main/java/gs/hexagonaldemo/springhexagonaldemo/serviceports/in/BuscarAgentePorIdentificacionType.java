package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarAgentePorIdentificacionType {

    protected Short tipoAgente;
    protected Short tipoPersona;
    protected Short tipoIdentificacionId;
    protected String numeroIdentificacion;
    protected Short seguroId;
    protected Integer entidadId;
    protected Boolean incluirAgentesSinEntidadAsignada;
    protected String estado;

}
