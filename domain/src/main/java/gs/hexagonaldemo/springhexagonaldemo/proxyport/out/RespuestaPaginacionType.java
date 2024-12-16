package gs.hexagonaldemo.springhexagonaldemo.proxyport.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class RespuestaPaginacionType {

    protected Integer indice;
    protected Long registrosRestantes;

}
