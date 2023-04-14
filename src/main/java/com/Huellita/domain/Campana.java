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
@Table(name = "campanas")
public class Campana implements Serializable{
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Campanas")

    private Long id_Campanas;

    private String nombre;
    private String descripcion;

    public Campana() {
    }

    public Campana(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
 
}
