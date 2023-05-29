/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experiencia;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IExperienciaService {
    
    public List <Experiencia> getExperiencia();
    
    public Experiencia findExperiencia(Long id);
    
    public void addExperiencia(Experiencia exp);
    
    public void deleteExperiencia(Long id);
    
    public Experiencia editExperiencia(Long id,
                                       String newCargo,
                                       String newInstitucion,
                                       String newDescripcion,
                                       String newFechaDesde,
                                       String newFechaHasta,
                                       String newUrlLogo);
    
}
