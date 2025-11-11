package gs.hexagonaldemo.springhexagonaldemo.proxyport.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ConsultarCarteraAfiliadoPorPeriodo {


    protected Integer periodo;
    protected String estadoAfiliacion;
    protected Integer indice;

}
