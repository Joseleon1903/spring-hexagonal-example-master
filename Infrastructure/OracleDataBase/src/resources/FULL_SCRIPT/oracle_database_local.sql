delete from PARAM_EJECUCION_INTER_INFO;
delete from ejecucion_intercambio_info;
delete from sigma_log;


delete from CARTERA_AFILIADO;

delete from DETALLE_CARTERA_AFILIADO;

select * from CARTERA_AFILIADO

select * from DETALLE_CARTERA_AFILIADO

select * from ejecucion_consulta

select * from EJECUCION_CONSULTA_MOTIVOS

select * from bitacora_evento

select * from usuario

select * from EJECUCION_INTERCAMBIO_INFO

select * from PARAM_EJECUCION_INTER_INFO

select * from ENTIDAD_AFEC_EJEC_INTER_INFO

select * from servicio_sistema where servicio_id = 434

select * from intercambio_informacion where intercambio_informacion_id =60

SISALRIL_ENV_INTER_INFO_PKG.ENV_INTERCAMBIO_PROCESADOS_SP

select * from intercambio_informacion where tipo_intercambio_informacion = 1 
and  intercambio_informacion_id =13

select * from PARAM_INTERCAMBIO_INFO where intercambio_informacion_id =60

select * from ejecucion_intercambio_info where servicio_id = 434

select * from ejecucion_intercambio_info order by fecha_inicio desc;

select * from motivo_estado where motivo_id = 10096;

select * from PARAM_EJECUCION_INTER_INFO

select * from sigma_log

BEGIN
   SISALRIL_ENV_INTER_INFO_PKG.ENV_INTERCAMBIO_PROCESADOS_SP(300012);
END;


declare
valor VARCHAR2(200);
begin 
   valor:=EJECUCION_INTER_INFO_ES_PKG.BUSCAR_VALOR_PARAMETRO_FN(300012, 'FECHA_INICIAL');
end;


      SELECT PEII.VALOR , PEII.*, PII.*
      FROM PARAM_EJECUCION_INTER_INFO PEII
      JOIN PARAM_INTERCAMBIO_INFO PII ON PEII.PARAM_INTERCAMBIO_INFO_ID = PII.PARAM_INTERCAMBIO_INFO_ID
      WHERE PEII.EJECUCION_INTERCAMBIO_INFO_ID = 400007
      AND PEII.CODIGO_PARAMETRO = 'FECHA_INICIAL';