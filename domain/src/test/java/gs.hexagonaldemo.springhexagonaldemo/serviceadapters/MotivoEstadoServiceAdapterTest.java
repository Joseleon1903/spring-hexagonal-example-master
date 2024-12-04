package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;

import static org.mockito.ArgumentMatchers.notNull;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MotivoEstadoServiceAdapterTest {

    @Mock
    private MotivoEstadoRepository motivoEstadoRepository;

    @InjectMocks
    private MotivoEstadoServiceAdapter motivoEstadoServiceAdapter;

    @Before
    public void setup() {
        MockitoAnnotations.initMocks(this);
    }

    @Test
    public void buscarUsuarioPorId_testCase() {

        Long motivoId = 1607L;
        when(motivoEstadoRepository.getById(motivoId)).thenReturn(notNull());

        motivoEstadoServiceAdapter.buscarMotivoEstadoPorId(motivoId);

        verify(motivoEstadoRepository).getById(motivoId);
    }

}
