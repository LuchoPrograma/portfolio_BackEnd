/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.repository;

import com.backend.portfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author PC
 */
public interface ProyectoRepository extends JpaRepository <Proyecto, Long> {
    
}
