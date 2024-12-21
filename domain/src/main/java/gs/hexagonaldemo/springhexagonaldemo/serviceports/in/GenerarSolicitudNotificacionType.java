package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class GenerarSolicitudNotificacionType {

    protected int servicioId;
    protected int entidadId;
    protected short tipoNotificacionId;
    protected List<ParametroGeneracionSolicitudNotificacionType> parametrosSolicitudNotificacion= new ArrayList<>();
    protected List<DestinatarioSolicitudNotificacionType> destinatarios =  new ArrayList<>();
    protected long referenciaId;
}
