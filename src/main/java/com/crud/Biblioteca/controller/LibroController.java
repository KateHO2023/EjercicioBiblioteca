package com.crud.Biblioteca.controller;

import com.crud.Biblioteca.model.Libro;
import com.crud.Biblioteca.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LibroController {

    @Autowired
    LibroService libroService;

    @GetMapping("/libro")
    private List<Libro> verLibro(){
       return libroService.verLibro();
    }

    @PostMapping("/libro")
    public void crearLibro(@RequestBody Libro libro){
        libroService.crearLibro(libro);
    }

    @DeleteMapping("/libro/{id}")
    private void eliminarLibro(@PathVariable("id")Long id) {
        libroService.eliminarLibro(id);
    }

    @PutMapping("/libro")
    public void editarPokemon(@RequestBody Libro libro){
      libroService.crearLibro(libro);
    }

}
