package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Parametro {

    private String parametroId;
    private String valor;
    private String tipoDato;
    private String descripcion;

}
