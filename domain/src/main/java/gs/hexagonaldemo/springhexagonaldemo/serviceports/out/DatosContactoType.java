package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import gs.hexagonaldemo.springhexagonaldemo.models.Telefono;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public class DatosContactoType {

    private Integer contactoId;
    private Short tipoPersona;
    private Integer entidadId;
    private String descripcionEntidad;
    private Short tipoEntidadId;
    private String descripcionTipoEntidad;
    private Long ciudadanoId;
    private String cedula;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String genero;
    private LocalDate fechaNacimiento;
    private List<Short> areasNegocio;
    private String correoCorporativo;
    private String correoAlterno;
    private Collection<Telefono> telefonos;
    private String posicion;
    private LocalDate fechaCreacion;
    private LocalDate fechaUltimoCambio;
    private Integer usuarioUltimoCambioId;
    private Integer contratoConfidencialidadId;
    private Integer usuarioGestorAltaContactoId;
    private String nombreUsuarioGestor;
    private String primerApellidoUsuarioGestor;
    private String segundoApellidoUsuarioGestor;
    private Short categoriaInformacionContactoId;
    private String descripcionCategoriaInformacionContacto;
    private Boolean tieneHijos;
    private Boolean tieneUsuarioActivo;
    private String estado;

}
