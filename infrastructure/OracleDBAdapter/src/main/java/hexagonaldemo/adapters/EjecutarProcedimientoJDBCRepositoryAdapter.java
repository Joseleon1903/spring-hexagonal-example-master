package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.serviceports.EjecutarProcedimientoJDBCRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.Map;

@Component
public class EjecutarProcedimientoJDBCRepositoryAdapter implements EjecutarProcedimientoJDBCRepository {


    private SimpleJdbcCall simpleJdbcCall;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private DataSource dataSource;


    @Override
    public Boolean executeQuery(String query, Long ejecucionintecambioId) {
        System.out.println("Entering in executeQuery: "+ query);
        String[] procedimiento = query.split("\\.");

        simpleJdbcCall =new SimpleJdbcCall(dataSource)
                .withCatalogName(procedimiento[0])
                .withProcedureName(procedimiento[1])
                .declareParameters(
                        new SqlParameter("P_PARAMETRO_EJECUCION_ID", Types.NUMERIC)
                );
        Map<String, Object> parameters = Map.of("P_PARAMETRO_EJECUCION_ID", ejecucionintecambioId);

        simpleJdbcCall.execute(parameters);
        System.out.println("ejecucion Intercambio ejecutado con exito: ");
        return true;
    }
}
