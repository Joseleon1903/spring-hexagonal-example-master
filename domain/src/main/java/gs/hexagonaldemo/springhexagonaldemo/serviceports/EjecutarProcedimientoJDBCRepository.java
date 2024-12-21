package gs.hexagonaldemo.springhexagonaldemo.serviceports;

public interface EjecutarProcedimientoJDBCRepository {

    Boolean executeQuery(String  query,Long EjecucionintecambioId);
}
