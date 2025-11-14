package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.TipoEntidad;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.TipoEntidadRepository;
import hexagonaldemo.entity.TipoEntidadEntity;
import hexagonaldemo.mapper.TipoEntidadMapper;
import hexagonaldemo.repositories.TipoEntidadRep;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Component
public class TipoEntidadRepositoryAdapter implements TipoEntidadRepository {

    @Autowired
    private TipoEntidadRep tipoEntidadRep;

    @Override
    public Optional<TipoEntidad> buscarTipoEntidadPorId(Short tipoEntidadId) {
        TipoEntidadEntity entity = tipoEntidadRep.findById(tipoEntidadId).get();
        return Optional.of(TipoEntidadMapper.toDto(entity));
    }

    @Override
    public Optional<List<TipoEntidad>> buscarTipoEntidadPorDatosGenerales(String descripcion, Short seguroId, String estado, Boolean poseeLDAPOrganizationUnit, Boolean aplicaAfiliacion) {

        return Optional.empty();
    }
}
