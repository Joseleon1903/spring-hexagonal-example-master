package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MotivoEstado {

    private Long motivoId;

    private String descripcion;

    private Integer permiteDuplicidad;

    private Long servicioPrincipalProcesaId;

    private String estado;

    @Override
    public String toString() {
        return "MotivoEstado{" +
                "motivoId=" + motivoId +
                ", descripcion='" + descripcion + '\'' +
                ", permiteDuplicidad=" + permiteDuplicidad +
                ", servicioPrincipalProcesaId=" + servicioPrincipalProcesaId +
                ", estado='" + estado + '\'' +
                '}';
    }
}
