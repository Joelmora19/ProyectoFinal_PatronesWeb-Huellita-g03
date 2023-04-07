package com.Huellita.dao;

import com.Huellita.domain.Articulo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticuloDao extends JpaRepository<Articulo, Long>{
    
}
