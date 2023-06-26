/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Proyecto;
import java.util.List;

/**
 *
 * @author PC
 */
public interface IProyectoService {

    public List<Proyecto> getProyectos();

    public void addProyecto(Proyecto project);

    public void deleteProyecto(Long id);

    public Proyecto findProyecto(Long id);

    public Proyecto editProyecto(Long id,
            String editNombre,
            String editDescripcion,
            String editUrlProyect,
            String editFecha);

}
