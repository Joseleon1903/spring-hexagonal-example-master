package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespuestaPaginacionType {

    protected Integer indice;
    protected Long registrosRestantes;

}
