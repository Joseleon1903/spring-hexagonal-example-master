package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity(name = "EjecucionConsulta")
@Table(name="EJECUCION_CONSULTA")
public class EjecucionConsultaEntity {

    @Id
    @Column(name="EJECUCION_CONSULTA_ID", nullable=false)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="EJECUCION_CONSULTA_SEQ")
    @SequenceGenerator(name = "EJECUCION_CONSULTA_SEQ", sequenceName = "EJECUCION_CONSULTA_SEQ", allocationSize = 1, initialValue = 1)
    private Long ejecucionConsultaId;

    @Column(name="ENTIDAD_ID", nullable=false)
    private Integer entidadId;

    @Column(name="USUARIO_ID")
    private Integer usuarioId;

    @Column(name="SERVICIO_ID", nullable=false)
    private Integer servicioId;

    @Column(name="FECHA", nullable=false)
    private LocalDateTime fecha;

    @Column(name="FECHA_FIN")
    private LocalDateTime fechaFin;

    @Column(name="CRITERIOS", nullable=false)
    private String criterios;

    @Column(name="ESTADO", nullable=false)
    private String estado;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "EJECUCION_CONSULTA_MOTIVOS", joinColumns = { @JoinColumn(name = "EJECUCION_CONSULTA_ID") })
    @Column(name = "MOTIVO_ID")
    private List<Integer> listaMotivoEstado = new ArrayList<>();


}