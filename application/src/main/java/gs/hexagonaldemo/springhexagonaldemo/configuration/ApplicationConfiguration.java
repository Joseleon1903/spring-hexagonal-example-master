package gs.hexagonaldemo.springhexagonaldemo.configuration;

import gs.hexagonaldemo.adapters.MotivoEstadoRepositoryAdapter;
import gs.hexagonaldemo.springhexagonaldemo.ports.*;
import gs.hexagonaldemo.springhexagonaldemo.repositoryadapters.UserRepositoryAdapter;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.MotivoEstadoServiceAdapter;
import gs.hexagonaldemo.springhexagonaldemo.verifiers.NameVerifierAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public MotivoEstadoES motivoEstadoService(MotivoEstadoRepository  motivoEstadoRepository) {
        return new MotivoEstadoServiceAdapter(motivoEstadoRepository);
    }

    @Bean
    public AddUserService addUserService(NameVerifierService nameVerifierService, UserRepository userRepository) {
        return new AddUserServiceAdapter(nameVerifierService, userRepository);
    }

    @Bean
    public GetUserService getUserService(UserRepository userRepository) {
        return new GetUserServiceAdapter(userRepository);
    }

    @Bean
    public NameVerifierService nameVerifierService() {
        return new NameVerifierAdapter();
    }

    @Bean
    public UserRepository userRepository() {
        return new UserRepositoryAdapter();
    }


    @Bean
    public MotivoEstadoRepository motivoEstadoRepository() {
        return new MotivoEstadoRepositoryAdapter();
    }

}
