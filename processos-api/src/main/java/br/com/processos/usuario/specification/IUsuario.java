package br.com.processos.usuario.specification;

import br.com.processos.usuario.specification.entity.Usuario;

import java.util.List;

public interface IUsuario {

    Usuario buscarPorId(Long id);

    List<Usuario> buscarTodos();
}
