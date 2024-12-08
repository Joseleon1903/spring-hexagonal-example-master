package gs.hexagonaldemo.springhexagonaldemo.configuration;

import com.unipago.unisigma.usecase.tasks.adapter.PublicarInformacionServicePortAdapter;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.PublicarInformacionPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProxyConfiguration {

    @Bean
    public PublicarInformacionPort publicarInformacionServicePort() {
        return new PublicarInformacionServicePortAdapter();
    }

}
