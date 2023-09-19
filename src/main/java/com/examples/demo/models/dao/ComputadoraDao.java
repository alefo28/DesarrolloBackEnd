package com.examples.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.examples.demo.models.entity.Computadora;

public interface ComputadoraDao extends CrudRepository<Computadora, Long> {

    static Computadora setComputadora(String name, String marca) {
        Computadora compu = new Computadora();
        compu.setName(name);
        compu.setMarca(marca);
        return compu;
    }
    
    
}

