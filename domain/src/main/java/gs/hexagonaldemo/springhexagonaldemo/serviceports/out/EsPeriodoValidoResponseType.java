package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class EsPeriodoValidoResponseType {

    protected boolean esPeriodoValido;
    protected Integer motivoInvalido;


}
