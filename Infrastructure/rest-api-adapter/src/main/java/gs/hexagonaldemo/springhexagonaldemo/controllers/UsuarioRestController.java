package gs.hexagonaldemo.springhexagonaldemo.controllers;

import gs.hexagonaldemo.springhexagonaldemo.models.Usuario;
import gs.hexagonaldemo.springhexagonaldemo.serviceports.UsuarioES;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioRestController {

    private UsuarioES usuarioES;

    @Autowired
    public UsuarioRestController(UsuarioES usuarioES) {
        this.usuarioES = usuarioES;
    }

    @GetMapping(value = "/usuario/{id}")
    public ResponseEntity<Usuario> getUsuarioById(@PathVariable("id") String id) {
        System.out.println("Entring id: "+id);
        Integer motivoId = Integer.parseInt(id);
        Usuario usuario  = usuarioES.buscarUsuarioPorId(motivoId).get();
        return ResponseEntity.ok(usuario);
    }

    @GetMapping(value = "/usuario/codigo/{codigo}")
    public ResponseEntity<Usuario> getUsuarioByCodigo(@PathVariable("codigo") String codigo) {
        System.out.println("Entring codigo: "+codigo);
        Usuario usuario  = usuarioES.buscarUsuarioPorCodigo(codigo, null).get();
        return ResponseEntity.ok(usuario);
    }


}
