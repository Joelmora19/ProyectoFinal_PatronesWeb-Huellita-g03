
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
@Table(name = "blog")

public class Blog implements Serializable{
    
     private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Blog")
    
    private Long id_Blog;
    
    private String descripcion;
    private String asunto;
    private String comentario;

    public Blog() {
    }

    public Blog(String descripcion, String asunto, String comentario) {
        this.descripcion = descripcion;
        this.asunto = asunto;
        this.comentario = comentario;
    }
    
    
    
}
