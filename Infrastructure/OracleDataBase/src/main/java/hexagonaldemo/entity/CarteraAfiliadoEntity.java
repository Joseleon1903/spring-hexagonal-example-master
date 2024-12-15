package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="CarteraAfiliado" )
@Table(name = "CARTERA_AFILIADO")
@NamedQueries({
        @NamedQuery(name = CarteraAfiliadoEntity.Queries.EXISTE_CARTERA_AFILIADO_PERIODO_SERVICIO, query = "SELECT c FROM CarteraAfiliado c WHERE c.periodo = :periodo AND c.servicioId = :servicioId")
})
public class CarteraAfiliadoEntity {

    @Id
    @Column(name = "CARTERA_AFILIADO_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CARTERA_AFILIADO_SEQ")
    @SequenceGenerator(name = "CARTERA_AFILIADO_SEQ", sequenceName = "CARTERA_AFILIADO_SEQ", allocationSize = 1, initialValue = 1)
    private Long carteraAfiliadoId;

    @Column(name = "EJECUCION_AFILIACION_ID", nullable = false)
    private Long ejecucionAfiliacionId;

    @Column(name = "SERVICIO_ID", nullable = false)
    private Integer servicioId;

    @Column(name = "PERIODO", nullable = false)
    private Integer periodo;

    @Column(name = "FECHA_GENERACION", nullable = false)
    private LocalDate fechaGeneracion;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "carteraAfiliadoId", fetch = FetchType.LAZY)
    private List<DetalleCarteraAfiliadoEntity> detalleCartera =  new ArrayList<>();


    public static class Queries {

        public static final String EXISTE_CARTERA_AFILIADO_PERIODO_SERVICIO = "CarteraAfiliado.existeCarteraAfiliadoPeriodoServicio";

    }
}
