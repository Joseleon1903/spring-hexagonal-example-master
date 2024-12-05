package gs.hexagonaldemo.entity;

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
@Entity
@Table(name ="PARAM_INTERCAMBIO_INFO")
@Access(AccessType.PROPERTY)
public class ParametroIntercambioInformacionEntity {

    @Id
    private Integer parametroIntercambioInformacionId;
//    private IntercambioInformacionEntity intercambioInformacionId;
//    private Short orden;
//    private String nombre;
//    private String tipoDato;
//    private Boolean validaRango;
//    private String parametroRango;
//    private Boolean validaDiasRango;
//    private boolean requerido;
//    private String estado;
//
//    protected boolean requeridoCondicionado;
//    protected TipoCondicionRequeridoEntity tipoCondicionRequerido;
//    protected List<ExcepcionParametroRequeridoIntercambioInformacionEntity> excepcionesParametroRequerido;

}
