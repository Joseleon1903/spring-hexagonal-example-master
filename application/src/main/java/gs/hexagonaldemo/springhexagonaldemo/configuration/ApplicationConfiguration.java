package gs.hexagonaldemo.springhexagonaldemo.configuration;

import gs.hexagonaldemo.adapters.MotivoEstadoRepositoryAdapter;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoES;
import gs.hexagonaldemo.springhexagonaldemo.ports.MotivoEstadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.MotivoEstadoServiceAdapter;
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

}
