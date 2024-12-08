package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "BitacoraEvento")
@Table(name = "BITACORA_EVENTO")
@NamedQueries({ @NamedQuery(name = "BitacoraEvento.findAll", query = "SELECT b FROM BitacoraEvento b"),
        @NamedQuery(name = "BitacoraEvento.findByEventoId", query = "SELECT b FROM BitacoraEvento b WHERE b.bitacoraEventoId = :eventoId"),
        @NamedQuery(name = "BitacoraEvento.findByFecha", query = "SELECT b FROM BitacoraEvento b WHERE b.fecha = :fecha"),
        @NamedQuery(name = "BitacoraEvento.findByDescripcion", query = "SELECT b FROM BitacoraEvento b WHERE b.descripcion = :descripcion") })
public class BitacoraEventoEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "EVENTO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "BITACORA_EVENTO_SEQ")
//    @SequenceGenerator(name = "BITACORA_EVENTO_SEQ", sequenceName = "BITACORA_EVENTO_SEQ", allocationSize = 1, initialValue = 1)
    private Long bitacoraEventoId;

    @Basic(optional = false)
    @Column(name = "DESCRIPCION", nullable = false, length = 4000)
    private String descripcion;

    @Basic(optional = false)
    @Column(name = "DIRECCION_IP", nullable = false, length = 15)
    private String direccionIp;

    @Basic(optional = false)
    @Column(name = "INSTANCIA_BPEL", nullable = false, length = 10)
    private Long instanciaBpel;

    @Basic(optional = false)
    @Column(name = "EVENTO_PADRE_ID", nullable = true)
    private Long eventoPadreId;

    @Basic(optional = false)
    @Column(name = "FECHA", nullable = false)
    private LocalDate fecha;

    @Basic(optional = true)
    @Column(name = "SERVICIO_ID")
    private Integer servicioId;

    @Column(name = "TIPO_EVENTO_ID", nullable = false)
    private Short tipoEventoId;

    @Basic(optional = false)
    @Column(name = "USUARIO_ID", nullable = false)
    private Integer usuarioId;

}
