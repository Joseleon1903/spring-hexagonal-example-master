package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Agente {

    private Long agenteId;
    private String estado;
    private Short tipoAgente;
    private Short tipoIdentificacionId;
    private Integer entidadId;
    private Short seguroId;
    private Long ciudadanoId;
    private Integer empleadorId;
    private Short tipoPersona;

    private Set<FechaVigenciaAgente> fechaVigenciaAgenteSet;


}
