
package com.Huellita.domain;

import jakarta.persistence.*;

import java.io.Serializable;
import lombok.Data;


@Data
@Entity
@Table(name="citas")
public class Cita implements Serializable{
    private static final long serialVersionUID=1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_Cita")
    private Long id_Cita;
    
    private String nombreDueno;
    private String correo;
    private String telefono;
    private String nombreMascota;
    private boolean paciente;
    private String fechaCita;
    private String horaCita;
    private String descripcion;
    
    //---RELACION A CREDITO---
    @JoinColumn(name="id_Users",referencedColumnName="id_Users")
    @OneToOne
    private Users users;

    public Cita() {
    }

    public Cita(String nombreDueno, String correo, String telefono, String nombreMascota, boolean paciente, String fechaCita, String horaCita, String descripcion, Users users) {
        this.nombreDueno = nombreDueno;
        this.correo = correo;
        this.telefono = telefono;
        this.nombreMascota = nombreMascota;
        this.paciente = paciente;
        this.fechaCita = fechaCita;
        this.horaCita = horaCita;
        this.descripcion = descripcion;
        this.users = users;
    }
 
}
