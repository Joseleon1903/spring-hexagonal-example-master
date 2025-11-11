package gs.hexagonaldemo.springhexagonaldemo.proxyport;


import gs.hexagonaldemo.springhexagonaldemo.proxyport.in.ConsultarCarteraAfiliadoPorPeriodo;
import gs.hexagonaldemo.springhexagonaldemo.proxyport.out.ConsultarCarteraAfiliadoPorPeriodoResponse;

/**
 *
 * <b>Perfil de Servicio</b>
 *
 * <dl>
 * <dt><b>Nombre:</b></dt>
 * <dd>ConsultarCarteraAfiliadoPorPeriodoTS</dd>
 *
 * <dt><b>Descripcion:</b></dt>
 * <dd>Este servicio provee las capacidades asociadas a la tarea de Consultar la
 * Cartera de Afiliados al Seguro Familiar de Salud.</dd>
 *
 * <dt><b>Versi�n:</b></dt>
 * <dd>0.01</dd>
 *
 *
 * <dt><b>Modelo:</b></dt>
 * <dd>Tarea</dd>
 * </dl>
 *
 *
 *
 */
public interface ConsultarCarteraAfiliadoPorPeriodoPort {

    /**
     * Permite consultar la cartea de afiliados al seguro familiara de salud
     * relacionados al periodo proporcionado.
     *
     * @dateLastModified 16/09/2015
     *
     * @param consultarCarteraAfiliadoPorPeriodoInput
     * @return
     */
    ConsultarCarteraAfiliadoPorPeriodoResponse consultarCarteraAfiliadoPorPeriodo(ConsultarCarteraAfiliadoPorPeriodo consultarCarteraAfiliadoPorPeriodoInput);

}