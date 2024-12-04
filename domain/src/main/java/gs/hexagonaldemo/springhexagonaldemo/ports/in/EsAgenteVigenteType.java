package gs.hexagonaldemo.springhexagonaldemo.ports.in;

import gs.hexagonaldemo.springhexagonaldemo.models.Agente;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EsAgenteVigenteType {

    protected Agente agente;
    protected LocalDate fecha;

}
