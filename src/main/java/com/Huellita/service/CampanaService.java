/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Huellita.service;

import com.Huellita.domain.Campana;
import java.util.List;

/**
 *
 * @author Monserrat Najera
 */
public interface CampanaService {
   public List<Campana> getCampana();
    
    public Campana getCampana(Campana campana);
    
    public void deleteCampana(Campana campana);
    
    public void saveCampana(Campana campana); 
}
