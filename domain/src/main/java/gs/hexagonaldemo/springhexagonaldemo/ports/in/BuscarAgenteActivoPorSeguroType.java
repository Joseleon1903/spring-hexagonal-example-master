package gs.hexagonaldemo.springhexagonaldemo.ports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarAgenteActivoPorSeguroType {

    protected Short tipoAgente;
    protected Short tipoPersona;
    protected Short tipoIdentificacionId;
    protected String numeroIdentificacion;
    protected Short seguroId;


}
