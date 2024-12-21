package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "DominioCorreoEntidad")
@Table(name="DOMINIO_CORREO_ENTIDAD")
@NamedQueries({
        @NamedQuery(name="DominioCorreoEntidad.findAll", query="SELECT d FROM DominioCorreoEntidad d"),
        @NamedQuery(name="DominioCorreoEntidad.buscarPorEntidadId", query="SELECT d FROM DominioCorreoEntidad d WHERE d.entidadId.entidadId = :entidadId"),
})
public class DominioCorreoEntidadEntity {

    @Id
    @Column(name = "DOMINIO_CORREO_ENTIDAD_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DOMINIO_CORREO_ENTIDAD_SEQ")
    @SequenceGenerator(name = "DOMINIO_CORREO_ENTIDAD_SEQ", sequenceName = "DOMINIO_CORREO_ENTIDAD_SEQ", allocationSize = 1, initialValue = 1)
    private Integer dominioCorreoEntidadId;

    @JoinColumn(name = "ENTIDAD_ID", referencedColumnName = "ENTIDAD_ID", nullable = false)
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private EntidadEntity entidadId;

    @Column(name = "DOMINIO", nullable = false, length = 64)
    private String dominio;

    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

}
