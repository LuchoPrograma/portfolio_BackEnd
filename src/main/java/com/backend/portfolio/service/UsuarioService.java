/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Usuario;
import com.backend.portfolio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author PC
 */
@Service
public class UsuarioService implements IUsuarioService{

    @Autowired
    private UsuarioRepository userRepository;
    
    @Override
    public Usuario getUsuario(Long id) {
        Usuario usuario = userRepository.findById(id).orElse(null);
        
        return usuario;
    }

    @Override
    public void createUsuario(Usuario user) {
        userRepository.save(user);
    }
    
}
