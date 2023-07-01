/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class PersonaService implements IPersonaService {
    
    @Autowired
    private PersonaRepository persoRepository;

    @Override
    public List<Persona> getAbout() {
        List<Persona> listaPersonas = persoRepository.findAll();
        return listaPersonas;
    }

    
//    @Override
//    public void editPersona(Long id, Persona changedPerso){
//        Persona perso = persoRepository.findById(id).orElse(null);
//        
//        System.out.println(perso);
//        persoRepository.save(perso);
//    }
    
    
    @Override
    public void editAbout(Long id, String editarNombre, String editarApellido, String editarTitulo, String editarAcercaDe, String editarUrlFoto) {
         Persona perso = persoRepository.findById(id).orElse(null);
        
        perso.setNombre(editarNombre);
        perso.setApellido(editarApellido);
        perso.setTitulo(editarTitulo);
        perso.setAcercaDe(editarAcercaDe);
        perso.setUrlFoto(editarUrlFoto);
        
        persoRepository.save(perso);
       
    }

    @Override
    public void savePersona(Persona perso) {
        persoRepository.save(perso);
    }


    
}
