package com.farmaciascomunales.dispersion.service;

import com.farmaciascomunales.dispersion.model.OrdenDispersion;
import com.farmaciascomunales.dispersion.repository.OrdenDispersionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DispersionService {

    private final OrdenDispersionRepository repository;

    public DispersionService(OrdenDispersionRepository repository) {
        this.repository = repository;
    }

    public List<OrdenDispersion> listar() {
        return repository.findAll();
    }

    public OrdenDispersion obtener(Long id) {
        return repository.findById(id).orElse(null);
    }

    public OrdenDispersion crear(OrdenDispersion orden) {
        return repository.save(orden);
    }
}