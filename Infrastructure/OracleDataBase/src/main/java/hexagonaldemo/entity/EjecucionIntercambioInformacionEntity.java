package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "EjecucionIntercambioInformacion")
@Table(name ="EJECUCION_INTERCAMBIO_INFO")
@NamedQueries({
        @NamedQuery(name = EjecucionIntercambioInformacionEntity.Queries.BUSCAR_ULTIMO_INTER_INFO_POR_SVC , query = "select e from EjecucionIntercambioInformacion e where e.servicioId = :servicioId and (e.estado in :estados or 1 = :estadoPropocionado) order by e.fechaInicio desc"),
        @NamedQuery(name = EjecucionIntercambioInformacionEntity.Queries.BUSCAR_ULTIMO_INTER_INFO_POR_SVC_FECHA_RESP_NO_ASIG , query = "select e from EjecucionIntercambioInformacion e where e.servicioId = :servicioId and ( e.estado in :estados or 1 = :estadoPropocionado) and e.fechaRespuesta is null order by e.fechaInicio desc"),
        @NamedQuery(name = EjecucionIntercambioInformacionEntity.Queries.BUSCAR_ULTIMO_INTER_INFO_POR_SVC_FECHA_RESP_ASIG, query = "select e from EjecucionIntercambioInformacion e where e.servicioId = :servicioId and (e.estado in :estados or 1 = :estadoPropocionado) and e.fechaRespuesta is not null order by e.fechaInicio desc")
})
public class EjecucionIntercambioInformacionEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "EJECUCION_INTERCAMBIO_INFO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EJECUCION_INTERCAMBIO_INFO_SEQ")
//    @SequenceGenerator(name = "EJECUCION_INTERCAMBIO_INFO_SEQ", sequenceName = "EJECUCION_INTERCAMBIO_INFO_SEQ", allocationSize = 1, initialValue = 1)
    private Long ejecucionIntercambioInfoId;

    @ManyToOne
    @JoinColumn(name="INTERCAMBIO_INFORMACION_ID")
    private IntercambioInformacionEntity intercambioInformacionId;

    @Column(name = "USUARIO_ID")
    private Integer usuarioId;

    @Basic(optional = false)
    @Column(name = "FECHA_INICIO", nullable = false)
    private LocalDate fechaInicio;

    @Basic(optional = true)
    @Column(name = "FECHA_FIN" , nullable = true)
    private LocalDate fechaFin;

    @Basic(optional = true)
    @Column(name = "FECHA_RESPUESTA")
    private LocalDate fechaRespuesta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "ejecucionIntercambioInformacionId")
    private List<ParametroEjecucionIntercambioInformacionEntity> parametrosEjecucion;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ENTIDAD_AFEC_EJEC_INTER_INFO",joinColumns = @JoinColumn(name = "EJECUCION_INTERCAMBIO_INFO_ID", referencedColumnName = "EJECUCION_INTERCAMBIO_INFO_ID"))
    @Column(name = "ENTIDAD_ID")
    private List<Integer> entidadesAfectadas;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false)
    private String estado;

    @Basic(optional = false)
    @Column(name = "MOTIVO_ID", nullable = false)
    private Integer motivoId;

    @Column(name = "CODIGO_SERVICIO")
    private Integer codigoServicio;

    @Column(name = "SERVICIO_ID")
    private Integer servicioId;

    public static class Queries {

        public static final String BUSCAR_ULTIMO_INTER_INFO_POR_SVC = "EjecucionIntercambioInformacion.buscarUltimoIntercambioInformacionPorServicio";
        public static final String BUSCAR_ULTIMO_INTER_INFO_POR_SVC_FECHA_RESP_ASIG = "EjecucionIntercambioInformacion.buscarUltimoIntercambioInformacionPorServicioFechaRespAsig";
        public static final String BUSCAR_ULTIMO_INTER_INFO_POR_SVC_FECHA_RESP_NO_ASIG = "EjecucionIntercambioInformacion.buscarUltimoIntercambioInformacionPorServicioFechaRespNoAsig";

    }

    public interface Funciones {
        String BUSCAR_INTER_INFO_POR_SERVICIO_FN = "EJECUCION_INTER_INFO_ES_PKG.BUSCAR_EJEC_INTER_POR_SERVICIO_FN";
    }

    public interface Columns {
        String EJECUCION_INTARCAMBIO_INFO_ID = "EJECUCION_INTARCAMBIO_INFO_ID";
        String INTERCAMBIO_INFORMACION_ID = "INTERCAMBIO_INFORMACION_ID";
        String USUARIO_ID = "USUARIO_ID";
        String FECHA_INICIO = "FECHA_INICIO";
        String FECHA_FIN = "FECHA_FIN";
        String FECHA_RESPUESTA = "FECHA_RESPUESTA";
        String ESTADO = "ESTADO";
        String MOTIVO_ID ="MOTIVO_ID";
        String CODIGO_SERVICIO = "CODIGO_SERVICIO";
        String SERVICIO_ID = "SERVICIO_ID";
        //INTERCAMBIO INFORMACION
        String DESCRIPCION = "DESCRIPCION";
        String INFO_ESTADO = "INFO_ESTADO";
        String NOMBRE = "NOMBRE";
        String ESQUEMA = "ESQUEMA";
        String PROCEDIMIENTO = "PROCEDIMIENTO";
        String INFO_SERVICIO_ID = "INFO_SERVICIO_ID";
        String SERVICIO_ENVIO_ID = "SERVICIO_ENVIO_ID";
        String RUTA_SERVICIO_TAREA_ESPECIFICO = "RUTA_SERVICIO_TAREA_ESPECIFICO";
        String TIPO_INTERCAMBIO_INFORMACION = "TIPO_INTERCAMBIO_INFORMACION";
        String ENTIDAD_RELACIONADA_ID = "ENTIDAD_RELACIONADA_ID";
        String VALIDA_EJECUCION_PREVIA = "VALIDA_EJECUCION_PREVIA";
        String VALIDA_TIEMPO_RETENCION_INFORMACION = "VALIDA_TIEMPO_RETENCION_INFORMACION";

    }
}
