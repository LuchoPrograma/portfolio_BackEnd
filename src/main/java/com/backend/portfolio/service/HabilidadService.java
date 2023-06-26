/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Habilidad;
import com.backend.portfolio.repository.HabilidadRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class HabilidadService implements IHabilidadService {

    @Autowired
    private HabilidadRepository skillRepository;

    @Override
    public List<Habilidad> getHabilidad() {
        return skillRepository.findAll();
    }

    @Override
    public Habilidad findHabilidad(Long id) {
        return skillRepository.findById(id).orElse(null);
    }

    @Override
    public void addHabilidad(Habilidad skill) {
        skillRepository.save(skill);
    }

    @Override
    public void deleteHabilidad(Long id) {
        skillRepository.deleteById(id);
    }

    @Override
    public Habilidad editHabilidad(Long id,
            String editHabilidad,
            String editPorcentaje) {
        
        Habilidad editedSkill = skillRepository.findById(id).orElse(null);
        editedSkill.setHabilidad(editHabilidad);
        editedSkill.setPorcentaje(editPorcentaje);
        
        skillRepository.save(editedSkill);
        return editedSkill;
    }

}
