/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Huellita.service;

import com.Huellita.domain.Cita;
import java.util.List;

/**
 *
 * @author Derek
 */
public interface CitaService {
    public List<Cita> getCita();
    
    public Cita getCita(Cita cita);
    
    public void deleteCita(Cita cita);
    
    public void saveCita(Cita cita);
}
