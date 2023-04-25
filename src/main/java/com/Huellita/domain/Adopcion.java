package com.Huellita.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

@Data
@Entity
@Table(name = "adopcion")

public class Adopcion implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Adopcion")

    private Long id_Adopcion;

    private String descripcion;
    private String animal;
    private String motivo;
    @Column(name="ruta_imagen")
    private String rutaImagen;

    public Adopcion() {
    }

    public Adopcion(String descripcion, String animal, String motivo) {
        this.descripcion = descripcion;
        this.animal = animal;
        this.motivo = motivo;
    }

}
