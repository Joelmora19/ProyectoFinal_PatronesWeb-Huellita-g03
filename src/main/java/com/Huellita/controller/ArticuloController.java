/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Huellita.controller;

import com.Huellita.domain.Articulo;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Huellita.service.ArticuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/articulo")

public class ArticuloController {

    @Autowired
    private ArticuloService articuloService;

    //---------LISTADO--------
    @GetMapping("/listado")
    public String inicioArticuto(Model model) {
        var articulo = articuloService.getArticulo();
        model.addAttribute("articulo",articulo);
        return "/articulo/listado";
    }
    
    //---------ELIMINAR--------
    @GetMapping("/eliminar/{id_Articulo}")
    public String eliminarArticuto(Articulo articulo) {
        articuloService.deleteArticulo(articulo);
        return "redirect:/articulo/listado";
    }
    
    //------------NUEVO---------------
    @GetMapping("/nuevo")
    public String nuevoArticuto(Articulo articulo) {
        return "/articulo/modifica";
    }
    
    //--------GUARDAR---------------
    @PostMapping("/guardar")
    public String guardarArticulo(Articulo articulo){
        articuloService.saveArticulo(articulo);
        return "redirect:/articulo/listado";
    }
    
    //---------MODIFICAR-------------
    @GetMapping("/editar/{id_Articulo}")
    public String editaArticulo(Articulo articulo){
        articulo = articuloService.getArticulo(articulo);
        return "/articulo/modifica";
    }
    
    

}
