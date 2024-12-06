package gs.hexagonaldemo.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Agente")
@Table(name = "AGENTE")
@NamedQueries({
        @NamedQuery(name = "Agente.findAll", query = "SELECT a FROM Agente a"),
        @NamedQuery(name = "Agente.findByAgenteId", query = "SELECT a FROM Agente a JOIN FETCH a.fechaVigenciaAgenteSet WHERE a.agenteId = :agenteId"),
        @NamedQuery(name = "Agente.findByEstado", query = "SELECT a FROM Agente a WHERE a.estado = :estado") })
public class AgenteEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "AGENTE_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AGENTE_SEQ")
//    @SequenceGenerator(name = "AGENTE_SEQ", sequenceName = "AGENTE_SEQ", allocationSize = 1, initialValue = 1)
    private Long agenteId;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Basic(optional = false)
    @Column(name = "TIPO_AGENTE", nullable = false, length = 2)
    private Short tipoAgente;

    @Basic(optional = false)
    @Column(name = "TIPO_IDENTIFICACION_ID", nullable = false, length = 2)
    private Short tipoIdentificacionId;

    @Column(name = "ENTIDAD_ID", nullable = true)
    private Integer entidadId;

    @Column(name = "SEGURO_ID", nullable = false, length = 2)
    private Short seguroId;

    @Column(name = "CIUDADANO_ID", nullable = false)
    private Long ciudadanoId;

    @Column(name = "EMPLEADOR_ID", nullable = false)
    private Integer empleadorId;

    @Basic(optional = false)
    @Column(name = "TIPO_PERSONA", nullable = false)
    private Short tipoPersona;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "agenteId", fetch = FetchType.EAGER)
    private Set<FechaVigenciaAgenteEntity> fechaVigenciaAgenteSet;

}
