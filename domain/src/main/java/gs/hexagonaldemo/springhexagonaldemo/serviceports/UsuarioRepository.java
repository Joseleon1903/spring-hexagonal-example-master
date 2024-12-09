package gs.hexagonaldemo.springhexagonaldemo.serviceports;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;

import java.util.List;
import java.util.Optional;

public interface UsuarioRepository {

    Optional<Usuario> create(Usuario Usuario);

    Optional<Usuario> update(Usuario Usuario);

    Optional<List<Usuario>> getList();

    void delete(int id);

    Optional<Usuario> getById(Integer usuarioId);



}
