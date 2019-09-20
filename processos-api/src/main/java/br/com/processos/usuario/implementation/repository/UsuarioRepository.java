package br.com.processos.usuario.implementation.repository;

import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository<Usuario, Long> {
}
