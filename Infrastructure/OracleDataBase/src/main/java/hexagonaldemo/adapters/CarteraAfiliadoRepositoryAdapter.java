package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.RespuestaPaginacion;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.CarteraAfiliadoRepository;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.BuscarCarteraAfiliadosPorEntidadPeriodoResponse;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.out.DetalleCarteraAfiliadoPeriodo;
import hexagonaldemo.entity.CarteraAfiliadoEntity;
import hexagonaldemo.entity.DetalleCarteraAfiliadoEntity;
import hexagonaldemo.mapper.CarteraAfiliadoMapper;
import hexagonaldemo.repositories.CarteraAfiliadoRep;
import hexagonaldemo.repositories.DetalleCarteraAfiliadoRep;
import hexagonaldemo.util.DaoUtil;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.SqlParameter;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Types;
import java.util.*;

@Component
public class CarteraAfiliadoRepositoryAdapter implements CarteraAfiliadoRepository {

    @Autowired
    private CarteraAfiliadoRep carteraAfiliadoRep;

    @Autowired
    private DetalleCarteraAfiliadoRep detalleCarteraAfiliadoRep;

    @Autowired
    private DataSource dataSource;


    private SimpleJdbcCall simpleJdbcCall;



    @PostConstruct
    public void init(){
        this.simpleJdbcCall = new SimpleJdbcCall(dataSource)
                .withFunctionName("BUSCAR_CARTERA_AFI_PERIODO_FN") // Nombre de la función PL/SQL
                .withCatalogName("CARTERA_AFILIADO_ES_PKG")
                .declareParameters(
                        new SqlParameter("P_PERIODO", Types.NUMERIC),
                        new SqlParameter("P_ENTIDAD_ID", Types.NUMERIC),
                        new SqlParameter("P_ESTADO_AFILIACION", Types.VARCHAR),
                        new SqlParameter("P_INDICE", Types.NUMERIC),
                        new SqlParameter("P_CANTIDAD_MAX_REGISTROS", Types.NUMERIC)
                )
                .returningResultSet("SYS_REFCURSOR", (rs, rowNum) -> {
                    // Mapea cada fila del cursor a un objeto Java (puedes personalizarlo)
                    Map<String, Object> row = new HashMap<>();

                    row.put("REGISTROS_RESTANTES", rs.getLong("REGISTROS_RESTANTES"));
                    row.put("PAGINA_ACTUAL", rs.getLong("PAGINA_ACTUAL"));

                    row.put("DETALLE_CARTERA_AFILIADO_ID", rs.getLong("DETALLE_CARTERA_AFILIADO_ID"));
                    row.put("AFILIACION_ID", rs.getLong("AFILIACION_ID"));
                    row.put("SOLICITUD_ID", rs.getLong("SOLICITUD_ID"));

                    row.put("NOMBRE", rs.getString("NOMBRE"));
                    row.put("PRIMER_APELLIDO", rs.getString("PRIMER_APELLIDO"));
                    row.put("FECHA_NACIMIENTO", rs.getDate("FECHA_NACIMIENTO"));
                    row.put("ESTADO_AFILIACION", rs.getString("ESTADO_AFILIACION"));
                    row.put("GENERO", rs.getString("GENERO"));


                    row.put("TIPO_AFILIADO", rs.getString("TIPO_AFILIADO"));
                    row.put("TIPO_DEPENDIENTE", rs.getString("TIPO_DEPENDIENTE"));
                    row.put("PARENTESCO_ID", rs.getLong("PARENTESCO_ID"));
                    row.put("CIUDADANO_ID", rs.getLong("CIUDADANO_ID"));
                    row.put("CEDULA", rs.getString("CEDULA"));
                    row.put("NUI", rs.getString("NUI"));
                    row.put("NSS", rs.getString("NSS"));
                    row.put("NACIONALIDAD_ID", rs.getString("NACIONALIDAD_ID"));

                    row.put("NSS_TITULAR", rs.getString("NSS_TITULAR"));
                    row.put("CEDULA_TITULAR", rs.getString("CEDULA_TITULAR"));
                    row.put("NUMERO_CONTRATO", rs.getString("NUMERO_CONTRATO"));

                    row.put("FECHA_EFECTIVIDAD_AFILIACION", rs.getDate("FECHA_EFECTIVIDAD_AFILIACION"));
                    return row;
                });
    }

    public List<Map<String, Object>> buscarCarteraAfiPeriodo(int periodo, int entidadId, String estadoAfiliacion, int indice, int cantidadMaxRegistros) {
        // Configuración de parámetros de entrada
        System.out.println("Entering buscarCarteraAfiPeriodo");

        System.out.println("param  periodo: "+periodo);
        System.out.println("param  entidadId: "+entidadId);
        System.out.println("param  estadoAfiliacion: "+estadoAfiliacion);
        System.out.println("param  indice: "+indice);
        System.out.println("param  cantidadMaxRegistros: "+cantidadMaxRegistros);


        Map<String, Object> inParams = new HashMap<>();
        inParams.put("P_PERIODO", periodo);
        inParams.put("P_ENTIDAD_ID", entidadId);
        inParams.put("P_ESTADO_AFILIACION", estadoAfiliacion);
        inParams.put("P_INDICE", indice);
        inParams.put("P_CANTIDAD_MAX_REGISTROS", cantidadMaxRegistros);

        // Llamada a la función y obtención del resultado
        Map<String, Object> result = simpleJdbcCall.execute(inParams);

        // Extraer y retornar los datos del cursor
        @SuppressWarnings("unchecked")
        List<Map<String, Object>> resultSet = (List<Map<String, Object>>) result.get("SYS_REFCURSOR");
        return resultSet;
    }

    @Override
    public Optional<CarteraAfiliado> registrarCarteraAfiliado(CarteraAfiliado carteraAfiliado) {

        CarteraAfiliadoEntity entity = Objects.requireNonNull(CarteraAfiliadoMapper.toEntity(carteraAfiliado));
        List<DetalleCarteraAfiliadoEntity> entityList = entity.getDetalleCartera();
        entity.setDetalleCartera(null);

        entity = carteraAfiliadoRep.save(entity);

        CarteraAfiliadoEntity finalEntity = entity;
        entityList.forEach(ent ->{
            ent.setCarteraAfiliadoId(finalEntity);
            detalleCarteraAfiliadoRep.save(ent);
        });

        return Optional.ofNullable(CarteraAfiliadoMapper.toDto(entity));
    }

    @Override
    public Boolean existeCarteraAfiliadoPeriodoServicio(Integer periodo, Integer servicioId) {
        return null;
    }

    @Override
    public BuscarCarteraAfiliadosPorEntidadPeriodoResponse buscarCarteraAfiliadosPorEntidadPeriodo(Integer entidadId, Integer periodo, String estadoAfiliacion, Integer indice, Integer cantidadRegistrosParticion) {

        List<Map<String, Object>> resulset =   buscarCarteraAfiPeriodo(periodo,entidadId,  estadoAfiliacion,  indice,  cantidadRegistrosParticion);

        List<DetalleCarteraAfiliadoPeriodo> respuesta= new ArrayList<>();

        RespuestaPaginacion paginacion = new RespuestaPaginacion();

        resulset.forEach( res ->{

            paginacion.setIndice(Integer.parseInt(res.get("PAGINA_ACTUAL").toString()));
            paginacion.setRegistrosRestantes(Long.parseLong(res.get("REGISTROS_RESTANTES").toString()));

            DetalleCarteraAfiliadoPeriodo detalle =  new DetalleCarteraAfiliadoPeriodo();
            detalle.setDetalleCarteraAfiliadoId(Long.parseLong(res.get("DETALLE_CARTERA_AFILIADO_ID").toString()));
            detalle.setSolicitudId(Long.parseLong(res.get("SOLICITUD_ID").toString()));
            detalle.setAfiliacionId(Long.parseLong(res.get("AFILIACION_ID").toString()));
            detalle.setTipoAfiliado(res.get("TIPO_AFILIADO").toString());
            detalle.setTipoDependiente(DaoUtil.getStringColumn(res, "TIPO_DEPENDIENTE"));
            detalle.setParentescoId(Short.parseShort(res.get("PARENTESCO_ID").toString()));
            detalle.setCedula(DaoUtil.getStringColumn( res , "CEDULA"));
            detalle.setNui(DaoUtil.getStringColumn(res, "NUI"));
            detalle.setNacionalidadId(DaoUtil.getShortColumn(res, "NACIONALIDAD_ID"));
            detalle.setNssTitular(DaoUtil.getIntegerColumn(res, "NSS_TITULAR"));
            detalle.setCedulaTitular(DaoUtil.getStringColumn(res, "CEDULA_TITULAR"));
            detalle.setNumeroContrato(DaoUtil.getLongColumn(res, "NUMERO_CONTRATO"));
            //agregando nuevos campo orden 23
           // detalle.setEstudiante(detalle.getEstudiante());
         //   detalle.setDiscapacitado(detalle.getDiscapacitado());
            detalle.setGenero(DaoUtil.getStringColumn(res, "GENERO"));
            detalle.setNombre(DaoUtil.getStringColumn(res, "NOMBRE"));
            detalle.setPrimerApellido(DaoUtil.getStringColumn(res,"PRIMER_APELLIDO" ));
            detalle.setEstadoAfiliacion(DaoUtil.getStringColumn(res, "ESTADO_AFILIACION"));
            detalle.setFechaNacimiento(DaoUtil.getLocalDate(res, "FECHA_NACIMIENTO"));
            detalle.setFechaEfectividadAfiliacion(DaoUtil.getLocalDate(res, "FECHA_EFECTIVIDAD_AFILIACION"));
            respuesta.add(detalle);
        });
        return new BuscarCarteraAfiliadosPorEntidadPeriodoResponse(respuesta,paginacion);
    }
}
