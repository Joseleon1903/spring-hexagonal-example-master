package gs.hexagonaldemo.springhexagonaldemo.configuration;

import com.soap.api.adapter.config.SoapContractConfig;
import com.soap.api.adapter.endpoints.StudentEndpoint;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ws.config.annotation.EnableWs;

@EnableWs
@Configuration
public class SoapConfig  extends SoapContractConfig {


    // 👇 Aquí registras tu endpoint manualmente
    @Bean
    public StudentEndpoint studentEndpoint() {
        return new StudentEndpoint();
    }
}
