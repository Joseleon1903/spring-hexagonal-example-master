package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ExcepcionParametroRequeridoIntercambioInformacion")
@Table(name ="EXCEP_PARAM_REQ_INTER_INFO")
public class ExcepcionParametroRequeridoIntercambioInformacionEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "EXCEP_PARAM_REQ_INTER_INFO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EXCEP_PARAM_REQ_INTER_INFO_SEQ")
//    @SequenceGenerator(name = "EXCEP_PARAM_REQ_INTER_INFO_SEQ", sequenceName = "EXCEP_PARAM_REQ_INTER_INFO_SEQ", allocationSize = 1, initialValue = 1)
    private Integer excepcionParametroRequeridoIntercambioInformacionId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARAM_INTERCAMBIO_INFO_ID", referencedColumnName = "PARAM_INTERCAMBIO_INFO_ID", nullable = false)
    private ParametroIntercambioInformacionEntity parametroIntercambioInformacionId;

    @Column(name = "PARAM_CONDICIONA_REQ_ID")
    private Integer parametroCondicionaRequeridoId;

    @Column(name = "VALOR_ESPECIFICO")
    private boolean valorEspecifico;

    @Column(name = "VALOR_PARAMETRO_CONDICIONA_REQ", length = 1)
    private String valorParametroCondicionaRequerido;


}
