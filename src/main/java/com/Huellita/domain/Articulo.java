
package com.Huellita.domain;

import jakarta.persistence.*;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name = "articulo")

public class Articulo implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Articulo")

    private Long id_Articulo;

    private String descripcion;
    private String detalle;
    private double precio;
    private int existencias;

    public Articulo() {
    }

    public Articulo(String descripcion, String detalle, double precio, int existencias) {
        this.descripcion = descripcion;
        this.detalle = detalle;
        this.precio = precio;
        this.existencias = existencias;
    }

}

