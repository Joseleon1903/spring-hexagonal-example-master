package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Usuario {

    protected Integer usuarioId;
    protected String codigo;
    protected String clave;
    protected Integer contactoId;
    protected Short tipoUsuarioId;
    protected LocalDate fechaUltimoCambio;
    protected Integer usuarioUltimoCambioId;
    protected String llaveEncriptacionClave;
    protected LocalDate fechaCreacion;
    protected LocalDate fechaExpiracion;
    protected LocalDate fechaUltimoCambioClave;
    protected LocalDate fechaUltimaAutenticacion;
    protected Short cantidadAvisosProximoVencimientoClave;
    protected LocalDate fechaUltimoAvisoProximoVencimientoClave;
    protected LocalDate fechaVencimientoClave;
    private LocalDate fechaAvisoVencimientoClave;
    protected Boolean bloqueado;
    protected LocalDate fechaNotificacionBloqueo;
    protected String estado;
}