/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Persona;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IPersonaService {
    
    public List<Persona> getAbout();
    
    public void savePersona(Persona perso);
    
    public void editAbout(Long id,
                              String editarNombre,
                              String editarApellido,
                              String editarTitulo,
                              String editarAcercaDe,
                              String editarUrlFoto
                             );
    
    
}
