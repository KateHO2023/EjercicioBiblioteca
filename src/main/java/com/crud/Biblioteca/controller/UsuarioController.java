package com.crud.Biblioteca.controller;

import com.crud.Biblioteca.model.Libro;
import com.crud.Biblioteca.model.Usuario;
import com.crud.Biblioteca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioService usuarioService;

    @GetMapping("/usuario")
    private List<Usuario> verUsuario() {
        return usuarioService.verUsuario();
    }

    @PostMapping("/usuario")
    public void crearUsuario(@RequestBody Usuario usuario) {
        usuarioService.crearUsuario(usuario);
    }
    @DeleteMapping("/usuario/{cc}")
    private void eliminarUsuario(@PathVariable("cc")Long cc){
       usuarioService.eliminarUsuario(cc);
    }

    @PutMapping("/usuario")
    public void editarPokemon(@RequestBody Usuario usuario){
        usuarioService.crearUsuario(usuario);
    }

}
