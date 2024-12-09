package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;

import java.util.Optional;

public interface UsuarioES {

    /**

     */
    Optional<Usuario> actualizarUsuario(Usuario usuario);

    /**
     * Capacidad que busca un usuario a partir del id ingresado como par�metro.
     *
     */
    Optional<Usuario> buscarUsuarioPorId(Integer usuarioId);

    /**
     * La Capacidad busca en el repositorio de usuario del sistema el usuario asociado al c�digo o
     * nombre de usuario provisto como par�metro y retorna el usuario.
     *
     */
    Optional<Usuario> buscarUsuarioPorCodigo(String codigo, Boolean incluirDatosLDAP);

    /**
     * La Capacidad busca en el repositorio de usuarios del sistema el usuario asociado al id de contacto
     * y estado del usuario provistos como par�metros y retorna los datos del usuario.
     *
     */
    Optional<Usuario> buscarUsuariosPorContactoId(Integer contactoId, String estado);

//    /**
//     * La Capacidad busca en el repositorio de asociaciones de grupos de roles por usuarios del sistema
//     * los usuarios asociados a un grupo rol y/o id de entidad provistos como par�metros y retorna
//     * un listado de los usuarios con grupos de roles asignados.
//     *
//     * @param input
//     * @return {@link BuscarUsuariosConGruposRolesAsignadosResponseType}
//     * @throws InternalServiceException
//     */
//
//    BuscarUsuariosConGruposRolesAsignadosResponseType buscarUsuariosConGruposRolesAsignados(BuscarUsuariosConGruposRolesAsignadosType input) throws InternalServiceException;
//
//    /**
//     * La Capacidad busca en el repositorio de usuarios del sistema los usuarios asociados al id
//     * de entidad provisto como par�metro y retorna un listado de los datos de los usuarios.
//     *
//     * @param input
//     * @return
//     * @throws FechaInvalidaException
//     * @throws InternalServiceException
//     * @throws ValorNoPermitidoException
//     * @author Carlos V�squez <i>[cjvasquez@unipago.com.do]</i>
//     * @since OrdenAtencion1
//     */
//    BuscarUsuariosPorDatosGeneralesResponseType buscarUsuariosPorDatosGenerales(BuscarUsuariosPorDatosGeneralesType input) throws FechaInvalidaException, InternalServiceException, ValorNoPermitidoException, DatoRequeridoNoProporcionadoException;
//
//    /**
//     *
//     * @param input
//     * @return
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws InternalServiceException
//     */
//    EsContrasenaValidaSegunPoliticaResponseType esContrasenaValidaSegunPolitica(EsContrasenaValidaSegunPoliticaType input) throws DatoRequeridoNoProporcionadoException, InternalServiceException;
//
//    /**
//     *
//     * @param input
//     * @return
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws InternalServiceException
//     */
//    GenerarCodigoUsuarioResponseType generarCodigoUsuario(GenerarCodigoUsuarioType input) throws DatoRequeridoNoProporcionadoException, ValorNoPermitidoException, InternalServiceException;
//
//    /**
//     *
//     * @param input
//     * @return
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws RegistroExistenteException
//     * @throws ValorNoPermitidoException
//     * @throws InternalServiceException
//     */
//    RegistrarUsuarioResponseType registrarUsuario(RegistrarUsuarioType input) throws DatoRequeridoNoProporcionadoException, RegistroExistenteException, ValorNoPermitidoException, InternalServiceException;
//
//    /**
//     * <b>3.1</b> valida las credenciales de los ususarios
//     *
//     * <br/>
//     * <br/>
//     * El sistema valida las credenciales de los usuarios existentes en LDAP
//     *
//     * @param usuarioId
//     *            el usuario a autenticar.
//     * @param clave
//     *            el usuario a autenticar.
//     * @return true or false si el ciudadano es valido no.
//     * @throws ServicesFault
//     *             Si ocurre algun problema en la consulta de Usuario, el <b>FaultInfo</b> especificado en la Excepcion contendra el mensaje de la causa de la excepcion.
//     */
//    TieneCredencialesValidasResponseType tieneCredencialesValidas(TieneCredencialesValidasType input) throws DatoRequeridoNoProporcionadoException, InternalServiceException;
//
//
//    /**
//     * Capacidad para buscar la proxima sequencia en la secuencia del usuario
//     *
//     * @param input
//     * @return la secuencia del usuario
//     * @throws InternalServiceException
//     */
//    GetUsuarioProximaSecuenciaResponseType getUsuarioProximaSecuencia(GetUsuarioProximaSecuenciaType input) throws InternalServiceException;
//
//    /**
//     * Permite actualizar la contrase�a de un usuario del sistema en LDAP.
//     * La Capacidad actualiza la contrase�a en el repositorio de usuarios de el LDAP con los datos provistos como par�metros
//     *
//     * @param actualizarClaveUsuarioInput
//     * @return
//     * @throws InternalServiceException
//     * @throws DatoRequeridoNoProporcionadoException
//     * @throws NoExistenDatosException
//     * @throws ValorNoPermitidoException
//     * @author Carlos V�squez <i>[cjvasquez@unipago.com.do]</i>
//     * @since OrdenAtencion1
//     */
//    ActualizarClaveUsuarioResponseType actualizarClaveUsuario(ActualizarClaveUsuarioType actualizarClaveUsuarioInput) throws InternalServiceException, DatoRequeridoNoProporcionadoException, NoExistenDatosException, ValorNoPermitidoException;
//
//    /**
//     * La Capacidad busca en el repositorio de asociaciones de grupos de roles por usuarios del sistema
//     * los usuarios asociados a un grupo rol y/o id de entidad provistos como par�metros y retorna
//     * un listado de los usuarios distintos con grupos de roles asignados.
//     *
//     * @param input
//     * @return {@link BuscarUsuariosConGruposRolesAsignadosResponseType}
//     * @throws InternalServiceException
//     */
//
//    BuscarUsuariosDistintosConGruposRolesAsignadosResponseType buscarUsuariosDistintosConGruposRolesAsignados(BuscarUsuariosDistintosConGruposRolesAsignadosType input) throws InternalServiceException;


}