package gs.hexagonaldemo.springhexagonaldemo.serviceadapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.UsuarioES;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.UsuarioRepository;

import java.util.Optional;

public class UsuarioServiceAdapter implements UsuarioES {

    private UsuarioRepository usuarioRepository;

    public UsuarioServiceAdapter(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Optional<Usuario> actualizarUsuario(Usuario usuario) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorId(Integer usuarioId) {
        return usuarioRepository.getById(usuarioId);
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorCodigo(String codigo, Boolean incluirDatosLDAP) {
        return usuarioRepository.buscarUsuarioPorCodigo(codigo,incluirDatosLDAP);
    }

    @Override
    public Optional<Usuario> buscarUsuariosPorContactoId(Integer contactoId, String estado) {
        return Optional.empty();
    }
}
