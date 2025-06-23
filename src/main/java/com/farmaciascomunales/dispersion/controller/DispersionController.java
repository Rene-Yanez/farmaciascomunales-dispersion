package com.farmaciascomunales.dispersion.controller;

import com.farmaciascomunales.dispersion.model.OrdenDispersion;
import com.farmaciascomunales.dispersion.service.DispersionService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dispersion")
public class DispersionController {

    private final DispersionService service;

    public DispersionController(DispersionService service) {
        this.service = service;
    }

    @GetMapping
    public List<OrdenDispersion> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public OrdenDispersion obtener(@PathVariable Long id) {
        return service.obtener(id);
    }

    @PostMapping
    public OrdenDispersion crear(@RequestBody OrdenDispersion orden) {
        return service.crear(orden);
    }
}