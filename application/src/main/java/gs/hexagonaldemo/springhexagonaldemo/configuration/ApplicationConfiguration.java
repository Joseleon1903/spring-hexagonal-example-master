package gs.hexagonaldemo.springhexagonaldemo.configuration;

import gs.hexagonaldemo.springhexagonaldemo.ports.IntercambioInformacionES;
import gs.hexagonaldemo.springhexagonaldemo.ports.IntercambioInformacionRepository;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoES;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.IntercambioInformacionAdapter;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.MotivoEstadoServiceAdapter;
import hexagonaldemo.adapters.IntercambioInformacionRepositoryAdapter;
import hexagonaldemo.adapters.MotivoEstadoRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public MotivoEstadoES motivoEstadoService(MotivoEstadoRepository  motivoEstadoRepository) {
        return new MotivoEstadoServiceAdapter(motivoEstadoRepository);
    }

    @Bean
    public MotivoEstadoRepository motivoEstadoRepository() {
        return new MotivoEstadoRepositoryAdapter();
    }


    @Bean
    public IntercambioInformacionES intercambioInformacionService(IntercambioInformacionRepository intercambioInformacionRepository) {
        return new IntercambioInformacionAdapter(intercambioInformacionRepository);
    }

    @Bean
    public IntercambioInformacionRepository intercambioInformacionRepository() {
        return new IntercambioInformacionRepositoryAdapter();
    }

}
