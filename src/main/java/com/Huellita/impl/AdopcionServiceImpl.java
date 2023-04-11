package com.Huellita.impl;

import com.Huellita.dao.AdopcionDao;
import com.Huellita.domain.Adopcion;
import com.Huellita.service.AdopcionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdopcionServiceImpl implements AdopcionService {

    @Autowired
    private AdopcionDao adopcionDao;

    @Override
    public List<Adopcion> getAdopcion() {
        return (List<Adopcion>) adopcionDao.findAll();
    }

    @Override
    public Adopcion getAdopcion(Adopcion adopcion) {
        return adopcionDao.findById(adopcion.getId_Adopcion()).orElse(null);
    }

    @Override
    public void deleteAdopcion(Adopcion adopcion) {
        adopcionDao.delete(adopcion);
    }
    
    @Override
    public void saveAdopcion(Adopcion adopcion) {
        adopcionDao.save(adopcion);
    }

}
