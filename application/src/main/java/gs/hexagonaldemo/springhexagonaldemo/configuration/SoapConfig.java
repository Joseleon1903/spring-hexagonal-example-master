package gs.hexagonaldemo.springhexagonaldemo.configuration;

import com.soap.api.adapter.config.SoapContractConfig;
import com.soap.api.adapter.endpoints.ConsultarCarteraAfiliadoPeriodoEndpoint;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

@EnableWs
@Configuration
public class SoapConfig  extends SoapContractConfig {


    // 👇 Aquí registras tu endpoint manualmente
    @Bean
    public ConsultarCarteraAfiliadoPeriodoEndpoint studentEndpoint(ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort) {
        return new ConsultarCarteraAfiliadoPeriodoEndpoint(consultarCarteraAfiliadoPorPeriodoPort);
    }
}
