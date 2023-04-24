package com.crud.Biblioteca.enums;

import javax.persistence.Table;

@Table (name = "estado")
public enum Enum_Estado {
    disponible,
    prestado,
}
