/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.backend.portfolio.service;

import com.backend.portfolio.model.Usuario;

/**
 *
 * @author PC
 */
public interface IUsuarioService {
    
    public Usuario getUsuario(Long id);
    public void createUsuario(Usuario user);
    
}
