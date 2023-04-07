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
@Table(name="users")
public class Users implements Serializable{
    
     private static final long serialVersionUID=1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Users")
    private Long idUsers;
    
    private String fullName;
    private String username;
    private String contrasena;
    private String telefono;
    private String genero;

    public Users() {
    }

    public Users(String fullName, String username, String contrasena, String telefono, String genero) {
        this.fullName = fullName;
        this.username = username;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.genero = genero;
    }

    
    
}
