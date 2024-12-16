package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespuestaCarteraAfiliadoType {

    protected long solicitudId;
    protected Integer nss;
    protected String nombre;
    protected String primerApellido;
    protected String estadoAfiliacion;
    protected Integer motivoEstadoId;
    protected LocalDate fechaEfectividadAfiliacion;

}
