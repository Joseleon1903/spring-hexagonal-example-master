package gs.hexagonaldemo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "MOTIVO_ESTADO")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MotivoEstadoEntity {

    @Id
    @Column(name = "MOTIVO_ID")
    private Long motivoId;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "PERMITE_DUPLICIDAD")
    private Integer permiteDuplicidad;

    @Column(name = "SERVICIO_PRINCIPAL_PROCESA_ID")
    private Long servicioPrincipalProcesaId;

    @Column(name = "ESTADO")
    private String estado;

}
