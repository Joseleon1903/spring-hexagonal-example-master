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
@Entity(name ="Contacto")
@Table(name = "CONTACTO")
@NamedQueries({
        @NamedQuery(name = "Contacto.findByAll", query = "SELECT c FROM Contacto c"),
        @NamedQuery(name = ContactoEntity.Queries.BUSCAR_CONTACTOS_POR_ENTIDAD_ID, query = "SELECT c FROM Contacto c where c.entidadId = :entidadId"),
        @NamedQuery(name = "Contacto.buscarPorId", query = "SELECT c FROM Contacto c where c.contactoId = :contactoId")
})
@NamedNativeQueries({
        @NamedNativeQuery(name = ContactoEntity.Queries.BUSCAR_CONTACTO_POR_CEDULA, resultClass = ContactoEntity.class,
                query = "SELECT c.* FROM CONTACTO c JOIN CIUDADANO ciu ON c.CIUDADANO_ID = ciu.CIUDADANO_ID "
                        + "WHERE ciu.CEDULA = ?1"),
        @NamedNativeQuery(name = ContactoEntity.Queries.BUSCAR_CONTACTO_POR_CODIGO_USUARIO, resultClass = ContactoEntity.class,
                query = "SELECT c.* FROM CONTACTO c JOIN USUARIO usu ON c.CONTACTO_ID = usu.CONTACTO_ID "
                        + "WHERE UPPER(usu.CODIGO) = UPPER(?1)"),
})
public class ContactoEntity {


    @Id
    @Column(name = "CONTACTO_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CONTACTO_SEQ")
    @SequenceGenerator(name = "CONTACTO_SEQ", sequenceName = "CONTACTO_SEQ", allocationSize = 1, initialValue = 1)
    private Integer contactoId;

    @Column(name = "TIPO_PERSONA", nullable = false)
    private Short tipoPersona;

    @Column(name = "CIUDADANO_ID")
    private Long ciudadanoId;

    @Column(name = "DESCRIPCION")
    private String descripcion;

    @ElementCollection(fetch = FetchType.EAGER)
    @CollectionTable(name = "CONTACTO_AREA_NEGOCIO",joinColumns = @JoinColumn(name = "CONTACTO_ID",referencedColumnName="CONTACTO_ID"))
    @Column(name = "AREA_NEGOCIO_ID")
    private List<Short> areaNegocio;

    @Column(name = "CORREO_CORPORATIVO" , nullable = false)
    private String correoCorporativo;

    @Column(name = "CORREO_ALTERNO" , nullable = false)
    private String correoAlterno;

    @Column(name = "POSICION" , nullable = true)
    private String posicion;

    @Column(name = "ENTIDAD_ID" , nullable = false)
    private Integer entidadId;

    @Column(name = "FECHA_CREACION" , nullable = false)
    private LocalDate fechaCreacion;

    @Column(name = "FECHA_ULTIMO_CAMBIO" )
    private LocalDate fechaUltimoCambio;

    @Column(name = "USUARIO_ULTIMO_CAMBIO_ID" )
    private Integer usuarioUltimoCambioId;

    @Column(name = "CONTRATO_CONFIDENCIALIDAD_ID" )
    private Integer contratoConfidencialidadId;

    @Column(name = "CATEGORIA_INFO_CONTACTO_ID" )
    private Short categoriaInformacionContactoId;

    @Column(name = "TIENE_HIJOS" )
    private Boolean tieneHijos;

    @Column(name = "USUARIO_GESTOR_ALTA_CTO_ID" )
    private Integer usuarioGestorAltaContactoId;

    @Column(name = "ESTADO" , nullable = false)
    private String estado;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "TELEFONO_CONTACTO", joinColumns = @JoinColumn(name = "CONTACTO_ID", referencedColumnName = "CONTACTO_ID"),
            inverseJoinColumns = @JoinColumn(name = "TELEFONO_ID", referencedColumnName = "TELEFONO_ID"))
    private List<TelefonoEntity> listaTelefonos;


    public static interface Queries {

        String BUSCAR_CONTACTO_POR_CEDULA 			= "Contacto.buscarPorCedula";
        String BUSCAR_CONTACTOS_POR_ENTIDAD_ID 		= "Contacto.buscarPorEntidadId";
        String BUSCAR_CONTACTO_POR_CODIGO_USUARIO 	= "Contacto.buscarPorCodigoUsuario";

    }

}
