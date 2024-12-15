package gs.hexagonaldemo.springhexagonaldemo.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class DetalleCarteraAfiliado {

    private Long detalleCarteraAfiliadoId;
    private CarteraAfiliado carteraAfiliadoId;
    private Integer periodo;
    private Integer entidadId;
    private String nombre;
    private String primerApellido;
    private Integer estanciaInfantilId;
    private Short institucionPensionadoId;
    private Long ciudadanoId;
    private Long solicitudId;
    private Long afiliacionId;
    private String tipoAfiliado;
    private Long ciudadanoTitularId;
    private Short parentescoId;
    private String tipoDependiente;
    private Boolean estudiante;
    private Boolean discapacitado;
    private Boolean excluirConsolidado;
    private String estadoAfiliacion;
    private Integer motivoId;
    private LocalDate fechaEfectividadAfiliacion;

}
