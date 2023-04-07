/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Huellita.service;

import com.Huellita.domain.Articulo;
import java.util.List;


public interface ArticuloService {
    public List<Articulo> getArticulo();
    
    public Articulo getArticulo(Articulo articulo);
    
    public void deleteArticulo(Articulo articulo);
    
    public void saveArticulo(Articulo articulo);
}
