package hexagonaldemo.entity;

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
@Entity(name = "HorarioServicio" )
@Table(name = "HORARIO_SERVICIO")
@NamedQueries({ @NamedQuery(name=HorarioServicioEntity.Queries.BUSCAR_HORARIO_POR_SERVICIO__SOLAPADO, query="SELECT h FROM HorarioServicio h WHERE h.servicioSistemaId = :servicioId AND h.diaAplicacion = :diaAplicacion "),
        @NamedQuery(name=HorarioServicioEntity.Queries.BUSCAR_HORARIO_POR_SERVICIO_ID, query="SELECT h FROM HorarioServicio h WHERE h.servicioSistemaId = :servicioId ")
})
public class HorarioServicioEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "HORARIO_SERVICIO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "HORARIO_SERVICIO_SEQ")
//    @SequenceGenerator(name = "HORARIO_SERVICIO_SEQ", sequenceName = "HORARIO_SERVICIO_SEQ", allocationSize = 1, initialValue = 1)
    private Long horarioServicioId;

    @Column(name = "SERVICIO_ID")
    private Integer servicioSistemaId;

    @Basic(optional = false)
    @Column(name = "DIA_APLICACION", nullable = false)
    private String diaAplicacion;

    @Basic(optional = false)
    @Column(name = "HORA_INICIO", nullable = false)
    private LocalDate horaInicio;

    @Basic(optional = false)
    @Column(name = "HORA_FIN", nullable = false)
    private LocalDate horaFin;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private String estado;

    @Basic(optional = false)
    @Column(name = "USUARIO_CREACION_ID", nullable = false)
    private Integer usuarioCreacionId;

    @Basic(optional = false)
    @Column(name = "FECHA_CREACION", nullable = false)
    private LocalDate fechaCreacion;

    @Basic(optional = false)
    @Column(name = "USUARIO_ULTIMO_CAMBIO_ID", nullable = false)
    private Integer usuarioUltimoCambioId;

    @Basic(optional = false)
    @Column(name = "FECHA_ULTIMO_CAMBIO", nullable = false)
    private LocalDate fechaUltimoCambio;


    public static class Queries{
        public static final String BUSCAR_HORARIO_POR_SERVICIO_ID ="HorarioServicio.buscarHorarioServicioPorServicioId";
        public static final String BUSCAR_HORARIO_POR_SERVICIO__SOLAPADO ="HorarioServicio.findByServicioSolapado";

    }
}
