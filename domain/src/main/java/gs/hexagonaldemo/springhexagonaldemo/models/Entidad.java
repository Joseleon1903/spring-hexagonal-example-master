package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Entidad {

    private Integer entidadId;
    private Short claveEntidad;
    private String sigla;
    private String descripcion;
    private Boolean participaAfiliacionAutomatica;
    private String estado;
    private Short tipoEntidadId;
    private String rnc;
    private LocalDate fechaInscripcion;
    private String numeroAcreditacion;
    private Integer entidadSupervisoraId;
    private Short regimenId;
    private String ldapOrganizationUnit;
    private Integer usuarioId;
    private Short tipoFondoId;
    private Short tipoEmpleadorId;
    private Short tipoAdministracionId;
    private Short tipoEstanciaInfantilId;
    private Short municipioId;
    private List<DominioCorreoEntidad> dominiosCorreo;
    private Short grupoEconomicoId;
    private Boolean comparteContactosGrupoEconomico;
    private Boolean comparteAgentesGrupoEconomico;
    private String codigoClienteFacturacion;
    private Boolean accionista;
    private Boolean aplicaMembresia;
    private Boolean aplicaFacturacion;
    private Boolean requiereAprobacionAplicarBajaAutomatica;
    private Boolean validaEdadIndividualizacionSeguroVida;
    private List<Short> institucionesPensionados;
    private Boolean aplicaParticipacionMovimientoFondo;
    private Boolean validaAntiguedadIndividualizacionSeguroVida;


}
