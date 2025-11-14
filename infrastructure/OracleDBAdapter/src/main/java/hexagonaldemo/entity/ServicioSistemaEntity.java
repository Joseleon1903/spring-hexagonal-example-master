package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "ServicioSistema")
@Table(name = "SERVICIO_SISTEMA")
@NamedQueries({ @NamedQuery(name = "ServicioSistema.findAll", query = "SELECT s FROM ServicioSistema s"),
        @NamedQuery(name = "ServicioSistema.findByServicioId", query = "SELECT s FROM ServicioSistema s WHERE s.servicioId = :servicioId"),
        @NamedQuery(name = "ServicioSistema.findNombreColaByServicioId", query = "SELECT s.nombreCola FROM ServicioSistema s WHERE s.servicioId = :servicioId"),
        @NamedQuery(name = "ServicioSistema.findByDescripcion", query = "SELECT s FROM ServicioSistema s WHERE s.descripcion = :descripcion"),
        @NamedQuery(name = "ServicioSistema.findByEstado", query = "SELECT s FROM ServicioSistema s WHERE s.estado = :estado"),
        @NamedQuery(name = "ServicioSistema.findByServicioIdActivo", query = "SELECT s FROM ServicioSistema s WHERE s.servicioId = :servicioId and s.estado = 'AC'"),
        @NamedQuery(name = ServicioSistemaEntity.Queries.BUSCAR_POR_SERVICIO_PADRE_ID, query = "SELECT s FROM ServicioSistema s WHERE s.servicioPadreId = :servicioPadreId ORDER BY s.ordenEjecucion, s.servicioId"),
        @NamedQuery(name = ServicioSistemaEntity.Queries.BUSCAR_POR_PROCESO_SUBPROCESO, query = "SELECT s FROM ServicioSistema s where s.procesoSubprocesoId = :procesoSubprocesoId")})
public class ServicioSistemaEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "SERVICIO_ID", nullable = false)
    private Integer servicioId;

    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    private String descripcion;

    @Basic(optional = false)
    @Column(name = "PROCESO_SUBPROCESO_ID" , nullable = false)
    private Long procesoSubprocesoId;

    @Column(name = "REGIMEN_ID", nullable = true)
    private Short regimenId;

    @Column(name = "SEGURO_ID", nullable = true)
    private Short seguroId;

    @Basic(optional = true)
    @Column(name = "NOMBRE_COLA" , nullable = true)
    private String nombreCola;

    @Basic(optional = false)
    @Column(name = "HORARIO_REQUERIDO" , nullable = false)
    private boolean horarioRequerido;

    @Basic(optional = false)
    @Column(name = "FECHA_INICIO_DISPONIBILIDAD", nullable = false)
    private LocalDate fechaInicioDisponibilidad;

    @Basic(optional = false)
    @Column(name = "TIPO_SERVICIO_ID", nullable = false)
    private Short tipoServicioId;

    @Column(name = "ORDEN_EJECUCION", nullable = true)
    private Short ordenEjecucion;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Basic(optional = false)
    @Column(name = "SERVICIO_PADRE_ID", nullable = true)
    private Integer servicioPadreId;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "AREA_NEGOCIO_SERVICIO_SISTEMA", joinColumns = @JoinColumn(name = "SERVICIO_ID"))
    @Column(name = "AREA_NEGOCIO_ID")
    private List<Short> areasNegocio;

    @Column(name = "CLAVE_PROCESO_ARCHIVO", nullable = true, length = 2)
    private String claveProcesoArchivo;

    @Column(name = "CLAVE_SUBPROCESO_ARCHIVO", nullable = true, length = 2)
    private String claveSubprocesoArchivo;

    @Basic(optional = false)
    @Column(name = "FACTURABLE" , nullable = false)
    private boolean facturable;

    @Basic(optional = false)
    @Column(name = "PARTICIONA_RESPUESTA" , nullable = false)
    private boolean particionaRespuesta;

    @Basic(optional = false)
    @Column(name = "APLICA_CARGA_DOCUMENTO" , nullable = false)
    private boolean aplicaCargaDocumento;

    @Basic(optional = false)
    @Column(name = "APLICA_RESPUESTA_INMEDIATA")
    private boolean aplicaRespuestaInmediata;

    @Basic(optional = false)
    @Column(name = "APLICA_GENERACION_LOTE")
    private boolean aplicaGeneracionLote;


    public static interface Queries {

        String BUSCAR_POR_PROCESO_SUBPROCESO 	= "ServicioSistema.findByProcesoSubProceso";
        String BUSCAR_POR_SERVICIO_PADRE_ID 	= "ServicioSistema.findByServicioPadreId";

    }
}
