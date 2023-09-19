package com.examples.demo.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.examples.demo.models.entity.Computadora;

public interface ComputadoraDao extends CrudRepository<Computadora, Long> {
    
}
