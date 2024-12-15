package hexagonaldemo.entity;

import gs.hexagonaldemo.springhexagonaldemo.models.CarteraAfiliado;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "DetalleCarteraAfiliado")
@Table(name = "DETALLE_CARTERA_AFILIADO")
public class DetalleCarteraAfiliadoEntity {

    @Id
    @Column(name = "DETALLE_CARTERA_AFILIADO_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DETALLE_CARTERA_AFILIADO_SEQ")
    @SequenceGenerator(name = "DETALLE_CARTERA_AFILIADO_SEQ", sequenceName = "DETALLE_CARTERA_AFILIADO_SEQ", allocationSize = 1, initialValue = 1)
    private Long detalleCarteraAfiliadoId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "CARTERA_AFILIADO_ID", referencedColumnName = "CARTERA_AFILIADO_ID", nullable = false)
    private CarteraAfiliadoEntity carteraAfiliadoId;

    @Column(name = "PERIODO", nullable = false)
    private Integer periodo;

    @Column(name = "ENTIDAD_ID", nullable = false)
    private Integer entidadId;

    @Column(name = "NOMBRE")
    private String nombre;

    @Column(name = "PRIMER_APELLIDO")
    private String primerApellido;

    @Column(name = "ESTANCIA_INFANTIL_ID", nullable = true)
    private Integer estanciaInfantilId;

    @Column(name = "INSTITUCION_PENSIONADO_ID", nullable = true)
    private Short institucionPensionadoId;

    @Column(name = "CIUDADANO_ID", nullable = false)
    private Long ciudadanoId;

    @Column(name = "SOLICITUD_ID", nullable = false)
    private Long solicitudId;

    @Column(name = "AFILIACION_ID", nullable = false)
    private Long afiliacionId;

    @Column(name = "TIPO_AFILIADO", nullable = false)
    private String tipoAfiliado;

    @Column(name = "CIUDADANO_TITULAR_ID", nullable = false)
    private Long ciudadanoTitularId;

    @Column(name = "PARENTESCO_ID", nullable = false)
    private Short parentescoId;

    @Column(name = "TIPO_DEPENDIENTE", nullable = false)
    private String tipoDependiente;

    @Column(name = "ESTUDIANTE", nullable = false)
    private Boolean estudiante;

    @Column(name = "DISCAPACITADO", nullable = false)
    private Boolean discapacitado;

    @Column(name = "EXCLUIR_CONSOLIDADO", nullable = false)
    private Boolean excluirConsolidado;

    @Column(name = "ESTADO_AFILIACION", nullable = false)
    private String estadoAfiliacion;

    @Column(name = "MOTIVO_ESTADO_ID", nullable = false)
    private Integer motivoId;

    @Column(name = "FECHA_RECEPCION_SOL_AFILIACION", nullable = false)
    private LocalDate fechaEfectividadAfiliacion;

}
