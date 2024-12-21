package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParametroEspecifico {

    private Integer parametroEspecificoId;
    private String parametroId;
    private Integer entidadId;
    private Integer servicioId;
    private String valor;
}
