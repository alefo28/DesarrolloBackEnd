package com.examples.demo.models.service.ComputadoraService;

import java.util.List;

import com.examples.demo.models.entity.Computadora;

public interface ComputadoraService {

    /**
     * Este Metodo Retorna todo un Listado de computadoras
     * 
     * @return
     **/

    public List<Computadora> findAll();

    public Computadora findById(Long id);

    // post
    public Computadora setComputadora(String name, String marca);

    // put
    public Computadora save(Computadora updateComputadora);
}
