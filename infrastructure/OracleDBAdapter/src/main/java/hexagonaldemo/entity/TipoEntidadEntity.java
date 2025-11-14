package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "TipoEntidad")
@Table(name = "TIPO_ENTIDAD")
@NamedQueries({ @NamedQuery(name = "TipoEntidad.findAll", query = "SELECT t FROM TipoEntidad t"),
        @NamedQuery(name = "TipoEntidad.findByTipoEntidadId", query = "SELECT t FROM TipoEntidad t WHERE t.tipoEntidadId = :tipoEntidadId"),
        @NamedQuery(name = "TipoEntidad.findByDescripcion", query = "SELECT t FROM TipoEntidad t WHERE t.descripcion = :descripcion"),
        @NamedQuery(name = "TipoEntidad.findByEstado", query = "SELECT t FROM TipoEntidad t WHERE t.estado = :estado") })
public class TipoEntidadEntity {


    @Id
    @Column(name = "TIPO_ENTIDAD_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TIPO_ENTIDAD_SEQ")
    @SequenceGenerator(name = "TIPO_ENTIDAD_SEQ", sequenceName = "TIPO_ENTIDAD_SEQ", allocationSize = 1, initialValue = 1)
    private Short tipoEntidadId;

    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    private String descripcion;

    @Column(name = "SIGLA", nullable = false, length = 10)
    private String sigla;

    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Column(name = "SEGURO_ID")
    private Short seguroId;

    @Column(name = "LDAP_ORGANIZATION_UNIT" , nullable = true)
    private String ldapOrganizationUnit;


}
