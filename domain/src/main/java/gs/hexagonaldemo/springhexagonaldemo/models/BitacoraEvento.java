package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BitacoraEvento {

    private Long bitacoraEventoId;
    private String descripcion;
    private String direccionIp;
    private Long instanciaBpel;
    private Long eventoPadreId;
    private LocalDate fecha;
    private Integer servicioId;
    private Short tipoEventoId;
    private Integer usuarioId;


}
