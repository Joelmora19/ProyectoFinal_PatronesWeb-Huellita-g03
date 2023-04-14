/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Huellita.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;

/**
 *
 * @author Monserrat Najera
 */

@Data
@Entity
@Table(name = "cursos")
public class Curso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Curso")

    private Long id_Curso;

    private String nombre;
    private String telefono;
    private String correo;
    private boolean estudiante;
    private boolean medico;

    public Curso() {
    }

    public Curso(String nombre, String telefono, String correo, boolean estudiante, boolean medico) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.correo = correo;
        this.estudiante = estudiante;
        this.medico = medico;
    }

    
    
    
}
