package com.crud.Biblioteca.model;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;
import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Usuario {
    @Id
    @Column(name = "cc", nullable = false, length = 15)
    private Long cc;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    private LocalDate fechaNacimiento;

  @OneToMany (mappedBy = "usuario")
  private List <Libro> libros;

}
