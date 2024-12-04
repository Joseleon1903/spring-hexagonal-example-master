package gs.hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "FECHA_VIGENCIA_AGENTE")
@NamedQueries({@NamedQuery(name = "FechaVigenciaAgente.findAll" , query = "SELECT f FROM FechaVigenciaAgente f"),
        @NamedQuery(name = "FechaVigenciaAgente.findById" , query = "SELECT f FROM FechaVigenciaAgente f where f.fechaVigenciaAgenteId = :fechaVigenciaAgenteId")})
public class FechaVigenciaAgenteEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "FECHA_VIGENCIA_AGENTE_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "FECHA_VIGENCIA_AGENTE_SEQ")
//    @SequenceGenerator(name = "FECHA_VIGENCIA_AGENTE_SEQ", sequenceName = "FECHA_VIGENCIA_AGENTE_SEQ", allocationSize = 1, initialValue = 1)
    private Long fechaVigenciaAgenteId;


    @Basic(optional = false)
    @Column(name = "FECHA_INGRESO" , nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaIngreso;

    @Basic(optional = true)
    @Column(name = "FECHA_SALIDA" , nullable = true)
    @Temporal(TemporalType.TIMESTAMP)
    private LocalDate fechaSalida;

    @ManyToOne(optional = false, cascade = CascadeType.MERGE)
    @JoinColumn(name = "AGENTE_ID", referencedColumnName = "AGENTE_ID")
    private AgenteEntity agenteId;

}
