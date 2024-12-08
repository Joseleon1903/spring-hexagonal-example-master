package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class ParametroEjecucion {

    protected String nombre;
    protected String valor;
}
