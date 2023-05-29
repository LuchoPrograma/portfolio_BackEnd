/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    
    @Autowired
    private ExperienciaRepository expRepository;

    @Override
    public List<Experiencia> getExperiencia() {
        List<Experiencia> allExp = expRepository.findAll();
        return allExp;
    }

    @Override
    public Experiencia findExperiencia(Long id) {
        Experiencia findExp = expRepository.findById(id).orElse(null);
        return findExp;
    }

    @Override
    public void addExperiencia(Experiencia exp) {
        expRepository.save(exp);
    }

    @Override
    public void deleteExperiencia(Long id) {
        expRepository.deleteById(id);
    }

    @Override
    public Experiencia editExperiencia(Long id, String newCargo, String newInstitucion, String newDescripcion, String newFechaDesde, String newFechaHasta, String newUrlLogo) {
       Experiencia editExp =  expRepository.findById(id).orElse(null);
       
       editExp.setCargo(newCargo);
       editExp.setInstitucion(newInstitucion);
       editExp.setDescripcion(newDescripcion);
       editExp.setFechaDesde(newFechaDesde);
       editExp.setFechaHasta(newFechaHasta);
       editExp.setUrlLogo(newUrlLogo);
       
       expRepository.save(editExp);
       return editExp;
    }
    
}
