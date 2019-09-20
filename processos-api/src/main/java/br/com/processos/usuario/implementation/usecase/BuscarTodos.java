package br.com.processos.usuario.implementation.usecase;

import br.com.processos.usuario.implementation.repository.UsuarioRepository;
import br.com.processos.usuario.specification.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BuscarTodos {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> executar() {
        return (List<Usuario>) usuarioRepository.findAll();
    }
}
