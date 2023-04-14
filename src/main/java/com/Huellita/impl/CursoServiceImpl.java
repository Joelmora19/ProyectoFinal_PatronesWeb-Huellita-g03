/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Huellita.impl;

import com.Huellita.dao.CursoDao;
import com.Huellita.domain.Curso;
import com.Huellita.service.CursoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 *
 * @author Monserrat Najera
 */
@Service
public class CursoServiceImpl implements CursoService {
   @Autowired
    private CursoDao cursoDao;

    @Override
    public List<Curso> getCurso() {
        return (List<Curso>) cursoDao.findAll();
    }

    @Override
    public Curso getCurso(Curso curso) {
        return cursoDao.findById(curso.getId_Curso()).orElse(null);
    }

    @Override
    public void deleteCurso(Curso curso) {
        cursoDao.delete(curso);
    }
    
    @Override
    public void saveCurso(Curso curso) {
        cursoDao.save(curso);
    }

} 

