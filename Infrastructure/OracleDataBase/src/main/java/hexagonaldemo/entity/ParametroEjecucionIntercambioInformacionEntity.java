package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ParametroEjecucionIntercambioInformacion")
@Table(name ="PARAM_EJECUCION_INTER_INFO")
public class ParametroEjecucionIntercambioInformacionEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "PARAM_EJECUCION_INTER_INFO_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAM_EJECUCION_INTER_INFO_SEQ")
    @SequenceGenerator(name = "PARAM_EJECUCION_INTER_INFO_SEQ", sequenceName = "PARAM_EJECUCION_INTER_INFO_SEQ", allocationSize = 1)
    private Long parametroEjecucionIntercambioInformacionId;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "EJECUCION_INTERCAMBIO_INFO_ID", referencedColumnName = "EJECUCION_INTERCAMBIO_INFO_ID")
    private EjecucionIntercambioInformacionEntity ejecucionIntercambioInformacionId;

    @Column(name = "PARAM_INTERCAMBIO_INFO_ID")
    private Integer parametroIntercambioInformacionId;

    @Column(name = "VALOR")
    private String valor;

    @Column(name = "CODIGO_PARAMETRO")
    private String codigoParametro;

}
