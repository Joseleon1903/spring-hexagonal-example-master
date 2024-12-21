package gs.hexagonaldemo.springhexagonaldemo.serviceports.in;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class BuscarResumenEjecucionesConsultaPorFechaType {

    protected LocalDate fechaInicial;
    protected LocalDate fechaFinal;
    protected Short tipoServicioId;
    protected Boolean servicioFacturable;
    protected Short tipoEntidadId;
    protected Boolean entidadAplicaFacturacion;
    protected Boolean excluirServicioEntidadNoFacturable;
    protected List<Short> tiposFondoId;
    protected String  estado;


}
