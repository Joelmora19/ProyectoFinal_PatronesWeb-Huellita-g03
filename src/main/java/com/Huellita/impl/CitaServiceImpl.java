package com.Huellita.impl;


import com.Huellita.dao.CitaDao;
import com.Huellita.domain.Cita;

import com.Huellita.service.CitaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Derek
 */
@Service
public class CitaServiceImpl implements CitaService {

    @Autowired
    private CitaDao citaDao;

    @Override
    public List<Cita> getCita() {
        return (List<Cita>) citaDao.findAll();
    }

    @Override
    public Cita getCita(Cita cita) {
        return citaDao.findById(cita.getId_Cita()).orElse(null);
    }

    @Override
    public void deleteCita(Cita cita) {
        citaDao.delete(cita);
    }

    @Override
    public void saveCita(Cita cita) {
        citaDao.save(cita);
    }

}
