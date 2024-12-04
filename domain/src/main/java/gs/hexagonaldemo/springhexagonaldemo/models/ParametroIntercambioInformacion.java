package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ParametroIntercambioInformacion {

    private Integer parametroIntercambioInformacionId;
    private IntercambioInformacion intercambioInformacionId;
    private Short orden;
    private String nombre;
    private String tipoDato;
    private Boolean validaRango;
    private String parametroRango;
    private Boolean validaDiasRango;
    private boolean requerido;
    private String estado;

    protected boolean requeridoCondicionado;
    protected TipoCondicionRequerido tipoCondicionRequerido;
    protected List<ExcepcionParametroRequeridoIntercambioInformacion> excepcionesParametroRequerido;
}
