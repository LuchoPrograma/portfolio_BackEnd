
package com.backend.portfolio.controller;

import com.backend.portfolio.model.Persona;
import com.backend.portfolio.service.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired 
    private IPersonaService interPersona;
    
    //About
    @GetMapping("/persona/get")
    public List<Persona> getAbout(){
        
        return interPersona.getAbout();
    } 
    @PutMapping ("persona/editar/{id}")
    public Persona editAbout(@PathVariable Long id,
                               @RequestParam ("nombre") String editarNombre,
                               @RequestParam("apellido") String editarApellido,
                               @RequestParam("acercaDe") String editarAcercaDe,
                               @RequestParam ("urlFoto") String editarUrlFoto){
        
        return interPersona.editAbout(id, 
                            editarNombre, 
                            editarApellido,
                            editarAcercaDe, 
                            editarUrlFoto);    
    }
    @PostMapping ("/persona/crear")
    public String createPersona(@RequestBody Persona perso){
        interPersona.savePersona(perso);
        return "La Persona fue creada correctamente";
    }
    

   
    
    
}
