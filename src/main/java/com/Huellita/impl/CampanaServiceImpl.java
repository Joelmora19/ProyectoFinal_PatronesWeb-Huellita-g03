/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Huellita.impl;

import com.Huellita.domain.Campana;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Huellita.dao.CampanaDao;
import com.Huellita.service.CampanaService;

/**
 *
 * @author Monserrat Najera
 */
@Service
public class CampanaServiceImpl implements CampanaService{
     @Autowired
    private CampanaDao campanaDao;

    @Override
    public List<Campana> getCampana() {
        return (List<Campana>) campanaDao.findAll();
    }

    @Override
    public Campana getCampana(Campana campana) {
        return campanaDao.findById(campana.getId_Campanas()).orElse(null);
    }

    @Override
    public void deleteCampana(Campana campana) {
        campanaDao.delete(campana);
    }
    
    @Override
    public void saveCampana(Campana campana) {
        campanaDao.save(campana);
    } 
}
