package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Contacto {

    private Integer contactoId;
    private Short tipoPersona;
    private Long ciudadanoId;
    private String descripcion;
    private List<Short> areaNegocio;
    private String correoCorporativo;
    private String correoAlterno;
    private String posicion;
    private Integer entidadId;
    private LocalDate fechaCreacion;
    private LocalDate fechaUltimoCambio;
    private Integer usuarioUltimoCambioId;
    private Integer contratoConfidencialidadId;
    private Short categoriaInformacionContactoId;
    private Boolean tieneHijos;
    private Integer usuarioGestorAltaContactoId;
    private String estado;
    private List<Telefono> listaTelefonos;
}
