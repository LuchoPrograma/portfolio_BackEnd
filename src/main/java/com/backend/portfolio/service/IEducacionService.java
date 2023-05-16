/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Educacion;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IEducacionService {
    
    public List<Educacion> getEducacion ();
    
    public void addEducacion(Educacion educ);
    
    public void deleteEducacion(Long id);
    
    public Educacion findEducacion(Long id);
    
    public Educacion editEducacion(Long id,
                              String newTitulo,
                              String newInstitucion,
                              String newDescripcion,
                              String newFechaDesde,
                              String newFechaHasta,
                              String newUrlLogo
                              );
    
}
