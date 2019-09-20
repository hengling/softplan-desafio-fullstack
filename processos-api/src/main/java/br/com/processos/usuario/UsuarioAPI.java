package br.com.processos.usuario;

import br.com.processos.usuario.specification.IUsuario;
import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
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
    public Usuario buscarPorId(@Valid @NotNull @PathVariable Long id) {
        return iUsuario.buscarPorId(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Usuario inserir(@Valid @NotNull @RequestBody Usuario usuario) {
        return iUsuario.inserir(usuario);
    }

    @PutMapping(path = "/{id}")
    public Usuario atualizar(@NotNull @PathVariable Long id, @Valid @NotNull @RequestBody Usuario usuarioModificado) {
        return iUsuario.atualizar(id, usuarioModificado);
    }

    @DeleteMapping(path = "/{id}")
    public void remover(@NotNull @PathVariable Long id) {
        iUsuario.remover(id);
    }
}
