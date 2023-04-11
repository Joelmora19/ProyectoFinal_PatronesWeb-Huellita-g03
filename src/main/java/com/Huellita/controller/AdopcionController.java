package com.Huellita.controller;

import com.Huellita.domain.Adopcion;
import com.Huellita.service.AdopcionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/adopcion")
public class AdopcionController {

    @Autowired
    private AdopcionService adopcionService;

    //------LISTADO-----
    @GetMapping("/listado")
    public String inicioAdopcion(Model model) {
        var adopcion = adopcionService.getAdopcion();
        model.addAttribute("adopcion", adopcion);
        return "/adopcion/listado";
    }

    //------ELIMINAR------
    @GetMapping("/eliminar/{id_Adopcion}")
    public String eliminarAdopcion(Adopcion adopcion) {
        adopcionService.deleteAdopcion(adopcion);
        return "redirect:/adopcion/listado";
    }

    //------NUEVO-----
    @GetMapping("/nuevo")
    public String nuevoAdopcion(Adopcion adopcion) {
        return "/adopcion/modifica";
    }

    //-----GUARDAR----
    @PostMapping("guardar")
    public String guardarAdopcion(Adopcion adopcion) {
        adopcionService.saveAdopcion(adopcion);
        return "redirect:/adopcion/listado";
    }

    //---------MODIFICAR-------------
    @GetMapping("/editar/{id_Adopcion}")
    public String editaAdopcion(Adopcion adopcion) {
        adopcion = adopcionService.getAdopcion(adopcion);
        return "/adopcion/modifica";
    }
}
