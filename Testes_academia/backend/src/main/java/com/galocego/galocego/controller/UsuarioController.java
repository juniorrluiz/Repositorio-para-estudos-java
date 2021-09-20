package com.galocego.galocego.controller;

import com.galocego.galocego.model.Usuario;
import com.galocego.galocego.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private UsuarioService usuarioService;

    //localhost:8080/usuarios
    @GetMapping
    public List<Usuario> getUsers() {
        return usuarioService.listUsers();
    }

    //localhost:8080/usuarios/1
    @GetMapping(path = "/{id}")
    public Usuario getUserById(@PathVariable Long id) {
        return usuarioService.getUserById(id);
    }

    //localhost:8080/usuarios/cadastrar
    @PostMapping(path = "/cadastrar")
    public Usuario saveUser(@RequestBody Usuario usuario) {
        return usuarioService.saveUser(usuario);
    }
}
