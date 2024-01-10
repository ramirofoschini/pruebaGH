/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sa.demo.service;

import com.sa.demo.model.Persona;
import com.sa.demo.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author ramip
 */

@Service
public class PersonaService {
    
    @Autowired
    PersonaRepository personaRepository;
    
    public List <Persona> findAll(){
    return personaRepository.findAll();
    }
    
}
