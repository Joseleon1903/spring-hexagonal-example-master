package gs.hexagonaldemo.springhexagonaldemo.serviceports.out;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetalleCarteraAfiliadoPeriodo {

    protected long detalleCarteraAfiliadoId;
    protected Long afiliacionId;
    protected long solicitudId;
    protected String tipoAfiliado;
    protected String tipoDependiente;
    protected Short parentescoId;
    protected Long ciudadanoId;
    protected String cedula;
    protected String nui;
    protected Integer nss;
    protected ActaNacimientoType actaNacimiento;
    protected String numeroDocumentoIdentificacionExtranjero;
    protected Boolean extranjero;
    protected Short nacionalidadId;
    protected String nombre;
    protected String primerApellido;
    protected LocalDate fechaNacimiento;
    protected String genero;
    protected String estadoAfiliacion;
    protected Integer motivoEstadoId;
    protected Long ciudadanoTitularId;
    protected Integer nssTitular;
    protected String cedulaTitular;
    protected Long numeroContrato;
    protected Integer estanciaInfantilId;
    protected Short claveEstanciaInfantil;
    protected Short institucionPensionadoId;
    protected Boolean estudiante;
    protected Boolean discapacitado;
    protected Boolean excluirConsolidado;
    protected LocalDate fechaEfectividadAfiliacion;
}
