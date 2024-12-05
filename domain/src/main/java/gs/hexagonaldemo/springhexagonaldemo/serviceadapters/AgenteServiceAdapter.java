package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.exception.InternalServiceException;
import gs.hexagonaldemo.springhexagonaldemo.models.Agente;
import gs.hexagonaldemo.springhexagonaldemo.ports.AgenteES;
import gs.hexagonaldemo.springhexagonaldemo.ports.in.*;

import java.util.Collections;
import java.util.List;

public class AgenteServiceAdapter implements AgenteES {


    @Override
    public Agente actualizarAgente(Agente actualizarAgente) throws InternalServiceException {
        return null;
    }

    @Override
    public Agente buscarAgentePorIdentificacion(BuscarAgentePorIdentificacionType buscarAgentePorIdentificacionInput) throws InternalServiceException {
        return null;
    }

    @Override
    public List<Agente> buscarAgenteActivoPorSeguro(BuscarAgenteActivoPorSeguroType buscarAgenteActivoPorSeguroInput) throws InternalServiceException {
        return Collections.emptyList();
    }

    @Override
    public List<Agente> buscarAgenteActivoPorEntidad(BuscarAgenteActivoPorEntidadType buscarAgenteActivoPorEntidadInput) throws InternalServiceException {
        return Collections.emptyList();
    }

    @Override
    public Agente esAgenteVigente(EsAgenteVigenteType esAgenteVigenteInput) throws InternalServiceException {
        return null;
    }

    @Override
    public Agente registrarAgente(Agente registrarAgenteType) throws InternalServiceException {
        return null;
    }

    @Override
    public List<Agente> buscarAgentesPorDatosGenerales(BuscarAgentesPorDatosGeneralesType buscarAgentesPorDatosGeneralesInput) throws InternalServiceException {
        return Collections.emptyList();
    }
}
