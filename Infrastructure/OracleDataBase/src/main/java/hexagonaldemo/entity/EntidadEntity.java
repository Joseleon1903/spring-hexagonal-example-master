package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="Entidad" )
@Table(name = "ENTIDAD")
@NamedQueries({
        @NamedQuery(name = "Entidad.findAll", query = "SELECT e FROM Entidad e"),
        @NamedQuery(name = "Entidad.findByEntidadId", query = "SELECT e FROM Entidad e WHERE e.entidadId = :entidadId"),
        @NamedQuery(name = "Entidad.findByClaveEntidad", query = "SELECT e FROM Entidad e WHERE e.claveEntidad = :claveEntidad"),
        @NamedQuery(name = "Entidad.findByDescripcion", query = "SELECT e FROM Entidad e WHERE e.descripcion = :descripcion"),
        @NamedQuery(name = "Entidad.findByEstado", query = "SELECT e FROM Entidad e WHERE e.estado = :estado"),
        @NamedQuery(name = "Entidad.findByClaveEntidadTipoEntidad", query = "SELECT e FROM Entidad e WHERE e.claveEntidad =:claveEntidad and e.tipoEntidadId =:tipoEntidad")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = "Entidad.EntidadSupervisoraPorSeguroId", query = "SELECT ENT.* FROM ENTIDAD ENT JOIN ENTIDAD_SUPERVISORA_SEGURO ES on (ENT.ENTIDAD_ID = ES.ENTIDAD_ID) WHERE ES.SEGURO_ID = ?", resultClass = EntidadEntity.class)
})
public class EntidadEntity {

    @Id
    @Column(name = "ENTIDAD_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ENTIDAD_SEQ")
    @SequenceGenerator(name = "ENTIDAD_SEQ", sequenceName = "ENTIDAD_SEQ", allocationSize = 1, initialValue = 1)
    private Integer entidadId;

    @Column(name = "CLAVE_ENTIDAD", nullable = false)
    private Short claveEntidad;

    @Column(name = "SIGLA")
    private String sigla;

    @Column(name = "DESCRIPCION", nullable = false, length = 150)
    private String descripcion;

    @Column(name = "PARTICIPA_AFILIACION_AUT")
    private Boolean participaAfiliacionAutomatica;

    @Column(name = "ESTADO", nullable = false, length = 2)
    private String estado;

    @Column(name = "TIPO_ENTIDAD_ID")
    private Short tipoEntidadId;

    @Column(name = "RNC")
    private String rnc;

    @Column(name = "FECHA_INSCRIPCION")
    private LocalDate fechaInscripcion;

    @Column(name = "NUMERO_ACREDITACION")
    private String numeroAcreditacion;

    @Column(name = "ENTIDAD_SUPERVISORA_ID")
    private Integer entidadSupervisoraId;

    @Column(name = "REGIMEN_ID", nullable = true, length = 2)
    private Short regimenId;

    @Column(name = "LDAP_ORGANIZATION_UNIT", nullable = true)
    private String ldapOrganizationUnit;

    @Column(name = "USUARIO_ARCHIVO")
    private Integer usuarioId;

    @Column(name = "TIPO_FONDO_ID")
    private Short tipoFondoId;

    @Column(name = "TIPO_EMPLEADOR_ID", nullable = true)
    private Short tipoEmpleadorId;

    @Column(name = "TIPO_ADMINISTRACION_ID", nullable = true)
    private Short tipoAdministracionId;

    @Column(name = "TIPO_ESTANCIA_INFANTIL_ID", nullable = true)
    private Short tipoEstanciaInfantilId;

    @Column(name = "MUNICIPIO_ID", nullable = true)
    private Short municipioId;

    @OneToMany(cascade = CascadeType.REFRESH, mappedBy = "entidadId", fetch=FetchType.LAZY)
    private List<DominioCorreoEntidadEntity> dominiosCorreo;

    @Column(name = "GRUPO_ECONOMICO_ID", length=3)
    private Short grupoEconomicoId;

    @Column(name = "COMPARTE_CONTACTOS_GRUPO_ECO")
    private Boolean comparteContactosGrupoEconomico;

    @Column(name = "COMPARTE_AGENTES_GRUPO_ECO")
    private Boolean comparteAgentesGrupoEconomico;

    @Column(name = "CODIGO_CLIENTE_FACTURACION")
    private String codigoClienteFacturacion;

    @Column(name = "ACCIONISTA")
    private Boolean accionista;

    @Column(name = "APLICA_MEMBRESIA")
    private Boolean aplicaMembresia;

    @Column(name = "APLICA_FACTURACION")
    private Boolean aplicaFacturacion;


    @Column(name = "REQ_APROBACION_APLIC_BAJA_AU")
    private Boolean requiereAprobacionAplicarBajaAutomatica;

    @Column(name = "VALIDA_EDAD_IND_SEGURO_VIDA")
    private Boolean validaEdadIndividualizacionSeguroVida;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "ENTIDAD_INSTITUCION_PEN", joinColumns = @JoinColumn(name = "ENTIDAD_ID", referencedColumnName = "ENTIDAD_ID"))
    @Column(name = "INSTITUCION_PENSIONADO_ID")
    private List<Short> institucionesPensionados;

    @Column(name = "APLICA_PART_MOVIMIENTO_FONDO")
    private Boolean aplicaParticipacionMovimientoFondo;

    @Column(name = "VALIDA_ANTG_IND_SEGURO_VIDA")
    private Boolean validaAntiguedadIndividualizacionSeguroVida;



}