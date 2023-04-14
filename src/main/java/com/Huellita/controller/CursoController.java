/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Huellita.controller;


import com.Huellita.domain.Curso;
import com.Huellita.service.CursoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Monserrat Najera
 */
@Controller
@RequestMapping("/curso")
public class CursoController {

    @Autowired
    private CursoService cursoService;   
    
        //------LISTADO-----
    @GetMapping("/listado")
    public String inicioCurso(Model model) {
        var curso = cursoService.getCurso();
        model.addAttribute("curso", curso);
        return "/curso/listado";
    }
    //------ELIMINAR------
    @GetMapping("/eliminar/{id_Curso}")
    public String eliminarCurso(Curso curso) {
        cursoService.deleteCurso(curso);
        return "redirect:/curso/listado";
    }
    //------NUEVO-----
    @GetMapping("/nuevo")
    public String nuevoCurso(Curso curso) {
        return "/curso/modifica";
    }
 //-----GUARDAR----
    @PostMapping("guardar")
    public String guardarCurso(Curso curso) {
        cursoService.saveCurso(curso);
        return "redirect:/curso/listado";
    }
    //---------MODIFICAR-------------
    @GetMapping("/editar/{id_Curso}")
    public String editaCurso(Curso curso) {
        curso = cursoService.getCurso(curso);
        return "/curso/modifica";
    }
}
