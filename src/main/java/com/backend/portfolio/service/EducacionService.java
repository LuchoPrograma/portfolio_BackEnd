/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class EducacionService implements IEducacionService {
    
    @Autowired
    private EducacionRepository educRepository;

    @Override
    public List<Educacion> getEducacion() {
       List<Educacion> listadoEduc = educRepository.findAll();
       return listadoEduc;
    }

    @Override
    public void addEducacion(Educacion educ) {
        educRepository.save(educ);
    }

    @Override
    public void deleteEducacion(Long id) {
        educRepository.deleteById(id);
    }

    @Override
    public Educacion findEducacion(Long id) {
        Educacion educ = educRepository.findById(id).orElse(null);
        return educ;
    }

    @Override
    public Educacion editEducacion(Long id, String newTitulo, String newInstitucion, String newDescripcion, String newFechaDesde, String newFechaHasta, String newUrlLogo) {
        Educacion educ = educRepository.findById(id).orElse(null);
        
        educ.setTitulo(newTitulo);
        educ.setInstitucion(newInstitucion);
        educ.setDescripcion(newDescripcion);
        educ.setFechaDesde(newFechaDesde);
        educ.setFechaHasta(newFechaHasta);
        educ.setUrlLogo(newUrlLogo);
        
        educRepository.save(educ);
        
        return educ;
        
    }
    
}
