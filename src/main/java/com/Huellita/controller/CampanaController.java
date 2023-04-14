/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/springframework/Controller.java to edit this template
 */
package com.Huellita.controller;

import com.Huellita.domain.Campana;
import com.Huellita.service.CampanaService;
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
@RequestMapping("/campana")
public class CampanaController {
    
  @Autowired
    private CampanaService campanaService;   
    
        //------LISTADO-----
    @GetMapping("/listado")
    public String inicioCampana(Model model) {
        var campana = campanaService.getCampana();
        model.addAttribute("campana", campana);
        return "/campana/listado";
    }
    //------ELIMINAR------
    @GetMapping("/eliminar/{id_Campanas}")
    public String eliminarCampana(Campana campana) {
        campanaService.deleteCampana(campana);
        return "redirect:/campana/listado";
    }
    //------NUEVO-----
    @GetMapping("/nuevo")
    public String nuevoCampana(Campana campana) {
        return "/campana/modifica";
    }
 //-----GUARDAR----
    @PostMapping("guardar")
    public String guardarCampana(Campana campana) {
        campanaService.saveCampana(campana);
        return "redirect:/campana/listado";
    }
    //---------MODIFICAR-------------
    @GetMapping("/editar/{id_Campanas}")
    public String editaCampana(Campana campana) {
        campana = campanaService.getCampana(campana);
        return "/campana/modifica";
    }
    
}
