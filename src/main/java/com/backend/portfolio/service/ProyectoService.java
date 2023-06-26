/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Proyecto;
import com.backend.portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */

@Service
public class ProyectoService implements IProyectoService{

    @Autowired
    private ProyectoRepository proyectRepository;
    
    
    @Override
    public List<Proyecto> getProyectos() {
        List<Proyecto> listaProyectos = proyectRepository.findAll();
        return listaProyectos;
    }

    @Override
    public void addProyecto(Proyecto project) {
        proyectRepository.save(project);
    }

    @Override
    public void deleteProyecto(Long id) {
       proyectRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
        return proyectRepository.findById(id).orElse(null);
    }

    @Override
    public Proyecto editProyecto(Long id, String editNombre, String editDescripcion, String editUrlProyect, String editFecha) {
        Proyecto project = proyectRepository.findById(id).orElse(null);
        
        project.setNombre(editNombre);
        project.setDescripcion(editDescripcion);
        project.setUrlProyecto(editUrlProyect);
        project.setFecha(editFecha);
        
        proyectRepository.save(project);
        
        return project;
    }
   
    
    
}
