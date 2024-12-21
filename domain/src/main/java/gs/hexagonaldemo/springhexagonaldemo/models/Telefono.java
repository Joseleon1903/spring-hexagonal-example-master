package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Telefono {

    private Long telefonoId;
    private Short codigoTipoTelefono;
    private String telefono;
    private String extension;
    private TipoTelefono tipoTelefonoId;
    private String estado;

}
