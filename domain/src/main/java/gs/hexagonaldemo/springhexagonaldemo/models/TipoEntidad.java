package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class TipoEntidad {

    private Short tipoEntidadId;
    private String descripcion;
    private String sigla;
    private String estado;
    private Short seguroId;
    private String ldapOrganizationUnit;

}
