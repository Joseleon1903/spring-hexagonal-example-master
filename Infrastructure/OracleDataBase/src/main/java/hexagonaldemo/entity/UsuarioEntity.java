package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "Usuario")
@Table(name = "USUARIO", uniqueConstraints = { @UniqueConstraint(columnNames = "CONTACTO_ID") })
@NamedQueries({ @NamedQuery(name = UsuarioEntity.Query.BUSCAR_TODO, query = "SELECT DISTINCT u FROM Usuario u"),
        @NamedQuery(name = UsuarioEntity.Query.BUSCAR_POR_ID, query = "SELECT u FROM Usuario u WHERE u.usuarioId = :usuarioId"),
        @NamedQuery(name = UsuarioEntity.Query.BUSCAR_POR_CODIGO, query = "SELECT u FROM Usuario u WHERE u.codigo = :codigo"),
        @NamedQuery(name = UsuarioEntity.Query.BUSCAR_POR_CONTACTO_ID_ESTADO, query = "SELECT u FROM Usuario u WHERE u.contactoId = :contactoId AND (:estado IS NULL OR u.estado = :estado)"),
})
@NamedNativeQueries({
        @NamedNativeQuery(name = UsuarioEntity.Query.BUSCAR_POR_ENTIDAD, resultClass = UsuarioEntity.class,
                query = "SELECT u FROM USUARIO u JOIN CONTACTO c ON u.CONTACTO_ID = c.CONTACTO_ID WHERE c.ENTIDAD_ID = ?1"),
})
public class UsuarioEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "USUARIO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USUARIO_SEQ")
//    @SequenceGenerator(name = "USUARIO_SEQ", sequenceName = "USUARIO_SEQ", allocationSize = 1, initialValue = 1)
    private Integer usuarioId;

    @Basic(optional = false)
    @Column(name = "CODIGO", nullable = false, length = 30)
    private String codigo;

    @Column(name = "CONTACTO_ID")
    private Integer contactoId;

    @Basic(optional = false)
    @Column(name = "TIPO_USUARIO_ID")
    private Short tipoUsuarioId;

    @Basic(optional = true)
    @Column(name = "USUARIO_ULTIMO_CAMBIO_ID", nullable = false)
    private Integer usuarioUltimoCambioId;

    @Basic(optional = true)
    @Column(name = "LLAVE_ENCRIPTACION_CLAVE", nullable = true, length = 30)
    private String llaveEncriptacionClave;

    @Basic(optional = true)
    @Column(name = "CANT_AVISOS_PROX_VENC_CLAVE", nullable = true, length = 2)
    private Short cantidadAvisosProximoVencimientoClave;

    @Basic(optional = true)
    @Column(name = "FECHA_ULT_AVISO_PROX_VENC_CLV", nullable = true)
    private LocalDate fechaUltimoAvisoProximoVencimientoClave;

    @Basic(optional = true)
    @Column(name = "FECHA_AVISO_VENC_CLV", nullable = true)
    private LocalDate fechaAvisoVencimientoClave;

    @Basic(optional = true)
    @Column(name = "FECHA_ULTIMA_AUTENTICACION", nullable = true)
    private LocalDate fechaUltimaAutenticacion;

    @Basic(optional = true)
    @Column(name = "FECHA_ULTIMO_CAMBIO", nullable = true)
    private LocalDate fechaUltimoCambio;

    @Basic(optional = false)
    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Basic(optional = true)
    @Column(name = "FECHA_NOTIFICACION_BLOQUEO", nullable = true)
    private LocalDate fechaNotificacionBloqueo;



    /**
     * namedQueries del entity {@link Usuario}
     * @author
     *
     */
    public static class Query {
        public static final String BUSCAR_POR_ID = "Usuario.findByUsuarioId";
        public static final String BUSCAR_TODO = "Usuario.findAll";
        public static final String BUSCAR_POR_CODIGO = "Usuario.findByCodigo";
        public static final String BUSCAR_POR_ENTIDAD = "Usuario.buscarPorEntidad";
        public static final String BUSCAR_POR_CONTACTO_ID_ESTADO = "Usuario.buscarPorContactoIdEstado";
        public static final String BUSCAR_ENTIDAD_POR_USUARIO_CODIGO = "Usuario.buscarEntidadPorCodigo";

        private Query(){}
    }

    /**
     *
     * @author cjvasquez
     *
     */
    public static class Funciones{

        public static final String BUSCAR_POR_DATOS_GENERALES_FN = "USUARIO_ES_PKG.BUSC_POR_DATOS_GENERALES";
        public static final String BUSCAR_USUARIOS_POR_ENTIDAD_FN = "UNISIGMA_CONSULTAS_PKG.BUSCAR_USUARIOS_POR_ENTIDAD_FN";
        public static final String PROXIMA_SEQUENCIA_QUERY = "SELECT USUARIO_SEQ.NEXTVAL as PROXIMASECUENCIA FROM DUAL";
        public static final String BUSCAR_USUARIOS_CON_GRUPOS_ROLES_ASIGNADOS_FN = "USUARIO_ES_PKG.BUSC_CON_GRP_ROLES_ASIG_FN";
        public static final String BUSCAR_USUARIOS_DISTINTOS_CON_GRUPOS_ROLES_ASIG_FN = "USUARIO_ES_PKG.BUSC_USU_DIST_GRP_ROL_ASIG_FN";
        public static final String GENERAR_CODIGO_USUARIO_FN = "USUARIO_ES_PKG.GENERAR_CODIGO_USUARIO";

        private Funciones(){}

    }
}
