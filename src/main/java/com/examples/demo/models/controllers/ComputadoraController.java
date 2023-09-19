package com.examples.demo.models.controllers;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.examples.demo.models.entity.Computadora;
import com.examples.demo.models.service.ComputadoraService.ComputadoraService;

@RestController
public class ComputadoraController {

    @Autowired
    private ComputadoraService service;

    @GetMapping("/listComputadora")
    public List<Computadora> list() {
        return service.findAll();
    };

    @GetMapping("/computadora/(id)")
    public Computadora detail(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/computadora/(id)")
    public Computadora detailDelete(@PathVariable Long id) {
        return service.findById(id);
    }

    // post
    @PostMapping("/computadora")
    public Computadora addComputer(@PathVariable String name, String marca) {
        return service.setComputadora(name, marca);
    }

    // put
    @PutMapping("/computadora/(id)")
    public  Computadora updateComputer(@PathVariable Long id, String name, String marca){
        Computadora updateComputadora = service.findById(id);

        updateComputadora.setName(name);
        updateComputadora.setMarca(marca);

        
        return service.save(updateComputadora);
    }
}
