package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name ="Parametro" )
@Table(name="PARAMETRO")
@NamedQueries({ @NamedQuery(name = "Parametro.findAll", query="SELECT pa FROM Parametro pa"),
        @NamedQuery(name = "Parametro.findById", query="SELECT pa FROM Parametro pa WHERE pa.parametroId = :parametroId")})
public class ParametroEntity {

    @Id
    @Basic(optional = false)
    @Column(name = "PARAMETRO_ID", nullable = false)
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "PARAMETRO_SEQ")
//    @SequenceGenerator(name = "PARAMETRO_SEQ", sequenceName = "PARAMETRO_SEQ", allocationSize = 1, initialValue = 1)
    private String parametroId;

    @Basic(optional = false)
    @Column(name = "VALOR", nullable = false,length = 500)
    private String valor;

    @Basic(optional = false)
    @Column(name = "TIPO_DATO", nullable = false, length = 1)
    private String tipoDato;

    @Basic(optional = false)
    @Column(name = "DESCRIPCION" ,nullable = false, length = 150)
    private String descripcion;

}
