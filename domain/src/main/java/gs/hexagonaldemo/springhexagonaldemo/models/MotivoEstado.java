package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class MotivoEstado {

    private Integer motivoId;

    private String descripcion;

    private Integer permiteDuplicidad;

    private Long servicioPrincipalProcesaId;

    private String estado;

    public MotivoEstado(int codigo, String descripcion) {
        this.motivoId = codigo;
        this.descripcion = descripcion;
    }

    public MotivoEstado(int motivoId) {
        this.motivoId = motivoId;
    }

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
