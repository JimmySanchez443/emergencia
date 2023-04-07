package com.emergencia.demo.controller;


import com.emergencia.demo.modelo.Emergencia;

import com.emergencia.demo.repository.EmergenciaRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
@RequiredArgsConstructor
public class EmergenciaController {

    @Autowired
    private final EmergenciaRepository emergenciaRepository;

    @GetMapping("/emergencia")
    public List<Emergencia> findAll() {
        return emergenciaRepository.findAll();
    }

    @PostMapping("/emergencia")
    public void save(@RequestBody Emergencia emergencia){
        emergenciaRepository.save(emergencia);
    }


    @GetMapping("/emergencia/{id}")
    public Emergencia findById(@PathVariable String id){
        return emergenciaRepository.findById(id).get();
    }

    @DeleteMapping("/emergencia/{id}")
    public void deleteBy(@PathVariable String id){
        emergenciaRepository.deleteById(id);
    }




}
