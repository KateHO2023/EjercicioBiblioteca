package com.crud.Biblioteca.model;


import javax.persistence.*;
import com.crud.Biblioteca.enums.Enum_Estado;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString


public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, length = 10)
    private Long id;

    @Column(name = "autor", nullable = false)
    private String autor;

    @Column(name = "fechapublicacion", nullable = false)
    private LocalDate fechaPublicacion;

    @Column(name = "nombre", nullable = false)
    private String nombre;

    private int nroVecesPrestado;

    @Enumerated(EnumType.STRING)
    @Column(name = "estado")
    private Enum_Estado estado;

   @ManyToOne
   @JoinColumn (name = "usuario_id")
   private Usuario usuario;
}
