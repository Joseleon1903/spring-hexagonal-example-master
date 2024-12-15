package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponseType;

import java.util.Optional;

public interface CarteraAfiliadoRepository {


    Optional<CarteraAfiliado> registrarCarteraAfiliado(CarteraAfiliado carteraAfiliado);

    Boolean existeCarteraAfiliadoPeriodoServicio(Integer periodo,Integer servicioId);

    BuscarCarteraAfiliadosPorEntidadPeriodoResponseType buscarCarteraAfiliadosPorEntidadPeriodo(Integer entidadId, Integer periodo, String estadoAfiliacion,
                                                                                                Integer indice, Integer cantidadRegistrosParticion);

}
