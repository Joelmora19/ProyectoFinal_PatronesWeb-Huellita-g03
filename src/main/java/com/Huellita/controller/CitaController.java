package com.Huellita.controller;

import com.Huellita.domain.Cita;
import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.Huellita.service.CitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
@RequestMapping("/cita")

public class CitaController {

    @Autowired
    private CitaService citaService;

    //---------LISTADO--------
    @GetMapping("/listado")
    public String inicioArticuto(Model model) {
        var cita = citaService.getCita();
        model.addAttribute("cita",cita);
        return "/cita/listado";
    }
    
    //---------ELIMINAR--------
    @GetMapping("/eliminar/{id_Cita}")
    public String eliminarArticuto(Cita cita) {
        citaService.deleteCita(cita);
        return "redirect:/cita/listado";
    }
    
    //------------NUEVO---------------
    @GetMapping("/nuevo")
    public String nuevoArticuto(Cita cita) {
        return "/cita/modifica";
    }
    
    //--------GUARDAR---------------
    @PostMapping("/guardar")
    public String guardarCita(Cita cita){
        citaService.saveCita(cita);
        return "redirect:/cita/listado";
    }
    
    //---------MODIFICAR-------------
    @GetMapping("/editar/{id_Cita}")
    public String editaCita(Cita cita){
        cita = citaService.getCita(cita);
        return "/cita/modifica";
    }
    
    

}
