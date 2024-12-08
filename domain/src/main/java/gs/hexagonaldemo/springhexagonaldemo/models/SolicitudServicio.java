package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Data
@ToString
public class SolicitudServicio {

    protected String mensaje;
    protected String cola;
    protected boolean esTopic;
    protected String unitOfOrder;

    public SolicitudServicio(String mensaje, String cola, boolean esTopic) {
        this.mensaje = mensaje;
        this.cola = cola;
        this.esTopic = esTopic;
    }
}
