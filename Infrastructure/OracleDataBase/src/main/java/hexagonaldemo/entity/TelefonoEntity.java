package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name ="Telefono" )
@Table(name = "TELEFONO")
public class TelefonoEntity {

    @Id
    @Column(name = "TELEFONO_ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TELEFONO_SEQ")
    @SequenceGenerator(name = "TELEFONO_SEQ", sequenceName = "TELEFONO_SEQ", allocationSize = 1, initialValue = 1)
    private Long telefonoId;

    @Column(name = "CODIGO_TIPO_TELEFONO" , nullable = false)
    private Short codigoTipoTelefono;

    @Column(name = "TELEFONO" , nullable = false)
    private String telefono;

    @Column(name = "EXTENSION" , nullable = false)
    private String extension;

    @Column(name = "TIPO_TELEFONO_ID")
    private String tipoTelefonoId;

    @Column(name = "ESTADO")
    private String estado;



}
