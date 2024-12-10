package hexagonaldemo.adapters;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.UsuarioRepository;
import hexagonaldemo.mapper.UsuarioMapper;
import hexagonaldemo.repositories.UsuarioRep;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class UsuarioRepositoryAdapter implements UsuarioRepository {

    @Autowired
    private UsuarioRep usuarioRep;

    @Override
    public Optional<Usuario> create(Usuario Usuario) {
        return Optional.empty();
    }

    @Override
    public Optional<Usuario> update(Usuario Usuario) {
        return Optional.empty();
    }

    @Override
    public Optional<List<Usuario>> getList() {
        return Optional.empty();
    }

    @Override
    public void delete(int id) {

    }

    @Override
    public Optional<Usuario> getById(Integer usuarioId) {
        return Optional.of(UsuarioMapper.mapToDomain(usuarioRep.getById(usuarioId)));
    }

    @Override
    public Optional<Usuario> buscarUsuarioPorCodigo(String codigo, Boolean incluirDatosLDAP) {
        return Optional.of(UsuarioMapper.mapToDomain(usuarioRep.BuscarUsuarioPorCodigo(codigo).get()));
    }
}
