package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class AreaNegocio {

    private Short areaNegocioId;
    private String descripcion;
    private Short tipoArea;


}
