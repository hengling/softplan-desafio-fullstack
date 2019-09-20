package br.com.processos.usuario.implementation;

import br.com.processos.usuario.implementation.usecase.AtualizarUsuario;
import br.com.processos.usuario.implementation.usecase.BuscarTodosUsuarios;
import br.com.processos.usuario.implementation.usecase.BuscarUsuarioPorId;
import br.com.processos.usuario.implementation.usecase.InserirUsuario;
import br.com.processos.usuario.implementation.usecase.RemoverUsuario;
import br.com.processos.usuario.specification.IUsuario;
import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioImpl implements IUsuario {

    @Autowired
    private BuscarUsuarioPorId buscarUsuarioPorId;

    @Autowired
    private BuscarTodosUsuarios buscarTodosUsuarios;

    @Autowired
    private InserirUsuario inserirUsuario;

    @Autowired
    private AtualizarUsuario atualizarUsuario;

    @Autowired
    private RemoverUsuario removerUsuario;

    @Override
    public Usuario buscarPorId(Long id) {
        return buscarUsuarioPorId.executar(id);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return buscarTodosUsuarios.executar();
    }

    @Override
    public Usuario inserir(Usuario novoUsuarioo) {
        return inserirUsuario.executar(novoUsuarioo);
    }

    @Override
    public Usuario atualizar(Long id, Usuario usuarioModificado) {
        return atualizarUsuario.executar(id, usuarioModificado);
    }

    @Override
    public void remover(Long id) {
        removerUsuario.executar(id);
    }
}
