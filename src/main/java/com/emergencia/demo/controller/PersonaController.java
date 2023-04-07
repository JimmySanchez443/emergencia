package com.emergencia.demo.controller;

import com.emergencia.demo.modelo.Persona;
import com.emergencia.demo.repository.PersonaRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class PersonaController {
    @Autowired
    private final PersonaRepository personaRepository;

    @GetMapping("/persona")
    public List<Persona> findAll() {
        return personaRepository.findAll();
    }

    @PostMapping("/persona")
    public void save(@RequestBody Persona persona){
        personaRepository.save(persona);
    }


    @GetMapping("/persona/{id}")
    public Persona findById(@PathVariable String id){
        return personaRepository.findById(id).get();
    }

    @DeleteMapping("/persona/{id}")
    public void deleteBy(@PathVariable String id){
        personaRepository.deleteById(id);
    }





}
