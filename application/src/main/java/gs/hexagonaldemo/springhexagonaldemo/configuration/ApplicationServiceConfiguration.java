package gs.hexagonaldemo.springhexagonaldemo.configuration;

import com.unisigma.rabbit.adapters.RabbitJmsConsumerAdpater;
import com.unisigma.rabbit.adapters.RabbitJmsProducerAdpater;
import gs.hexagonaldemo.springhexagonaldemo.serviceadapters.*;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.*;
import hexagonaldemo.adapters.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationServiceConfiguration {

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
    public ParametroES parametroService(ParametroRepository parametroRepository) {
        return new ParametroServicioAdapter(parametroRepository);
    }

    @Bean
    public ParametroRepository parametroRepository() {
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

    @Bean
    public ServicioSistemaES servicioSistemaService(ServicioSistemaRepository servicioSistemaRepository) {
        return new ServicioSistemaServiceAdapter(servicioSistemaRepository);
    }

    @Bean
    public ServicioSistemaRepository servicioSistemaRepository() {
        return new ServicioSistemaRepositoryAdapter();
    }

    @Bean
    public EjecucionIntercambioInformacionES ejecucionIntercambioInformacionService(EjecucionIntercambioInformacionRepository ejecucionIntercambioInformacionRepository) {
        return new EjecucionIntercambioInformacionAdapter(ejecucionIntercambioInformacionRepository);
    }

    @Bean
    public EjecucionIntercambioInformacionRepository ejecucionIntercambioInformacionESRepository() {
        return new EjecucionIntercambioInformacionRepositoryAdapter();
    }

    @Bean
    public EjecutarProcedimientoJDBCRepository ejecutarProcedimientoJDBCRepositoryService() {
        return new EjecutarProcedimientoJDBCRepositoryAdapter();
    }

    @Bean
    public SolicitudServicioES solicitudServicioService(RabbitJms rabbitJms, EjecutarProcedimientoJDBCRepository ejecutarProcedimientoJDBCRepository) {
        return new SolicitudServicioServiceAdapter(rabbitJms, ejecutarProcedimientoJDBCRepository);
    }

    @Bean
    public RabbitJms rabbitJmsSrvice() {
        return new RabbitJmsProducerAdpater();
    }

    @Bean
    public RabbitJmsConsumer rabbitJmsConsumerSrvice(SolicitudServicioES solicitudServicioES, EjecucionIntercambioInformacionES ejecucionIntercambioInformacionES) {
        return new RabbitJmsConsumerAdpater(solicitudServicioES, ejecucionIntercambioInformacionES);
    }

    @Bean
    public NotificacionES notificacionServicioService() {
        return new NotificacionServiceAdapter();
    }


    @Bean
    public UsuarioES usuarioServicioService(UsuarioRepository usuarioRepository) {
        return new UsuarioServiceAdapter(usuarioRepository);
    }

    @Bean
    public UsuarioRepository usuarioRepository() {
        return new UsuarioRepositoryAdapter();
    }
}
