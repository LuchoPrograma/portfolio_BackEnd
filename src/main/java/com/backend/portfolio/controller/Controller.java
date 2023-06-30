package com.backend.portfolio.controller;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Habilidad;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.model.Proyecto;
import com.backend.portfolio.service.IEducacionService;
import com.backend.portfolio.service.IExperienciaService;
import com.backend.portfolio.service.IHabilidadService;
import com.backend.portfolio.service.IPersonaService;
import com.backend.portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    //About
    @Autowired
    private IPersonaService interPersona;

    @GetMapping("/persona/get")
    public List<Persona> getAbout() {

        return interPersona.getAbout();
    }

    @PutMapping("persona/editar/{id}")
    public Persona editAbout(@PathVariable Long id,
            @RequestParam("nombre") String editarNombre,
            @RequestParam("apellido") String editarApellido,
            @RequestParam("titulo") String editarTitulo,
            @RequestParam("acercaDe") String editarAcercaDe,
            @RequestParam("urlFoto") String editarUrlFoto) {

        return interPersona.editAbout(id,
                editarNombre,
                editarApellido,
                editarTitulo,
                editarAcercaDe,
                editarUrlFoto);
    }

    @PostMapping("/persona/crear")
    public void createPersona(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
    }

    //Education
    @Autowired
    private IEducacionService interEducacion;

    @GetMapping("/educacion/get")
    public List<Educacion> getEducation() {

        return interEducacion.getEducacion();
    }

    @PostMapping("/educacion/add")
    public void addEducation(@RequestBody Educacion educ) {
        interEducacion.addEducacion(educ);
        
    }

    @DeleteMapping("educacion/delete/{id}")
    public void deleteEducation(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
    }

    @PutMapping("/educacion/edit/{id}")
    public Educacion editEducation(@PathVariable Long id,
            @RequestParam("titulo") String newTitulo,
            @RequestParam("institucion") String newInstitucion,
            @RequestParam("descripcion") String newDescripcion,
            @RequestParam("fechaDesde") String newFechaDesde,
            @RequestParam("fechaHasta") String newFechaHasta,
            @RequestParam("urlLogo") String newUrlLogo
    ) {

        return interEducacion.editEducacion(id, newTitulo, newInstitucion, newDescripcion, newFechaDesde, newFechaHasta, newUrlLogo);

    }

    //Experience
    @Autowired
    private IExperienciaService interExp;

    @GetMapping("/experiencia/get")
    public List<Experiencia> getExperience() {

        return interExp.getExperiencia();
    }

    @DeleteMapping("/experiencia/delete/{id}")
    public void deleteExperience(@PathVariable Long id) {
        interExp.deleteExperiencia(id);
    }

    @PostMapping("/experiencia/add")
    public void addExperience(@RequestBody Experiencia exp) {
        interExp.addExperiencia(exp);
       
    }

    @PutMapping("/experiencia/edit/{id}")
    public Experiencia editExperience(@PathVariable Long id,
            @RequestParam("cargo") String newCargo,
            @RequestParam("institucion") String newInstitucion,
            @RequestParam("descripcion") String newDescripcion,
            @RequestParam("fechaDesde") String newFechaDesde,
            @RequestParam("fechaHasta") String newFechaHasta,
            @RequestParam("urlLogo") String newUrlLogo
    ) {

        return interExp.editExperiencia(id, newCargo, newInstitucion, newDescripcion, newFechaDesde, newFechaHasta, newUrlLogo);

    }

    //Habilidad
    @Autowired
    private IHabilidadService interSkill;

    @GetMapping("/habilidad/get")
    public List<Habilidad> getSkill() {

        return interSkill.getHabilidad();
    }

    @DeleteMapping("/habilidad/delete/{id}")
    public void deleteSkill(@PathVariable Long id) {
        interSkill.deleteHabilidad(id);
    }

    @PostMapping("/habilidad/add")
    public void addSkill(@RequestBody Habilidad skill) {
        interSkill.addHabilidad(skill);
    }

    @PutMapping("/habilidad/edit/{id}")
    public void editSkill(@PathVariable Long id,
            @RequestParam("habilidad") String editHabilidad,
            @RequestParam("porcentaje") String editPorcentaje) {
        interSkill.editHabilidad(id,editHabilidad,editPorcentaje);
        
    }
    
    //Proyects
    
    @Autowired
    private IProyectoService interProyect;
    
    @GetMapping("/proyecto/get")
    public List<Proyecto> getProject(){
        return interProyect.getProyectos();
    }
    
    @DeleteMapping("/proyecto/delete/{id}")
    public void deleteProject(@PathVariable Long id){
        interProyect.deleteProyecto(id);
    }
    
    @PostMapping("/proyecto/add")
    public String addProject(@RequestBody Proyecto project){
        interProyect.addProyecto(project);
        return "Proyecto añadido correctamente";
    }
    
    @PutMapping("/proyecto/edit/{id}")
    public void editProject(@PathVariable Long id,
                              @RequestParam("nombre") String editNombre,
                              @RequestParam("descripcion") String editDescripcion,
                              @RequestParam("urlProyecto") String editUrlProyect,
                              @RequestParam("fecha") String editFecha){
        
        interProyect.editProyecto(id, editNombre, editDescripcion, editUrlProyect, editFecha);
        
        
    }
            
    
}
