
package com.Huellita.service;

import com.Huellita.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulo();
    
    public Articulo getArticulo(Articulo articulo);
    
    public void deleteArticulo(Articulo articulo);
    
    public void saveArticulo(Articulo articulo);
}
