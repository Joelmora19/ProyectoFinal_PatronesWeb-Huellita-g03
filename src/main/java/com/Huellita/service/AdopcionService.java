package com.Huellita.service;

import com.Huellita.domain.Adopcion;
import java.util.List;

public interface AdopcionService {

    public List<Adopcion> getAdopcion();
    
    public Adopcion getAdopcion(Adopcion adopcion);
    
    public void deleteAdopcion(Adopcion adopcion);
    
    public void saveAdopcion(Adopcion adopcion);
    
}
