package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponseType;

import java.util.Optional;

public class CarteraAfiliadoServiceAdapter implements CarteraAfiliadoES {

    private CarteraAfiliadoRepository carteraAfiliadoRepository;

    public CarteraAfiliadoServiceAdapter(CarteraAfiliadoRepository carteraAfiliadoRepository) {
        this.carteraAfiliadoRepository = carteraAfiliadoRepository;
    }

    @Override
    public Optional<CarteraAfiliado> registrarCarteraAfiliado(CarteraAfiliado carteraAfiliado) {
        return carteraAfiliadoRepository.registrarCarteraAfiliado(carteraAfiliado);
    }

    @Override
    public Boolean existeCarteraAfiliadoPeriodoServicio(Integer periodo, Integer servicioId) {
        return null;
    }

    @Override
    public BuscarCarteraAfiliadosPorEntidadPeriodoResponseType buscarCarteraAfiliadosPorEntidadPeriodo(Integer entidadId, Integer periodo, String estadoAfiliacion, Integer indice, Integer cantidadRegistrosParticion) {
        return carteraAfiliadoRepository.buscarCarteraAfiliadosPorEntidadPeriodo(entidadId, periodo, estadoAfiliacion, indice,cantidadRegistrosParticion);
    }
}
