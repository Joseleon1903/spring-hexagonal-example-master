package gs.hexagonaldemo.springhexagonaldemo.configuration;

import gs.hexagonaldemo.springhexagonaldemo.ports.*;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.*;
import hexagonaldemo.adapters.*;
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

    @Bean
    public HorarioServicioES horarioServicioService(HorarioServicioRepository horarioServicioESRepository) {
        return new HorarioServicioAdapter(horarioServicioESRepository);
    }

    @Bean
    public HorarioServicioRepository horarioServicioRepository() {
        return new HorarioServicioRepositoryAdapter();
    }

    @Bean
    public ParametroES ParametroService(ParametroRepository parametroRepository) {
        return new ParametroServicioAdapter(parametroRepository);
    }

    @Bean
    public ParametroRepository ParametroRepository() {
        return new ParametroRepositoryAdapter();
    }


    @Bean
    public BitacoraEventoES bitacoraEventoService(BitacoraEventoRepository bitacoraEventoRepository) {
        return new BitacoraEventoServiceAdapter(bitacoraEventoRepository);
    }

    @Bean
    public BitacoraEventoRepository bitacoraEventoRepository() {
        return new BitacoraEventoRepositoryAdapter();
    }


}
