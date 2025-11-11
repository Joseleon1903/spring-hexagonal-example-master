package gs.hexagonaldemo.springhexagonaldemo.configuration;


import com.unipago.suirsigma.afiliacion.services.tasks.adapter.ConsultarCarteraAfiliadoPorPeriodoAdapter;
import com.unipago.unisigma.usecase.tasks.adapter.PublicarInformacionServicePortAdapter;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.ConsultarCarteraAfiliadoPorPeriodoPort;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.PublicarInformacionPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationProxyConfiguration {

    @Bean
    public PublicarInformacionPort publicarInformacionServicePort() {
        return new PublicarInformacionServicePortAdapter();
    }

    @Bean
    public ConsultarCarteraAfiliadoPorPeriodoPort consultarCarteraAfiliadoPorPeriodoPort() {
        return new ConsultarCarteraAfiliadoPorPeriodoAdapter();
    }




}