package br.com.processos.usuario.implementation;

import br.com.processos.usuario.implementation.usecase.BuscarPorId;
import br.com.processos.usuario.implementation.usecase.BuscarTodos;
import br.com.processos.usuario.specification.IUsuario;
import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UsuarioImpl implements IUsuario {

    @Autowired
    private BuscarPorId buscarPorId;

    @Autowired
    private BuscarTodos buscarTodos;

    @Override
    public Usuario buscarPorId(Long id) {
        return buscarPorId.executar(id);
    }

    @Override
    public List<Usuario> buscarTodos() {
        return buscarTodos.executar();
    }
}
