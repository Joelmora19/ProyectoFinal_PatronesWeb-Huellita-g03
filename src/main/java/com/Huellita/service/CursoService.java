/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Huellita.service;

import com.Huellita.domain.Curso;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface CursoService {
    public List<Curso> getCurso();
    
    public Curso getCurso(Curso curso);
    
    public void deleteCurso(Curso curso);
    
    public void saveCurso(Curso curso);
}
