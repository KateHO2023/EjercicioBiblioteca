package com.crud.Biblioteca.service;

import com.crud.Biblioteca.model.Libro;
import com.crud.Biblioteca.repository.LibroRepository;
import com.crud.Biblioteca.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LibroService {

    @Autowired
    LibroRepository libroRepository;

    public void crearLibro(Libro libro){
        libroRepository.save(libro);
    }
    public  List<Libro> verLibro(){
        List<Libro> libros= new ArrayList<Libro>();
        libros.addAll(libroRepository.findAll());
        return libros;
    }
    public void eliminarLibro(Long id){
        libroRepository.deleteById(id);
    }
    public void editarLibro(){
    }


}
