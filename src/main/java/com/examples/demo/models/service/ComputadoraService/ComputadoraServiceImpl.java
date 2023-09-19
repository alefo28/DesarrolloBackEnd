package com.examples.demo.models.service.ComputadoraService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.examples.demo.models.dao.ComputadoraDao;
import com.examples.demo.models.entity.Computadora;

@Service
public class ComputadoraServiceImpl implements ComputadoraService {

    @Autowired
    private ComputadoraDao computadoraDao;

    @Override
    @Transactional(readOnly = true)
    public List<Computadora> findAll() {
        return (List<Computadora>) computadoraDao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Computadora findById(Long id) {
        return computadoraDao.findById(id).orElse(null);
    }

    //post
    //put

}
