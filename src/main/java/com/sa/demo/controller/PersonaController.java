/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sa.demo.controller;

import com.sa.demo.model.Persona;
import com.sa.demo.service.PersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ramip
 */
@RestController
@RequestMapping(path="/api/v1/persona")
public class PersonaController {
    
    
    @Autowired
    PersonaService service;
    
    
    @GetMapping("")
    public List <Persona> findAll(){
    return service.findAll();
}
    
}