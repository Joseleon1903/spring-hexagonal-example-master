package gs.hexagonaldemo.springhexagonaldemo.utils;


public interface ParametrosUSConstantes {
    public static class Consultas {
        public static final String QUERY_GENERA_ARCHIVO_RESPUESTA_PAGOS = "call FUNCTION nombreFuncion(?)";

        private Consultas() {
        }
    }

    public static class Json {
        public static final String JSON_KEY_NOTIFICACION_ASUNTO = "asunto";
        public static final String JSON_KEY_NOTIFICACION_CONTENIDO = "contenido";

        private Json() {
        }
    }

    public static class RutaServicioIntercambioGenerico {
        public static final String PUBLICAR_INFORMACION = "unipago/ejb/commons/PublicarInformacionTS";
        public static final String RECIBIR_INFORMACION = "";

        private RutaServicioIntercambioGenerico() {
        }
    }

    public enum CriterioConsulta {
        NSS(1), CEDULA(2), NUI(2), NUMERO_CONTRATO(3), NUMERO_SOLICITUD(4);
        private short codigo;

        private CriterioConsulta(int codigo) {
            this.codigo = (short) codigo;
        }

        public short getCodigo() {
            return codigo;
        }
    }

    public static class LDAPParameters {
        public static final String USER_FILTER_PATTERN = "%user%";
        public static final String USER_FILTER_DN = "distinguishedName";
        public static final String USER_FILTER_ACCOUNT_EXPIRED = "accountExpires";
        public static final String LDAP_DN_BASE = "LDAP_DN_BASE";
        public static final String LDAP_SEARCH_SCOPE = "LDAP_SEARCH_SCOPE";
        public static final String LDAP_USER_ACCONUNT_CONTROL = "userAccountControl";
        public static final String LDAP_USER_PRINCIPAL_NAME = "userPrincipalName";
        public static final String LDAP_SAMA_ACCOUNT_NAME = "sAMAccountName";
        public static final String LDAP_GIVEN_NAME = "givenName";
        public static final String LDAP_DISPLAY_NAME = "displayName";
        public static final String LDAP_SN = "sn";
        public static final String LDAP_UNICODE_P = "unicodePwd";
        public static final String LDAP_USER_P = "userpassword";

        private LDAPParameters() {
        }
    }

    public static class PublicarArchivosRespuestas {
        public static final String NOMBRE_TAG_CLAVE_ENTIDAD_EMISORA = "claveEntidadEmisora";
        public static final String NOMBRE_TAG_TIPO_ENTIDAD_EMISORA = "tipoEntidadEmisora";
        public static final String NOMBRE_TAG_ESPACIOS_BLANCOS = "espaciosBlanco";

        private PublicarArchivosRespuestas() {
        }
    }

    public static class ProcesarArchivos {
        public static final String BANDEJA_ENTRADA = "bandeja_entrada";

        private ProcesarArchivos() {
        }
    }

    enum TipoIndividualizacionDesc {
        AU("AUTOMATICA"), RE("REGULAR"), VN("VALIDACION CONTRA NOMINA");

        private String descripcion;

        private TipoIndividualizacionDesc(String descripcion) {
            this.descripcion = descripcion;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    /**
     * Constantes del escenario 7134:Asignar Entidad Administradora Aportes Adelantados al Seguro Familiar de Salud para deteminar el tipo de aporte
     *
     * @author cjvasquez
     * @since Hallazgos
     */
    public final class TipoAportesEntidad {
        public static final String TITULAR = "T";
        public static final String ADICIONAL = "A";

        private TipoAportesEntidad() {
        }
    }

    public final class RepositorioCategoriaArchivo {
        public static final short INSTRUCCION_MOVIMIENTO_FONDO = 1;
        public static final short EJECUCION_RECAUDACION = 2;

        private RepositorioCategoriaArchivo() {
        }
    }

    public static class Periodos {
        public static final int APORTE_TITULAR_PERIODO = -6;
        public static final int PERIODO_ADELANTADO = 1;
        public static final int PERIODO_ANTERIOR = -1;

        private Periodos() {
        }
    }

    /**
     * Mensajes para validacion
     *
     * @author jreyes
     * @since Orden Atencion 6
     */
    public static class MensajeValidacion {

        /**
         * MENSAJE PARA VALIDACION DE REGLAS DE INTEGRIDAD
         */
        public static final String MENSAJE_VALIDACION_REGLAS_DE_INTEGRIDAD = "Validando reglas de integridad";

        /**
         * MENSAJE PARA VALIDACION DE REGLAS DE RANGOS DE FECHA
         */
        public static final String MENSAJE_VALIDACION_RANGOS_FECHA = "Validando rango de fechas";

        /**
         * MENSAJE PARA VALIDACION DE REGLAS DE VALORES PERMITIDOS
         */
        public static final String MENSAJE_VALIDACION_VALORES_PERMITIDOS = "Validando valores permitidos";

        /**
         * MENSAJE VALIDACION OK
         */
        public static final String MENSAJE_VALIDACION_OK = "Validacion de regla cumplida";

        /**
         * MENSAJE VALIDACION FALLIDA
         */
        public static final String MENSAJE_VALIDACION_FALLIDA = "Validacion de regla no fue exitosa";

        private MensajeValidacion() {
        }

        ;
    }

    public static class TipoAfiliacion {
        public static final short TIPO_AFILIACION_NORMAL = 1;
        public static final short TIPO_AFILIACION_AUTOMATICA = 2;
        public static final short TRASPASO = 3;
        public static final short NOVEDAD = 4;

        private TipoAfiliacion() {
        }
    }

    public static class Generos {
        public static final String MASCULINO = "M";
        public static final String FEMENINO = "F";

        private Generos() {
        }
    }

    public static class TipoAfiliado {
        public static final String TIPO_AFILIADO_TITULAR = "T";
        public static final String TIPO_AFILIADO_DEPENDIENTE = "D";

        private TipoAfiliado() {
        }
    }

    public static class TipoDependiente {
        public static final String TIPO_DEPENDIENTE_DIRECTO = "D";
        public static final String TIPO_DEPENDIENTE_ADICIONAL = "A";

        private TipoDependiente() {
        }

        public static final Object[] values() {
            return new Object[]{TIPO_DEPENDIENTE_DIRECTO, TIPO_DEPENDIENTE_ADICIONAL};
        }
    }

    public static class TipoEmpleador {

        public static final short EMPRESA_PRIVADA = 1;
        public static final short EMPRESA_PUBLICA = 2;

        private TipoEmpleador() {
        }
    }


    /**
     * Identificacion Ciudadano
     *
     * @author
     */
    public static class TipoIdentificacion {

        public static final short GENERICO = 0;
        public static final short CEDULA_IDENTIDAD_ELECTORAL = 1;
        public static final short RNC = 2;
        public static final short NSS = 3;
        public static final short NUI = 4;
        public static final short ACTA_NACIMIENTO = 5;
        public static final short ACTA_NACIMIENTO_EXTRANJERO = 6;
        public static final short NUMERO_DE_IDENTIFICACION_DEL_REGISTRO = 7; // Usado para los ID (ciudadanoId, empleadorId, etc)
        public static final short TITULAR_POR_EXCEPCION = 8;
        public static final short VISA = 9;
        public static final short CARNET_DE_MIGRACION = 10;
        public static final short DOCUMENTO_EXPEDIDO_POR_EL_MIP = 11;
        public static final short REGISTRO_PATRONAL = 12;

        public static final int CEDULA_IDENTIDAD_ELECTORAL_LENGTH = 11;
        public static final int RNC_LENGTH = 9;
        public static final int NSS_LENGTH = 9;

        private TipoIdentificacion() {
        }
    }

    public static class TipoDocumento {
        public static final short ACTA_DE_NACIMIENTO = 1;
        public static final short SOPORTE_LEGAL_DIFERENCIA_APELLIDOS = 2;
        public static final short CEDULA_TITULAR = 3;
        public static final short CEDULA_CONYUGE = 4;
        public static final short ACTA_NACIMIENTO_EXTRANJERA = 5;
        public static final short SOLICITUD_DESAFILIACION_Y_TRASPASO = 6;
        public static final short ARCHIVO_NACHA_DE_MOVIMIENTO_DE_FONDOS = 7;
        public static final short ACTA_DE_DEFUNCION = 8;
        public static final short DOCUMENTO_SOPORTE_AFILIACION_EXTRANJERA = 9;
        public static final short ARCHIVO_LBTR_DE_MOVIMIENTO_DE_FONDOS = 10;
        public static final short ARCHIVO_CONCENTRACION_REFERENCIAS_VALIDAS = 11;
        public static final short ARCHIVO_CONCENTRACION_AJUSTES_CREDITO = 12;
        public static final short ARCHIVO_DE_REPORTE = 13;
        public static final short ARCHIVO_DE_SERVICIO_DE_CONTINGENCIA = 14;
        public static final short MARCA_DE_AGUA_SOLICITUD_TRASPASO_SFS = 15;
        public static final short ARCHIVO_INDIVIDUALIZACION_APORTES = 16;
        public static final short IMPRESION_FORMULARIO_SOLICITUD_DE_TRASPASO = 17;
        public static final short ARCHIVO_DE_CARGA_CIUDADANOS_FALLECIDOS_JCE = 19;

        private TipoDocumento() {
        }
    }


    public static class TipoIntercambioInformacion {
        public static final short ENVIAR_INFORMACION = 1;
        public static final short RECIBIR_INFORMACION = 2;

        private TipoIntercambioInformacion() {
        }
    }

    public static class TipoDato {
        public static final String FECHA = "D";
        public static final String NUMERO = "N";
        public static final String CARACTER = "C";
        public static final String PERIODO = "P";

        private TipoDato() {
        }
    }

    public static class TipoCausaMotivoCancelacion {
        public static final String CANCELACION = "C";
        public static final String INHABILITADO = "I";

        private TipoCausaMotivoCancelacion() {
        }
    }

    public static class CausaMotivoCancelacionCiudadano {
        public static final Short CODIGO_FALLECIMIENTO = 2;

        private CausaMotivoCancelacionCiudadano() {
        }
    }

    public static class TipoFormularioTraspaso {
        public static final String NUCT = "NUCT";
        public static final String NUCUF = "NUCUF";
        public static final String NRT = "NRT";
        public static final String NUCE = "NUCE";

        private TipoFormularioTraspaso() {
        }
    }

    public static class TipoFormularioAfiliacion {
        public static final short FISICO = 1;
        public static final short DIGITAL = 2;

        private TipoFormularioAfiliacion() {
        }
    }

    public static class TipoInclusion {
        public static final short SOLICITUD_TRASPASO = 1;
        public static final short NUEVO_TRASPASO = 2;
        public static final short SOLICITUD_NOVEDAD = 1;
        public static final short NUEVO_AFILIADO = 2;

        private TipoInclusion() {
        }
    }

    public enum Parentescos {
        PADRE(1), MADRE(2), ESPOSO(3), ESPOSA(3), HIJO(4), HIJA(4), HERMANO(5), HERMANA(
                5), ABUELO(6), ABUELA(6), SOBRINO(7), SOBRINA(7), TIO(8), TIA(8), NIETO(
                9), NIETA(9), HIJASTRO(10), HIJASTRA(10), COMPANERO_DE_VIDA(11), COMPANERA_DE_VIDA(
                11), PADRE_DEL_CONYUGE(12), MADRE_DEL_CONYUGE(13), TUTELA(14);

        private short parentescoId;

        private Parentescos(int parentescoId) {
            this.parentescoId = (short) parentescoId;
        }

        public short getParentescoId() {
            return parentescoId;
        }
    }

    public static class ResultadosGeneracionArchivos {
        public static final String entidadId = "ENTIDAD_ID";
        public static final String rompimiento = "DATO_SEGREGACION";
        public static final String referenciaId = "REFERENCIA_ID";

        private ResultadosGeneracionArchivos() {
        }
    }

    /**
     * ID's de los codigos de motivos del repositorio MOTIVO_ESTADO asociado a las solicitudes
     *
     * @author
     */
    public static class Motivos {
        public static final int PERSITE_LA_DIFERENCIA_EN_ENTIDADES_ENTRE_EL_MONTO_DE_LA_INSTRUCCION_RESPECTO_AL_MONTO_DE_LA_COMPENSACION = 10599;

        public static final int TRASPASO_RECHAZADO_POR_INSTRUCCION_DE_LA_SUPERVISORA = 1054;
        public static final int AFILIACION_RECHAZADO_SUBSIDIADO_PARA_SER_AFILIADO_REGIMEN_CONTRIBUTIVO = 839;
        public static final int MOTIVO_NUMERO_LOTE_NO_EXISTE = 140;
        public static final int AFILIADO_RECHAZADO_POR_BAJA_TITULAR = 126;
        /**
         * MOTIVO_PROVINCIA_NO_CATALOGADA (Codigo: 168)
         */
        public static final int MOTIVO_PROVINCIA_NO_CATALOGADA = 168;
        /**
         * EL MUNICIPIO NO ESTA CATALOGADO O ESTA INACTIVO (Codigo: 169)
         */
        public static final int EL_MUNICIPIO_NO_ESTA_CATALOGADO_O_ESTA_INACTIVO = 169;
        public static final int MOTIVO_PROVINCIA_NO_CORRESPONDE_MUNICIPIO = 440;
        public static final int MOTIVO_PROVINCIA_NO_VALOR = 484;
        public static final int MOTIVIO_PENDIENTE_VALIDAR_NOMINA = 64;
        public static final int MOTIVO_NUMERO_CONTRATO_PENDIENTE_EN_SOLICITUD = 60;
        public static final int MOTIVO_NUMERO_DE_CONTRATO_FUERA_DE_FOLIO_ASIGNADO = 56;
        public static final int MOTIVO_AGENTE_NO_EXISTE = 24;
        public static final int MOTIVO_AGENTE_INACTIVO = 426;

        /**
         * CIUDADANO SE ENCUENTRA REGISTRADO EN OTRA ENTIDAD (Codigo: 69)
         */
        public static final int CIUDADANO_SE_ENCUENTRA_REGISTRADO_EN_OTRA_ENTIDAD = 69;

        /**
         * CIUDADANO SE ENCUENTRA REGISTRADO EN LA MISMA ENTIDAD (Codigo: 70)
         */
        public static final int CIUDADANO_SE_ENCUENTRA_REGISTRADO_EN_LA_MISMA_ENTIDAD = 70;

        /**
         * EL CIUDADANO NO EXISTE EN EL MAESTRO DE CIUDADANOS (Codigo: 75)
         */
        public static final int MOTIVO_NUMERO_CEDULA_NO_EXISTE_EN_EL_PADRON = 75;

        /**
         * NUMERO DE NOTIFICACION DE INDIVIDUALIZACION PROPORCIONADO NO EXISTE (Codigo: 10038)
         */
        public static final int MOTIVO_NUMERO_INDIVIDUALIZACION_NO_EXISTE = 10038;

        /**
         * NUMERO DE CAPITA NO SE CORRESPONDE CON EL NUMERO DE NOTIFICACION DE INDIVIDUALIZACION (Codigo: 10066)
         */
        public static final int NUMERO_CAPITA_NO_CORRESPONDE_NUMERO_NOTIFICACION_INDIVIDUALIZACION = 10066;

        /**
         * SOLICITUD DE GESTION DE CAPITAS RECHAZADA POR EL RECHAZO DE TODAS LAS CAPITAS ESPECIFICAS PROPORCIONADAS (Codigo: 10324)
         */
        public static final int SOLICITUD_DE_GESTION_DE_CAPITAS_RECHAZADA_POR_EL_RECHAZO_DE_TODAS_LAS_CAPITAS_ESPECIFICAS_PROPORCIONADAS = 10324;

        public static final int CLAVE_DE_PROCESO_INVALIDA = 34;
        public static final int CLAVE_DE_SUBPROCESO_INVALIDA = 35;
        public static final int PENDIENTE_AFILIACION_DEFINITIVA_TITULAR = 185;
        public static final int MOTIVO_CONTRATO_INVALIDO_SIPEN = 438;
        public static final int MOTIVO_DIFERENCIA_MONTOS_FACTURA_PAGO = 117;
        public static final int TIPO_AGENTE_INVALIDO = 10004;
        public static final int TIPO_IDENTIFICACION_INVALIDO = 10005;
        public static final int ACCION_EJECUTAR_INVALIDA = 10006;
        public static final int TIPO_ENTIDAD_NO_CATALOGADA_ACTIVA = 42;
        public static final int NO_EXISTEN_DATOS_CON_LOS_CRITERIOS_PROPORCIONADOS = 10043;
        public static final int ENTIDAD_NO_CATALOGADA_ACTIVA = 43;
        public static final int FECHA_DE_EFECTIVIDAD_ES_MENOR_A_LA_FECHA_EN_QUE_SE_REMITIO_LA_SOLICITUD_DE_MANTENIMIENTO_DE_AGENTE = 10007;
        public static final int LA_FECHA_DE_APLICACION_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_DE_GENERACION = 10336;
        public static final int NO_EXISTE_UNA_CONFIGURACION_DEFINIDA_PARA_LA_ENTRADA_CONTABLE_A_REALIZAR = 10337;
        public static final int CEDULA_NO_EXISTE_O_CATALOGADA = 260;
        public static final int RNC_NO_EXISTE_O_CATALOGADA = 803;
        public static final int PROMOTOR_YA_ACTIVO = 462;
        public static final int PROMOTOR_YA_ACTIVO_OTRA_ENTIDAD = 464;
        public static final int AGENTE_PROMOTOR_NO_EXISTE = 24;
        public static final int PROMOTOR_YA_INACTIVO = 463;
        public static final int USUARIO_NO_AUTORIZADO_PARA_SOLICITAR_MANTENIMIENTO_AGENTE = 10008;
        public static final int CIUDADANO_ACTIVO_NOMINA_EXCEPCION = 191;
        public static final int CIUDADANO_NO_PERTENCE_NOMINA_EXCEPCION = 192;
        public static final int CIUDADANO_SE_ENCUENTRA_EN_NOMINA = 161;
        public static final int TIPO_PERSONA_INVALIDO = 10009;
        public static final int TIPO_IDENTIFICACION_AGENTE_NO_CORRESPONDE_PARA_EL_TIPO_PERSONA = 10010;
        public static final int NUMERO_IDENTIFICADOR_NO_CORRESPONDE_ENTIDAD = 10003;
        public static final int LA_FECHA_DE_ALTA_DEBE_SER_POSTERIOR_A_LA_ULTIMA_FECHA_DE_BAJA = 52;
        public static final int LA_FECHA_DE_BAJA_DEBE_SER_POSTERIOR_A_LA_ULTIMA_FECHA_DE_ALTA = 10011;
        /**
         * EL PRIMER APELLIDO DEL CIUDADANO ES DIFERENTE AL DEL MAESTRO DE CIUDADANOS (Codigo: 5).
         */
        public static final int MOTIVO_APELLIDO_CIUDADANO_ES_DIFERENTE = 5;
        /**
         * EL NOMBRE DEL CIUDADANO ES DIFERENTE AL DEL MAESTRO DE CIUDADANOS (Codigo: 265).
         */
        public static final int MOTIVO_NOMBRE_CIUDADANO_ES_DIFERENTE = 265;
        public static final int LA_FECHA_DE_PAGO_ES_MAYOR_A_LA_FECHA_ACTUAL = 142;
        public static final int MEDIO_DE_PAGO_NO_CATALOGADO_O_INACTIVO = 119;
        public static final int NUMERO_DE_AUTORIZACION_NO_COINCIDE_CON_LA_REFERENCIA = 118;
        public static final int LA_REFERENCIA_PROPORCIONADA_NO_SE_ENCUENTRA_PENDIENTE_DE_PAGO = 1396;
        public static final int LA_REFERENCIA_NO_ES_VALIDA = 133;
        public static final int PENDIENTE_DE_VALIDAR_CONTRA_FACTURA_AUTORIZADA = 10016;
        public static final int BLOQUEADO_POR_FALLECIMIENTO = 10017;
        public static final int BLOQUEADO_POR_TRASPASO = 10018;
        public static final int LA_REFERENCIA_PROPORCIONADA_PENDIENTE_VALIDAR_CONTRA_FACTURA_AUTORIZADA = 10600;

        /**
         * NUMERO DE LOTE NO CORRESPONDE AL SERVICIO (Codigo: 10019)
         */
        public static final int LOTE_NO_PERTENECE_SERVICIO = 10019;
        /**
         * NUMERO DE NOTIFICACION DE INDIVIDUALIZACION NO CORRESPONDE A LA ENTIDAD (Codigo: 10020)
         */
        public static final int INDIVIDUALIZACION_NO_PERTENECE_ENTIDAD = 10020;


        public static final int LOTE_NO_PERTENECE_ENTIDAD = 10042;
        public static final int NUMERO_LOTE_NO_EXISTE = 140;
        public static final int APORTE_NO_CORRESPONDE_CON_INDIVIDUALIZACION = 10021;
        public static final int INDIVIDUALIZACION_TIENE_APORTE_NO_INDIVIDUALIZADO = 10022;
        public static final int INDIVIDUALIZACION_REQUIERE_CONFIRMACION = 10034;
        public static final int APORTE_NO_INDIVIDUALIZADO = 10023;
        public static final int APORTE_NO_RECHAZADO = 10025;
        public static final int LA_FECHA_DE_APLICACION_DEBE_SER_POSTERIOR_O_IGUAL_A_LA_FECHA_DE_GENERACION = 10026;
        public static final int ENTIDAD_RECAUDADORA_NO_SE_CORRESPONDE_CON_LA_ENTIDAD_A_LA_QUE_SE_AUTORIZO_EL_PAGO = 605;
        public static final int SERVICIO_SOLICITADO_CON_PARAMETROS_INCORRECTOS = 10028;
        public static final int YA_EXISTE_UN_CONTACTO_ACTIVO_CON_LA_MISMA_CEDULA = 10029;
        public static final int DIRECCION_DE_CORREO_ELECTRONICO_INVALIDA = 10030;
        public static final int SOLICITUD_CREACION_CONTACTO_SE_ENCUENTRA_VENCIDA = 10031;
        public static final int YA_EXISTE_UN_CONTACTO_ACTIVO_CON_LA_MISMA_CEDULA_PARA_OTRA_ENTIDAD = 10032;
        public static final int YA_EXISTE_UN_CONTACTO_INACTIVO_CON_LA_MISMA_CEDULA = 10033;
        public static final int NUMERO_INDIVIDUALIZACION_CONTIENE_APORTES_NO_RECHAZADOS = 10064;
        public static final int EL_TIPO_DE_DEPENDIENTE_DEBE_SER_DIRECTO = 10330;
        public static final int NUMERO_APORTE_NO_RECHAZADO = 10063;
        public static final int AFILIADO_TITULAR_POSEE_DEPENDIENTES = 1660;
        public static final int AFILIADO_ESTA_COTIZANDO = 1479;
        public static final int AFILIADO_O_NUCLEO_POSEE_APORTE = 1680;
        public static final int TITULAR_NO_AFILIADO = 1754;
        public static final int PARENTESCO_NO_CATALOGADO = 113;
        public static final int PARENTESCO_NO_PERMITIDO_REGIMEN = 1644;
        public static final int PARENTESCO_PROPORCIONADO_NO_PERMITIDO_PARA_TIPO_DE_PERSONA_DEL_TITULAR = 1852;
        public static final int NSS_INVALIDO = 240;
        public static final int EDAD_DEPENDIENTE_INVALIDA = 80;
        public static final int DIFERENCIA_EDAD_INVALIDA = 467;
        public static final int NO_EXISTE_CONYUGE_NUCLEO = 748;
        public static final int APELLIDO_NO_CORRESPONDE = 1669;
        public static final int DEPENDIENTE_TITULAR_REGISTRADO_MISMA_ENTIDAD = 153;
        public static final int DEPENDIENTE_REGISTRADO_MISMA_ENTIDAD = 154;
        public static final int DEPENDIENTE_REGISTRADO_OTRA_ENTIDAD = 178;
        public static final int DEPENDIENTE_TITULAR_REGISTRADO_OTRA_ENTIDAD = 179;
        public static final int PARENTESCO_NO_PERMITE_DUPLICIDAD = 495;
        public static final int SEXO_CONYUGE_DEBE_SER_INVERSO = 542;
        public static final int DEPENDIENTE_ADICIONAL_TIENE_APORTES = 10037;
        public static final int SIN_APORTES_PERIODO_CORRIENTE = 1676;
        public static final int RECHAZADO_ENCONTRARSE_COMO_EMPLEADOR = 1730;
        public static final int RECHAZADO_PERTENECE_NOMINA_BENEFICIARIO = 1803;
        public static final int AFILIADO_RECHAZADO_POR_REGISTRO_EN_NOMINA_ADICIONAL = 871;
        public static final int EXISTE_DIFERENCIA_NO_VALIDA_ENTRE_EDAD_CONYUGE_EDAD_DEPENDIENTE_CONYUGE = 749;
        public static final int SOLICITUD_DEBE_SER_REALIZADA_POR_UNIFICACION_NUCLEO_FAMILIAR = 1660;
        public static final int AFILIADO_DEFINITIVO_REGIMEN_SUBSIDIADO_TITULAR_NO_TIENE_APORTES_PERIODO_CORRIENTE = 1676;
        public static final int EL_NUMERO_IDENTIFICADOR_PROPORCIONADO_NO_EXISTE = 1635;
        public static final int NUMERO_IDENTIFICADOR_NO_CORRESPONDE_A_ENTIDAD = 10035;
        public static final int EL_SERVICIO_PROPORCIONADO_NO_ESTA_CATALOGADO = 10040;
        public static final int LA_FECHA_INICIAL_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_FINAL = 1693;
        public static final int EL_RANGO_DE_FECHAS_PROPORCIONADO_EN_LA_CONSULTA_EXCEDE_EL_TIEMPO_MAXIMO_PERMITIDO = 1704;
        public static final int SERVICIO_NO_CATALOGADO = 10040;
        public static final int RANGO_FECHA_EXCEDE_TIEMPO_MAX = 1704;
        public static final int ERROR_INTERNO_DEL_SERVICIO = 1607;
        public static final int LOTE_NO_PROCESADO = 10041;
        public static final int DEP_REGISTRADO_SUBSI_NUC_CONTRIB = 1679;
        public static final int ENTIDAD_REMITE_PAGO_NO_ACREDITADA_COMO_ENTIDAD_RECAUDADORA = 122;
        public static final int PENDIENTE_DE_REVISION_DE_DOCUMENTO = 10050;
        public static final int PENDIENTE_VALIDAR_CORRESPONDENCIA_CON_EL_TITULAR_CONYUGE_DEL_TITULAR = 10059;
        public static final int BLOQUEADO_ADICIONAL_POR_FALLECIMIENTO_TITULAR = 10061;
        public static final int MOTIVO_EXISTE_SOLICITUD_PARA_ACTA_NACIMIENTO = 1663;
        public static final int PENDIENTE_DE_ASIGNACION_DE_NSS = 182;
        public static final int ACTA_DE_NACIMIENTO_EXISTE_DUPLICADA = 583;
        public static final int PENDIENTE_CARGA_DOCUMENTO = 10036;
        public static final int MUNICIPIO_REPORTADO_EN_ACTA_NO_EXISTE = 112;
        public static final int NUMERO_OFICIALIA_NO_CATALOGADO = 171;
        public static final int NO_EXISTE_CORRESPONDENCIA_MUNICIPIO_OFICIALIA = 419;
        public static final int CIUDADANO_ES_PARTICIPANTE_DE_UNA_FUSION_ENTRE_ENTIDADES_PUBLICAS_Y_NO_HA_CUMPLIDO_EL_PLAZO = 10572;

        /**
         * FECHA DE NACIMIENTO NO DEBE SER MAYOR A LA FECHA ACTUAL ( Codigo: 157).
         */
        public static final int FECHA_DE_NACIMIENTO_NO_DEBE_SER_MAYOR_A_LA_FECHA_ACTUAL = 157;
        public static final int DEPENDIENTE_DEBE_SER_MENOR = 1753;
        public static final int ID_SERVICIO_PROPORCIONADO_NO_CORRESPONDE_SERVICIO_SISTEMA = 10062;
        /**
         * EL AFILIADO SOLICITADO NO POSEE UN TIPO DE AFILIADO O UN PARENTESCO PERMITIDO PARA LA ACCION SOLICITADA (Codigo: 1373)
         */
        public static final int EL_AFILIADO_SOLICITADO_NO_POSEE_UN_TIPO_DE_AFILIADO_O_UN_PARENTESCO_PERMITIDO_PARA_LA_ACCION_SOLICITADA = 1373;
        public static final int ERROR_EN_INTEGRIDAD_DE_LOS_DATOS = 10000;
        public static final int EXISTEN_DATOS_REQUERIDOS_NO_PROPORCIONADOS = 10001;
        public static final int TITULAR_SOLICITA_MENOR_EXTRANJERO_NO_POSEE_APORTE = 1755;
        public static final int NACIONALIDAD_DEBE_CORRESPONDER_A_PAIS_EXTRANJERO = 10039;
        public static final int NACIONALIDAD_NO_CATALOGADA_O_INACTIVA = 1761;
        public static final int CAMBIO_APELLIDO_DEBE_SER_NULO_SI_PARENTESCO_ESTA_RELACIONADO_CON_TUTELA = 10071;
        public static final int ENTIDAD_NO_CORRESPONDE_SEGURO_SERVICIO = 10072;
        public static final int DATO_NO_CUMPLE_TIPO_DATO_REQURIDO = 10002;
        /**
         * LA FECHA DE NACIMIENTO NO COINCIDE CON LA DEL MAESTRO DE CIUDADANOS (Codigo: 77)
         */
        public static final int FECHA_NACIMIENTO_NO_COINCIDE_CON_LA_DEL_MAESTRO = 77;
        public static final int CAMPO_CODIGO_ACCION_SISALRIL_REQUERIDO = 1474;
        public static final int CAMPO_CODIGO_ACCION_SISALRIL_NO_CATALOGADO = 1477;
        public static final int DATOS_SIN_VALOR = 10083;
        public static final int NUMERO_AUTORIZACION_DUPLICADO = 10084;
        public static final int ACCION_SISALRIL_DUPLICADA = 10085;
        public static final int MOTIVO_NO_SUMINISTRADO = 10086;
        public static final int MOTIVO_NO_CATALOGADO = 1423;
        public static final int PERIODO_PROPORCIONADO_INVALIDO = 10049;
        public static final int EL_ANIO_CONTENIDO_EN_EL_PERIODO_PROPORCIONADO_DEBE_SER_MAYOR_AL_2002 = 10024;
        public static final int PERIODO_PROPORCIONADO_NO_PUEDE_SER_MAYOR_AL_CORRIENTE = 10053;
        public static final int EL_DATO_NSS_SER_PROPORCIONADO = 1412;
        public static final int EL_NSS_PROPORCIONADO_YA_ESTA_AFILIADO_DEFINITIVO_O_PROVISIONAL = 10051;
        public static final int EL_DATO_MOTIVO_ESTADO_DEBE_SER_PROPORCIONADO = 603;
        public static final int EL_MOTIVO_ESTADO_NO_ESTA_CATALOGADO = 1423;
        public static final int ENTIDAD_MOTIVO_NO_CATALOGADOS = 10091;
        public static final int VALORES_NO_PROPORCIONADOS = 10092;
        public static final int SOLICITUD_SERVICIOS_NO_PENDIENTE_RESPUESTA = 10093;
        public static final int INTERCAMBIO_INFORMACION_NO_CATALOGADO = 10096;
        public static final int PARAMETRO_PROPORCIONADO_NO_CORRESPONDE_AL_INTERCAMBIO_INFORMACION = 10097;
        public static final int PARAMETRO_REQUERIDO_NO_PROPORCIONADO = 10098;
        public static final int PARAMETRO_NO_SE_CORRESPONDE_CON_EL_TIPO_DE_DATO = 10099;
        public static final int INTERCAMBIO_NO_CORRESPONDE_AL_TIPO_DE_INTERCAMBIO_SOLICITADO = 10100;
        public static final int TIPO_DE_AJUSTE_NO_ESTA_CATALOGADO = 10048;
        public static final int DATOS_NO_POSEEN_UN_VALOR_PERMITIDO = 10014;
        public static final int RECHAZO_POR_REFERENCIA_INVALIDA = 155;
        public static final int EL_INDICADOR_DEL_TIPO_DE_AFILIADO_DEBE_SER_TITULAR_O_DEPENDIENTE = 167;
        public static final int EL_INDICADOR_DEL_TIPO_DE_DEPENDIENTE_DEBE_SER_DIRECTO_O_ADICIONAL = 10107;
        public static final int SEGURO_PROPORCIONADO_NO_CATALOGADO_O_ACTIVO = 10094;
        public static final int TIPO_INDIVIDUALIZACION_PROPORCIONADO_NO_CATALOGADO_O_ACTIVO = 10095;
        public static final int SEXO_DEL_DEPENDIENTE_NO_GUARDA_CORRESPONDENCIA_CON_PARENTESCO = 543;
        public static final int EXISTE_DOS_O_MAS_CICLO_DE_TRASPASO_ACTIVOS = 10118;
        public static final int DATO_DE_IDENTIFICACION_NO_PROPORCIONADO_PARA_EL_TIPO_DE_IDENTIFICACION = 10109;
        public static final int ARCHIVO_NO_EXISTE_EN_RUTA_ESPECIFICADA = 10117;
        public static final int NO_EXISTE_UN_TRASPASO_PARA_EL_NUMERO_DE_FORMULARIO_DE_TRASPASO_ESPECIFICADO = 10157;
        public static final int EL_TRASPASO_NO_CORRESPONDE_AL_CIUDADANO_PROPORCIONADO = 315;
        public static final int EL_TRASPASO_NO_REQUIERE_MOVIMIENTO_DE_FONDOS = 10158;
        public static final int RUBRO_PROPORCIONADO_NO_SE_ENCUENTRA_CATALOGADO = 10159;
        public static final int RUBRO_PROPORCIONADO_NO_ES_PERMITIDO_PARA_TRASPASO_DE_VALORES = 10160;
        public static final int YA_FUERON_RECIBIDOS_LOS_VALORES_A_TRASPASAR_DE_ESTE_FORMULARIO_DE_TRASPASO = 341;
        public static final int NUMERO_FORMULARIO_PERTENECE_ENTIDAD = 10151;
        public static final int TIPO_TRASPASO_NO_CATALOGADO_ACTIVO = 318;
        public static final int NUMERO_DE_FORMULARIO_DE_TRASPASO_NO_PERTENECE_A_LA_ENTIDAD_QUE_REMITE_LA_SOLICITUD = 244;
        public static final int TIPO_TRASPASO_NO_PERMITIDO_PARA_ENTIDAD = 348;
        public static final int FECHA_FORMULARIO_TRASPASO_MAYOR_FECHA_ACTUAL = 254;
        public static final int FECHA_FORMULARIO_AFILIACION_MAYOR_FECHA_ACTUAL = 253;
        public static final int FECHA_SOLICITUD_TRASPASO_MAYOR_FECHA_AFILIACION_TRASPASO = 255;
        public static final int LOS_DATOS_DE_IDENTIFICACION_DEL_CIUDADANO_NO_SE_CORRESPONDEN_PARA_EL_MISMO_CIUDADANO = 239;
        public static final int EL_CIUDADANO_ESPECIFICADO_NO_SE_ENCUENTRA_AFILIADO_EN_LA_ENTIDAD = 236;
        public static final int EL_CIUDADANO_ESPECIFICADO_SE_ENCUENTRA_AFILIADO_EN_LA_ENTIDAD = 317;
        public static final int EXISTE_UNA_SOLICITUD_DE_TRASPASO_EN_CURSO_PARA_EL_CIUDADANO_SOLICITADO = 245;
        public static final int EL_NUMERO_DE_FORMULARIO_DE_TRASPASO_EXISTE_EN_OTRA_SOLICITUD_DE_TRASPASO = 243;
        public static final int SOLICITUD_TRASPASO_FUERA_DEL_PLAZO_ESTABLECIDO = 257;
        public static final int NUMERO_DE_LOTE_PROPORCIONADO_NO_EXISTE = 140;
        public static final int NUMERO_DE_LOTE_NO_CORRESPONDE_A_LA_ENTIDAD = 10042;
        public static final int NUMERO_DE_LOTE_NO_CORRESPONDE_AL_SERVICIO = 10019;
        public static final int NUMERO_DE_LOTE_PROPORCIONADO_NO_HA_SIDO_PROCESADO = 10041;
        public static final int TRASPASO_NO_SE_ENCUENTRA_EN_ESTADO_QUE_PERMITA_ENVIO_TRASPASO_VALORES_CON_TIPO_DE_VALOR_ESPECIFICADO = 314;
        public static final int EL_AFILIADO_HA_EXCEDIDO_LA_CANTIDAD_DE_TRASPASOS_PERMITIDOS_DURANTE_UN_ANIO = 233;
        public static final int EL_TIPO_DE_SANGRE_NO_SE_ENCUENTRA_CATALOGADO = 10125;
        public static final int VALORES_NOTIFICADOS_EN_TRASPASO_DE_VALORES_MENOR_AL_MONTO_DE_APORTES_DISPERSADO = 751;
        public static final int EL_CIUDADANO_NO_SE_ENCUENTRA_AFILIADO_EN_LA_ENTIDAD_DESTINO_DEL_TRASPASO_ESPECIFICADO = 10161;
        public static final int MOTIVO_234_EL_AFILIADO_NO_CUMPLE_CON_LA_CANTIDAD_DE_COTIZACIONES_EXIGIDAS_PARA_TRASPASARSE = 234;
        public static final int MOTIVO_263_SOLICITUD_DE_TRASPASO_PENDIENTE_DE_CERTIFICAR = 263;
        public static final int EL_NSS_Y_CEDULA_DE_LA_AFP_ORIGEN_Y_AFP_DESTINO_NO_COINCIDEN = 221;
        public static final int LA_FECHA_DE_SUSCRIPCION_DE_LA_AFP_ORIGEN_Y_AFP_DESTINO_NO_COINCIDEN = 227;
        public static final int EL_TIPO_DE_TRASPASO_DE_LA_AFP_ORIGEN_Y_AFP_DESTINO_NO_COINCIDEN = 10148;
        public static final int SOLICITUD_MANTENIMIENTO_NO_ESPECIFICA_DATOS = 10139;
        public static final int EL_CIUDADANO_NO_TIENE_UNA_AFILIACION_ACTIVA_PARA_EL_SEGURO_EN_CUESTION = 10078;
        public static final int DEBE_ESPECIFICAR_NSS_CEDULA_CIUDADANO = 1714;
        public static final int NUMERO_SOL_TRASPASO_NO_EXISTE = 10156;
        public static final int SOL_TRASPASO_NO_SE_ENCUENTRA_EN_UN_ESTADO_PERMITIDO = 10153;
        public static final int EL_NUMERO_DE_CICLO_TRASPASO_NO_EXISTE = 326;
        public static final int VENCIDA_POR_FALTA_DE_ACLARACION = 10137;
        public static final int VENCIDA_POR_FALTA_DE_ENVIO_DE_LA_SOLICITUD_DE_TRASPASO_PAREJA = 235;
        public static final int VENCIDA_POR_FALTA_DE_CARGA_DE_DOCUMENTO_SOPORTE = 1045;
        public static final int NUMERO_DE_SOLICITUD_DE_TRASPASO_NO_EXISTE = 10156;
        public static final int LA_SOLICITUD_DE_TRASPASO_ASOCIADA_A_LA_CANCELACION_NO_PERTENECE_AL_SEGURO_DE_LA_ENTIDAD_SUPERVISORA = 10143;
        public static final int LA_SOLICITUD_DE_TRASPASO_SE_ENCUENTRA_EN_UN_ESTADO_QUE_NO_PERMITE_REALIZAR_LA_ACCION_SOLICITADA = 10142;
        public static final int EL_MOTIVO_DE_CANCELACION_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10144;
        public static final int LA_SOLICITUD_DE_TRASPASO_NO_APLICA_PARA_CANCELACION = 10065;
        public static final int LA_ENTIDAD_NO_PERTENECE_AL_SEGURO_Y_REGIMEN_PROPORCIONADOS = 10045;
        public static final int LA_PREGUNTA_DE_SEGURIDAD_NO_SE_ENCUENTRA_CATALOGADA_O_ACTIVA = 10124;
        public static final int FORMULARIO_TRASPASO_NO_PUEDE_SER_MODIFICADO = 10154;
        public static final int SOLICITUD_MAN_FUERA_PLAZO_ESTABLECIDO = 10155;
        public static final int EL_TIPO_DE_AFILIADO_DEBE_SER_TITULAR = 550;
        public static final int EL_NUMERO_DE_TRASPASO_NO_EXISTE = 10121;
        public static final int EL_NUMERO_DE_TRASPASO_NO_CORRESPONDE_CON_EL_SEGURO = 10120;
        public static final int EL_SERVICIO_ENVIADO_NO_SE_ENCUENTRA_CATALOGADO_Y_ACTIVO = 10040;
        public static final int NO_EXISTE_CONFIGURACION_PARA_MOVIMIENTO_FONDOS_REALIZAR = 10162;
        public static final int EL_AFILIADO_TITULAR_NO_ESTA_AL_DIA_EN_SUS_PAGOS = 1043;
        public static final int EL_TIPO_DE_TELEFONO_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10123;
        public static final int EXISTE_SOLICITUD_TRASPASO_EN_CURSO_PARA_UN_DEPENDIENTE_DEL_CIUDADANO_A_TRASPASARSE = 10128;
        public static final int MOTIVO_RECHAZADO_POR_PROCESO_TRASPASO = 1015;
        public static final int LA_ENTIDAD_SOLICITA_ACCION_SOBRE_SOLICITUD_TRASPASO_NO_POSEE_TIPO_DE_PARTICIPACION_REQUERIDO = 1470;
        public static final int NSS_PROPORCIONADO_NO_ES_UN_PARTICIPANTE_DE_LA_SOLICITUD_DE_TRASPASO = 296;
        public static final int EL_CIUDADANO_SE_ENCUENTRA_PENDIENTE_O_ES_UN_AFILIADO_ACTIVO_NO_COTIZANTE = 10131;
        public static final int EL_AFILIADO_PERTENECE_A_LA_MISMA_ARS_SOLICITANTE = 1038;
        public static final int CIUDADANO_NO_SE_ENCUENTRA_COMO_PARTICIPANTE_PROCESO_FUSION = 988;
        public static final int IMPEDIMENTO_NO_ESTA_CATALOGADO_O_ACTIVO = 997;
        public static final int EXISTE_UNA_NOTIFICACION_DE_IMPEDIMENTO_PENDIENTE_PARA_EL_AFILIADO_EN_LA_SOLICITUD_DE_TRASPASO = 1471;
        public static final int LA_ACCION_SOLICITADA_SOBRE_LA_SOLICITUD_DE_TRASPASO_SE_ENCUENTRA_FUERA_DEL_PLAZO_ESTABLECIDO = 1010;
        public static final int PENDIENTE_DE_ACCION_DE_LA_SUPERVISORA_SOBRE_IMPEDIMENTO_DE_TRASPASO = 10119;
        public static final int MOTIVO_LA_FECHA_DE_APLICACION_DEBE_SER_POSTERIOR_O_IGUAL_A_LA_FECHA_DE_GENERACION = 10026;
        public static final int VENCIMIENTO_VALIDADO_POR_SIPEN = 295;
        public static final int TRASPASO_PENDIENTE_DE_CIERRE = 10140;
        public static final int NO_EXISTE_NOTIFICACION_DE_IMPEDIMENTO_PENDIENTE_O_RELACIONADA_A_LA_SOLICITUD_PROVISTA = 1504;
        public static final int LA_ACCION_DE_CONTINUAR_EL_TRASPASO_REQUIERE_UN_MOTIVO = 1489;
        public static final int MOTIVO_DE_ACCION_TOMADA_POR_SISALRIL_NO_ESTA_CATALOGADO_O_ACTIVO = 1008;
        public static final int LA_ACCION_DE_DETENER_EL_TRASPASO_NO_REQUIERE_UN_MOTIVO = 1488;
        public static final int NOTIFICACION_DE_IMPEDIMIENTO_INVALIDADA_POR_LA_ENTIDAD_SUPERVISORA = 10132;
        public static final int FUE_ACEPTADA_OTRA_NOTIFICACION_DE_IMPEDIMIENTO_PARA_LA_MISMA_SOLICITUD_DE_TRASPASO = 10126;
        public static final int TRASPASO_CON_IMPEDIMENTO_VALIDADO_POR_LA_ENTIDAD_SUPERVISORA = 1009;
        public static final int TIPO_DOCUMENTO_NO_CATALOGADO = 10056;
        public static final int NUMERO_SOLICITUD_SERVICIO_NO_EXISTE = 10112;
        public static final int TIPO_DOCUMENTO_NO_DISPONIBLE = 10164;
        public static final int SOLICITUD_SERVICIO_NO_PERTENECE_ENTIDAD = 10054;
        public static final int NO_EXISTE_NOTIFICACION_DE_IMPEDIMENTO_PENDIENTE_DE_ACCION_O_RELACIONADA_A_LA_SOLICITUD_PROVISTA = 10152;
        public static final int RECHAZADO_POR_DIFERENCIA_ACLARACION_VALIDADO_POR_SIPEN = 365;
        public static final int EL_ESTADO_DEBE_SER_PROPORCIONADO_CUANDO_SEA_PROVISTO_UN_MOTIVO = 10165;
        public static final int EL_ESTADO_MOTIVO_NO_SE_ENCUENTRA_DENTRO_ESTADOS_MOTIVOS_PERMITIDOS = 10166;
        public static final int SE_HA_EXCEDIDO_PLAZO_PARA_TOMAR_ACCION_SOBRE_SOLICITUD_DE_TRASPASO_PENDIENTE_DE_AUTORIZACION = 10141;
        public static final int TIPO_DOCUMENTO_NO_RELACIONADO_A_LA_SOLICITUD_SERVICIO = 10055;
        public static final int PENDIENTE_AUTORIZACION_ADMINISTRADORA_POR_TENER_DEPENDIENTES_A_RECHAZAR = 10122;
        public static final int SE_HA_EXCEDIDO_PLAZO_PARA_TOMAR_ACCION_SOBRE_SOLICITUD_DE_TRASPASO_POR_PARTE_SUPERVISORA = 1503;
        public static final int FUNCIONALIDAD_SOLICITADA_NO_SE_ENCUENTRA_IMPLEMENTADA = 10134;
        public static final int IDENTIFICACION_NO_PROPORCIONADO_PARA_EL_TIPO_DE_IDENTIFICACION = 10109;
        public static final int PERIODO_PROPORCIONADO_ES_INVALIDO = 10049;
        public static final int PERIODO_INICIAL_DEBE_SER_ANTERIOR_O_IGUAL_AL_PERIODO_FINAL = 10175;
        public static final int FECHA_INICIAL_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_FINAL = 1693;
        public static final int SOLICITUD_RECHAZADA_POR_DECISION_DEL_TITULAR_SOLICITANTE = 1496;
        /**
         * EL AFILIADO NO CUENTA CON UN ESTADO DE AFILIACION PERMITIDO PARA LA ACCION SOLICITADA (Codigo: 1742)
         */
        public static final int EL_AFILIADO_SOLICITADO_NO_CUENTA_CON_UN_ESTADO_PERMITIDO_PARA_LA_ACCION_SOLICITADA = 1742;
        public static final int EL_DEPENDIENTE_SOLICITADO_YA_EXISTE_EN_EL_NUCLEO_DEL_TITULAR_SOLICITANTE = 1527;
        public static final int EL_AFILIADO_SOLICITADO_SE_ENCUENTRA_COMO_UN_DEPENDIENTE_CONYUGE = 10167;
        public static final int EL_AFILIADO_SOLICITADO_ES_EL_MISMO_SOLICITANTE = 10168;
        public static final int EL_TITULAR_SOLICITANTE_SE_ENCUENTRA_EN_UN_TRASPASO_EN_CURSO = 1508;
        public static final int EL_DEPENDIENTE_DEL_AFILIADO_SOLICITADO_NO_TIENE_ESTADO_PAREN_AFILIACION_PERMITIDO_UNIFICACION = 10170;
        public static final int DEPENDIENTE_CIUDADANO_SOLICITADO_SE_ENCUENTRA_EN_TRASPASO_EN_CURSO = 1512;
        public static final int NO_EXISTE_RELACION_VALIDA_PARENTESCO_TIPO_CONDICION_EDAD_DEPENDIENTE = 80;
        public static final int EXISTEN_DEPENDIENTES_DEL_AFILIADO_SOLICITADO_QUE_NO_FUERON_PROPORCIONADOS_EN_SOLICITUD_TRASPASO = 10169;
        public static final int EXISTEN_DEPENDIENTES_DIRECTOS_NO_FUERON_SELECCIONADOS_EN_SOLICITUD_TRASPASO_UNIFICACION = 10171;
        public static final int SOLICITUD_TRAPASO_PROVISTA_CON_DEPENDIENTES_PARTICIPANTES_Y_EL_AFILIADO_SOLICITADO_NO_ES_CONYUGE = 10172;
        public static final int EXISTEN_DEPENDIENTES_PARTICIPANTES_EN_SOLICITUD_TRASPASO_CON_PARENTESCO_CONYUGE = 10173;
        public static final int AFILIADO_NO_INCLUIDO_COMO_PARTICIPANTE_DE_SOLICITUD_TRASPASO = 10147;
        public static final int EL_TITULAR_DEL_CIUDADANO_SOLICITADO_SE_ENCUENTRA_EN_UN_TRASPASO_EN_CURSO = 1499;
        public static final int EL_AFILIADO_SOLICITADO_ES_CONYUGE_O_TIENE_UN_CONYUGE = 1494;
        public static final int RECHAZADO_ENCONTRARSE_COMO_AFILIADO_ACTIVO_EN_LA_ENTIDAD_ORIGEN = 10176;
        public static final int PENDIENTE_AUTORIZACION_SUPERVISORA_POR_TITULAR_CON_DEPENDIENTES_A_RECHAZAR_REGIMEN_SUBSIDIADO = 10163;
        public static final int RECHAZADO_POR_EL_INCUMPLIMIENTO_DE_VALIDACIONES_GENERALES_SOLICITUD_DE_SERVICIO = 10174;
        public static final int DEPENDIENTE_PARTICIPANTE_RECHAZADO_PORQUE_EL_AFILIADO_SOLICITADO_NO_APLICA_PARA_TRASPASO_UNIFICACION_NUCLEO = 1495;
        public static final int PENDIENTE_DE_AUTORIZACION_DE_LA_SUPERVISORA_POR_SER_TITULAR_CON_DEPENDIENTES_A_RECHAZAR_EN_EL_REGIMEN_SUBSIDIADO = 10163;
        public static final int EL_TIPO_PERSONA_NO_ES_PERMITIDO_SI_AGENTE_ES_REPRESENTANTE = 10205;
        public static final int EL_NUMERO_IDENTIFICADOR_PROPORCIONADO_NO_CORRESPONDE_AL_SERVICIO_DEL_SOLICITADO = 10216;
        public static final int NUCLEO_FAMILIAR_SE_ENCUENTRA_EN_TRASPASO = 1514;
        public static final int EXISTE_EJECUCION_PREVIA_SERVICIO_SOLICITADO_PENDIENTE_RESPUESTA = 10215;
        public static final int CIUDADANO_SE_ENCUENTRA_AFILIADO_COMO_TITULAR_CON_DEPENDIENTES_EN_OTRO_REGIMEN = 10219;
        public static final int APORTE_CORRESPONDE_A_UN_PERIODO_QUE_NO_CUMPLE_CON_LA_ANTIGUEDAD_PERMITIDA_PARA_AFILIACION = 10218;
        public static final int NOTIFICACION_IMPEDIMENTO_RECHAZADA_POR_CANCELACION_SOLICITUD_TRASPASO = 10218;
        public static final int LA_ENTIDAD_NO_PERTENECE_AL_SEGURO_GESTOR_EXTERNO_DE_SOLICITUDES = 10129;
        public static final int EL_NUMERO_SOLICITUDE_PROPORCIONADO_SE_ENCUENTRA_ASOCIADO_A_OTRA_SOLICITUD_SERVICIO = 1424;
        public static final int MOTIVO_CAMBIO_NO_CATALOGADO_ACTIVO = 1443;
        public static final int SOLICITUD_DE_SERVICIO_SE_ENCUENTRA_EN_ESTADO_INVALIDO_PARA_PROCESO = 10110;
        public static final int LA_ENTIDAD_ORIGEN_DEBE_SER_DIFERENTE_ENTIAD_DESTINO = 781;
        public static final int EL_TITULAR_NO_HA_PARTICIPADO_EN_TRASPASO_ORDINARIO = 1438;
        public static final int LA_ENTIAD_DESTINO_PROPORCIONADA_ES_DISTINTA_DE_LA_ENTIDAD_ORIGEN_DEL_TRASPASO_ORDINARIO_A_REVERSAR = 1444;
        public static final int SOLICITUD_RECHAZADA_POR_ESTAR_PARTICIPANDO_EN_UN_PROCESO_DE_REVERSO_DE_TRASPASO_O_AFILIACION = 1865;
        public static final int IDENTIFICACION_PROPORCIONADA_NO_PERTENECE_A_UN_AFILIADO_TITULAR = 1036;
        public static final int EL_TIPO_NOTIFICACION_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10202;
        public static final int NO_EXISTEN_SUSCRIPCION_DE_NOTIFICACION_CATALOGADA_O_ACTIVA_PARA_ENTIDAD_Y_SERVICIO = 10203;
        public static final int NO_EXISTEN_DEFINICION_DE_NOTIFICACION_CATALOGADA_O_ACTIVA_PARA_EL_SERVICIO_PROPORCIONADO = 10240;
        public static final int EXISTEN_PARAMETROS_DE_DEFINICION_NOTIFIACION_QUE_NO_FUERON_PROPORCIONADOS = 10241;
        public static final int EXISTEN_PARAMETROS_DE_DEFINICION_NOTIFIACION_QUE_NO_POSEEN_VALOR = 10242;
        public static final int NO_EXISTEN_CONTACTOS_ASOCIADOS_A_LA_VIA_SUSCRIPCION_DE_LA_NOTIFICACION = 10243;
        public static final int NO_HAN_SIDO_PROPORCIONADOS_LOS_DESTINATARIOS_PARA_LA_NOTIFICACION = 10244;
        public static final int TIPO_TRASPASO_NO_PERMITE_NOTIFICAR_IMPEDIMENTO = 1402;
        public static final int EL_REGIMEN_PROPORCIONADO_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10220;
        public static final int EL_REGIMEN_NO_SE_CORRESPONDE_CON_EL_SEGURO = 10044;
        public static final int EL_MOTIVO_DE_REVERSO_DE_CAPITA_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10222;
        public static final int LA_FECHA_PROPORCIONADA_NO_PUEDE_SER_MAYOR_A_LA_FECHA_ACTUAL = 10228;
        public static final int PENDIENTE_DE_COMPLETAR = 10229;
        public static final int FUE_REALIZADA_OTRA_SOLICITUD_CONTRASENIA = 10287;
        public static final int EL_CODIGO_IDENTIFICADOR_DEL_REGISTRO_NO_CUMPLE_CON_EL_FORMATO_ESTABLECIDO = 10199;
        public static final int EL_CODIGO_IDENTIFICADOR_DEL_REGISTRO_PROPORCIONADO_YA_SE_ENCUENTRA_REGISTRADO = 10200;
        public static final int CONTRATO_CONFIDENCIALIDAD_NO_ACEPTADO = 10233;
        public static final int CODIGO_USUARIO_INCORRECTO = 10183;
        public static final int NO_EXISTE_EJECUCION_INTERCAMBIO_INFORMACION_PREVIA_SERVICIO_SOLICITADO_PENDIENTE_RESPUESTA = 10224;
        public static final int SOLICITUD_DE_GESTION_DE_CONTACTO_SE_ENCUENTRA_VENCIDA = 10184;
        public static final int EL_VALOR_INICIAL_RANGO_DEBE_SER_ANTERIOR_IGUAL_AL_VALOR_FINAL = 10284;
        public static final int LA_FECHA_INICIAL_DEL_RANGO_DE_FECHAS_ES_INVALIDA = 10076;
        public static final int LA_FECHA_FINAL_DEL_RANGO_DE_FECHAS_ES_INVALIDA = 10077;
        public static final int EXISTEN_REGISTROS_EN_EL_INTERCAMBIO_DE_INFORMACION_QUE_NO_CUMPLIERON_CON_LA_REGLAS_DE_NEGOCIO_ESTABLECIDAS = 10285;
        public static final int DEBE_EXISTIR_AL_MENOS_UN_CRITERIO_DE_BUSQUEDA_PARA_REALIZAR_LA_CONSULTA = 10177;
        public static final int DEBE_PROPORCIONAR_FECHA_INICIAL_Y_FINAL_DEL_RANGO_DE_FECHAS = 10074;
        public static final int TIPO_GENERACION_CAPITA_NO_ESTA_CATALOGADO_O_ACTIVO = 10300;
        public static final int EL_ESTADO_DEL_SUBSIDIO_NO_SE_ENCUENTRA_CATALOGADO_O_SE_ENCUENTRA_INACTIVO = 10292;
        public static final int EL_PERIODO_RECLAMADO_NO_PUEDE_SER_MAYOR_AL_PERIODO_CORRIENTE_AFILIACION = 1617;
        public static final int EXISTE_UNA_SOLICITUD_DE_PAGO_RETROACTIVO_PROCESADA_CORRECTAMENTE_PARA_EL_MISMO_DEPENDIENTE_Y_PERIODO_SOLICITADO = 710;
        public static final int EL_TITULAR_DEL_DEPENDIENTE_NO_TIENE_UNA_CAPITA_DISPERSADA_PARA_EL_PERIODO_SOLICITADO = 711;
        public static final int AFILIADO_CON_INDIVIDUALIZACION_DE_CAPITA_PARA_EL_PERIODO_A_INDIVIDUALIZAR = 10102;
        public static final int AFILIADO_CON_INDIVIDUALIZACION_DE_CAPITA_RECHAZADA_PARA_EL_PERIODO_A_INDIVIDUALIZAR = 10090;
        public static final int SOLICITADO_NO_SE_ENCUENTRA_DENTRO_DEL_RANGO_DE_PERIODOS_PERMITIDOS_PARA_PAGO_RETROACTIVO_DE_RECIEN_NACIDO = 713;
        public static final int EL_PERIODO_SOLICITADO_NO_PUEDE_SER_MAYOR_O_IGUAL_AL_PERIODO_CORRIENTE_A_LA_FECHA_DE_RECEPCION_DE_LA_SOLICITUD = 715;
        public static final int EL_PERIODO_SOLICITADO_NO_SE_ENCUENTRA_DENTRO_DEL_RANGO_DE_PERIODOS_DE_ANTIGUEDAD_PERMITIDO = 1838;
        public static final int TRASPASO_PENDIENTE_DE_REVERSO_DE_CAPITAS = 10217;
        public static final int SOLICITUD_DE_GESTION_DE_APORTE_RECHAZADA_POR_EL_RECHAZO_DE_TODOS_LOS_APORTES_ESPECIFICOS_PROPORCIONADOS = 10333;
        /**
         * LA ENTIDAD QUE REMITE LA SOLICITUD NO ES LA SUPERVISORA DE LA ENTIDAD PROPORCIONADA (Codigo: 10138)
         */
        public static final int LA_ENTIDAD_QUE_REMITE_LA_SOLICITUD_NO_ES_LA_SUPERVISORA_DE_LA_ENTIDAD_PROPORCIONADA = 10138;
        /**
         * LA ESTANCIA INFANTIL PROPORCIONADA NO SE ENCUENTRA CATALOGADA O ACTIVA (Codigo: 1347)
         */
        public static final int LA_ESTANCIA_INFANTIL_PROPORCIONADA_NO_SE_ENCUENTRA_CATALOGADA_O_ACTIVA = 1347;
        /**
         * EL DEPENDIENTE NO POSEE UNA EDAD PERMITIDA PARA PERTENECER A UNA ESTANCIA INFANTIL (Codigo: 1348)
         */
        public static final int EL_DEPENDIENTE_NO_POSEE_UNA_EDAD_PERMITIDA_PARA_PERTENECER_A_UNA_ESTANCIA_INFANTIL = 1348;
        public static final int EL_CIUDADANO_SE_ENCUENTRA_REGISTRADO_EN_UNA_ESTANCIA_INFANTIL = 1380;
        /**
         * EL EMPLEADOR DE LA FACTURA NO SE CORRESPONDE CON EL EMPLEADOR EN LA SOLICITUD DE SUBSIDIO (Codigo: 10298)
         */
        public static final int EL_EMPLEADOR_DE_LA_FACTURA_NO_SE_CORRESPONDE_CON_EL_EMPLEADOR_EN_LA_SOLICITUD_DE_SUBSIDIO = 10298;
        /**
         * EL ENO EXISTE UNA SOLICITUD DE SUBSIDIO PARA EL CIUDADANO, PERIODO Y TIPO DE SUBSIDIO (Codigo: 10297)
         */
        public static final int NO_EXISTE_UNA_SOLICITUD_DE_SUBSIDIO_PARA_EL_CIUDADANO_PERIODO_Y_TIPO_DE_SUBSIDIO = 10297;

        public static final int EL_SECTOR_ECONOMICO_NO_ESTA_CATALOGADO_O_ESTA_INACTIVO = 10245;

        public static final int EL_TIPO_DE_EMPLEADOR_NO_ESTA_CATALOGADO_O_ESTA_INACTIVO = 10246;

        /**
         * LA SOLICITUD DE SUBSIDIO NO SE ENCUENTRA VIGENTE (Codigo: 10299)
         */
        public static final int LA_SOLICITUD_DE_SUBSIDIO_NO_SE_ENCUENTRA_VIGENTE = 10299;
        /**
         * EL TITULAR DEL DEPENDIENTE NO EXISTE EN EL MAESTRO DE CIUDADANOS (Codigo: 170)
         */
        public static final int EL_TITULAR_DEL_DEPENDIENTE_NO_EXISTE_EN_EL_MAESTRO_DE_CIUDADANOS = 170;
        /**
         * EL DEPENDIENTE NO TIENE UNA AFILIACION REGISTRADA (Codigo: 1804)
         */
        public static final int EL_DEPENDIENTE_NO_TIENE_UNA_AFILIACION_REGISTRADA = 1804;
        /**
         * EL TITULAR ENVIADO NO SE CORRESPONDE CON EL TITULAR ASOCIADO A LA AFILIACION DEFINITIVA DEL DEPENDIENTE (Codigo: 1805)
         */
        public static final int EL_TITULAR_ENVIADO_NO_SE_CORRESPONDE_CON_EL_TITULAR_ASOCIADO_A_AFILIACION_DEFINITIVA_DEL_DEPENDIENTE = 1805;
        /**
         * EL DEPENDIENTE NO SE ENCUENTRA REGISTRADO COMO DEPENDIENTE PARA EL TITULAR ESPECIFICADO (Codigo: 1398).
         */
        public static final int EL_DEPENDIENTE_NO_SE_ENCUENTRA_REGISTRADO_COMO_DEPENDIENTE_PARA_EL_TITULAR_ESPECIFICADO = 1398;
        /**
         * LA ENTIDAD NO TIENE PERMITIDO REALIZAR EL TIPO DE NOVEDAD SOLICITADO
         */
        public static final int LA_ENTIDAD_NO_TIENE_PERMITIDO_REALIZAR_EL_TIPO_DE_NOVEDAD_SOLICITADO = 1694;

        public static final int FECHA_DEFUNCION_ES_MAYOR_A_LA_FECHA_ACTUAL = 1690;
        public static final int CIUDADANO_SE_ENCUENTRA_FALLECIDO = 415;

        /**
         * EL PARENTESCO DEL AFILIADO NO CORRESPONDE A UN CONYUGE (Codigo: 1618).
         */
        public static final int EL_PARENTESCO_DEL_AFILIADO_NO_CORRESPONDE_A_UN_CONYUGE = 1618;
        /**
         * EL DEPENDIENTE CONYUGE DEBE TENER CEDULA (Codigo: 970).
         */
        public static final int EL_DEPENDIENTE_CONYUGE_DEBE_TENER_CEDULA = 970;
        /**
         * PARENTESCO NO CATALOGADO O INACTIVO (Codigo: 113)
         */
        public static final int PARENTESCO_NO_CATALOGADO_O_INACTIVO = 113;
        public static final int EL_CIUDADANO_POSEE_SOLICITUD_NOVEDAD_EN_CURSO_CON_TIPO_NOVEDAD_NO_PERMITE_LA_SOLICITUD_NOVEDAD_ENVIADA = 10303;
        public static final int NO_EXISTE_UNA_SOLICITUD_DE_NOVEDAD_CON_EL_NUMERO_DE_REFERENCIA_PROPORCIONADO = 10304;
        public static final int AFILIADO_CON_OTRA_SOLICITUD_DE_NOVEDAD_DEL_MISMO_GRUPO_Y_TIPO_EN_PROCESO = 1628;
        public static final int SOLICITUD_AFILIACION_TITULAR_Y_CONYUGE_NO_TIENEN_EL_MISMO_ESTADO = 1735;
        /**
         * EL GRUPO DE NOVEDAD NO ESTA CATALOGADO O ESTA INACTIVO (Codigo: 10254)
         */
        public static final int EL_GRUPO_DE_NOVEDAD_NO_ESTA_CATALOGADO_O_ESTA_INACTIVO = 10254;
        /**
         * EL GRUPO Y TIPO DE NOVEDAD ESPECIFICADOS NO SON VALIDOS (Codigo: 1622)
         */
        public static final int EL_GRUPO_Y_TIPO_DE_NOVEDAD_ESPECIFICADOS_NO_SON_VALIDOS = 1622;
        public static final int AFILIADO_CON_OTRA_SOLICITUD_NOVEDAD_DEL_MISMO_GRUPO_EN_PROCESO = 10305;
        public static final int REGISTRO_RECHAZADO_POR_EL_PROCESO_DE_NOVEDAD = 459;
        /**
         * EL SEXO NO COINCIDE CON EL DEL MAESTRO DE CIUDADANOS (Codigo: 76)
         */
        public static final int EL_SEXO_NO_COINCIDE_CON_EL_DEL_MAESTRO_DE_CIUDADANOS = 76;
        public static final int EL_TIPO_DE_AFILIADO_DEBE_SER_DEPENDIENTE = 549;
        public static final int NOVEDAD_DE_CAMBIO_DE_DATOS_DE_AFILIACION_NO_APLICA_PARA_DEPENDIENTE_CONYUGE = 1823;
        public static final int EL_PARENTESCO_PROPORCIONADO_NO_PUEDE_SER_UN_PARENTESCO_RELACIONADO_A_TUTELA = 10253;
        public static final int NO_SE_PROPORCIONARON_DATOS_NUEVOS_EN_LA_SOLICITUD_DE_CAMBIO_DE_DATOS = 10250;
        public static final int EL_TIPO_DE_AFILIACION_PROPORCIONADO_NO_SE_ENCUENTRA_CATALOGADO_O_ESTA_INACTIVO = 10251;
        public static final int EL_CONYUGE_DEL_NUCLEO_FAMILIAR_NO_SE_ENCUENTRA_EN_EL_MAESTRO_DE_CIUDADANOS = 10015;
        public static final int EL_CONYUGE_DEL_NUCLEO_FAMILIAR_SE_ENCUENTRA_CANCELADO_EN_EL_MAESTRO_DE_CIUDADANOS = 10135;

        /**
         * EL NUMERO DE SOLICITUD DE SERVICIO PROPORCIONADO NO CORRESPONDE CON EL SERVICIO Y SEGURO (Codigo: 10306)
         */
        public static final int NUMERO_SOLICITUD_SERVICIO_NO_CORRESPONDE_CON_SERVICIO_SEGURO = 10306;

        public static final int EL_TIPO_DE_COBERTURA_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 10206;
        public static final int EXISTEN_CUENTAS_INACTIVAS_O_SIN_ASIGNAR_EN_LA_CONFIGURACION_DE_TIPOS_DE_CUENTA = 10312;

        /**
         * PENDIENTE DE REVISION DE LA ENTIDAD REGULADORA (Codigo: 10214)
         */
        public static final int PENDIENTE_DE_REVISION_DE_LA_ENTIDAD_REGULADORA = 10214;

        public static final int NUMERO_DE_LOTE_NO_CORRESPONDE_A_UN_TIPO_DE_LOTE_PERMITIDO_PARA_LA_ACCION_SOLICITADA = 10318;
        public static final int EL_EMPLEADOR_NO_ESTA_CATALOGO_O_ACTIVO = 625;
        public static final int EL_TITULAR_DEL_DEPENDIENTE_DEBE_ESTAR_DE_MANERA_DEFINITIVA_Y_ACTIVA_PARA_EL_DEPENDIENTE = 1828;

        public static final int SOLICITUD_DE_AFILIACION_PENDIENTE_POR_QUE_EL_NUCLEO_NO_SE_ENCUENTRA_REGISTRADO_EN_UNA_NOMINA_ACTIVA = 1678;
        public static final int IDENTIFICACION_CIUDADANO_CORRESPONDE_TITULAR_DE_EXCEPCION = 10326;
        public static final int IDENTIFICACION_CIUDADANO_CORRESPONDE_CIUDADANO_EXTRANJERO = 10327;
        public static final int IDENTIFICACION_CIUDADANO_NO_CORRESPONDE_CON_TIPO_PERSONA = 10328;
        public static final int EL_TITULAR_DEL_DEPENDIENTE_NO_DEBE_SER_UN_CIUDADANO_EXTRANJERO = 10325;
        public static final int TITULAR_NUCLEO_FAMILIAR_CANCELADO_EN_EL_MAESTRO_DE_CIUDADANOS = 10310;
        public static final int EL_CIUDADANO_NO_TIENE_CEDULA_ASIGNADA_EN_EL_MAESTRO_DE_CIUDADANOS = 1417;
        public static final int LA_EDAD_DEL_CIUDADANO_EXCEDE_LA_EDAD_LIMITE_ESTABLECIDA_PARA_DEPENDIENTES_DE_TITULARES_INSTITUCIONALES = 1851;

        public static final int LA_SOLICITUD_PARA_OMISION_VALIDACION_APELLIDO_NO_FUE_AUTORIZADA_POR_SISALRIL = 1800;
        public static final int EL_CIUDADANO_SE_ENCUENTRA_CANCELADO_EN_EL_MAESTRO_DE_CIUDADANOS = 552;

        public static final int BAJA_POR_DIVORCIO_O_SEPARACION = 10334;
        public static final int MOTIVO_CAMBIO_NO_ES_PERMITIDO_ENTIDAD = 10335;
        public static final int LA_CLAVE_DE_LA_INSTITUCION_DE_PENSIONADOS_NO_ESTA_CATALOGADA_O_ESTA_INACTIVA = 1920;
        public static final int LA_CLAVE_DE_LA_INSTITUCION_DE_PENSIONADOS_NO_ES_PERMITIDA_PARA_LA_ENTIDAD = 1922;
        public static final int LA_INSTITUCION_DE_PENSIONADOS_DEL_TITULAR_DEL_DEPENDIENTE_NO_PERMITE_AFILIAR_DEPENDIENTES_ADICIONALES = 1921;
        public static final int AFILIADO_RECHAZADO_POR_AFILIARSE_COMO_PENSIONADO = 1912;
        public static final int TIPO_NOVEDAD_NO_CATALOGADO_ACTIVO = 174;
        public static final int NO_EXISTE_UNA_ESTRUCTURA_DE_ARCHIVO_PARA_SERVICIO_PROPORCIONADO = 10338;
        public static final int LA_ESTRUCTURA_NO_POSEE_DATOS_REQUERIDOS_PARA_GENERACION_DE_ARCHIVOS = 10339;
        public static final int LA_ENTIDAD_FINANCIERA_PROPORCIONADA_DEBE_ESTAR_CATALOGADA = 10079;
        public static final int LA_FECHA_INICIAL_DEBE_SER_PROPORCIONADA = 10074;
        public static final int LA_FECHA_FINAL_DEBE_SER_PROPORCIONADA = 10075;
        public static final int LA_FECHA_INICIAL_DEBE_TENER_FORMATO_VALIDO = 10076;
        public static final int LA_FECHA_FINAL_DEBE_TENER_FORMATO_VALIDO = 10077;
        public static final int LA_ENTIDAD_FINANCIERA_DEBE_ESTAR_CATALOGADA = 10079;
        public static final int LA_ENTIDAD_LOGICA_DEBE_ESTAR_CATALOGADA = 10080;
        public static final int EL_CONCEPTO_DEBE_ESTAR_CATALOGADO = 10081;
        public static final int EL_TIPO_CUENTA_DEBE_ESTAR_CATALOGADO = 10082;
        public static final int LA_ENTIDAD_NO_TIENE_RELACION_CON_LA_ENTIDAD_PROPORCIONADA_EN_LA_SOLICITUD_DEL_SERVICIO = 10348;
        public static final int EL_CIUDADANO_NO_HA_SIDO_NOTIFICADO_COMO_FALLECIDO = 1715;
        public static final int NUMERO_INDIVIDUALIZACION_CAPITAS_NO_ENCUENTRAN_INDIVIDUALIZADOS = 10067;
        public static final int NUMERO_CAPITA_NO_ENCUENTRAN_INDIVIDUALIZADOS = 10068;
        public static final int TIPO_SUBSIDIO_NO_SE_ENCUENTRA_CATALOGADO = 10291;
        public static final int LOS_CRITERIOS_DE_BUSQUEDA_PROPORCIONADOS_SON_INSUFICIENTES_PARA_REALIZAR_LA_BUSQUEDA = 10223;
        public static final int NO_EXISTE_UNA_EJECUCION_DE_FACTURACION_PARA_REVERSO_FACTURACION = 10342;
        public static final int YA_EXISTE_UNA_EJECUCION_PARA_EL_PROCESO_DE_GENERACION_DE_FACTURACION_EN_ESTADO_DISTINTA_DE_RECHAZADA = 10344;
        public static final int EL_ORDEN_DE_EJECUCION_SUMINISTRADO_NO_ESTA_CATALOGADO = 10341;

        public static final int DOCUMENTO_SOBREPASA_TAMANO_PERMITIDO = 1605;
        public static final int FORMATO_DOCUMENTO_NO_CATALOGADO_ACTIVO = 10057;
        public static final int FORMATO_DOCUMENTO_NO_CORRESPONDE_TIPO_DOCUMENTO = 10058;
        public static final int CARGA_DOCUMENTO_FUERA_PLAZO = 657;
        public static final int SOLICITUD_NO_CORRESPONDE_DOCUMENTO_PENDIENTE = 1611;

        // Constantes utilizada en los servicios de Reportes

        public static final int PENDIENTE_CALCULAR_EJECUCIONES_A_REALIZAR = 10353;
        public static final int NO_EXISTE_REPORTE_CATALOGADO_ACTIVO_PARA_SERVICIO_SISTEMA_PROPORCIONADO = 10354;
        public static final int SUSCRIPCION_REPORTE_PROPORCIONADA_NO_CATALOGADA_O_ACTIVA = 10355;
        public static final int SUSCRIPCION_PROPORCIONADA_NO_PERTENECE_AL_REPORTE = 10356;
        public static final int PARAMETRO_PROPORCIONADO_NO_PERTENECE_AL_REPORTE = 10357;
        public static final int EXISTE_EJECUCION_EN_CURSO_PARA_SUSCRIPCION_REPORTE_EJECUTAR = 10358;
        public static final int SE_HA_EXCEDIDO_CANTIDAD_EJECUCIONES_DIARIAS_ESTABLECIDA_SUSCRIPCION_REPORTE_EJECUTAR = 10359;
        public static final int REPORTE_EJECUTAR_NO_APLICA_PARA_EJECUCION_CALENDARIZADA = 10363;

        public static final int EJECUCION_REPORTE_CANCELADA_POR_CANCELACION_SOLICITUD_EJECUCION = 10364;
        public static final int EXISTEN_EJECUCIONES_DE_LA_SOLICITUD_EJECUCION_REPORTE_NO_FUERON_COMPLETADAS_EXITOSAMENTE = 10361;

        public static final int PENDIENTE_EJECUTAR = 10360;

        public static final int FECHA_CORTE_DEBE_SER_MAYOR_A_LA_FECHA_FINAL_DE_LA_NOTIFICACION = 10371;
        public static final int LAS_CREDENCIALES_DE_AUTENTICACION_DEL_USUARIO_SON_INVALIDAS = 10178;
        public static final int EL_USUARIO_NO_POSEE_PERMISOS_SUFICIENTES_PARA_ACCEDER_AL_SERVICIO_SOLICITADO = 10182;
        public static final int TRASPASO_DE_VALOR_NOTIFICADO_CON_TIPO_DE_VALOR_A_TRASPASAR_INCORRECTO = 10373;

        // Motivos Contingencia.
        public static final int SOL_INTERCAMBIO_CONTINGENCIA_PENDIENTE_DE_GENERAR_ARCHIVO_FISICO = 10362;

        public static final int NO_EXISTE_UNA_SOLICITUD_DE_NOVEDAD_PARA_EL_NUMERO_DE_SOLICITUD_DE_BENEFICIO_PROPORCIONADO = 1684;

        public static final int SOLICITUD_DE_NOVEDAD_DE_ENTREGA_DE_BENEFICIO_NO_SE_ENCUENTRA_EN_UN_ESTADO_PERMITIDO_PARA_EL_SERVICIO_SOLICITADO = 1707;

        public static final int EL_TIPO_DE_NOVEDAD_NO_PERMITe_MANTENIMIENTO = 1621;

        public static final int LA_FECHA_DE_CIERRE_DEBE_SER_POSTERIOR_O_IGUAL_A_LA_FECHA_SOLICITUD_DE_ENTREGA_DE_BENEFICIO = 1640;

        public static final int LA_MODALIDAD_DE_PENSION_ESPECIFICADA_NO_SE_ENCUENTRA_CATALOGADA_O_ACTIVA = 1630;

        public static final int LA_MODALIDAD_DE_PENS_ESP_NO_SE_ENCUENTRA_PERMITIDA_PARA_EL_TIPO_DE_NOVEDAD_DE_LA_SOL_DE_ENTREGA_DE_BENEFICIO = 1627;

        public static final int LA_FECHA_DE_EFECTIVIDAD_DE_ENTREGA_DEL_BENEFICIO_DEBE_SER_POSTERIOR_A_LA_FECHA_DE_LA_SOLICITUD_DE_ENTREGA_DE_BENEFICIO = 1685;

        public static final int EL_TIPO_DE_PENSION_SOLO_ES_APLICABLE_PARA_UN_CIUDADANO_NOTIFICADO_COMO_FALLECIDO = 1703;

        public static final int LA_FECHA_DE_CIERRE_PROPORCIONADA_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_ACTUAL = 1636;

        public static final int EL_GRADO_DE_DISCAPACIDAD_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO = 1632;

        public static final int EL_CODIGO_DE_MOTIVO_PROPORCIONADO_NO_SE_ENCUENTRA_CATALOGADO_O_ACTIVO_PARA_EL_SERVICIO_SOLICITADO = 1629;
        public static final int CIUDADANO_SE_ENCUENTRA_AFILIADO_EN_UN_PLAN_ESPECIAL_DE_PENSIONADOS = 1940;

        public static final int RUBRO_ENVIADO_MAS_DE_UNA_VEZ_EN_LA_MISMA_SOLICITUD = 10530;
        public static final int EL_MONTO_DE_LA_RENTABILIDAD_ENVIADA_DEBE_SER_MAYOR_A_CERO = 10531;
        public static final int EXISTEN_RUBROS_CON_VALOR_NEGATIVO = 10566;

        public static final int EL_ESTADO_DE_INDIVIDUALIZACION_DE_CAPITA_NO_SE_ENCUENTRA_CATALOGADO_O_SE_ENCUENTRA_INACTIVO = 10449;

        public static final int TIPO_DE_IDENTIFICACION_NO_PERMITIDO_PARA_EL_PARENTESCO_Y_O_EDAD_DEL_DEPENDIENTE = 1849;

        public static final int CIUDADANO_TIENE_ASIGNADO_TIPO_DE_IDENTIFICACION_CON_UN_NIVEL_DE_PRFERENCIA_MAYOR_AL_DEL_TIPO_DE_IDENTIFICACION_PROPORCIONADO = 10594;

        // Motivos de validacion diferencia de apellidos.
        public static final int EL_SEGUNDO_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL_PRIMER_APELLIDO_DEL_TITULAR = 1671;
        public static final int EL_PRIMER_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL__SEGUNDO_APELLIDO_DEL_TITULAR = 1672;
        public static final int EL_PRIMER_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL_PRIMER__APELLIDO_DEL_CONYUGE = 1673;
        public static final int EL_PRIMER_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL__SEGUNDO_APELLIDO_DEL_CONYUGE = 1675;
        public static final int EL_PRIMER_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL_PRIMER_APELLIDO__DEL_TITULAR = 10593;
        public static final int EL_SEGUNDO_APELLIDO_DEL_DEPENDIENTE_NO_SE_CORRESPONDE_CON_EL_PRIMER_APELLIDO_DEL_CONYUGE = 1674;

        public static final int SOLICITUD_DE_SERVICIO_EN_EJECUCION = 10370;

        public static final int EL_ARCHIVO_CONTIENE_MAS_ARCHIVOS_DE_LOS_PERMITIDOS = 10612;
        public static final int EL_ARCHIVO_CONTIENE_DATOS_INCORRECTOS = 10321;
        public static final int LA_CANTIDAD_SERVICIO_PROPORCIONADO_DEBE_SER_MAYOR_A_CERO = 10625;
        public static final int LA_TARIFA_SERVICIO_PROPORCIONADA_DEBE_SER_MAYOR_A_CERO = 10626;
        public static final int LA_ENTIDAD_PERTENECE_SEGURO_REGIMEN_NO_PERMITIDO_PARA_SOLICITUD_SERVICIO = 10129;
    }

    public static class MotivosRedistribucionRubros {
        public static final int AFILIADO_MAYOR_DE_60_ANOS = 1;
        public static final int PAGOS_CON_TRES_PERIODOS_O_MAS_DE_ATRASO = 2;

        private MotivosRedistribucionRubros() {
        }
    }

    public static class DescripcionMotivos {
        public static final String ERROR_INTERNO_DEL_SERVICIO = "ERROR INTERNO DEL SERVICIO, DE PERSISTIR FAVOR CONTACTAR AL ADMINISTRADOR DEL SISTEMA";

        public static final String EXISTEN_DATOS_REQUERIDOS_NO_PROPORCIONADOS = "EXISTEN DATOS REQUERIDOS NO PROPORCIONADOS";
        public static final String TIPO_DE_AJUSTE_NO_ESTA_CATALOGADO = "TIPO DE AJUSTE NO ESTA CATALOGADO";
        public static final String MOTIVO_SEGURO_PROPORCIONADO_NO_CATALOGADO_O_ACTIVO = "EL SEGURO PROPORCIONADO NO SE ENCUENTRA CATALOGADO O ACTIVO";
        public static final String TIPO_INDIVIDUALIZACION_PROPORCIONADO_NO_CATALOGADO_O_ACTIVO = "EL TIPO DE INDIVIDUALIZACION PROPORCIONADO NO SE ENCUENTRA CATALOGADO O ACTIVO";
        public static final String NUMERO_DE_LOTE_PROPORCIONADO_NO_EXISTE = "NUMERO DE LOTE PROPORCIONADO NO EXISTE";
        public static final String NUMERO_DE_LOTE_NO_CORRESPONDE_A_LA_ENTIDAD = "NUMERO DE LOTE NO CORRESPONDE A LA ENTIDAD";
        public static final String NUMERO_DE_LOTE_NO_CORRESPONDE_AL_SERVICIO = "NUMERO DE LOTE NO CORRESPONDE AL SERVICIO";
        public static final String NUMERO_DE_LOTE_PROPORCIONADO_NO_HA_SIDO_PROCESADO = "NUMERO DE LOTE PROPORCIONADO NO HA SIDO PROCESADO";
        public static final String SOLICITUD_MANTENIMIENTO_NO_ESPECIFICA_DATOS = "LA SOLICITUD DE MANTENIMIENTO NO  ESPECIFICA LOS DATOS A ACTUALIZAR";
        public static final String NUMERO_SOL_TRASPASO_NO_EXISTE = "NUMERO DE SOLICITUD DE TRASPASO NO EXISTE";
        public static final String EL_NUMERO_DE_TRASPASO_NO_CORRESPONDE_CON_EL_SEGURO = "EL NUMERO DE TRASPASO NO CORRESPONDE CON EL SEGURO";
        public static final String EL_SERVICIO_ENVIADO_NO_SE_ENCUENTRA_CATALOGADO_Y_ACTIVO = "EL SERVICIO PROPORCIONADO NO ESTA CATALOGADO O ESTA INACTIVO";
        public static final String LA_ENTIDAD_SOLICITA_ACCION_SOBRE_SOLICITUD_TRASPASO_NO_POSEE_TIPO_DE_PARTICIPACION_REQUERIDO = "LA ENTIDAD QUE SOLICITA LA ACCION SOBRE LA SOLICITUD DE TRASPASO NO POSEE EL TIPO DE PARTICIPACION REQUERIDO";
        public static final String NSS_PROPORCIONADO_NO_ES_UN_PARTICIPANTE_DE_LA_SOLICITUD_DE_TRASPASO = "EL NSS PROPORCIONADO NO ES UN PARTICIPANTE DE LA SOLICITUD DE TRASPASO";
        public static final String LA_SOLICITUD_DE_TRASPASO_SE_ENCUENTRA_EN_UN_ESTADO_QUE_NO_PERMITE_REALIZAR_LA_ACCION_SOLICITADA = "LA SOLICITUD DE TRASPASO SE ENCUENTRA EN UN ESTADO QUE NO PERMITE REALIZAR LA ACCION SOLICITADA";
        public static final String EL_CIUDADANO_SE_ENCUENTRA_PENDIENTE_O_ES_UN_AFILIADO_ACTIVO_NO_COTIZANTE = "EL CIUDADANO SE ENCUENTRA PENDIENTE O ES UN AFILIADO ACTIVO NO COTIZANTE";
        public static final String EL_AFILIADO_PERTENECE_A_LA_MISMA_ARS_SOLICITANTE = "EL AFILIADO PERTENECE A LA MISMA ARS SOLICITANTE";
        public static final String IMPEDIMENTO_NO_ESTA_CATALOGADO_O_ACTIVO = "IMPEDIMENTO NO ESTA CATALOGADO O ACTIVO";
        public static final String EXISTE_UNA_NOTIFICACION_DE_IMPEDIMENTO_PENDIENTE_PARA_EL_AFILIADO_EN_LA_SOLICITUD_DE_TRASPASO = "EXISTE UNA NOTIFICACION DE IMPEDIMENTO PENDIENTE PARA EL AFILIADO EN LA SOLICITUD DE TRASPASO";
        public static final String LA_ACCION_SOLICITADA_SOBRE_LA_SOLICITUD_DE_TRASPASO_SE_ENCUENTRA_FUERA_DEL_PLAZO_ESTABLECIDO = "LA ACCION SOLICITADA SOBRE LA SOLICITUD DE TRASPASO SE ENCUENTRA FUERA DEL PLAZO ESTABLECIDO";
        public static final String NUMERO_SOLICITUD_SERVICIO_NO_EXISTE = "EL NUMERO DE SOLICITUD DE SERVICIO PROPORCIONADO NO EXISTE";
        public static final String TIPO_DOCUMENTO_NO_DISPONIBLE = "TIPO DE DOCUMENTO NO DISPONIBLE PARA LA SOLICITUD DE SERVICIO";
        public static final String SOLICITUD_SERVICIO_NO_PERTENECE_ENTIDAD = "LA SOLICITUD DE SERVICIO NO PERTENECE A ESTA ENTIDAD";
        public static final String ID_SERVICIO_PROPORCIONADO_NO_CORRESPONDE_SERVICIO_SISTEMA = "EL NUMERO IDENTIFICADOR DEL SERVICIO PROPORCIONADO NO SE ENCUENTRA ASOCIADO AL SERVICIO DEL SISTEMA SOLICITADO";
        public static final String SOLICITUD_DE_GESTION_DE_CONTACTO_SE_ENCUENTRA_VENCIDA = "LA SOLICITUD DE GESTION DE CONTACTO SE ENCUENTRA VENCIDA";
        public static final String EXISTEN_REGISTROS_EN_EL_INTERCAMBIO_DE_INFORMACION_QUE_NO_CUMPLIERON_CON_LA_REGLAS_DE_NEGOCIO_ESTABLECIDAS = "EXISTEN REGISTROS EN EL INTERCAMBIO DE INFORMACION QUE NO CUMPLIERON CON LAS REGLAS DE NEGOCIO ESTABLECIDAS";
        public static final String EL_ESTADO_DE_INDIVIDUALIZACION_DE_CAPITA_NO_SE_ENCUENTRA_CATALOGADO_O_SE_ENCUENTRA_INACTIVO = "EL ESTADO DE INDIVIDUALIZACION DE CAPITA NO SE ENCUENTRA CATALOGADO O SE ENCUENTRA INACTIVO";
        public static final String LA_ENTIDAD_PERTENECE_SEGURO_REGIMEN_NO_PERMITIDO_PARA_SOLICITUD_SERVICIO = "LA ENTIDAD PROPORCIONADA PERTENECE A UN SEGURO Y/O REGIMEN NO PERMITIDO PARA LA SOLICITUD DE SERVICIO";

        private DescripcionMotivos() {
        }
    }

    /**
     * Seguros del Sistema
     *
     * @author
     */
    public static class Seguros {
        /**
         * SEGURO DE VIDA, DISCAPACIDAD Y SOBREVIVENCIA (1)
         */
        public static final short ID_SEGURO_DE_PENSIONES = 1;
        /**
         * SEGURO FAMILIAR DE SALUD (2)
         */
        public static final short ID_SEGURO_DE_SALUD = 2;
        /**
         * SEGURO DE RIESGOS LABORALES (3)
         */
        public static final short ID_SEGURO_DE_RIESGOS_LABORALES = 3;
        /**
         * FONAMAT (4)
         */
        public static final short ID_SEGURO_FONAMAT = 4;
        /**
         * ESTANCIAS INFANTILES (5)
         */
        public static final short ID_SEGURO_DE_ESTANCIAS_INFANTILES = 5;

        private Seguros() {
        }
    }

    public static class DescripcionSeguros {
        public static final String DESC_SEGURO_DE_PENSIONES = "SEGURO DE PENSIONES";
        public static final String DESC_SEGURO_DE_SALUD = "SEGURO FAMILIAR DE SALUD";
        public static final String DESC_SEGURO_DE_RIESGOS_LABORALES = "SEGURO DE RIESGOS LABORALES";

        private DescripcionSeguros() {
        }
    }

    public static class Regimenes {
        public static final short CONTRIBUTIVO = 1;
        public static final short SUBSIDIADO = 2;
        public static final short PENSIONADOS = 3;
        public static final short TRABAJADORES_DOMESTICOS = 4;

        private Regimenes() {
        }
    }

    public static class HandlersNodes {
        public static final String HANDLER_DIRECCION_CLIENTE = "DIRECCION_CLIENTE";
        public static final String HANDLER_CODIGO_USUARIO = "CODIGO_USUARIO";
        public static final String HANDLER_DATOS_USUARIO = "DATOS_USUARIO";
    }

    public static class Entidades {
        public static final int ENTIDAD_UNIPAGO = 1006;
        public static final int SISALRIL = 1003;
        public static final int REQUIERE_CONFIRMACION = 1;
        public static final int NO_REQUIERE_CONFIRMACION = 0;
        public static final int TSS = 1002;
    }

    public static class TipoLote {
        public static final String LOTE_SERVICIO_INTERNO = "SI";
        public static final String LOTE_SERVICIO_WEB = "WS";
        public static final String LOTE_SERVICIO_ARCHIVO = "AR";
    }

    public static class EstadoLote {
        public static final String ESTADO_LOTE_ARCHIVO_GENERADO = "AG";
        public static final String ESTADO_LOTE_PROCESADO_CORRECTAMENTE = "PC";
        public static final String ESTADO_LOTE_PROCESADO_ERRORES = "PE";
        public static final String ESTADO_LOTE_VALIDADO_ESTRUCTURAL = "VE";
        public static final String ESTADO_LOTE_ERROR_VALIDACION = "EV";
        public static final String ESTADO_LOTE_RECHAZADO = "RE";
    }

    public static class AsuntosNotificacion {
        public static final String ASUNTO_CREACION_SERVICIO = "CREACION SERVICIO DEL SISTEMA";
        public static final String ASUNTO_ALTA_AGENTES = "Alta";
        public static final String ASUNTO_MANTENIMIENTO_PROMOTOR = "Respuesta Solicitud de Mantenimiento de Agentes Promotores y Representantes";
        public static final String ASUNTO_RESULTADO_INDIVIDUALIZACION = "RESULTADO PROCESO INDIVIUDALIZACION DE APORTES";
        public static final String ASUNTO_DISPONIBILIDAD_INDIVIDUALIZACION = "DISPONIBILIDAD DE INDIVIDUALIZACION";
        public static final String ASUNTO_BAJA_AGENTE = "Baja";
        public static final String ASUNTO_REPRESENTANTE_AGENTE = "Representante";
        public static final String ASUNTO_PROMOTOR_AGENTE = "Promotor";
        public static final String ASUNTO_NOTIFICACION_INTERNA_CONCENTRACION_DE_PAGOS = "Resultados Proceso Concentraci�n de Pagos";
        public static final String ASUNTO_RESULTADO_SOLICITUD_AFILIACION = "Resultado de la solicitud de afiliaci�n";
        public static final String ASUNTO_NOTIFICACION_VALIDACION_NOMINA = "Validacion Contra la N�mina";
        public static final String ASUNTO_GESTIONAR_GRUPO_SERVICIOS = "Creaci�n Grupo de Servicios del Sistema";
        public static final String ASUNTO_GESTIONAR_CONTACTOS = "Solicitud de Confirmaci�n de Asignaci�n de Grupos de Servicios";
        public static final String ASUNTO_CREACION_CONTACTOS = "Creaci�n Contacto de Cliente";
        public static final String ASUNTO_CREACION_USUARIO = "Creaci�n Usuario del Sistema";
        public static final String ASUNTO_CERTIFICACION_TRASPASO = "Servicio CERTIFICAR TRASPASO EN EL SEGURO DE PENSIONES concluido";
    }

    public static class TipoEntrega {
        public static final String PARCIAL = "P";
        public static final String TOTAL = "T";
    }

    public static class TipoEntregaBeneficio {
        public static final short SOBREVIVENCIA = 2;
        public static final short DISCAPACIDAD = 3;

    }

    /**
     * ID's de los servicios de sistema del repositorio SERVICIO_SISTEMA
     *
     * @author
     */
    public static class Servicios {

        public static final int PUBLICAR_INFORMACION_MASIVA = 13;
        public static final int GENERAR_ENTRADA_CONTABLE = 469;
        public static final int GENERAR_ENTRADA_CONTABLE_DE_CONCENTRACION = 471;
        public static final int GENERAR_ENTRADA_CONTABLE_DE_DISPERSION = 473;
        public static final int GENERAR_ENTRADA_CONTABLE_DE_RECAUDACION = 470;
        public static final int GENERAR_ENTRADA_CONTABLE_DE_ESPECIALIZACION = 472;
        public static final int GENERAR_CARTERA_AFILIADOS_REGIMEN_PLAN_PILOTO_TRABAJADORES_DOMESTICO_SFS = 758;
        public static final int GENERAR_CARTERA_AFILIADOS_REGIMEN_PLAN_PILOTO_TRABAJADORES_DOMESTICO_SP = 759;
        public static final int VALIDAR_VIGENCIA_DE_REPRESENTANTES_EN_EL_SFS = 500;
        public static final int CONSULTAR_SOLICITUDES_MANT_AGENTE_FECHA = 491;
        public static final int VALIDAR_PROXIMO_VENCIMIENTO_ESTADISTICA_INFORMACION = 735;
        public static final int NOTIFICAR_LOTES_PENDIENTES_DE_PROCESAR = 743;


        /**
         * AFILIACION (14)
         */
        public static final int AFILIACION = 14;
        public static final int SERVICIO_AFILIACION_VOLUNTARIA_AL_REGIMEN_CONTRIBUTIVO_SALUD = 16;
        public static final int SERVICIO_AFILIACION_VOLUNTARIA_AL_REGIMEN_SUBSIDIADO_SALUD = 17;
        public static final int SERVICIO_AFILIACION_VOLUNTARIA_AL_REGIMEN_PENSIONADOS_SALUD = 246;
        public static final int AFILIACION_AUTOMATICA = 18;
        public static final int AFILIACION_AUTOMATICA_AL_SEGURO_DE_PENSIONES = 19;
        public static final int AFILIACION_AUTOMATICA_AL_REGIMEN_CONTRIBUTIVO_DEL_SEGURO_FAMILIAR_DE_SALUD = 20;
        public static final int VALIDACION_CONTRA_EL_MAESTRO_DE_CIUDADANOS = 21;
        public static final int VALIDACION_CONTRA_NOMINA = 24;
        public static final int VALIDACION_CONTRA_NOMINA_TITULARES_CONTRIBUTIVO_SFS = 25;
        public static final int PROCESAR_ARCHIVOS_RECIBIDOS = 33;
        public static final int GENERACION_DE_ARCHIVOS = 35;
        public static final int GESTION_DE_APORTES_INDIVIDUALIZADOS = 40;
        public static final int GESTION_APORTES_INDIVIDUALIZADOS_SEGURO_PENSIONES = 41;
        public static final int GESTION_APORTES_INDIVIDUALIZADOS_SEGURO_RIESGOS_LABORALES = 42;
        public static final int SERVICIO_INDIVIDUALIZACION_APORTES = 44;
        public static final int SERVICIO_PREINDIVIDUALIZACION_APORTES_SEGURO_PENSIONES = 45;
        public static final int SERVICIO_PREINDIVIDUALIZACION_APORTES_SEGURO_RIESGOS_LABORALES = 46;
        public static final int SERVICIO_PREINDIVIDUALIZACION_APORTES_SEGURO_FAMILIAR_SALUD = 47;
        public static final int CONFIRMACION_AUTOMATICA_APORTES_DISPERSAR = 48;
        public static final int GESTIONAR_GRUPO_ROLES = 49;
        public static final int GESTIONAR_USUARIOS_DEL_SISTEMA = 50;
        public static final int GESTIONAR_CONTACTOS_DEL_SISTEMA = 51;
        public static final int MODIFICAR_DATOS_SEGURIDAD_USUARIO = 52;
        public static final int AFILIACION_VOLUNTARIA_DEPENDIENTE_REGIMEN_CONTRIBUTIVO_SEGURO_FAMILIAR_SALUD = 53;
        public static final int AFILIACION_VOLUNTARIA_DEPENDIENTE_REGIMEN_SUBSIDIADO_SEGURO_FAMILIAR_SALUD = 54;
        public static final int AFILIACION_VOLUNTARIA_DEPENDIENTE_REGIMEN_PENSIONADOS_SEGURO_FAMILIAR_SALUD = 233;
        public static final int AFILIACION_AUTOMATICA_DEPENDIENTES_ADICIONALES = 55;
        public static final int VALIDACION_CONTRA_NOMINA_DEPENDIENTE_ADICIONALES_CONTRIBUTIVO_SFS = 56;
        public static final int VALIDACION_CONTRA_NOMINA_DEPENDIENTES_SUBSIDIADO = 57;
        public static final int VALIDACION_CONTRA_NOMINA_TITULARES_SUBSIDIADO_SFS = 58;
        public static final int VALIDACION_CONTRA_NOMINA_DEPENDIENTES_REGIMEN_PENSIONADO_SFS = 461;
        public static final int VALIDAR_AFILIADOS_NO_COTIZANTES_EN_EL_REGIMEN_CONTRIBUTIVO_DEL_SFS = 462;
        public static final int VALIDACION_CONTRA_NOMINA_TITULARES_REGIMEN_PENSIONADO_SFS = 87;
        public static final int NOTIFICAR_CAMBIOS_EN_LA_AFILIACION = 483;
        public static final int GESTIONAR_ENTIDADES_SOLICITANTES_DE_MANTENIMIENTOS_DE_CUENTA = 632;
        public static final int VALIDAR_AFILIACIONES_DUP = 689;

        /**
         * VALIDAR VENCIMIENTO DE DOCUMENTOS EN SOLICITUDES DE AFILIACION (C�digo: 577)
         */
        public static final int VALIDAR_VENCIMIENTO_DE_DOCUMENTOS_EN_SOLICITUDES_DE_AFILIACION = 577;

        /**
         * VALIDAR VENCIMIENTO DE DOCUMENTOS EN SOLICITUDES DE NOVEDAD (C�digo: 578)
         */
        public static final int VALIDAR_VENCIMIENTO_DE_DOCUMENTOS_EN_SOLICITUDES_DE_NOVEDAD = 578;


        /**
         * CONSULTAR RESPUESTA DE SOLICITUD DE AFILIACION POR LOTE (Codigo: 60)
         */
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_DE_AFILIACION_POR_LOTE = 60;
        public static final int CONSULTAR_CAMBIOS_EN_AFILIACION_DE_TITULARES_POR_FECHA_Y_SERVICIO = 73;
        public static final int CONSULTAR_RESPUESTA_NOTIFICACION_RECEPCION_PAGO_LOTE = 81;
        public static final int CONSULTAR_RESUMEN_NOTIFICACION_INDIVIDUALIZACION_APORTES_FECHA = 84;
        public static final int CONSULTAR_RESPUESTA_NOTIFICACION_RECEPCION_PAGO_NUMERO_PAGO = 82;
        public static final int CONFIRMACION_AUTOMATICA_APORTES_DISPERSAR_PENSIONES = 94;
        public static final int CONFIRMACION_AUTOMATICA_APORTES_DISPERSAR_CONTRIBUTIVO = 95;
        public static final int CONFIRMACION_AUTOMATICA_APORTES_DISPERSAR_RIESGO_LABORALES = 96;
        public static final int CONSULTA_INST_MOV_FONDOS = 101;
        public static final int CONSULTA_INDIVIDUALIZACION = 102;
        public static final int CONSULTA_DE_CONFIRMACION_DE_APORTES_INDIVIDUALIZADOS = 104;
        public static final int CONSULTA_AFILIACION_SEGURO_PENSIONES = 107;
        public static final int CONSULTA_AFILIACION_SEGURO_FAMILIAR_SALUD = 108;
        public static final int ESPECIALIZACION_CUENTAS = 128;
        public static final int ESPECIALIZACION_CUENTAS_REGULAR = 480;
        public static final int ESPECIALIZACION_CUENTAS_REZAGOS_AUTOMATICA = 481;
        public static final int ESPECIALIZACION_CUENTAS_REZAGOS_VALIDACION_CONTRA_NOMINA = 517;

        public static final int GENERAR_CAPITA_POR_PAGAR_AL_SEGURO_FAMILIAR_DE_SALUD = 115;
        public static final int GENERAR_CAPITA_POR_PAGAR_AL_SEGURO_SALUD_CONTRIBUTIVO = 116;
        public static final int ENVIO_DOCUMENTOS = 127;
        public static final int NOTIFICACION_INDIVIDUALIZACION_APORTES_SEGURO_SALUD = 147;
        public static final int CONSULTAR_CAPITAS_POR_PAGAR_RECHAZADOS_POR_RANGO_DE_FECHA = 120;
        public static final int REVISION_DE_DOCUMENTOS_REQUERIDOS = 140;
        public static final int DISPERSION_DE_APORTES = 130;
        public static final int DISPERSION_DE_APORTES_AL_SEGURO_DE_PENSIONES = 131;
        public static final int DISPERSION_DE_APORTES_AL_SEGURO_DE_RIESGO_LABORALES = 132;
        public static final int DISPERSION_DE_APORTES_AL_SEGURO_FAMILIAR_DE_SALUD = 133;
        public static final int NOTIFICACION_INDIVIDUALIZACION_APORTES = 27;
        public static final int CONCENTRACION_FONDO_PADRE = 29;
        public static final int RECIBIR_INFORMACION_MASIVA = 117;
        public static final int INTERCAMBIO_INFORMACION_MASIVA = 37;
        public static final int RESPUESTA_ENVIO_CAPITAS_SFS = 119;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_AL_SDSS = 121;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_AL_REGIMEN_CONTRIBUTIVO_DEL_SEGURO_FAMILIAR_DE_SALUD = 122;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_AL_REGIMEN_SUBSIDIADO_DEL_SEGURO_FAMILIAR_DE_SALUD = 123;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_AL_SEGURO_DE_PENSIONES = 124;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_A_ESTANCIAS_INFANTILES = 134;
        public static final int GENERAR_CARTERA_DE_AFILIADOS_REGIMEN_DE_PENSIONADOS_DEL_SEGURO_FAMILIAR_DE_SALUD = 448;
        public static final int ASIGNACION_ENTIDAD_ADMINISTRADORA_APORTES_ADELANTADOS_SEGURO_FAMILIAR_DE_SALUD = 153;
        public static final int CONSULTA_DE_AJUSTES_EN_FACTURAS = 105;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_GESTION_INDIVIDUALIZACION_APORTES_NUMERO_LOTE = 106;
        public static final int CONSULTA_DE_RESUMEN_PAGOS_FECHA = 99;
        public static final int AFILIACION_AUTOMATICA_CIUDADANO_ACTIVOS_NOMINA_EXCEPCION_PENSIONES = 100;
        public static final int CONSULTA_DE_NOMINA_NSS = 108;
        public static final int GESTION_AGENTES = 36;
        public static final int VALIDACION_PAGOS_RECIBIDOS_CONTRA_FACTURAS_AUTORIZADAS = 159;
        public static final int GESTION_CAPITAS_INDIVIDUALIZADAS_SEGURO_FAMILIAR_SALUD = 149;
        public static final int VALIDAR_CAPITAS_POR_PAGAR_VIGENTES = 163;
        public static final int CONSULTAR_RESPUESTA_SOLICITUD_GESTION_INDIVIDUALIZACION_CAPITAS_NUMERO_LOTE = 164;
        public static final int INDIVIDUALIZAR_CAPITAS_TITULARES_REGIMEN_CONTRIBUTIVO_DEL_SEGURO_FAMILIAR_SALUD = 151;
        public static final int INDIVIDUALIZAR_CAPITAS_DEP_ADICIONAL_REGIMEN_CONTRIBUTIVO_DEL_SEGURO_FAMILIAR_SALUD = 152;
        public static final int CONSULTAR_RESUMEN_DE_NOTIFICACION_DE_INDIVIDUALIZACION_DE_CAPITAS_POR_FECHA = 154;
        public static final int CONSULTAR_DETALLE_DE_INDIVIDUALIZACIONES_DE_CAPITAS_POR_NUMERO = 155;
        public static final int NOTIFICACION_DE_INDIVIDUALIZACION_DE_CAPITAS_AL_REGIMEN_CONTRIBUTIVO_DEL_SEGURO_FAMILIAR_DE_SALUD = 148;
        public static final int INDIVIDUALIZAR_CAPITAS_NUEVOS_DEPENDIENTES_DIRECTOS = 162;
        public static final int CONSULTAR_CARTERA_DE_AFILIADOS_POR_PERIODO = 113;
        public static final int CONSULTAR_RESPUESTA_SOLICITUD_MANTENIMIENTO_SOLICITUD_TRASPASO_POR_LOTE = 184;
        public static final int SOLICITAR_MANTENIMIENTO_A_LA_SOLICITUD_DE_TRASPASO_AFILIADOS_AL_SEGURO_DE_PENSIONES = 168;
        public static final int CERTIFICAR_TRASPASO_EN_EL_SEGURO_DE_PENSIONES = 173;
        public static final int CONSULTAR_DETALLE_VALORES_A_RECIBIR_ENTIDAD_DESTINO_TRASPASO_POR_FECHA = 187;
        public static final int CONSULTA_NOTIFICACION_IMPEDIMENTOS_SOLICITUDES_TRASPASO_FECHA = 183;
        public static final int CONSULTAR_RESPUESTA_NOTIFICACION_TRASPASO_DE_VALORES_DE_AFILIADOS_AL_SEGURO_DE_PENSIONES_POR_LOTE = 188;
        public static final int SOLICITAR_TRASPASO_AFILIADOS_AL_SEGURO_DE_PENSIONES = 165;
        public static final int TRASPASO_DE_VALORES_AFILIADOS_AL_SEGURO_DE_PENSIONES = 172;
        public static final int CONSULTAR_COMPENSACIONES_DE_SALDOS_DE_TRASPASOS_DEL_SEGURO_DE_PENSIONES_POR_CICLO_TRASPASO = 200;
        public static final int ASIGNAR_AUTOMATICAMENTE_ENTIDAD_DESTINO_SOLICITUD_DE_TRASPASO_SEGURO_DE_PENSIONES = 170;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO = 169;
        public static final int CIERRE_DE_TRASPASO_DE_VALORES = 175;
        public static final int CANCELAR_SOLICITUD_DE_TRASPASO = 167;
        public static final int CERRAR_TRASPASO_PENSIONES = 176;
        public static final int GENERAR_COMPENSACION_SALDOS_TRASPASAR_SEGURO_PENSIONES = 174;
        public static final int DISPERSION_APORTES_TRASPASO_SEGURO_PENSIONES = 190;
        public static final int SOLICITAR_TRASPASO_ORDINARIO_AFILIADOS_SEGURO_FAMILIAR_SALUD = 166;
        public static final int CERRAR_TRASPASO_ORDINARIO_DE_AFILIADOS_AL_SEGURO_FAMILIAR_DE_SALUD = 465;
        public static final int SOLICITAR_TRASPASO_UNIFICACION_AFILIADOS_SEGURO_FAMILIAR_SALUD = 201;
        public static final int CERRAR_TRASPASO_UNIFICACION_DE_AFILIADOS_AL_SEGURO_FAMILIAR_DE_SALUD = 466;
        public static final int NOTIFICAR_IMPEDIMENTOS_TRASPASO = 177;
        public static final int CONSULTAR_CAMBIOS_SOLICITUDES_TRASPASO_PENSIONES_POR_FECHA = 179;
        public static final int CONSULTAR_CAMBIOS_EN_SOLICITUDES_DE_TRASPASO_AL_SEGURO_FAMILIAR_DE_SALUD_POR_FECHA = 171;
        public static final int CONSULTAR_RESPUESTA_CANCELACION_SOLICITUDES_TRASPASO_POR_LOTE = 186;
        public static final int NOTIFICAR_ACCION_SOBRE_IMPEDIMENTOS_EN_SOLICITUDES_DE_TRASPASO = 182;
        public static final int CONSULTAR_RESPUESTA_ACCION_SOBRE_IMPEDIMENTOS_SOLICITUD_TRASPASO_POR_LOTE = 185;
        public static final int NOTIFICAR_ACCION_SOBRE_SOLICITUDES_TRASPASO_VENCIDAS_SEGURO_PENSIONES = 204;
        public static final int CONSULTAR_RESPUESTA_ACCION_SOLICITUDES_TRASPASO_VENCIDAS_PENSIONES_LOTE = 205;
        public static final int NOTIFICAR_ACCION_SOBRE_SOLICITUDES_TRASPASO_VENCIDAS_SEGURO_ACLARACION_PENSIONES = 206;
        public static final int CONSULTAR_RESPUESTA_ACCION_SOLICITUDES_TRASPASO_PENSIONES_VENCIDAS_ACLARACION_LOTE = 207;
        public static final int CERTIFICAR_TRASPASO_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 202;
        public static final int SOLICITAR_TRASPASO_AFILIADOS_AL_SDSS = 193;
        public static final int CONSULTA_DE_SOLICITUDES_DE_TRASPASO_VENCIDAS = 181;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO_EN_ACLARACION = 211;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO_EN_ESPERA_DE_PAREJA = 212;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO_EN_ESPERA_CARGA_DOCUMENTO = 213;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO_PENDIENTE_AUTORIZACION_SUPERVISORA = 214;
        public static final int VALIDAR_VENCIMIENTO_A_SOLICITUD_DE_TRASPASO_PENDIENTE_AUTORIZACION_ADMINISTRADORA = 215;
        public static final int NOTIFICAR_ACCION_SOBRE_SOLICITUDES_TRASPASO_PENSIONES_VENCIDAS_ACLARACION_SERVICIO_ID = 206;
        public static final int CONSULTA_DE_AFILIACION_PARA_TRASPASO_UNIFICACION_POR_IDENTIFICACION_CIUDADANO = 217;
        public static final int CONSULTA_SOLICITUDES_TRASPASO_POR_FECHA_EFECTIVIDAD = 218;
        public static final int CONSULTAR_HISTORICO_APORTES_POR_CIUDADANO = 178;
        public static final int CONSULTAR_RESPUESTA_ACCION_SUPERVISORA_SOLICITUDES_TRASPASO_SALUD_PENDIENTES_AUTORIZACION_LOTE = 209;
        public static final int NOTIFICAR_ACCION_SUPERVISORA__SOLICITUDES_TRASPASO_SALUD_PENDIENTES_AUTORIZACION = 208;
        public static final int NOTIFICAR_ACCION_ADMINISTRADORA_SOBRE_SOLICITUDES_TRASPASO_SALUD_PENDIENTES_AUTORIZACION = 196;
        public static final int CONSULTA_DE_TRASPASOS_DE_VALORES_EN_EL_SEGURO_DE_PENSIONES = 220;
        public static final int RESPUESTA_SOLICITUDES_ASIGNACION_NSS = 142;
        public static final int CERRAR_TRASPASO_AFILIADOS_SEGURO_FAMILIAR_DE_SALUD = 219;
        public static final int SOLICITAR_TRASPASO_POR_EXCEPCION_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 232;
        public static final int CERRAR_TRASPASO_EXCEPCION_DE_AFILIADOS_AL_SEGURO_FAMILIAR_DE_SALUD = 467;
        public static final int CONSULTAR_SOLICITUDES_DE_TRASPASO_SALUD_PENDIENTES_DE_AUTORIZACION_DE_LA_SUPERVISORA = 210;
        public static final int CONSULTAR_POR_SOLICITUD_DE_SERVICIO = 189;
        public static final int CONSULTA_DE_RESULTADOS_DE_TRASPASOS_DE_VALORES_EN_EL_SEGURO_DE_PENSIONES = 224;
        public static final int RESPUESTA_ENVIO_SOLICITUDES_DEPENDIENTES_DIFERENCIAS_APELLIDOS_RESPECTO_TITULAR_CONYUGE = 143;
        public static final int CONSULTA_NOTIFICACION_CAPITAS_INDIVIDUALIZADOS = 225;
        public static final int RESETEAR_CONTRASENA_DE_USUARIO = 92;
        public static final int RECUPERAR_CONTRASENA_DE_USUARIO = 93;
        public static final int CONSULTAR_INSTRUCCIONES_DE_MOVIMIENTO_DE_FONDO_DE_CONCENTRACION_POR_FECHA_Y_SERVICIO = 88;
        public static final int CONSULTAR_RESPUESTA_DE_AFILIACION_POR_NUMERO_DE_SOLICITUD = 61;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_DE_AFILIACION_DE_DEPENDIENTES_POR_NUMERO_DE_SOLICITUD = 66;
        public static final int CONSULTAR_DETALLE_DE_NOTIFICACION_DE_INDIVIDUALIZACION_POR_NUMERO = 86;
        public static final int CONSULTAR_CAMBIOS_EN_LA_AFILIACION_DE_DEPENDIENTES_A_ESTANCIA_INFANTILES_POR_FECHA_Y_SERVICIO = 139;
        public static final int CONSULTAR_SOLICITUDES_DE_TRASPASO_CANCELADAS_EN_SEGURO_FAMILIAR_DE_SALUD_POR_FECHA = 239;
        public static final int SOLICITAR_TRASPASO_POR_EXCEPCION_EN_EL_SFS = 232;
        public static final int CONSULTAR_REVERSOS_DE_INDIVIDUALIZACIONES_DE_CAPITAS_EN_TRASPASO_POR_EXCEPCION_POR_FECHA = 223;
        public static final int CONSULTAR_COMPENSACION_DE_INDIVIDUALIZACION_DE_CAPITAS_POR_FECHA = 242;
        public static final int CONSULTAR_DISPONIBILIDAD_DE_AFILIACION_DE_CIUDADANO_POR_SEGURO = 243;
        public static final int CONSULTAR_CIUDADANO_POR_IDENTIFICACION = 244;
        public static final int CONSULTAR_AFILIACION_DE_CIUDADANO_AL_SDSS_POR_IDENTIFICACION = 248;
        public static final int GENERAR_COMPENSACION_SALDOS_REVERSOS_CAPITA_DISPERSADO_SEGURO_FAMILIAR_SALUD = 245;
        public static final int CONSULTAR_RESPUESTA_SOLICITUDES_DE_TRASPASO_POR_EXCEPCION_POR_LOTE = 234;
        public static final int CONSULTAR_SOLICITUDES_DE_TRASPASO_RECIBIDAS_EN_EL_SFS_POR_FECHA = 247;
        public static final int CONSULTA_DE_TRASPASOS_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 249;
        public static final int SOLICITAR_TRASPASO_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 256;
        public static final int GENERAR_SOLICITUD_DE_NOTIFICACION = 271;
        public static final int GESTIONAR_ROLES = 252;
        public static final int GESTIONAR_CATEGORIAS_DE_CUENTAS = 627;
        public static final int GESTIONAR_CATEGORIAS_DE_CONCEPTOS_DE_CUENTAS = 629;
        public static final int GESTIONAR_CONCEPTOS_DE_CUENTAS = 628;
        public static final int GESTIONAR_TIPOS_DE_CUENTAS = 635;
        public static final int GESTIONAR_CATALOGO_RANGOS_FORMULARIOS_DE_AFILIACION = 674;
        public static final int GESTIONAR_CATALOGO_NOMINA_EXCEPCION = 670;

        public static final int GESTIONAR_EST_SOL_MAN_CUENTAS = 630;
        public static final int VALIDAR_VENCIMIENTO_DE_ASIGNACIONES_Y_SOLICITUDES_DE_ACCESO_LOGICO = 251;
        public static final int VALIDAR_VENCIMIENTO_DE_USUARIO = 273;
        public static final int VALIDA_PROXIMO_VENCIMIENTO_CONTRASENA_USUARIO = 274;
        public static final int VALIDA_VENCIMIENTO_CONTRASENA_USUARIO = 275;
        public static final int VALIDAR_ASIGNACIONES_DE_GRUPOS_ROLES_VENCIDA = 276;
        public static final int VALIDA_VENCIMIENTO_SOLICITUDES_GESTION_CONTACTOS = 277;
        public static final int REACTIVAR_USUARIO = 278;
        public static final int DESASOCIAR_GRUPOS_DE_ROLES_A_USUARIO = 279;
        public static final int ASOCIAR_GRUPO_DE_ROLES_A_USUARIO = 284;
        public static final int COMPLETAR_ALTA_USUARIO = 285;
        public static final int COMPLETAR_ALTA_DE_CONTACTO = 286;
        public static final int COMPLETAR_CAMBIO_DE_CONTRASENA = 287;
        public static final int CONSULTA_DE_PAGOS_POR_BANCOS = 263;
        public static final int CONSULTA_DE_REVERSOS_INDIVIDUALIZACION_DE_CAPITAS_POR_FECHA = 241;
        public static final int CONSULTA_DE_REFERENCIAS = 264;
        public static final int CONSULTA_DE_PAGOS_POR_SEGURO = 265;
        public static final int CONSULTA_DE_FACTURAS_AUTORIZADAS = 262;
        public static final int VALIDAR_FACTURAS_PAGADAS_CON_SUBSIDIO = 281;
        public static final int CONSULTAR_FACTURAS_PAGADAS_CON_SUBSIDIOS = 288;
        public static final int CONSULTAR_RESULTADO_PROCESAMIENTO_SOLICITUD_SUBSIDIO = 289;
        public static final int CONSULTA_DE_RESPUESTA_SOLICITUD_DE_PAGO_DE_CAPITA_RETROACTIVO_POR_LOTE = 291;
        public static final int SOLICITAR_PAGO_CAPITA_RETROACTIVO = 294;
        public static final int SOLICITAR_PAGO_CAPITA_RETROACTIVO_RECIEN_NACIDO = 293;
        public static final int VALIDAR_DUPLICIDAD_SOL_PAGO_RETRO = 718;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_AFILIACION_DE_DEPENDIENTE_POR_LOTE = 65;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_DE_AFILIACION_DE_DEPENDIENTES_AL_REGIMEN_SUBSIDIADO_DEL_SEGURO_FAMILIAR_DE_SALUD_POR_NUMERO_DE_LOTE = 70;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_DE_AFILIACION_DE_DEPENDIENTES_A_ESTANCIAS_INFANTILES_POR_LOTE = 137;
        public static final int CONSULTAR_RESPUESTA_DE_SOLICITUD_DE_NOVEDAD_POR_LOTE = 304;
        public static final int CONSULTAR_RESPUESTA_PROXIMA_MAYORIA_EDAD = 751;
        public static final int NOVEDAD_VOLUNTARIAS = 226;
        public static final int SOLICITAR_NOVEDAD_DE_CAMBIO_DE_DATOS_DE_AFILIACION = 300;
        public static final int GENERAR_COBERTURA_TEMPORAL_POR_NOVEDADES = 316;
        public static final int ENVIO_SOLICITUDES_ASIGNACION_NSS = 141;
        public static final int ENVIO_SOLICITUDES_NOVEDAD_FALLECIMIENTO_CIUDADANOS = 307;
        public static final int CONSULTAR_CAMBIOS_ESTADO_SOLICITUDES_TRASPASO_SEGURO_PENSIONES_POR_FECHA = 179;
        public static final int CONFIRMAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_AL_SEGURO_DE_PENSIONES = 64;
        public static final int CONFIRMAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_AL_SEGURO_DE_RIESGOS_LABORALES = 68;
        public static final int RECHAZAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_AL_SEGURO_DE_PENSIONES = 71;
        public static final int RECHAZAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_AL_SEGURO_DE_RIESGOS_LABORALES = 70;
        public static final int SOLICITAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_RECHAZADOS_AL_SEGURO_DE_PENSIONES = 455;
        public static final int SOLICITAR_NOTIFICACION_INDIVIDUALIZACION_DE_APORTES_RECHAZADOS_AL_SEGURO_DE_RIESGOS_LABORALES = 69;
        public static final int SERVICIO_112_GENERAR_TRASPASO_AFILIADOS_ACTIVOS_NOMINAS_EXCEPCION_SEGURO_PENSIONES = 112;
        public static final int GESTIONAR_SOLICITUDES_EJECUCION_REPORTES = 532;
        public static final int CANCELAR_SOLICITUDES_EJECUCION_REPORTES = 533;
        public static final int PROCESAR_SOLICITUD_EJECUCION_REPORTE = 530;
        public static final int CANCELAR_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 502;
        public static final int MODIFICAR_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 621;
        public static final int REGISTRAR_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 620;
        public static final int GESTIONAR_USUARIOS_DE_APROBACIONES_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 503;
        public static final int GESTIONAR_SOLICITUD_MANTENIMIENTO_CUENTAS = 619;
        public static final int APROBAR_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 622;
        public static final int REQUERIR_APLICACION_SOLICITUD_DE_MANTENIMIENTO_DE_CUENTA = 625;
        public static final int HABILITAR_APORTES_DE_CIUDADANOS_CON_INDIVIDUALIZACIONES_DE_CAPITAS_POR_COBERTURAS_TEMPORALES_RECHAZADAS = 736;
        public static final int HABILITAR_INDIVIDUALIZACIONES_CAPITAS_COBERTURAS_TEMPORALES_RECHAZADAS = 753;


        /**
         * AFILIACION DE DEPENDIENTES A ESTANCIAS INFANTILES (125)
         */
        public static final int AFILIACION_DE_DEPENDIENTES_A_ESTANCIAS_INFANTILES = 125;
        public static final int CONSULTA_DE_AFILIACION_A_ESTANCIAS_INFANTILES = 296;
        public static final int CONSULTA_DE_CIUDADANOS_ELEGIBLES_PARA_AFILIACION_EN_ESTANCIAS_INFANTILES = 135;
        public static final int CONSULTAR_RESULTADOS_DE_SERVICIOS_AUTOMATICOS_DE_AFILIACION = 72;
        /**
         * CONSULTAR CAMBIOS EN LA AFILIACION DE DEPENDIENTES REGIMEN CONTRIBUTIVO  SEGURO FAMILIAR DE SALUD POR FECHA Y SERVICIO (76)
         */
        public static final int CONSULTAR_CAMBIOS_EN_LA_AFILIACION_DE_DEPENDIENTES_REGIMEN_CONTRIBUTIVO_SEGURO_FAMILIAR_DE_SALUD_POR_FECHA_Y_SERVICIO = 76;
        /**
         * CONSULTAR CAMBIOS EN LA AFILIACION DE DEPENDIENTES REGIMEN SUBSIDIADO SEGURO FAMILIAR DE SALUD POR FECHA Y SERVICIO (79)
         */
        public static final int CONSULTAR_CAMBIOS_EN_LA_AFILIACION_DE_DEPENDIENTES_REGIMEN_SUBSIDIADO_SEGURO_FAMILIAR_DE_SALUD_POR_FECHA_Y_SERVICIO = 79;
        /**
         * SOLICITAR NOVEDAD DE DIVORCIO O SEPARACION EN EL SEGURO FAMILIAR DE SALUD (Codigo: 310)
         */
        public static final int SOLICITAR_NOVEDAD_DE_DIVORCIO_O_SEPARACION_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 310;
        public static final int SOLICITAR_NOVEDAD_DE_CAMBIO_DE_TITULARIDAD_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 303;
        /**
         * CONSULTAR CAMBIOS EN SOLICITUDES DE NOVEDAD POR FECHA (305)
         */
        public static final int CONSULTAR_CAMBIOS_EN_SOLICITUDES_DE_NOVEDAD_POR_FECHA = 305;
        public static final int SOLICITAR_NOVEDAD_DE_BAJA_POR_FALLECIMIENTO_DE_AFILIADOS = 308;
        /**
         * CONSULTAR BAJAS EN AFILIACIONES PROVISIONALES POR ANTIGUEDAD EN EL SEGURO FAMILIAR DE SALUD (330)
         */
        public static final int CONSULTAR_BAJAS_EN_AFILIACIONES_PROVISIONALES_POR_ANTIGUEDAD_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 330;
        /**
         * VALIDAR ANTIGUEDAD DE AFILIACIONES PROVISIONALES EN EL SEGURO FAMILIAR DE SALUD" (Codigo: 311)
         */
        public static final int VALIDAR_ANTIGUEDAD_DE_AFILIACIONES_PROVISIONALES_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 593;
        public static final int VALIDAR_ANTIGUEDAD_DE_AFILIACIONES_PROVISIONALES_EN_EL_SEGURO_PENSIONES = 722;
        public static final int VALIDAR_ANTIGUEDAD_DE_AFILIACIONES_PROVISIONALES_EN_ESPERA_VALIDAR_APORTES_REGIMEN_CONTRIBUTIVO_SFS = 311;
        public static final int VALIDAR_PERDIDA_DE_EMPLEO_DE_AFILIADOS_AL_SEGURO_FAMILIAR_DE_SALUD = 318;
        public static final int SOLICITAR_NOVEDAD_BAJA_AFILIADOS = 323;
        public static final int APLICAR_CAMBIO_DE_TITULARIDAD_EN_NUCLEO_FAMILIAR = 301;
        public static final int VALIDAR_AFILIADOS_COTIZANTES_EN_EL_REGIMEN_SUBSIDIADO_DEL_SFS = 327;
        public static final int VALIDAR_AFILIADOS_COTIZANTES_EN_EL_REGIMEN_PENSIONADO_DEL_SFS = 449;
        public static final int SOLICITAR_NOVEDAD_DE_CAMBIO_DE_DATOS_DEL_CIUDADANO = 332;
        public static final int VALIDAR_MAYORIA_EDAD_DEPENDIENTES_SEGURO_FAMILIAR_SALUD = 158;
        public static final int VALIDAR_MAYORIA_EDAD_AFILIADOS_SEGURO_ESTANCIAS_INFANTILES = 315;
        public static final int VALIDAR_MAYORIA_DE_EDAD_DEPENDIENTES_AFILIADOS_AL_SDSS = 299;
        public static final int CONSULTA_DE_NOVEDADES_AL_SEGURO_FAMILIAR_DE_SALUD = 302;
        public static final int CONSULTA_DE_NOVEDADES_AL_SEGURO_FAMILIAR_DE_PENSIONES = 587;
        public static final int CONSULTA_DE_APORTES_SIN_ASIGNAR = 325;
        public static final int CONSULTAR_INDIVIDUALIZACIONES_CAPITAS_RECHAZADAS_POR_FECHA = 353;
        public static final int NOTIFICACION_DE_INDIVIDUALIZACION_DE_CAPITA_REGIMEN_SUGSIDIADO_DEL_SEGURO_FAMILIAR_SALUD = 345;
        public static final int NOTIFICACION_DE_INDIVIDUALIZACION_DE_CAPITAS_DE_ESTANCIAS_INFANTILES = 346;
        public static final int NOTIFICACION_DE_INDIVIDUALIZCION_DE_CAPITA_DE_FONAMAT = 347;
        public static final int INDIVIDUALIZAR_CAPITAS_POR_COBERTURA_TEMPORAL_DEL_SEGURO_FAMILIAR_SALUD = 336;
        public static final int INDIVIDUALIZAR_CAPITAS_AL_REGIMEN_SUBSIDIADO_DEL_SEGURO_FAMILIAR_DE_SALUD = 356;
        public static final int INDIVIDUALIZAR_CAPITAS_POR_AFILIACIONES_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 450;
        public static final int INDIVIDUALIZAR_CAPITAS_AL_REGIMEN_PENSIONADOS_DEL_SEGURO_FAMILIAR_DE_SALUD = 451;
        /**
         * GESTIONAR AUTOMATICA DE CAPITAS A DISPERSAR AL SEGURO FAMILIAR DE SALUD (Codigo: 150)
         */
        public static final int GESTIONAR_AUTOMATICA_DE_CAPITAS_A_DISPERSAR_AL_SEGURO_FAMILIAR_DE_SALUD = 150;
        /**
         * GENERAR CAPITAS POR PAGAR DE ESTANCIAS INFANTILES (Codigo: 357)
         */
        public static final int GENERAR_CAPITAS_POR_PAGAR_DE_ESTANCIAS_INFANTILES = 357;
        public static final int INDIVIDUALIZAR_CAPITAS_PARA_ATENCIONES_MEDICAS_POR_ACCIDENTES_DE_TRANSITO = 374;
        /**
         * INDIVIDUALIZAR CAPITAS A ESTANCIAS INFANTILES (Codigo: 362)
         */
        public static final int INDIVIDUALIZAR_CAPITAS_A_ESTANCIAS_INFANTILES = 362;
        public static final int CONSULTA_DE_INDIVIDUALIZACIONES_DE_CAPITA_POR_CIUDADANO = 341;
        public static final int CONSULTA_DE_APORTES_DEL_SEGURO_DE_PENSIONES = 335;
        public static final int VALIDAR_CIUDADANOS_CANCELADOS = 314;
        /**
         * GENERAR CONSOLIDADO DE DISPERSION DE CAPITAS (Codigo:363)
         */
        public static final int GENERAR_CONSOLIDADO_DE_DISPERSION_DE_CAPITAS = 363;


        /**
         * NOTIFICACION DE INDIVIDUALIZACION DE CAPITAS AL SDSS (Codigo:344)
         */
        public static final int NOTIFICACION_DE_INDIVIDUALIZACION_DE_CAPITAS_AL_SDSS = 344;

        /**
         * DISPERSION DE CAPITAS (Codigo: 358).
         */
        public static final int DISPERSION_DE_CAPITAS = 358;
        public static final int ACTUALIZAR_NOTIFICACIONES_DE_INDIVIDUALIZACION_DE_AFILIADOS_POR_SEGURO = 385;

        /**
         * CONSULTA DE APORTES DISPERSADOS POR ENTIDAD (Codigo: 390).
         */
        public static final int CONSULTA_DE_APORTES_DISPERSADOS_POR_ENTIDAD = 390;
        public static final int CONFIRMAR_NOTIFICACION_INDIVIDUALIZACION_CAPITA = 379;
        public static final int RECHAZAR_NOTIFICACION_INDIVIDUALIZACION_CAPITAS = 380;
        public static final int SOLICITAR_NOTIFICACION_INDIVIDUALIZACION_CAPITAS_RECHAZADAS = 381;
        public static final int CALCULAR_COTIZACIONES_DE_AFILIADOS_POR_SEGURO = 378;
        public static final int CANCELAR_ARCHIVOS_GENERADOS = 383;
        public static final int ENVIO_SOLICITUDES_DEPENDIENTES_DIFERENCIA_APELLIDO_TITULAR_CONYUGE = 144;
        public static final int VALIDAR_DEPENDIENTES_DIRECTOS_PENDIENTE_DE_AFILIACION_DEFINITIVA_SFS = 237;
        public static final int CONSULTA_AFILIADOS_NO_ELEGIBLES_ALTA_TRASPASO = 236;
        /**
         * SOLICITAR TRASPASO DE AFILIADO AL SEGURO DE ESTANCIA INFANTIL (Codigo: 425).
         */
        public static final int SOLICITAR_TRASPASO_DE_AFILIADO_AL_SEGURO_DE_ESTANCIA_INFANTIL = 425;
        /**
         * CONSULTAR REPUESTA DE SOLICITUDES DE TRASPASO EN ESTANCIAS INFANTILES POR LOTE (CODIGO: 432).
         */
        public static final int CONSULTAR_REPUESTA_DE_SOLICITUDES_DE_TRASPASO_EN_ESTANCIAS_INFANTILES_POR_LOTE = 432;
        /**
         * CONSULTAR TRASPASOS DE VALORES CON DIFERENCIAS RESPECTO A LAS DISPERSIONES EN EL SEGURO DE PENSIONES (CODIGO: 437).
         */
        public static final int CONSULTAR_TRASPASOS_DE_VALORES_CON_DIFERENCIAS_RESPECTO_A_LAS_DISPERSIONES_EN_EL_SEGURO_DE_PENSIONES = 437;
        /**
         * CONSULTAR PARENTESCOS (CODIGO: 446)
         */
        public static final int CONSULTAR_PARENTESCO = 446;

        /**
         * CONSULTAR ENTIDADES (Codigo:  442)
         */
        public static final int CONSULTAR_ENTIDADES = 442;


        public static final int CONSULTAR_LOTES_RECIBIDOS_POR_FECHA_Y_SERVICIO = 433;
        /**
         * CONSULTAR TIPOS DE TRASPASO ( Codigo:  445 )
         */
        public static final int CONSULTAR_TIPOS_DE_TRASPASO = 445;

        /**
         * CONSULTAR TIPOS DE FACTURAS (CODIGO: 447)
         */
        public static final int CONSULTAR_TIPOS_DE_FACTURAS = 447;

        /**
         * CONSULTAR INDIVIDUALIZACIONES DE APORTES PENDIENTES DE COMFIRMAR POR FECHA (CODIGO: 435).
         */
        public static final int CONSULTAR_INDIVIDUALIZACIONES_DE_APORTES_PENDIENTES_DE_COMFIRMAR_POR_FECHA = 435;

        public static final int CONSULTA_DE_TRASPASOS_EN_EL_SEGURO_PENSIONES = 429;
        public static final int VALIDAR_CORRESPONDENCIA_DE_DEPENDIENTES_CON_TITULAR_O_CONYUGE_EN_EL_SEGURO_FAMILIAR_DE_SALUD = 406;
        public static final int CONSULTAR_DISTRIBUCION_GEOGRAFICA_DEL_SDSS = 440;
        public static final int CONSULTAR_OFICIALIAS = 441;

        /**
         * CONSULTAR EMPLEADORES (Codigo: 444).
         */
        public static final int CONSULTAR_EMPLEADORES = 444;

        public static final int CONSULTAR_DISPONIBILIDAD_DE_SERVICIOS_DEL_SISTEMA = 443;
        public static final Integer CONSULTAR_RESPUESTA_DE_AFILIACION_DE_TITULARES_POR_NUMERO_DE_CONTRATO = 85;
        public static final Integer GESTIONAR_CAPITAS_POR_PAGAR = 351;
        public static final Integer VALIDAR_CAPITAS_POR_PAGAR_VIGENTES_ESTANCIAS_INFANTILES = 371;

        /**
         * CONSULTAR EJECUCIONES DE PROCESOS POR FECHA Y SERVICIO (464)
         */
        public static final int CONSULTAR_EJECUCIONES_DE_PROCESO_POR_FECHA_SERVICIO = 464;

        /**
         * CONSULTAR_LOTES_ENVIADOS_POR_FECHA_SERVICIO (Codigo: 463).
         */
        public static final int CONSULTAR_LOTES_ENVIADOS_POR_FECHA_SERVICIO = 463;


        public static final int CONSULTAR_CIUDADANOS = 476;

        public static final int CONSULTAR_ARCHIVOS_GENERADOS_POR_FECHA_Y_SERVICIO = 479;

        public static final int CONSULTA_ENTRADAS_CONTABLE = 477;
        public static final int CONSULTAR_DOCUMENTO_AFILIACION = 487;
        public static final int CONSULTAR_DOCUMENTO_RECAUDO = 488;
        public static final int CONSULTAR_DOCUMENTO_TRASPASO = 489;
        public static final int CONSULTAR_DOCUMENTO_NOVEDAD = 490;
        public static final int CONSULTAR_DOCUMENTO_ACTA_DE_DEFUNCION = 495;
        public static final int BAJA_CONTACTO_PERSONA_FISICA = 510;

        public static final int MODIFICAR_CONTACTO = 509;
        /**
         * Individualizar de C�pitas de Pago Retroactivo Reci�n Nacido del Seguro Familiar de Salud
         * y sub procesos
         */
        public static final int INDIVIDUALIZAR_CAPITAS_POR_PAGO_RETROACTIVOS_DE_RECIEN_NACIDOS = 292;
        public static final int INDIVIDUALIZAR_CAPITAS_POR_PAGO_RETROACTIVOS_DE_RECIEN_NACIDOS_REGIMEN_CONTRIBUTIVO = 492;
        public static final int INDIVIDUALIZAR_CAPITAS_POR_PAGO_RETROACTIVOS_DE_RECIEN_NACIDOS_REGIMEN_SUBSIDIADO = 493;
        public static final int INDIVIDUALIZAR_CAPITAS_POR_PAGO_RETROACTIVOS_DE_RECIEN_NACIDOS_REGIMEN_PENSIONADOS = 494;

        public static final int GESTIONAR_SOLICITUDES_GESTION_CONTACTO_PROCESO = 501;

        public static final int BAJA_CONTACTO_PERSONA_MORAL_O_NOTIFICACION = 514;
        public static final int ALTA_CONTACTO_PERSONA_FISICA = 515;
        public static final int ALTA_CONTACTO_PERSONA_MORAL = 516;

        public static final int CONSULTAR_REPORTES_DISPONIBLES = 534;

        public static final int REVERSAR_FACTURACION_DE_SERVICIOS = 486;
        public static final int GENERAR_FACTURACION_DE_SERVICIOS = 485;
        public static final int GENERAR_CAPITAS_POR_PAGAR_PAGO_RETROACTIVO_RECIEN_NACIDOS = 290;

        public static final int CONSULTAR_TOTAL_DE_AFILIACIONES_RECHAZADAS_POR_MOTIVO_EN_EL_SEGURO_DE_PENSIONES = 548;
        public static final int CONSULTAR_TOTAL_DE_AFILIACIONES_RECHAZADAS_POR_ENTIDAD_PROMOTOR_EN_EL_SEGURO_DE_PENSIONES = 549;

        public static final int SOLICITAR_EJECUCION_DE_REPORTE = 529;
        public static final int PUBLICAR_REPORTE_MANUALMENTE = 531;

        public static final int CONSULTA_DE_AGENTES_PROMOTORES_Y_REPRESENTANTES = 527;
        public static final int SOLICITAR_GENERACION_ARCHIVO_POR_CONTINGENCIA = 541;
        public static final int ENVIAR_DOCUMENTO_POR_CONTINGENCIA = 544;
        public static final int ENVIAR_SOLICITUD_DE_SERVICIO_POR_CONTINGENCIA = 545;
        public static final int CONSULTAR_SOLICITUDES_DE_INTERCAMBIO_POR_CONTINGENCIA = 546;

        public static final int ESTADOS_SOLICITUD_AFILIACION_IMPIDEN_REUTILIZACION_CONTRATO = 526;
        public static final int GENERAR_RANGOS_DE_CARENCIA_DE_AFILIADOS = 365;

        /*
         * Contingencia
         */

        public static final int PROCESAR_SOLICITUDES_INTERCAMBIO_CONTINGENCIA = 542;

        /*
         * SOLICITAR NOVEDAD DE CAMBIO DE UBICACION GEOGRAFICA" (C�digo: 571)
         */
        public static final int SERVICIO_571_SOLICITAR_NOVEDAD_DE_CAMBIO_DE_UBICACION_GEOGRAFICA = 571;


        /*
         * CONSULTAR CUENTAS (C�digo: 631)
         */
        public static final int CONSULTAR_CUENTAS = 631;

        public static final int AFILIACION_VOLUNTARIA_DE_TITULARES = 453;
        public static final int AFILIACION_VOLUNTARIA_DE_DEPENDIENTES = 454;

        public static final int SERVICIO_585_NOTIFICAR_SOLICITUD_DE_ENTREGA_DE_BENEFICIO = 585;

        public static final int SERVICIO_600_NOTIFICAR_CIERRE_DE_SOLICITUD_DE_ENTREGA_DE_BENEFICIO = 600;

        public static final int SERVICIO_574_SOLICITAR_CANCELACION_ENTREGA_DE_BENEFICIOS = 574;

        public static final int SERVICIO_575_SOLICITAR_DECLINACION_ENTREGA_DE_BENEFICIOS = 575;

        public static final int CONSULTAR_SOLICITUDES_DE_TRASPASO_ENVIADAS_AL_SEGURO_FAMILIAR_DE_SALUD_POR_FECHA = 656;
        public static final int CONSULTAR_CIUDADANOS_FALLECIDOS_POR_FECHA = 561;
        public static final int CONCENTRACION_DE_CARGO_BANCARIO = 731;

        /*
         * CONSULTAR SOLICITUDES PENDIENTES DE DOCUMENTOS (576)
         */
        public static final int CONSULTAR_SOLICITUDES_PENDIENTES_DE_DOCUMENTOS = 576;


        /*
         * ARCHIVO_CIUDADANOS_FALLECIDOS_JCE
         */
        public static final int CARGAR_ARCHIVO_CIUDADANOS_FALLECIDOS_JCE = 739;
        public static final int PROCESAR_ARCHIVO_CIUDADANOS_FALLECIDOS_JCE = 740;

        public static final int NOTIFICAR_CIERRE_DE_SOLICITUD_DE_ENTREGA_DE_BENEFICIO = 586;
        public static final int NOTIFICACION_DE_RECEPCION_DE_PAGO = 6;

        public static final int CONSULTA_EMPLEADORES = 710;
        public static final int NOTIFICAR_CONSUMO_SERVICIOS = 768;

        public static int AFILIAR_AUTOMATICAMENTE_TRABAJADORES_DOMESTICO_REGIMEN_SUBSIDIADO = 762;

        public static int GESTIONAR_DIAS_FERIADOS = 738;
        public static int GESTIONAR_HORARIOS_SERVICIOS = 676;
        public static int GESTIONAR_EXCEPCION_HORARIO_SERVICIO = 695;

    }

    public static class ServiciosNombres {
        public static final String GENERAR_COMPENSACION_SALDOS_TRASPASAR_SEGURO_PENSIONES = "GENERAR COMPENSACION DE SALDOS A TRASPASAR EN EL SEGURO DE PENSIONES";
        public static final String VALIDAR_ANTIGUEDAD_DE_AFILIACIONES_PROVISIONALES_EN_EL_SEGURO_FAMILIAR_DE_SALUD = "VALIDAR ANTIGUEDAD DE AFILIACIONES PROVISIONALES EN EL SEGURO FAMILIAR DE SALUD";
        public static final String VALIDAR_ANTIGUEDAD_DE_AFILIACIONES_PROVISIONALES_EN_EL_SEGURO_PENSIONES = "VALIDAR ANTIGUEDAD DE AFILIACIONES PROVISIONALES EN EL SEGURO DE PENSIONES";
        public static final String VALIDAR_PERDIDA_DE_EMPLEO_DE_AFILIADOS_AL_SEGURO_FAMILIAR_DE_SALUD = "VALIDAR PERDIDA DE EMPLEO DE AFILIADOS AL SEGURO FAMILIAR DE SALUD";
        public static final String VALIDAR_AFILIADOS_COTIZANTES_EN_EL_REGIMEN_SUBSIDIADO_DEL_SFS = "VALIDAR AFILIADOS COTIZANTES EN EL REGIMEN SUBSIDIADO DEL SFS";
        public static final String GENERACION_DE_ARCHIVOS = "GENERACION DE ARCHIVOS";
        public static final String VALIDAR_AFILIACIONES_DUP = "VALIDAR DUPLICIDAD EN AFILIACIONES EN EL SEGURO FAMILIAR DE SALUD";
        public static final String VALIDAR_DUPLICIDAD_SOL_PAGO_RETRO = "VALIDAR DUPLICIDAD EN SOLICITUDES DE PAGO RETROACTIVO";
        public static final String PROCESAR_ARCHIVO_CIUDADANOS_FALLECIDOS_JCE = "PROCESAR ARCHIVO CIUDADANOS FALLECIDOS JCE";
        public static final String NOTIFICAR_LOTES_PENDIENTES_DE_PROCESAR = "NOTIFICAR LOTES PENDIENTES DE PROCESAR";
        public static final String HABILITAR_INDIVIDUALIZACIONES_CAPITAS_COBERTURAS_TEMPORALES_RECHAZADAS = "HABILITAR INDIVIDUALIZACIONES DE C�PITAS POR COBERTURA TEMPORALES RECHAZADAS";


    }

    public enum TipoEstadoNotificacionCapita {
        PENDIENTE(1, "PENDIENTE"),
        CONFIRMADO(2, "CONFIRMADO"),
        RECHAZADO(3, "RECHAZADO");

        private int codigo;
        private String descripcion;

        private TipoEstadoNotificacionCapita(int codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }
    }

    public static class TipoEventoSistema {
        public static final short RESULTADO_EXITOSO = 1;
        public static final short ADVERTENCIA = 2;
        public static final short RESULTADO_FALLIDO = 3;
    }

    public static class TipoGeneracionCapita {
        public static final Short REGULAR = 1;
        public static final Short NUEVOS_AFILIADO = 2;
        public static final Short PAGO_RETROACTIVO_RECIEN_NACIDOS = 3;
    }

    public static class Estados {

        private Estados() {
        }

        public static final String ESTADO_OK = "OK";
        public static final String ESTADO_IN = "IN";
        public static final String ESTADO_RE = "RE";
        public static final String ESTADO_PE = "PE";
        public static final String ESTADO_TR = "TR";
        public static final String ESTADO_BL = "BL";
        public static final String ESTADO_IR = "IR";
        public static final String ESTADO_IC = "IC";
        public static final String ESTADO_AC = "AC";
        public static final String ESTADO_PA = "PA";
        public static final String ESTADO_CA = "CA";
        public static final String ESTADO_LE = "LE";
        public static final String ESTADO_EN = "EN";
        public static final String ESTADO_ES = "ES";
        public static final String ESTADO_NT = "NT";
        public static final String ESTADO_RS = "RS";
        public static final String ESTADO_DI = "DI";
        public static final String ESTADO_PC = "PC";
        public static final String ESTADO_CT = "CT";
        public static final String ESTADO_RP = "RP";
        public static final String ESTADO_VR = "VR";
        public static final String ESTADO_VE = "VE";
        public static final String ESTADO_CO = "CO";
        public static final String ESTADO_EX = "EX";
        public static final String ESTADO_AT = "AT";
        public static final String ESTADO_FA = "FA";
        public static final String ESTADO_NF = "NF";
        public static final String ESTADO_NA = "NA";
        public static final String ESTADO_DE = "DE";
        public static final String ESTADO_LA = "LA";
        public static final String ESTADO_EV = "EV";

        public static final int ES_SERVICIO_REQUERIDO = 1;
    }

    public static class Formatos {
        public static final String FORMATO_PERIODO = "yyyyMM";
        public static final String FORMATO_FECHA_ISO_8601 = "yyyy-MM-dd'T'HH:mm:ss";
        public static final String FORMATO_FECHA_PLSQL = "YYYY-MM-DD HH24:MI:SS";
        public static final String FORMATO_FECHA_DATE_TO_PLSQL = "yyyy-MM-dd HH:mm:ss";
        public static final String FORMATO_FECHA_PARAMETROS_VALOR = "dd/MM/yyyy";
        public static final String FORMATO_HORA_PARAMETROS_VALOR = "HH:mm:ss";
        public static final String FORMATO_HORA_NOMBRE_LBTR = "ddMMyyyyHHmmss";
        public static final String FORMATO_NOTIFICACION = "dd/MM/yyyy hh:mm:ss a";
        public static final String FORMATO_FECHA_YYYYMMDDHH24MISS = "yyyyMMddHHmmss";
        public static final String FORMATO_FECHA_NOMBRE_GENERACION_ARCHIVOS = "ddMMyyyy";
        public static final String FORMATO_FECHA_NOMBRE_NACHA = "ddMMyy";
        public static final String FORMATO_FECHA_CABECERA_NACHA = "yyMMdd";
        public static final String FORMATO_HORA_CABECERA_NACHA = "HHmm";
    }

    public static class FormatoDocumento {
        public static final String FORMATO_DOCUMENTO_PORTATIL = "PDF";
        public static final String ARCHIVO_TEXTO = "TXT";

        private FormatoDocumento() {
        }
    }

    public static class GradoConsanguinidad {
        public static final int GRADO_CONSANGUINIDAD_CONYUGE = 0;
        public static final int PRIMER_GRADO_ASCENDENTE = 1;
        public static final int PRIMER_GRADO_DESCENDENTE = 2;
        public static final int SEGUNDO_GRADO_ASCENDENTE = 3;
        public static final int SEGUNDO_GRADO_COLATERAL = 4;
        public static final int SEGUNDO_GRADO_DESCENDENTE = 5;
        public static final int TERCER_GRADO_COLATERAL = 6;
    }

    /**
     * Tipos De Entidades
     *
     * @author
     */
    public static class TipoEntidad {
        /**
         * ENTIDADES INTEGRANTES DEL SISTEMA DOMINICANO DE SEGURIDAD SOCIAL (1)
         */
        public static final short SUPERVISORA = 1;

        /**
         * ADMINISTRADORAS DE FONDOS DE PENSIONES (AFP) (2)
         */
        public static final short AFP = 2;

        /**
         * ADMINISTRADORA DE RIESGOS DE SALUD (ARS) (3)
         */
        public static final short ARS = 3;

        /**
         * BANCOS (4)
         */
        public static final short BANCOS = 4;

        /**
         * REGIMEN DE SALUD SUBSIDIADO (6)
         */
        public static final short REGIMEN_SALUD_SUBSIDIADO = 6;

        /**
         * ADMINISTRADORA DE RIESGOS LABORALES (7)
         */
        public static final short ARL = 7;

        /**
         * ESTANCIAS INFANTILES (8)
         */
        public static final short ESTANCIAS_INFANTILES = 8;

        /**
         * ADMINISTRADORA DE ESTANCIAS INFANTILES (10)
         */
        public static final short AEI = 10;

        /**
         * ADMINISTRADORA DE FONDOS DE REPARTO (10)
         */
        public static final short FREP = 5;

        public static final short ARSPEN = 11;

        public static final short PPTD = 13;

        private TipoEntidad() {
        }
    }

    /**
     * Tipo Ciudadano Pago Id
     * POSIBLES VALORES PARA TIPO CIUDADANO PAGO
     *
     * @author dear martinez
     * @since Orden de Atencion 6
     */
    public static class TipoCiudadanoPagoId {

        /**
         * TITULAR (1)
         */
        public static final short TITULAR = 1;
        /**
         * CONYUGUE (2)
         */
        public static final short CONYUGUE = 2;
        /**
         * OTRO (3)
         */
        public static final short OTRO = 3;

        private TipoCiudadanoPagoId() {
        }
    }

    /**
     * Entidades Supervisoras
     *
     * @author
     */
    public static class EntidadSupervisora {
        public static final int SIPEN = 1001;
        public static final int TSS = 1002;
        public static final int SISALRIL = 1003;
        public static final int DIDA = 1004;
        /**
         * UNIPAGO (1006)
         */
        public static final int EPBD = 1006;
        /**
         * ADMINISTRADORA ESTANCIAS INFANTILES SALUD SEGURA (10001)
         */
        public static final int AEIS = 10001;
    }

    public static class TipoIndividualizacion {

        public static final String INDIVIDUALIZACION_REGULAR = "RE";
        public static final String VALIDACION_CONTRA_NOMINA = "VN";
        public static final String AFILIACION_AUTOMATICA = "AU";

    }

    public static class TipoIndividualizacionCapita {
        public static final Short PAGO_RETROACTIVO_RECIEN_NACIDOS = 4;
    }

    public static class TipoFechaAfiliacion {
        public static final String FECHA_AFILIACION_ORIGINAL = "FO";
        public static final String FECHA_AFILIACION_REPARTO = "FR";

    }

    public static class MensajesNotificacion {
        public static final String CREAR_SERVICIO_SISTEMA = "SERVICIO SISTEMA CREADO EXITOSAMENTE.";
        public static final String CREACION_HORARIO_DE_ATENCION = "CREACION HORARIO DE ATENCION DE SERVICIO";
        public static final String VALIDACION_CONTR_NOMINA = "";
    }

    public static class TipoTelefono {
        public static final short CASA = 2;
        public static final short OFICINA = 1;
        public static final short CELULAR = 3;

    }

    public static class TipoTraspaso {
        public static final Short NORMAL_PENSIONES = 1;
        public static final Short REPARTO_A_CCI = 3;
        public static final Short PLAN_SUSTITUTIVO_A_CCI = 4;
        public static final Short RECLAMACION_SIPEN = 5;
        public static final Short CCI_A_INABIMA = 6;
        public static final Short NORMAL_SALUD = 7;
        public static final Short UNIFICACION_NUCLEO_FAMILIAR = 9;
        public static final Short CAMBIO_POR_EXCEPCION = 10;
        public static final Short NORMAL_ESTANCIAS_INFANTILES = 11;
        public static final Short REPARTO_CCI_HACIA_FONDO_REPARTO_ESPECIALIZADO = 6;
    }

    public static class DescripcionBitacora {
        public static final String CREAR_SERVICIO_EXITOSO = "SERVICIO DEL SISTEMA CREADO EXITOSAMENTE.";
        public static final String REGISTRO_UTILIZACION_SERVICIO_EXITOSO = "Fue recibida correctamente la solicitud del servicio";
        public static final String CREAR_SOLICITUD_NOVEDAD = "Fue registrada la solicitud de Novedad %s";
        public static final String CREAR_SOLICITUD_AFILIACION = "Fue registrada la solicitud de afiliaci�n %s";
        public static final String CREAR_AFILIACION = "Afiliaci�n definitiva del ciudadano con el NSS %s en la entidad %s  del seguro %s y r�gimen %s.";
        public static final String EJECUCION_SERVICIO_EXITOSA = " Fue ejecutado exitosamente el servicio %s.";
        public static final String EJECUCION_SERVICIO_FALLIDA = " La ejecuci�n del servicio %s  gener� el error %s.";

        /**
         * String parametrizado con la descripcion de la bitacora fallida.
         * El primer parametro es la descripcion del servicio.
         * El segudo es el motivoId.
         * El tercero es la descripcion del motivo.
         */
        public static final String DESCRIPCION_RESULTADO_FALLIDO_TEMPLATE = "La ejecucion del servicio %s genero el error %s-%s.";

        /**
         * String parametrizado con la descripcion de la bitacora exitosa.
         * El primer parametro es la descripcion del servicio.
         */
        public static final String DESCRIPCION_RESULTADO_EXITOSO_TEMPLATE = "Fue ejecutado exitosamente el servicio %s.";
    }

    public static class DescripcionTipoPersona {
        public static String PERSONA_FISICA = "F�sica";
        public static String PERSONA_MORAL = "Moral";
        public static String PERSONA_NOTIFICACION = "Notificaci�n";
    }

    public static class DescripcionTipoIdentificacion {
        public static String RNC = "RNC";
        public static String CEDULA = "Cedula de Identidad y Electoral";
    }

    public static class TipoIdentificacionEmpleador {
        public static final short CEDULA = 1;
        public static final short RNC = 2;
        public static final short REGISTRO_PATRONAL = 12;
        public static final short NUMERO_DE_IDENTIFICACION = 7;

    }

    public static class TipoActividadFinanciera {
        public static final Short RECAUDADOR = 1;
        public static final Short CONCENTRADOR = 2;
        public static final Short RECEPTOR = 3;
    }

    public static class TipoAgente {
        public static final short PROMOTOR = 1;
        public static final short REPRESENTANTE = 2;
    }

    public static class TipoPersona {
        public static final short FISICA = 1;
        public static final short MORAL = 2;
        public static final short NOTIFICACION = 3;
    }

    public static class TipoParticipacion {
        public static final short ENTIDAD_ORIGEN = 1;
        public static final short ENTIDAD_DESTINO = 2;

        public static Object[] values() {
            return new Object[]{ENTIDAD_ORIGEN, ENTIDAD_DESTINO};
        }
    }

    public static class TipoParticipante {
        public static final short SOLICITADO = 1;
        public static final short SOLICITANTE = 2;

        public static Object[] values() {
            return new Object[]{SOLICITADO, SOLICITANTE};
        }
    }

    public static class TipoParticipanteNovedad {
        public static final short SOLICITADO = 1;
        public static final short PARTICIPANTE = 2;
    }

    public static class AccionGestionAporte {
        public static final short RECHAZAR_APORTE = 1;
        public static final short CONFIRMAR_APORTE = 2;
        public static final short SOLICITAR_NOTIFICACION = 3;
    }

    public static class AccionGestionCapita {
        public static final short RECHAZAR_APORTE = 1;
        public static final short CONFIRMAR_APORTE = 2;
        public static final short SOLICITAR_NOTIFICACION = 3;
    }

    public static class AccionMantenimientoAgente {
        public static final String ALTA_PROMOTOR_REPRESENTANTE = "AC";
        public static final String BAJA_PROMOTOR_REPRESENTANTE = "IN";
    }

    public static class AccionEventoTraspaso {
        public static final short AUTORIZAR = 1;
        public static final short RECHAZAR = 2;
        public static final short RECHAZAR_SOLICITUDES = 3;
    }

    public static class AccionImpedimentoTraspaso {
        public static final short CONTINUAR_FLUJO_TRASPASO = 1;
        public static final short DETENER_TRASPASO = 2;

    }

    public static class SolicitudTraspasoAccionEvento {
        public static final short SOLICITUD_TRASPASO_IDENTIFICADA = 1;
        public static final short SOLICITUD_TRASPASO_PAREJA = 2;
    }


    public static class EventoTraspaso {
        public static final short ENVIO_SOLICITUD_TRASPASO = 1;
        public static final short ENVIO_DOCUMENTO_SOPORTE_SOLICITUD_TRASPASO = 2;
        public static final short ENVIO_IMPEDIMENTOS_SOLICITUD_TRASPASO = 3;
        public static final short ENVIO_ACLARACIONES_DE_SOLICITUD_TRASPASO = 4;
        public static final short VENCIMIENTO_SOLICITUD_TRASPASO = 5;
        public static final short ENVIO_ACCION_SOBRE_IMPEDIMENTO_SOLICITUD_TRASPASO = 6;
        public static final short ENVIO_ACCION_SUPERVISORA_SOBRE_SOLICITUD_DE_TRASPASO_PENDIENTE_AUTORIZACION = 7;
        public static final short ENVIO_ACCION_ADMINISTRADORA_SOBRE_SOLICITUD_DE_TRASPASO_PENDIENTE_AUTORIZACION = 8;
    }

    public static class DescripcionAccionMantenimientoAgente {
        public static final String ALTA_PROMOTOR_REPRESENTANTE = "Alta";
        public static final String BAJA_PROMOTOR_REPRESENTANTE = "Baja";
    }

    public static class DescripcionTipoAgente {
        public static final String PROMOTOR = "PROMOTOR";
        public static final String REPRESENTANTE = "REPRESENTANTE";
    }


    public static class Colas {
        public static final String BITACORA = "unipago/jms/comunes/BitacoraQueue";
        public static final String NOTIFICACION = "unipago/jms/comunes/NotificacionQueue";
        public static final String INDIVIDUALIZACION_FACTURAS = "unipago/jms/recaudo/individualizarFacturasPagadasQueue";
        public static final String TRASPASAR_SOLICITUD_AFILIACION = "unipago/jms/traspaso/TraspasoSolicitudAfiliacionQueue";
        public static final String SOLICITUD_INTERCAMBIO_CONTIGENCIA = "unipago/jms/comunes/SolicitudIntercambioContingenciaQueue";
    }

    public static class MapKeys {
        public static final String MAP_NUMERO_INDIVIDUALIZACION = "numeroIndividualizacion";
        public static final String MAP_NUMERO_ORDEN = "numeroOrden";

    }

    public static class OrdenAprobacion {
        public static final short SISALRIL = (short) 1;
    }

    public static class TipoPrefijo {
        public static final short CIUDADANO_EXTRANJERO = 1;
        public static final short TITULAR_EXCEPCION = 2;
    }

    public static class Parametros {
        public static final String CANTIDAD_LINEA_ARCHIVOS = "CANTIDAD_LINEAS_ARCHIVOS";
        public static final String CANTIDAD_LINEA_ARHCIVOS = "CANTIDAD_LINEAS_ARCHIVOS";
        public static final String CANTIDAD_MAXIMA_REGISTROS_CONSULTA = "CANTIDAD_MAXIMA_REGISTROS_CONSULTA";
        public static final String CODIGO_PAIS_ISO_3166 = "CODIGO_PAIS_ISO_3166";
        public static final String CODIGO_MONEDA_ISO_4217 = "CODIGO_MONEDA_ISO_4217";
        public static final String LBTR_CONCEPTO = "LBTR_CONCEPTO";
        public static final String LBTR_CONCEPTO_PAGO = "LBTR_CONCEPTO_PAGO";
        public static final String N_A = "N/A";
        public static final String PAGO = "PAGO";
        public static final String NOMBRE_COLA_PUBLICAR_ARCHIVO = "NOMBRE_COLA_PUBLICAR_ARCHIVO";
        public static final String TAG_CLAVE_ENTIDAD = "claveEntidadEmisora";
        public static final String TAG_TIPO_ENTIDAD = "tipoEntidadEmisora";
        public static final String TAG_PROCESO = "claveProceso";
        public static final String TAG_SUB_PROCESO = "claveSubproceso";
        public static final String FN_AJUSTE_FACTURA = "FN_AJUSTES_FACTURA_PAGO";
        public static final String FN_ESTADO_LOTE = "FN_ESTADO_LOTE_DIFERENTE";
        public static final String FN_EMPLEADORES_FACTURA_PAGADA = "FN_EMPLEADORES_FACTURA_PAGADA";
        public static final String FN_RUBROS_IND = "FN_RUBRO_IND";
        public static final String FN_DETALLE_LOTE = "FN_DETALLE_LOTE";
        public static final String FN_UNIVERSO_FONDO = "FN_UNIVERSO_CONCENTRACION";
        public static final String FN_UNIVERSO_IND = "FN_UNIVERSO_IND";
        public static final String FN_PARAMETRO_ESPECIFICO = "FN_PARAMETRO_ESPECIFICO";
        public static final String FN_CANTIDAD_AFI_SEGURO = "FN_CANTIDAD_AFI_SEGURO_ENTIDAD";
        public static final String FN_SUMA_EDAD_AFI = "FN_SUMA_EDAD_AFILICION";
        public static final String FN_SUMA_SAL_ENT = "FN_SUM_SALARIO_ENTIDAD";
        public static final String FN_BUSCAR_GRUPO_DESC = "FN_BUSCAR_GRUPO_DESC";
        public static final String DATO_ALEATORIO_PRNG = "DATO_ALEATORIO_PRGN";
        public static final String FN_BUSCAR_GRUPO_ENT_ID = "FN_BUSCAR_GRUPO_ENT_ID";
        public static final String FN_BUSCAR_USUARIOS_POR_ENTIDAD = "FN_BUSCAR_USUARIOS_POR_ENTIDAD";
        public static final String FN_BUSCAR_CONTACTOS_POR_ENTIDAD = "FN_BUSCAR_CONTACTOS_POR_ENTIDAD";
        public static final String URL_SOLICITUD_GESTION_CONTACTO = "URL_SOLICITUD_GESTION_CONTACTO";
        public static final String SMTP_HOST_URL = "SMTP_HOST_URL";
        public static final String SMTP_HOST_PORT = "SMTP_HOST_PORT";
        public static final String FN_BUSCAR_CONTACTO = "FN_BUSCAR_CONTACTO";
        public static final String FN_BUSCAR_APORTE_PERIODO = "FN_BUSCAR_APORTE_PERIODO";
        public static final String SUMATORIA_RUBRO_DET_FACT_FN = "SUMATORIA_RUBRO_DET_FACT_FN";
        public static final String BUSCAR_CIU_AFI_AU_ADIC_FN = "BUSCAR_CIU_AFI_AU_ADIC_FN";
        public static final String CONSULTAR_SOLICITUD_AFILIACION_POR_SEGURO_FN = "CONSULTAR_SOLICITUD_AFILIACION_POR_SEGURO_FN";
        public static final String MAXIMO_DIFERENCIAS_APELLIDO_CIUDADANO = "MAXIMO_DIFERENCIAS_APELLIDO_CIUDADANO";
        public static final String MAXIMO_DIFERENCIAS_NOMBRE_CIUDADANO = "MAXIMO_DIFERENCIAS_NOMBRE_CIUDADANO";
        public static final String MAXIMO_DIFF_APELLIDOS_DEPENDIENTE_TITULAR_CONYUGE = "MAXIMO_DIFF_APELLIDOS_DEPENDIENTE_TITULAR_CONYUGE";
        public static final String MAXIMA_EDAD_MENOR = "MAXIMA_EDAD_MENOR";
        public static final String MAXIMA_EDAD_DEPENDIENTE_DIRECTO_NO_DISCAPACITADO = "MAXIMA_EDAD_DEPENDIENTE_DIRECTO_NO_DISCAPACITADO";
        public static final String BUSCAR_APORTE_CIU_ESTADO_FN = "BUSCAR_APORTE_CIU_ESTADO_FN";
        public static final String NOMBRE_SISTEMA = "NOMBRE_SISTEMA";
        public static final String BUSCAR_SOL_AFI_VALIDA_NOM_FN = "BUSCAR_SOL_AFI_VALIDA_NOM_FN";
        public static final String BUSCAR_DET_FACT_SEG_PERIODO_FN = "BUSCAR_DET_FACT_SEG_PERIODO_FN";
        public static final String BUSCAR_DET_FACT_SEG_FN = "BUSCAR_DET_FACT_SEG_FN";
        public static final String BUSCAR_INST_MOV_POR_FEC_SVC_FN = "BUSCAR_INST_MOV_POR_FEC_SVC_FN";
        public static final String BUSCAR_CAMBIOS_SOL_AFI_DEP_FN = "BUSCAR_CAMBIOS_SOL_AFI_DEP_FN";
        public static final String FN_CONSULTAR_RESUMEN_IND_FEC = "FN_CONSULTAR_RESUMEN_IND_FEC";
        public static final String CANTIDAD_MAXIMA_DIAS_ENTRE_RANGO_FECHAS_CONSULTA = "CANTIDAD_MAXIMA_DIAS_ENTRE_RANGO_FECHAS_CONSULTA";
        public static final String CANTIDAD_MAXIMA_DIAS_ENTRE_FECHA_CONSULTA_RESUMEN_NOT_IND_CAP_FECHA = "CANTIDAD_MAXIMA_DIAS_ENTRE_RANGO_FECHAS_CONSULTA_RESUMEN_NOT_IND_CAP_FECHA";
        public static final String BUSCAR_SUM_INST_MOV_FN = "BUSCAR_SUM_INST_MOV_FN";
        public static final String CONSULTA_INST_MOV_FN = "CONSULTA_INST_MOV_FN";
        public static final String FN_CONSULTAR_NUC_FAM_CED_TIT = "FN_CONSULTAR_NUC_FAM_CED_TIT";
        public static final String FN_CONSULTAR_NOMINA_POR_NSS = "FN_CONSULTAR_NOMINA_POR_NSS";
        public static final String FN_CONSULTAR_CAMBIOS_SOL_AFI = "FN_CONSULTAR_CAMBIOS_SOL_AFI";
        public static final String FN_CONSULTA_AJUSTES_FACT_FECHA = "CONSULTA_AJUSTES_FACT_FECHA_FN";
        public static final String FN_CONSULTA_FACT_FEC_TIPO_AJUS = "CONSULTA_FACT_FEC_TIPO_AJUS_FN";
        public static final String FN_CONSULTA_AJUS_FACT_FEC_REF = "CONSULTA_AJUS_FACT_FEC_REF_FN";
        public static final String FN_CONSULTAR_AFILIACION_SEGURO = "FN_CONSULTAR_AFILIACION_SEGURO";
        public static final String FN_CANT_FACT_AJU_FEC_MOV_AJU = "CANT_FACT_AJU_FEC_MOV_AJU_FN";
        public static final String FN_BUSCAR_REFERENCIAS_VALIDAS_PAGOS = "FN_BUSCAR_REFERENCIAS_VALIDAS_PAGOS";
        public static final String FN_BUSCAR_MONTO_AJUSTE_PAGO = "FN_BUSCAR_MONTO_AJUSTE_PAGO";
        public static final String FN_BUSCAR_AJUSTES_FACTURAS_PAGO = "FN_BUSCAR_AJUSTES_FACTURAS_PAGO";
        public static final String FN_CON_CONF_APO_FEC_SEG_DET = "CON_CONF_APO_FEC_SEG_DET_FN";
        public static final String FN_BUSCAR_GRUPOS_USUARIOS = "BUSCAR_GRUPOS_USUARIOS_FN";
        public static final String FN_CIUDADANOS_DISTINTOS_SOL_AFI = "FN_CIUDADANOS_DISTINTOS_SOL_AFI";
        public static final String FN_CON_CONF_APO_FEC_SEG_RES = "CON_CONF_APO_FEC_SEG_RES_FN";
        public static final String FN_BUSCAR_DET_PG_FECHA_ENT = "FN_BUSCAR_DET_PG_FECHA_ENT";
        public static final String FN_BUSC_TOTAL_SEG_PG_FECHA_ENT = "FN_BUSC_TOTAL_SEG_PG_FECHA_ENT";
        public static final String BUSCAR_NOT_IND_NOTIFICADA_FN = "BUSCAR_NOT_IND_NOTIFICADA_FN";
        public static final String FN_ACTUALIZAR_ENTIDAD_APORTE_ADICIONAL = "FN_ACTUALIZAR_ENTIDAD_APORTE_ADICIONAL";
        public static final String FN_ACTUALIZAR_ENTIDAD_APORTE = "FN_ACTUALIZAR_ENTIDAD_APORTE";
        public static final String FN_PROCESAR_CAPITA_SALUD_CONTRIBUTIVO_RE = "PROCESAR_CAPITA_SALUD_CONTRIBUTIVO_REGULAR_FN";
        public static final String FN_PROCESAR_CAPITA_SALUD_CONTRIBUTIVO_NUEVO_OK = "PROCESAR_CAPITA_SALUD_CONTRIBUTIVO_NUEVO_OK_FN";
        public static final String RUTA_ALMACENAMIENTO_DOCUMENTO = "RUTA_ALMACENAMIENTO_DOCUMENTO";
        public static final String ACTUALIZAR_APO_ESPEC_FN = "ACTUALIZAR_APO_ESPEC_FN";
        public static final String BUSCAR_APORTE_ESPEC_FN = "BUSCAR_APORTE_ESPEC_FN";
        public static final String BUSCAR_CUE_ESPC_FN = "BUSCAR_CUE_ESPC_FN";
        public static final String CAMBIAR_ESTADO_APORTE_FN = "CAMBIAR_ESTADO_APORTE_FN";
        public static final String BUSCAR_CAPITAS_RECHAZADOS_FN = "BUSCAR_CAPITAS_RECHAZADOS_FN";
        public static final String BUSCAR_APO_NOTIF_IND_FN = "BUSCAR_APO_NOTIF_IND_FN";
        public static final String BUSCAR_APORTES_DISPERSAR = "BUSCAR_APORTES_DISPERSAR_FN";
        public static final String ACTUALIZAR_APORTES_DISPERSADOS_SP = "ACTUALIZAR_APORTES_DISP_SP";
        public static final String BUSCAR_APO_REZAGADOS_ESPEC_FN = "BUSCAR_APO_REZAGADOS_ESPEC_FN";
        public static final String ACTU_APO_REZAGADOS_ESPEC_FN = "ACTU_APO_REZAGADOS_ESPEC_FN";
        public static final String FN_BUSCAR_CARTERA_AFI_PERIODO = "FN_BUSCAR_CARTERA_AFI_PERIODO";
        public static final String GENERAR_CARTERA_AFILIADOS_FN = "GENERAR_CARTERA_AFILIADOS_FN";
        public static final String PERIODO_MINIMO_PERMITIDO = "PERIODO_MINIMO_PERMITIDO";
        public static final String BUSCAR_APORTES_SIN_ENTIDAD_ASIGNADA_SFS_FN = "BUSCAR_APORTES_SIN_ENTIDAD_ASIGNADA_SFS_FN";
        public static final String ACTUALIZAR_RESPUESTA_SOL_ASIG_NSS_FN = "ACTUALIZAR_RESPUESTA_SOL_ASIG_NSS_FN";
        public static final String ACTUALIZAR_DIF_APELLIDO = "ACT_RES_SISAL_DIF_APE";
        public static final String DIAS_LIMITE_AFILIACION_PENSIONES = "DIAS_LIMITE_AFILIACION_VOLUNTARIA_PENSIONES";
        public static final String DIAS_LIMITE_AFILIACION_SALUD = "DIAS_LIMITE_AFILIACION_VOLUNTARIA_SALUD";
        public static final String FN_BUSCAR_HISTORICO_ESTADO_APORTE_ACTUAL = "BUSCAR_HIST_EST_APO_ACTUAL_FN";
        public static final String BUSCAR_EMP_SAL_SEG_NSS_FN = "BUSCAR_EMP_SAL_SEG_NSS_FN";
        public static final String MONTO_TOTAL_IND_FN = "MONTO_TOTAL_IND_FN";
        public static final String BUSCAR_PAGOS_POR_ESTADO_MOTIVO_FN = "BUSCAR_PAGOS_POR_ESTADO_MOTIVO_FN";
        public static final String FN_ELEGIBLES_AFI_AU = "FN_ELEGIBLES_AFI_AU";
        public static final String FN_BUSCAR_PAGO_EXCESO_DEP_FACT = "BUSCAR_PAGO_EXCESO_DEP_FACT_FN";
        public static final String FN_RESUMEN_NOT_IND_CAPITAS_POR_FECHA = "RESUMEN_NOT_IND_CAPITAS_POR_FECHA_FN";
        public static final String FN_INDIVIDUALIZAR_CAPITAS_TITULARES = "INDIVIDUALIZAR_CAPITAS_TITULARES_FN";
        public static final String FN_BUSCAR_SOL_TRASPASO_FECHA_ESTADO = "FN_BUSC_SOL_TRASPASO_FEC_ESTADO";
        public static final String DIAS_LIMITE_PAGO_SEGURIDAD_SOCIAL = "DIAS_LIMITE_PAGO_SEGURIDAD_SOCIAL";
        public static final String LIMITE_REGISTRO_BULK_COLLECT = "LIMITE_REGISTRO_BULK_COLLECT";
        public static final String DIA_TOPE_RECEPCION_SOL_TRASPASO_UNIFICACION = "DIA_TOPE_RECEP_SOL_UNIFICACION";
        public static final String MONTO_MAXIMO_DETALLE_LBTR = "MONTO_MAXIMO_DETALLE_LBTR";
        public static final String MONTO_MAXIMO_DETALLE_NACHA = "MONTO_MAXIMO_DETALLE_NACHA";
        public static final String CORREO_SERVICIO_CLIENTE = "CORREO_SERVICIO_CLIENTE";
        public static final String CORREO_AREA_SEGURIDAD = "CORREO_AREA_SEGURIDAD";
        public static final String ANOS_MAXIMOS_AFILIACION_ESTANCIAS_INFANTILES = "ANOS_MAXIMOS_AFILIACION_ESTANCIAS_INFANTILES";
        public static final String DIAS_MINIMOS_AFILIACION_ESTANCIAS_INFANTILES = "DIAS_MINIMOS_AFILIACION_ESTANCIAS_INFANTILES";
        public static final String PERIODOS_APORTE_DEPENDIENTE_EXTRANJERO = "PERIODOS_APORTE_DEPENDIENTE_EXTRANJERO";
        public static final String CANTIDAD_PERIODOS_CIUDADANO_COTIZANTE = "CANTIDAD_PERIODOS_CIUDADANO_COTIZANTE";
        public static final String CANTIDAD_PERIODOS_DEPENDIENTE_COTIZANTE = "CANTIDAD_PERIODOS_DEPENDIENTE_COTIZANTE";
        public static final String NACIONALIDAD_LOCAL = "NACIONALIDAD_LOCAL";
        public static final String CANTIDAD_PERIODOS_COTIZANTE = "CANTIDAD_PERIODOS_COTIZANTE";
        public static final String RUTA_ARCHIVOS_GENERADOS = "RUTA_ARCHIVOS_GENERADOS";
        public static final String CANTIDAD_REGISTRO_COMMIT = "CANTIDAD_REGISTRO_COMMIT";
        public static final String UNISIGMA_CONNECTION_FACTORY_JNDI = "JNDI_CONNECTION_FACTORY";
        public static final String RUTA_FIJA_GENERACION_REPORTE_WIN = "RUTA_FIJA_GENERACION_REPORTE_WIN";
        public static final String RUTA_FIJA_GENERACION_REPORTE_UNIX = "RUTA_FIJA_GENERACION_REPORTE_UNIX";
        public static final String URL_PORTAL_REPORTE = "URL_PORTAL_REPORTE";
        public static final String URL_WEBSERVICE_REPORTING_SERVICE = "URL_WEBSERVICE_REPORTING_SERVICE";
        public static final String NOMENCLATURA_SIMBOLO_SEPARADOR = "NOMENCLATURA_SIMBOLO_SEPARADOR";
        public static final String CANT_MINUTOS_AGREGAR_CALENDARIO = "CANT_MINUTOS_AGREGAR_CALENDARIO";
        public static final String USUARIO_WEBSERVICE_REPORTING_SERVICE = "USUARIO_WEBSERVICE_REPORTING_SERVICE";
        public static final String CREDENCIAL_WEBSERVICE_REPORTING_SERVICE = "CREDENCIAL_WEBSERVICE_REPORTING_SERVICE";
        public static final String LLAVE_ENCRIPTACION_CLAVE_WS_RS = "LLAVE_ENCRIPTACION_CLAVE_WS_RS";
        public static final String TIEMPO_ACTUALIZACION_PANTALLA_GESTION_REPORTES = "TIEMPO_ACTUALIZACION_PANTALLA_GESTION_REPORTES";
        public static final String URL_SERVICES_BUS = "URL_SERVICES_BUS";
        public static final String URL_SERVICIOS_CORE_INTERNOS = "URL_SERVICIOS_CORE_INTERNOS";
        public static final String CANT_DIAS_RET_EMP_PUB_FUSION_SFS = "CANT_DIAS_RET_EMP_PUB_FUSION_SFS";
        public static final String TIPOS_USUARIO_APLICATIVO_MOVIL = "TIPOS_USUARIO_APLICATIVO_MOVIL";
        public static final String TIEMPO_RETENCION_INTERCAMBIO_INFORMACION = "TIEMPO_RETENCION_INTERCAMBIO_INFORMACION";
        public static final String DIRECTORIO_ARCHIVOS_CARGA = "DIRECTORIO_ARCHIVOS_CARGA";
        public static final String CANTIDAD_DIAS_ATRAS_LOTE_PENDIENTE_PROCESAR = "CANTIDAD_DIAS_ATRAS_LOTE_PENDIENTE_PROCESAR";
        public static final String CANTIDAD_REGISTROS_NOTIFICACION = "CANTIDAD_REGISTROS_NOTIFICACION";
        public static final String CANT_DIAS_DEPENDIENTE_PROXIMA_MAYORIA_EDAD = "CANT_DIAS_DEPENDIENTE_PROXIMA_MAYORIA_EDAD";
    }

    public static class Plazos {
        public static final int PLAZO_AFILIACION_VOLUNTARIA_SEGURO_PENSIONES = 30;
        public static final int PLAZO_AFILIACION_VOLUNTARIA_SEGURO_SALUD = 10;
        public static final int PLAZO_SOLICITUD_MANTENIMIENTO_AGENTE = 30;
    }

    public static class TipoCuenta {
        public static final int CUENTA_REFERENCIAS_VALIDAS = 0;
        public static final int CUENTA_RECAUDADORA = 2;
    }

    public static class IntercambioInformacion {
        public static final int II_CONCENTRACION_REFERENCIAS_VALIDAS = 1;
        public static final int II_CONCENTRACION_FACTURAS_AJUSTES = 2;
    }

    public static class TipoMovimiento {
        public static final String CREDITO = "CR";
        public static final String DEBITO = "DB";
    }

    public static class CategoriaArchivo {
        public static final short ARCHIVO_TXT = 1;
        public static final short ARCHIVO_LBTR = 2;
        public static final short ARCHIVO_NACHA = 3;
    }

    enum TipoEstructuraArchivo {
        E, S, G, A;
    }

    public static class TipoSolicitudGestionContacto {
        public static final short CREACION_CONTACTO = 1;
        public static final short CREACION_USUARIO = 2;
        public static final short ASIGNACION_GRUPO_ROLES = 3;
        public static final short RECUPERAR_CONTRASENA = 4;
        public static final short RESETEAR_CONTRASENA = 5;
    }

    public static class TipoUsuarioAprobacion {
        public static final short OFICIAL = 1;
        public static final short SUPLENTE = 2;
    }

    public static class TipoFechaAprobacion {
        public static final short FECHA_NOTIFICACION = 1;
        public static final short FECHA_RESPUESTA = 2;
    }

    public static class TipoFechaSolicitudMantenimientoCuenta {
        public static final short FECHA_RECEPCION = 1;
        public static final short FECHA_CIERRE = 2;
        public static final short FECHA_NOTIFICACION_APROBACION = 3;
    }

    public static class TipoNivelAprobacion {
        public static final short APROBACION = 1;
        public static final short APLICACION = 2;
    }

    public static class AccionSolicitudMantenimientoCuenta {
        public static final short ALTA = 1;
        public static final short BAJA = 2;
        public static final short SUSTITUCION = 3;
    }

    public static class ClaseCuenta {
        public static final short BANCARIA = 1;
        public static final short CONTABLE = 2;
    }

    public static class Contratos {
        public static final int CONTRATO_CREACION_CONTACTO_FISICO = 1;
        public static final int CONTRATO_CREACION_CONTACTO_MORAL = 2;
    }

    public static class NominaBeneficiario {
        public static Long NOMINA_BENEFICIARIO_TSS = 1L;
    }

    public static class ParametrosNotificacion {
        public static final String ENTIDAD = "[ENTIDAD]";
        public static final String NOMBRE_ENTIDAD_CONTACTO = "[NOMBRE_ENTIDAD_CONTACTO]";
        public static final String POSICION_CONTACTO = "[POSICION_CONTACTO]";
        public static final String AREAS_NEGOCIO = "[AREAS_NEGOCIO]";
        public static final String NOMBRE_SISTEMA = "[NOMBRE_SISTEMA]";
        public static final String DESTINATARIOS_DINAMICOS = "[DESTINATARIOS_DINAMICOS]";
        public static final String CODIGO_SEGURIDAD = "[CODIGO_SEGURIDAD]";
        public static final String NOMBRE_USUARIO = "[NOMBRE_USUARIO]";
        public static final String ENLACE_O_URL = "[ENLACE]";
        public static final String NOMBRE_COMPLETO_CONTACTO = "[NOMBRE_COMPLETO_CONTACTO]";
        public static final String NOMBRE_COMPLETO_GESTOR_ACCESO = "[NOMBRE_COMPLETO_GESTOR_ACCESO]";
        public static final String NOMBRE_COMPLETO_GESTOR_USUARIO = "[NOMBRE_COMPLETO_GESTOR_USUARIO]";
        public static final String GRUPO_ROLES = "[GRUPO_ROLES]";
        public static final String LISTADO_GRUPOS_ROLES_EXPIRADOS = "[LISTADO_GRUPOS_ROLES_EXPIRADOS]";
        public static final String NOMBRE_COMPLETO_USUARIO = "[NOMBRE_COMPLETO_USUARIO]";
        public static final String FECHA_ESPECIALIZACION = "[FECHA_ESPECIALIZACION]";
        public static final String NOMBRE_SERVICIO = "[NOMBRE_SERVICIO]";
        public static final String FECHA_HORA_INICIO = "[FECHA_HORA_INICIO]";
        public static final String FECHA_HORA_FIN = "[FECHA_HORA_FIN]";
        public static final String CODIGO_ERROR = "[CODIGO_ERROR]";
        public static final String DESCRIPCION_ERROR = "[DESCRIPCION_ERROR]";
        public static final String FECHA_CONCENTRACION = "[FECHA_CONCENTRACION]";
        public static final String DESCRIPCION_ENTIDAD = "[DESCRIPCION_ENTIDAD]";
        public static final String NOMBRE_ENTIDAD = "[NOMBRE_ENTIDAD]";
        public static final String FECHA_HORA = "[FECHA_HORA]";
        public static final String NOMBRE_INTERCAMBIO_INFORMACION = "[NOMBRE_INTERCAMBIO_INFORMACION]";
        public static final String DESCRIPCION_INTERCAMBIO_INFORMACION = "[DESCRIPCION_INTERCAMBIO_INFORMACION]";
        public static final String ESQUEMA_INTERCAMBIO = "[ESQUEMA_INTERCAMBIO]";
        public static final String PERIODO = "[PERIODO]";
        public static final String CODIGO_INTERCAMBIO_INFORMACION = "[CODIGO_INTERCAMBIO_INFORMACION]";
        public static final String HORA_INICIO = "[HORA_INICIO]";
        public static final String HORA_FIN = "[HORA_FIN]";
        public static final String CANTIDAD_LOTES = "[CANTIDAD_LOTES]";
        public static final String CODIGO_SERVICIO = "[CODIGO_SERVICIO]";
        public static final String SOLICITUD_ID = "[SOLICITUD_ID]";
        public static final String DESCRIPCION_SOLICITUD = "[DESCRIPCION_SOLICITUD]";
        public static final String CANTIDAD_DIAS_FALTANTES_PARA_VENCIMIENTO = "[CANTIDAD_DIAS_FALTANTES_PARA_VENCIMIENTO]";
        public static final String CODIGO = "[CODIGO]";
        public static final String DESCRIPCION = "[DESCRIPCION]";
        public static final String DESCRIPCION_TIPO_SOLICITUD = "[DESCRIPCION_TIPO_SOLICITUD]";
        public static final String DESCRIPCION_MOTIVO_ESTADO_SOLICITUD = "[DESCRIPCION_MOTIVO_ESTADO_SOLICITUD]";
        public static final String PARAMETRO_EJECUCION = "[PARAMETRO_EJECUCION]";
        public static final String CODIGO_DESCRIPCION_ERROR = "[CODIGO_DESCRIPCION_ERROR]";
        public static final String FECHA_ULTIMO_CAMBIO = "[FECHA_ULTIMO_CAMBIO]";
        public static final String DESCRIPCION_ACCION_REALIZADA = "[DESCRIPCION_ACCION_REALIZADA]";
        public static final String DESCRIPCION_TIPO_AGENTE = "[DESCRIPCION_TIPO_AGENTE]";
        public static final String DESCRIPCION_TIPO_PERSONA = "[DESCRIPCION_TIPO_PERSONA]";
        public static final String DESCRIPCION_TIPO_IDENTIFICACION = "[DESCRIPCION_TIPO_IDENTIFICACION]";
        public static final String NUMERO_IDENTIFICACION = "[NUMERO_IDENTIFICACION]";
        public static final String PERIODO_FACTURACION = "[PERIODO_FACTURACION]";
        public static final String DESCRIPCION_ORDEN_EJECUCION = "[DESCRIPCION_ORDEN_EJECUCION]";
        public static final String CODIGO_USUARIO = "[CODIGO_USUARIO]";
        public static final String TABLA_CORREO = "[TABLA_CORREO]";
    }

    public static class ParametrosNotificacionSolicitudMantCuenta {
        public static final String SOLICITUD_MANT_CUENTA_ID = "[SOLICITUD_MANT_CUENTA_ID]";
        public static final String DESCRIPCION_ENTIDAD_SOLICITANTE = "[DESCRIPCION_ENTIDAD_SOLICITANTE]";
        public static final String FECHA_CAMBIO = "[FECHA_CAMBIO]";
        public static final String DESCRIPCION_ACCION_SOL_MANT_CUENTA = "[DESCRIPCION_ACCION_SOL_MANT_CUENTA]";
        public static final String TIPO_CUENTA_ID = "[TIPO_CUENTA_ID]";
        public static final String DESCRIPCION_TIPO_CUENTA = "[DESCRIPCION_TIPO_CUENTA]";
        public static final String DESCRIPCION_ENTIDAD_CUENTA = "[DESCRIPCION_ENTIDAD_CUENTA]";
        public static final String DESCRIPCION_ENTIDAD_FINANCIERA = "[DESCRIPCION_ENTIDAD_FINANCIERA]";
        public static final String NIVEL = "[NIVEL]";
        public static final String FECHA_CIERRE = "[FECHA_CIERRE]";
        public static final String DESCRIPCION_MOTIVO_CANCELACION = "[DESCRIPCION_MOTIVO_CANCELACION]";
        public static final String FECHA_CREACION = "[FECHA_CREACION]";
    }

    public static class TipoNotificacion {
        public static final short ADVERTENCIA = 1;
        public static final short EXITOSO = 2;
        public static final short FALLIDA = 3;
    }

    public static class ViaNotificacion {
        public static final short CORREO = 1;
    }

    public static class DefinicionNotificacion {
        public static final int NOTIFICACION_SOLICITUD_CREACION_CONTACTO_CLIENTE = 1;
        public static final int NOTIFICACION_CREACION_CONTACTO_CLIENTE_AL_GESTOR_CONTACTO = 2;
        public static final int NOTIFICACION_CREACION_CONTACTO_CLIENTE_A_SERVICIO_AL_CLIENTE = 3;
        public static final int NOTIFICACION_SOLICITUD_CREACION_USUARIO = 4;
        public static final int NOTIFICACION_CREACION_USUARIO_AL_GESTOR_ACCESO_SEGURIDAD = 5;
        public static final int NOTIFICACION_CREACION_USUARIO_A_SERVICIO_AL_CLIENTE = 6;
        public static final int NOTIFICACION_RECUPERACION_DE_CONTRASENA = 7;
        public static final int NOTIFICACION_RESETEO_DE_CONTRASENA = 8;
        public static final int NOTIFICACION_INTERNA_ESPECIALIZACION = 10;
        public static final int NOTIFICACION_EJECUCION_SERVICIO_EXITOSO = 12;
        public static final int NOTIFICACION_EJECUCION_SERVICIO_FALLIDO = 13;
        public static final int NOTIFICACION_EJECUCION_SERVICIO_EXITOSO_CONFIRMACION_APORTE = 18;
        public static final int NOTIFICACION_INTERNA_CONCENTRACION = 15;
        public static final int NOTIFICACION_EXTERNA_CONCENTRACION = 14;
        public static final int NOTIFICACION_FALLIDO_CONCENTRACION = 16;
        public static final int NOTIFICACION_FALLIDO_SIN_ENTIDAD_CONCENTRACION = 17;
        public static final int NOTIFICACION_EXTERNA_NOTIFICACION_INDIVIDUALIZACION_AFP = 19;
        public static final int NOTIFICACION_EXTERNA_NOTIFICACION_INDIVIDUALIZACION_ARL = 20;
        public static final int NOTIFICACION_EXTERNA_NOTIFICACION_INDIVIDUALIZACION_ARS = 21;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_AFP = 22;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_ARL = 23;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_ARS = 24;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_ERROR_AFP = 25;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_ERROR_ARL = 26;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_ERROR_ARS = 27;
        public static final int NOTIFICACION_PROCESO_EXITOSO_PUBLICAR_INFORMACION = 28;
        public static final int NOTIFICACION_PROCESO_EXITOSO_RECIBIR_INFORMACION = 29;
        public static final int NOTIFICACION_PROCESO_FALLIDO_INTERCAMBIO_INFORMACION = 30;
        public static final int NOTIFICACION_INTERNA_ESPECIALIZACION_FALLIDO = 11;
        public static final int NOTIFICACION_CAPITAS_RECHAZADOS_SFS = 31;
        public static final int CONFIRMACION_AUTOMATICA_FALLIDA = 35;
        public static final int NOTIFICACION_DE_DISPONIBILIDAD_DE_CARTERA_DE_AFILIADOS = 36;
        public static final int CONFIRMACION_AUTOMATICA_PENSIONES = 32;
        public static final int CONFIRMACION_AUTOMATICA_CONTRIBUTIVO = 33;
        public static final int CONFIRMACION_AUTOMATICA_RIESGOS_LABORALES = 34;
        public static final int INTERCAMBIO_INFORMACION_PROCESO_FALLIDO_INTERCAMBIO_NO_CATALOGADO = 37;
        public static final int NOTIFICACION_EXTERNA_NOTIFICACION_INDIVIDUALIZACION_CAPITA = 40;
        public static final int NOTIFICACION_INTERNA_NOTIFICACION_INDIVIDUALIZACION_CAPITA = 38;
    }

    public static class TipoPago {
        public static final String CORRIENTE = "CO";
        public static final String ADELANTADO = "AD";
        public static final String ATRASADO = "AT";

        public static Object[] valores() {
            return new String[]{CORRIENTE, ADELANTADO, ATRASADO};
        }
    }

    public static class Rubro {

        public static final short CUENTA_PERSONAL = 1;
        public static final short SEGURO_DE_VIDA = 2;
        public static final short COMISION_AFP = 3;
        public static final short COMISION_SIPEN = 4;
        public static final short FONDO_DE_SOLIDARIDAD = 5;
        public static final short APORTES_VOLUNTARIOS_ORDINARIOS = 6;
        public static final short INTERESES_CUENTA_PERSONAL = 7;
        public static final short INTERESES_SEGURO_DE_VIDA = 8;
        public static final short INTERESES_COMISION_AFP = 9;
        public static final short INTERESES_COMISION_SIPEN = 10;
        public static final short INTERESES_APORTES_VOLUNTARIOS_ORDINARIOS = 11;
        public static final short INTERESES_FONDO_DE_SOLIDARIDAD = 12;
        public static final short RECARGOS_PENSIONES = 13;
        public static final short MONTO_AJUSTE = 14;
        public static final short CUIDADO_DE_LA_SALUD_DE_LAS_PERSONAS = 15;
        public static final short ESTANCIAS_INFANTILES = 16;
        public static final short SUBSIDIOS = 17;
        public static final short COMISION_SISALRIL = 18;
        public static final short INTERES_SALUD = 19;
        public static final short RECARGOS_SALUD = 20;
        public static final short PER_CAPITA_ADICIONALES = 21;
        public static final short MONTO_RIESGOS_LABORALES = 22;
        public static final short COMISION_SRL = 23;
        public static final short INTERES_SRL = 24;
        public static final short INTERES_COMISION_SRL = 25;
        public static final short RECARGOS_SRL = 26;
        public static final short OTRAS_RECAUDACION = 27;
        public static final short INTERESES_OTRAS_RECAUDACION = 28;
        public static final short FONAMAT = 29;
        public static final short APORTES_VOLUNTARIOS_EXTRAORDINARIOS = 30;
        public static final short COMISION_TSS = 31;
        public static final short INTERES_COMISION_TSS = 32;
        public static final short COMISION_DIDA = 33;
        public static final short INTERES_COMISION_DIDA = 34;
    }

    public static class CodigoAutorizacionSisalril {
        public static final String AUTORIZADO = "S";
        public static final String RECHAZADO = "N";
        public static final String VENCIDO = "V";
    }

    public static class ParametroSeguridad {
        public static final String CANTIDAD_SEGUNDOS_SESSION_PORTAL_ACTIVA = "CANTIDAD_SEGUNDOS_SESSION_PORTAL_ACTIVA";
        public static final int CANTIDAD_SEGUNDOS_SESSION_PORTAL_POR_DEFECTO = 1800; // valor en segundos.
        public static final String TOKEN_CARACTER = "TOKEN_CARACTERES";
        public static final String TOKEN_LENGTH = "TOKEN_LENGTH";
        public static final String CANTIDAD_HORAS_VIGENCIA_TOKEN = "CANTIDAD_HORAS_VIGENCIA_TOKEN";
        public static final String CODIGO_SEGURIDAD_CARACTER = "CODIGO_SEGURIDAD_CARACTERES";
        public static final String CODIGO_SEGURIDAD_LENGTH = "CODIGO_SEGURIDAD_LENGTH";
        public static final String CLAVE_ENCRIPTACION_DIGEST = "CLAVE_ENCRIPTACION_DIGEST";
        public static final String CANTIDAD_DIAS_VENCIMIENTO_CLAVE = "CANTIDAD_DIAS_VENCIMIENTO_CLAVE";
        public static final String CANTIDAD_DIAS_CONTRASENA_PROXIMO_A_VENCER = "CANTIDAD_DIAS_CONTRASENA_PROXIMO_A_VENCER";
        public static final String AMBIENTE_OPERATIVO = "AMBIENTE_OPERATIVO";
        public static final String VERSION_SISTEMA = "VERSION_SISTEMA";
        public static final String CANTIDAD_MILISEGUNDOS_SESSION_PORTAL_ACTIVA_AJAX = "CANTIDAD_MILISEGUNDOS_SESSION_PORTAL_ACTIVA_AJAX";
        public static final String UNISIGMA_REALM = "unisigmaRealm";

    }

    public static class TipoArea {
        public static final short INTERNA = 1;
        public static final short EXTERNA = 2;
    }

    public static class TipoDestinoAporte {
        public static final short ENTIDAD_ASIGNADA_APORTE = (short) 1;
        public static final short RUBRO = (short) 2;
        public static final short CONDICION_APORTE = (short) 3;
        public static final short ARS = (short) 4;
    }

    public static class TipoDestino {
        public static final short ENTIDAD_ADMINISTRADORA_DEL_SEGURO = (short) 1;
        public static final short ENTIDAD_DESTINO_ASIGNADA_AL_RUBRO = (short) 2;
        public static final short EXCEPCION_ASIGNACION_DE_RUBRO = (short) 3;
        public static final short NINGUNA_ENTIDAD = (short) 4;
    }

    public static class TipoValorTraspaso {
        public static final String VALOR_PROCESO_ACTUAL = "A";
        public static final String VALOR_REZAGADO = "R";
    }

    public static class TipoDisponibilidad {
        public static final Short ENTIDAD = 1;
        public static final Short TIPO_ENTIDAD = 2;
    }

    public static class TipoDia {
        public static final short CALENDARIO = 1;
        public static final short LABORABLES = 2;
    }

    public static class TipoDiaFeriado {
        public static final short DIA_COMPLETO = 1;
        public static final short DIA_PARCIAL = 2;
    }

    public static interface TipoFecha {
        short GENERACION = 1;
        short APLICACION = 2;
        short INDIVIDUALIZACION = 1;
        short DISPERSION = 2;
        short CONFIRMACION = 3;
        short RECEPCION = 1;
        short ACCION_EVENTO_TRASPASO = 2;
        short INICIO_HISTORICO_ESTADO_SOLICITUD_TRASPASO = 3;
        short CIERRE_TRASPASO = 4;
        short CERTIFICACION = 2;
        short PROCESAMIENTO = 2;
        short INICIO_PROCESAMIENTO = 2;
        short FIN_PROCESAMIENTO = 3;
        short CANCELACION = 4;
    }

    public static interface TipoFechaAutorizacion {
        public static short FECHA_EMISION = 1;
        public static short FECHA_AUTORIZACION = 2;
        public static short FECHA_INDIVIDUALIZACION = 3;
    }

    public static class TipoFechaReversoIndCap {
        public static final Short GENERACION = 1;
        public static final Short NOTIFICACION = 2;

    }

    public static class TipoFechaTraspaso {
        public static final Short EFECTIVIDAD = 1;
        public static final Short CERTIFICACION = 2;
        public static final Short CIERRE = 3;

    }

    public static class TipoAntiguedad {
        public static final Short NO_APLICA_ANTIGUEDAD = 0;
        public static final Short CARENCIA = 1;
        public static final Short PRIMEROS_PAGOS_ATRASADOS = 2;

    }

    public static interface TipoFechaAfiliacionOriginal {
        String FECHA_AFILIACION_ORIGINAL = "FO";
        String FECHA_AFILIACION_REPARTO = "FR";
    }

    public static interface TipoFechaLote {
        short RECEPCION = 1;
        short PROCESAMIENTO = 2;
        short CANCELACION = 3;
    }

    public static interface TipoFechaEjecucionReporte {
        short FECHA_DE_RECEPCION_DE_SOLICITUD = 1;
        short FECHA_DE_INICIO_PROCESAMIENTO = 2;
        short FECHA_DE_FIN_PROCESAMIENTO = 3;
        short FECHA_DE_CANCELACION = 4;
    }

    public static interface CondicionAporte {
        short APORTE_INDIVIDUALIZADO = 1;
        short APORTE_NOTIFICADO = 2;
        short APORTE_DISPERSADO = 3;

        /*
         * Constantes de la consulta Aportes sin Asignar y de aportes del seguro de pensiones
         */
        short BLOQUEADOS = 1;
        short SIN_ASIGNAR_Y_SIN_BLOQUEAR = 2;
        short ASIGNADOS_Y_SIN_BLOQUEAR = 3;
        short SIN_BLOQUEAR = 4;

    }

    public static interface CondicionFactura {
        short FACTURAS_AUTORIZADAS_NO_PAGADAS = 1;
        short FACTURAS_AUTORIZADAS_PAGADAS = 2;
    }

    public static interface TipoPerCapita {
        public static final Short PLAN_BASICO_SALUD = 1;
        public static final Short FONAMAT = 2;
        public static final Short ESTANCIA_INFANTIL = 3;
    }

    public static interface Database {

        static interface Types {

            String TAB_TYPE_MOTIVO_ESTADO_TBL = "TAB_TYPE_MOTIVO_ESTADO_TBL";
            String TAB_TYPE_PERIODOS_TBL = "TAB_TYPE_PERIODO_TBL";
            String TAB_TYPE_LISTA_NUMEROS_TBL = "TAB_TYPE_LISTA_NUMEROS_TBL";
            String TAB_TYPE_ESTADO_MOTIVO_TBL = "TAB_TYPE_ESTADO_MOTIVO";

            String TAB_TYPE_LISTA_VARCHAR_TBL = "TAB_TYPE_LISTA_VARCHAR_TBL";
        }

    }

    /**
     * Enum para las Nacionalidades,
     * <p>
     * Creado como Enum por mejores practicas recomendadas por SonarQ.
     *
     * @author Ramon Rodriguez <i>[rerodriguez@unipago.com.do]</i>
     * @since OA 13
     */
    public enum Nacionalidad {

        SIN_CODIFICAR((short) 0),
        NACIONALIDAD_DOMINICANA((short) 1);

        private short id;

        private Nacionalidad(short id) {
            this.id = id;
        }

        public short getId() {
            return id;
        }
    }

    public enum TipoFondo {

        CCI((short) 1),
        FONDO_SUSTITUTIVO_DE_PENSIONES((short) 2),
        SISTEMA_DE_REPARTO((short) 3);

        private short id;

        private TipoFondo(short id) {
            this.id = id;
        }

        public short getId() {
            return id;
        }

    }

    public enum MotivoEstadoSolicitudServicio {

        CIUDADANO_AFILIADO_COMO_PENSIONADO(37);

        private int codigo;

        private MotivoEstadoSolicitudServicio(int codigo) {
            this.codigo = codigo;
        }

        public int getCodigo() {
            return codigo;
        }
    }

    public static final String DIRECCION_IP_LOCAL = "127.0.0.1";
    public static final int DIAS_LIMITE_AFILAICION_VOLUNTARIA_PENSIONES = 30;
    public static final int MOTIVIO_PENDIENTE_VALIDAR_NOMINA = 64;
    public static final int MOTIVO_FECHA_FORMULARIO_MAYOR_ACTUAL = 253;
    public static final int ESTADO_SOLICITUD_ACEPTADA = 1;
    public static final int ESTADO_SOLICITUD_PENDIENTE = 2;
    public static final int ESTADO_SOLICITUD_RECHAZADA = 3;
    public static final String ESTADO_AFILIACION_ACTIVA = "AC";
    public static final int SERVICIO_SISTEMA_ID = 4;
    public static final int motivo = 75;
    public static final int SERVICIO_ID_AFILIACION_AUTOMATICA = 18;
    public static final String ESTADO_ACTIVO_AC = "AC";
    public static final String ESTADO_FACTURA_PAGADA_PA = "PA";
    public static final String ESTADO_PAGO_ACEPTADO = "OK";
    public static final String ESTADO_SOLICITUD_ACEPTADA_OK = "OK";
    public static final String ESTADO_SOLICITUD_RECHAZADA_RE = "RE";
    public static final String ESTADO_PAGO_PENDIENTE_PROCESAR = "PE";
    public static final String CORRESPONDENCIA_FACTURA_PAGO_PE = "PE";
    public static final String CORRESPONDENCIA_FACTURA_PAGO_RE = "RE";
    public static final String ESTADO_APORTE_BLOQUEADO_POR_FALLECIMIENTO_BF = "BF";
    public static final String ESTADO_APORTE_PAGADO_PA = "PA";
    public static final String ESTADO_PROVINCIA_ACTIVA = "AC";
    public static final String ESTADO_PROVINCIA_INACTIVA = "IN";
    public static final String ESTADO_MUNICIPIO_ACTIVO = "AC";
    public static final String ESTADO_MUNICIPIO_INACTIVO = "IN";
    public static final String NOTIFICACION_ASUNTO_NOTIFICACION = "NOTIFICACION";

    public static final int RUBRO_MONTO_AJUSTE_ID = 14;
    public static final int ENTIDAD_RECAUDADORA_TEMPORAL = 401;
    public static final int SERVICIO_SISTEMA_GESTIONAR_PAGOS = 5;

    public static final short SEGURO_PENSIONES_ID = 1;
    public static final int RUBRO_CUENTA_PERSONAL = 1;
    public static final int RUBRO_INTERESES_CUENTA_PERSONAL = 7;
    public static final int RUBRO_SEGURO_DE_VIDA = 2;
    public static final int RUBRO_INTERESES_SEGURO_DE_VIDA = 8;
    public static final int RUBRO_OTRAS_RECAUDACIONES = 27;
    public static final int RUBRO_INTERESES_OTRAS_RECAUDACIONES = 28;

    public static final int SERVICIO_SISTEMA_ID_INICIAR_SESSION = 5;
    public static final int SERVICIO_SISTEMA_ID_COMPLETAR_ASIGNACION_GRUPOS_ROLES_USUARIO = 280;

    public static final short TIPO_NOTIFICACION_ADVERTENCIA = 1;
    public static final short TIPO_NOTIFICACION_EXITO = 2;
    public static final short TIPO_NOTIFICACION_FALLO = 3;
    public static final int USUARIO_SISTEMA = 1;
    public static final String CODIGO_USUARIO_SISTEMA = "UNIPAGO_SYS";
    public static final int USUARIO_ID_USUARIO_SISTEMA = 1;

    public static final String CONTRASENA_REGEX = "CONTRASENA_REGEX";
    public static final String CONTRASNIA_REG_LENGTH_PLACEHOLDER = "MIN_LENGTH";

    public static final short LDAP_NIVEL_DOMINIO = 1;
    public static final short LDAP_NIVEL_USUARIO = 2;

    public static final int NUMERO_ORDEN_LONGITUD = 6;

    public static final int NUMERO_PERIODOS_SIN_COTIZAR = -6;
    public static final int CANTIDAD_ADELANTOS_PERIODO_CORRIENTE = 1;
    public static byte PRIMER_ELEMENTO_LISTA = 0;
    public static final byte VALOR_OPCIONAL = 0;

    public static final int PRIMER_REGITRO_LOTE = 1;

    public static final Short NACIONALIDAD_DOMINICANA = 1;
    public static final Integer TAMANO_DESCRIPCION_BITACORA_EVENTO = 4000;
    public static final Integer ANO_INICIO_SEGURIDAD_SOCIAL = 2003;


    public enum MotivoEnum {
        DATOS_REQUERIDOS_PROPORCIONADOS(10001, "Existen datos requeridos no proporcionados"),
        NUMERO_LOTE_NO_CORRESPONDE_ENTIDAD(10042, "NUMERO DE LOTE NO CORRESPONDE A LA ENTIDAD"),
        NUMERO_LOTE_CORRESPONDE_SERVICIO(10019, "NUMERO DE LOTE NO CORRESPONDE AL SERVICIO"),
        NUMERO_LOTE_PROPORCIONADO_NO_PROCESADO(10041, "NUMERO DE LOTE PROPORCIONADO NO HA SIDO PROCESADO"),
        NUMERO_LOTE_NO_EXISTE(140, "NUMERO DE LOTE PROPORCIONADO NO EXISTE"),
        LA_FECHA_INICIAL_DEBE_SER_ANTERIOR_O_IGUAL_A_LA_FECHA_FINAL(1693, "LA FECHA INICIAL DEBE SER ANTERIOR O IGUAL A LA FECHA FINAL"),
        RANGO_FECHAS_PROPORCIONADO_EXCEDE_EL_TIEMPO_MAXIMO_PERMITIDO(1704, "EL RANGO DE FECHAS PROPORCIONADO EN LA CONSULTA EXCEDE EL TIEMPO MAXIMO PERMITIDO"),
        DEBE_EXISTIR_AL_MENOS_UN_CRITERIO_DE_BUSQUEDA(10177, "DEBE EXISTIR AL MENOS UN CRITERIO DE BUSQUEDA PARA REALIZAR LA CONSULTA"),
        SERVICIO_SOLICITADO_CON_PARAMETROS_INCORRECTOS(10028, "SERVICIO SOLICITADO CON PARAMETROS INCORRECTOS");

        private int codigo;
        private String descripcion;

        private MotivoEnum(int codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        public int getCodigo() {
            return codigo;
        }

        public String getDescripcion() {
            return descripcion;
        }

    }

    public enum TipoAsignacion {

        APORTES_BLOQUEADOS_POR_TRASPASO_A_LA_ENTIDAD_ORIGEN(Short.parseShort("1"), "Asignaci�n de Aportes Bloqueados por Traspaso a la Entidad Origen"),
        APORTES_BLOQUEADOS_Y_O_NOTIFICACIONES_A_LA_ENTIDAD_DESTION(Short.parseShort("2"), "Asignacion de Aportes Bloqueados y/o Notificados a la Entidad destino");

        private Short codigo;
        private String descripcion;

        private TipoAsignacion(Short codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        public Short getCodigo() {
            return this.codigo;
        }

        public String getDescripcion() {
            return this.descripcion;
        }

    }

    public enum Destinos {

        ENTIDAD_ADMINISTRADORA_DEL_SEGURO(Short.parseShort("1"), "Entidad Administradora del Seguro"),
        ENTIDAD_DESTINO_ASIGNADA_AL_RUBRO(Short.parseShort("2"), "Entidad Destino Asignada al Rubro"),
        EXCEPCION_DE_ASIGNACION_DE_RUBROS(Short.parseShort("3"), "Excepcion de Asignaci�n de Rubros"),
        NINGUNA_ENTIDAD(Short.parseShort("4"), "Ninguna Entidad");

        private Short codigo;
        private String descripcion;

        private Destinos(Short codigo, String descripcion) {
            this.codigo = codigo;
            this.descripcion = descripcion;
        }

        public Short getCodigo() {
            return this.codigo;
        }

        public String getDescripcion() {
            return this.descripcion;
        }

        public static Object[] valores() {
            return new Short[]{ENTIDAD_ADMINISTRADORA_DEL_SEGURO.codigo,
                    ENTIDAD_DESTINO_ASIGNADA_AL_RUBRO.codigo,
                    EXCEPCION_DE_ASIGNACION_DE_RUBROS.codigo,
                    NINGUNA_ENTIDAD.codigo};
        }

    }


    public static class JNDI {
        public static String WEB_SERVICE_CONTEXT = "java:comp/WebServiceContext";
    }

    public static class CodigoTipoNovedad {

        private CodigoTipoNovedad() {
        }

        public static final String DEPENDIENTE_DIRECTO_COTIZANTE = "72";
        public static final String DEPENDIENTE_ADICIONAL_COTIZANTE = "63";
        public static final String CAMBIO_DATOS_AFILIACION = "01";
        public static final String CAMBIO_TITULARIDAD = "40";
        public static final String DIVORCIO_O_SEPARACION = "30";
        public static final String BAJA_DE_AFILIADOS_COTIZANTES_EN_EL_REGIMEN_DE_PENSIONADOS = "83";
        public static final String CAMBIO_DE_UBICACION_GEOGRAFICA_DEL_AFILIADO = "07";
        public static final String ASIGNACION_NUMERO_CONTRATO = "03";

    }

    public static class TipoCambio {

        private TipoCambio() {
        }

        /**
         * Datos Afiliaci�n (c�digo 1)
         */
        public static final short DATOS_AFILIACION_1 = 1;

        /**
         * Datos Ciudadano (c�digo 2)
         */
        public static final short DATOS_CIUDADANO_2 = 2;

        /**
         * Datos Afiliaci�n y del Ciudadanon (c�digo 3)
         */
        public static final short DATOS_AFILIACION_Y_CIUDADANO_3 = 3;

        /**
         * Contrato Afiliaci�n (c�digo 4)
         */
        public static final short CONTRATO_AFILIACION_4 = 4;

        /**
         * Ubicaci�n Geogr�fica (c�digo 5)
         */
        public static final short UBICACION_GEOGRAFICA_5 = 5;

    }

    public static class GrupoNovedad {

        private GrupoNovedad() {
        }

        public static final short SOLICITUDES_DE_PENSION = 1;
        public static final short CAMBIO_DE_DATOS = 2;
        public static final short CAMBIO_COMPOSICION_NUCLEO_FAMILIAR = 4;
        public static final short GRUPO_NOVEDAD_BAJA_AFILIADO = 5;
        public static final short CAMBIOS_EN_NOMINA = 6;
        public static final short BAJA_FALLECIMIENTO = 3;

    }

    public static interface TipoNovedad {
        short NOTIFICACION_FALLECIMIENTO = 11;
        short DIVORCIO_O_SEPARACION = 13;
    }

    public static interface CodigoNovedad {
        String NOTIFICACION_FALLECIMIENTO = "10";
    }

    public static interface MotivosParticipacion {
        short INFORMATIVO = 4;
        short CAMBIO_DE_DATOS = 3;
        short BAJA = 2;
        short ALTA = 1;
    }

    public static class TipoDeFecha {
        public static final short FECHA_DE_RECEPCION = 1;
        public static final short FECHA_DE_CIERRE = 2;
        public static final short FECHA_DE_RESPUESTA_ENTIDAD_REVISORA = 3;

        /**
         * FECHAS PARA SOLICITUD GESTION CONTACTO.
         */
        public static final short FECHA_DE_CREACION = 1;
        public static final short FECHA_DE_VENCIMIENTO = 2;
        public static final short FECHA_DE_CIERRE_DE_SOLICITUD_GESTION = 3;
    }

    public static class TipoUbicacion {
        public static final short PROVINCIA = 1;
        public static final short REGION = 2;
        public static final short MUNICIPIO = 3;
    }


    public static class TipoArchivo {
        public static final String ENTRADA = "E";
        public static final String SALIDA = "S";
        public static final String ARCHIVO_GENERADO = "G";
    }


    public static class TipoRegistro {
        public static final String ENCABEZADO = "E";
        public static final String DETALLE = "D";
        public static final String SUMARIO = "S";
    }

    public static class TipoIntercambioContingencia {

        public static final short CARGA_SOLICITUD = 1;
        public static final short SOLICITUD_GENERACION_ARCHIVO = 2;
        public static final short CARGA_DOCUMENTO = 3;

        public static Object[] valores() {
            return new Object[]{CARGA_SOLICITUD, SOLICITUD_GENERACION_ARCHIVO, CARGA_DOCUMENTO};
        }

    }

    public static class ServiciosContingencia {
        public static final Integer ENVIO_DOCUMENTOS_ADMINISTRADORA_FONDO_DE_PENSIONES = 88;
        public static final Integer ENVIO_DOCUMENTOS_FONDOS_DE_REPARTO = 89;
        public static final Integer ENVIO_DOCUMENTOS_ADMINISTRADORA_RIESGOS_DE_SALUD_DEL_REGIMEN_CONTRIBUTIVO = 90;
        public static final Integer ENVIO_DOCUMENTOS_ADMINISTRADORA_RIESGOS_DE_SALUD_DEL_REGIMEN_SUBSIDIADO = 91;
        public static final Integer ENVIO_DOCUMENTOS_ADMINISTRADORA_RIESGOS_DE_SALUD_DE_PLANES_ESPECIALES_DE_PENSIONADOS = 92;
        public static final Integer ENVIO_DOCUMENTOS_ADMINISTRADORA_ESTANCIAS_INFANTILES = 93;
    }

    public static class Seguridad {
        public static final String MAX_PWD_AGE_MORALES = "MAX_PWD_AGE_MORALES";
        public static final String MAX_PWD_AGE_FISICO = "MAX_PWD_AGE_FISICO";
        public static final String MIN_PWD_LENGTH = "MIN_PWD_LENGTH";
        public static final String GRUPO_FISICO_LDAP = "GRUPO_FISICO_LDAP";
        public static final String GRUPO_MORAL_LDAP = "GRUPO_MORAL_LDAP";

    }

    public static class AfectaTipoAjusteFactura {
        public static final String NSS = "N";
        public static final String FACTURA = "F";
    }

    public static class UrlServicio {
        public static final String BANCO = "URL_SERVICIOS_BANCO";
        public static final String REGULADORA = "URL_SERVICIOS_REGULADORA";
        public static final String ARS = "URL_SERVICIOS_ARS";
        public static final String AFP = "URL_SERVICIOS_AFP";
        public static final String CORE_INTERNOS = "URL_SERVICIOS_CORE_INTERNOS";
    }


    public static final String FORMATO_ARCHIVO_CONTINGENCIA = "xml";

    public static interface Facturable {
        String SI = "S";
        String NO = "N";
    }

    public static interface ProcesoIndividualizacion {
        short REGULAR = 1;
        short TRABAJADORES_DOMESTICOS = 2;
    }
}