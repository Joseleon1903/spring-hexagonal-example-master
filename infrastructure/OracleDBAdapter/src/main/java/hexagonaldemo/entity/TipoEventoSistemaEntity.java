package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="TipoEventoSistema" )
@Table(name = "TIPO_EVENTO_SISTEMA")
@NamedQueries({
        @NamedQuery(name = "TipoEventoSistema.findAll", query = "SELECT t FROM TipoEventoSistema t"),
        @NamedQuery(name = "TipoEventoSistema.findByTipoEventoId", query = "SELECT t FROM TipoEventoSistema t WHERE t.tipoEventoId = :tipoEventoId"),
        @NamedQuery(name = "TipoEventoSistema.findByDescripcion", query = "SELECT t FROM TipoEventoSistema t WHERE t.descripcion = :descripcion"),
        @NamedQuery(name = "TipoEventoSistema.findByEstado", query = "SELECT t FROM TipoEventoSistema t WHERE t.estado = :estado")})
public class TipoEventoSistemaEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "TIPO_EVENTO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_EVENTO_SISTEMA_SEQ")
//    @SequenceGenerator(name = "TIPO_EVENTO_SISTEMA_SEQ", sequenceName = "TIPO_EVENTO_SISTEMA_SEQ", allocationSize = 1, initialValue = 1)
    private Short tipoEventoId;

    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    private String descripcion;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;


}
