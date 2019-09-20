package br.com.processos.usuario;

import br.com.processos.usuario.specification.IUsuario;
import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
public class UsuarioAPI {

    @Autowired
    private IUsuario iUsuario;

    @GetMapping
    public List<Usuario> buscarTodos() {
        return iUsuario.buscarTodos();
    }

    @GetMapping(path = "/{id}")
    public Usuario buscarPorId(@PathVariable Long id) {
        return iUsuario.buscarPorId(id);
    }
}
