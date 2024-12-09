package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "ParametroIntercambioInformacion")
@Table(name ="PARAM_INTERCAMBIO_INFO")
public class ParametroIntercambioInformacionEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "PARAM_INTERCAMBIO_INFO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAM_INTERCAMBIO_INFO_SEQ")
//    @SequenceGenerator(name = "PARAM_INTERCAMBIO_INFO_SEQ", sequenceName = "PARAM_INTERCAMBIO_INFO_SEQ", allocationSize = 1, initialValue = 1)
    private Integer parametroIntercambioInformacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INTERCAMBIO_INFORMACION_ID", referencedColumnName = "INTERCAMBIO_INFORMACION_ID", nullable = false)
    private IntercambioInformacionEntity intercambioInformacionId;

    @Column(name = "ORDEN")
    private Short orden;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "TIPO_DATO", length = 1)
    private String tipoDato;

    @Column(name = "VALIDA_RANGO")
    private Boolean validaRango;

    @Column(name = "PARAMETRO_RANGO")
    private String parametroRango;

    @Column(name = "VALIDA_DIAS_RANGO")
    private Boolean validaDiasRango;

    @Column(name = "REQUERIDO")
    private boolean requerido;

    @Column(name = "ESTADO")
    private String estado;

    @Column(name = "REQUERIDO_CONDICIONADO")
    protected boolean requeridoCondicionado;


    @Column(name = "TIPO_REQUERIDO_CONDICIONADO")
    protected TipoCondicionRequeridoEntity tipoCondicionRequerido;

    @OneToMany(mappedBy = "parametroIntercambioInformacionId", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    protected List<ExcepcionParametroRequeridoIntercambioInformacionEntity> excepcionesParametroRequerido;

}
