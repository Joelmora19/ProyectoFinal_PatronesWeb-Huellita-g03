/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Huellita.dao;

import com.Huellita.domain.Articulo;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArticuloDao extends JpaRepository<Articulo, Long>{
    
}
