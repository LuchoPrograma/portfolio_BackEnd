package com.backend.portfolio.controller;

import com.backend.portfolio.model.Educacion;
import com.backend.portfolio.model.Experiencia;
import com.backend.portfolio.model.Habilidad;
import com.backend.portfolio.model.Persona;
import com.backend.portfolio.service.IEducacionService;
import com.backend.portfolio.service.IExperienciaService;
import com.backend.portfolio.service.IHabilidadService;
import com.backend.portfolio.service.IPersonaService;
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
            @RequestParam("acercaDe") String editarAcercaDe,
            @RequestParam("urlFoto") String editarUrlFoto) {

        return interPersona.editAbout(id,
                editarNombre,
                editarApellido,
                editarAcercaDe,
                editarUrlFoto);
    }

    @PostMapping("/persona/crear")
    public String createPersona(@RequestBody Persona perso) {
        interPersona.savePersona(perso);
        return "La Persona fue creada correctamente";
    }

    //Education
    @Autowired
    private IEducacionService interEducacion;

    @GetMapping("/educacion/get")
    public List<Educacion> getEducation() {

        return interEducacion.getEducacion();
    }

    @PostMapping("/educacion/add")
    public String addEducation(@RequestBody Educacion educ) {
        interEducacion.addEducacion(educ);
        return "La Educacion fue creada correctamente";
    }

    @DeleteMapping("educacion/delete/{id}")
    public String deleteEducation(@PathVariable Long id) {
        interEducacion.deleteEducacion(id);
        return "Le educacion se eliminó correctamente";
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
    public String deleteExperience(@PathVariable Long id) {
        interExp.deleteExperiencia(id);
        return "La experiencia fue eliminada correctamente";
    }

    @PostMapping("/experiencia/add")
    public String addExperience(@RequestBody Experiencia exp) {
        interExp.addExperiencia(exp);
        return "Nueva Experiencia agregada correctamente";
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

    @Autowired
    private IHabilidadService interSkill;

    @GetMapping("/habilidad/get")
    public List<Habilidad> getSkill() {

        return interSkill.getHabilidad();
    }

    @DeleteMapping("/habilidad/delete/{id}")
    public String deleteSkill(@PathVariable Long id) {
        interSkill.deleteHabilidad(id);
        return "La habilidad fue eliminada correctamente";
    }

    @PostMapping("/habilidad/add")
    public String addSkill(@RequestBody Habilidad skill) {
        interSkill.addHabilidad(skill);
        return "Nueva habilidad agregada correctamente";
    }

    @PutMapping("/habilidad/edit/{id}")
    public String editSkill(@PathVariable Long id,
            @RequestParam("habilidad") String editHabilidad,
            @RequestParam("porcentaje") String editPorcentaje) {
        interSkill.editHabilidad(id,editHabilidad,editPorcentaje);
        
        return "Habilidad editada correctamente";
    }
}
