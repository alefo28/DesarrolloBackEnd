package com.examples.demo.models.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
    public Computadora deailDelete(@PathVariable Long id) {
        return service.findById(id);
    }

    //@PostMapping
    //@Put....
}
