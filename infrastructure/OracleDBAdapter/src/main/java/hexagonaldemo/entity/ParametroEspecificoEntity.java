package hexagonaldemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "ParametroEspecifico")
@Table(name = "PARAMETRO_ESPECIFICO")
@NamedQueries({@NamedQuery(name= "ParametroEspecifico.findAll" , query=" Select pe from ParametroEspecifico pe"),
        @NamedQuery(name= "ParametroEspecifico.buscarPorId", query= "Select pe from ParametroEspecifico pe Where pe.parametroId = :parametroid and pe.entidadId = :entidadId and pe.servicioId = :servicioId"),
        @NamedQuery(name= "ParametroEspecifico.buscarPorParametroId", query = "Select pe from ParametroEspecifico pe Where pe.parametroId = :parametroid"),
        @NamedQuery(name= "ParametroEspecifico.buscarPorParametroIdServicioId", query = "Select pe from ParametroEspecifico pe Where pe.parametroId = :parametroid and pe.servicioId = :servicioId and pe.entidadId is null"),
        @NamedQuery(name= "ParametroEspecifico.buscarPorParametroIdEntidadId", query = "Select pe from ParametroEspecifico pe Where pe.parametroId = :parametroid and pe.entidadId = :entidadId and pe.servicioId is null")})
public class ParametroEspecificoEntity {


    @Id
    @Column(name = "PARAMETRO_ESPECIFICO_ID" )
    private Integer parametroEspecificoId;

    @Column(name = "PARAMETRO_ID" )
    private String parametroId;

    @Basic(optional = true)
    @Column(name = "ENTIDAD_ID" , nullable = true)
    private Integer entidadId;

    @Basic(optional = true)
    @Column(name = "SERVICIO_ID" , nullable = true)
    private Integer servicioId;

    @Basic(optional = false)
    @Column(name = "VALOR" , nullable = false)
    private String valor;

}