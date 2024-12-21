package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "IntercambioInformacion")
@Table(name="INTERCAMBIO_INFORMACION")
@NamedQueries({
        @NamedQuery(name = IntercambioInformacionEntity.Queries.BUSCAR_POR_SERVICIO_ID , query = "SELECT i FROM IntercambioInformacion i LEFT JOIN FETCH i.parametros WHERE i.servicioId = :servicioId"),
})
public class IntercambioInformacionEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "INTERCAMBIO_INFORMACION_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "INTERCAMBIO_INFORMACION_SEQ")
//    @SequenceGenerator(name = "INTERCAMBIO_INFORMACION_SEQ", sequenceName = "INTERCAMBIO_INFORMACION_SEQ", allocationSize = 1, initialValue = 1)
    private Integer intercambioInformacionId;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "ESQUEMA")
    private String esquema;

    @Column(name = "PROCEDIMIENTO")
    private String procedimiento;

    @Column(name = "SERVICIO_ID")
    private Integer servicioId;

    @Column(name = "SERVICIO_ENVIO_ID")
    private Integer servicioEnvioId;

    @Column(name = "RUTA_SERVICIO_TAREA_ESPECIFICO")
    private String rutaServicioTareaEspecifico;

    @Column(name = "TIPO_INTERCAMBIO_INFORMACION")
    private Short tipoIntercambioInformacion;

    @Column(name = "ENTIDAD_RELACIONADA_ID")
    private Integer entidadRelacionadaId;

    @Column(name= "VALIDA_EJECUCION_PREVIA")
    private boolean validaEjecucionPrevia;

    @Column(name= "VALIDA_TIEMPO_RETENCION_INFO")
    protected boolean validaTiempoRetencionInformacion;

    @Column(name= "ASINCRONO")
    private boolean asincrono;

    @OneToMany(mappedBy = "intercambioInformacionId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<ParametroIntercambioInformacionEntity> parametros = new ArrayList<>();

    public static interface Queries {

        String BUSCAR_POR_SERVICIO_ID = "IntercambioInformacion.buscarPorServicioId";
        String BUSCAR_POR_SERVICIO_ID_TIPO_INTERCAMBIO_ESTADO = "IntercambioInformacion.buscarPorServicioIdTipoIntercambioEstado";

    }
}
