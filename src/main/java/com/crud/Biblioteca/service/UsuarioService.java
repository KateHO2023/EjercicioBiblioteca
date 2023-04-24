package com.crud.Biblioteca.service;

import com.crud.Biblioteca.model.Usuario;
import com.crud.Biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void crearUsuario(Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public List<Usuario> verUsuario (){
        List<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.addAll(usuarioRepository.findAll());
        return usuarios;
    }

    public void eliminarUsuario(Long cc ){
        usuarioRepository.deleteById(cc);
    }

    public void editarUsuario(){
    }



}
