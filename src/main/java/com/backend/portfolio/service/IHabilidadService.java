/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Habilidad;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IHabilidadService {
    
    public List<Habilidad> getHabilidad();
    
    public Habilidad findHabilidad(Long id);
    
    public void addHabilidad(Habilidad skill);
    
    public void deleteHabilidad(Long id);
    
    public Habilidad editHabilidad(Long id,
                              String editHabilidad,
                              String editPorcentaje);
    
}
