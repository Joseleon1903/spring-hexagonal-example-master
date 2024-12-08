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
@Entity(name = "AreaNegocio")
@Table(name = "AREA_NEGOCIO")
@NamedQueries({
        @NamedQuery(name = "AreaNegocio.findByAreaNegocioId", query = "SELECT a FROM AreaNegocio a WHERE a.areaNegocioId = :areaNegocioId"),
        @NamedQuery(name = AreaNegocioEntity.Queries.BUSCAR_AREAS_NEGOCIO, query = "SELECT a FROM AreaNegocio a WHERE (:tipoArea IS NULL OR a.tipoArea = :tipoArea)")
})
public class AreaNegocioEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "AREA_NEGOCIO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AREA_NEGOCIO_SEQ")
//    @SequenceGenerator(name = "AREA_NEGOCIO_SEQ", sequenceName = "AREA_NEGOCIO_SEQ", allocationSize = 1, initialValue = 1)
    private Short areaNegocioId;

    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    private String descripcion;

    @Basic(optional = false)
    @Column(name = "TIPO_AREA", nullable = false, length = 1)
    private Short tipoArea;


    public static class Queries{

        public static final String BUSCAR_AREAS_NEGOCIO = "buscarAreasNegocio";
    }
}