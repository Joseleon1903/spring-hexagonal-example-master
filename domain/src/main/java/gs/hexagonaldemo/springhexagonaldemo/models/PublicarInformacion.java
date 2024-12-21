package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class PublicarInformacion {

    protected Integer servicioId;
    protected List<ParametroEjecucion> parametrosEjecucion;

}
