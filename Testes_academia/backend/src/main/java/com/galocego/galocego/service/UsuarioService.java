package com.galocego.galocego.service;

import com.galocego.galocego.model.Usuario;
import com.galocego.galocego.model.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private UsuarioRepository usuarioRepository;

    public List<Usuario> listUsers() {
        return usuarioRepository.findAll();
    }

    public Usuario getUserById(Long id) {
        return usuarioRepository.findById(id).orElseThrow();
    }

    public Usuario saveUser(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
