package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ActaNacimientoType {

    protected String codigoMunicipio;
    protected Short codigoOficialia;
    protected String libro;
    protected String folio;
    protected String numero;
    protected Integer anio;
    protected String literal;
    protected String tipoLibro;

}
