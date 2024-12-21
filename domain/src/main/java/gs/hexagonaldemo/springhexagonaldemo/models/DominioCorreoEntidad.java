package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class DominioCorreoEntidad {

    private Integer dominioCorreoEntidadId;
    private Entidad entidadId;
    private String dominio;
    private String estado;


}
