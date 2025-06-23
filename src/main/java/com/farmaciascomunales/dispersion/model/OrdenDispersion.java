package com.farmaciascomunales.dispersion.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class OrdenDispersion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long idVenta;         // Referencia a la venta
    private Long idBeneficiario; // Paciente a quien se entrega
    private LocalDate fechaProgramada;
    private String estado;       // PROGRAMADA, ENTREGADA, CANCELADA

    // Getters y setters
    public Long getId() { return id; }

    public void setId(Long id) { this.id = id; }

    public Long getIdVenta() { return idVenta; }

    public void setIdVenta(Long idVenta) { this.idVenta = idVenta; }

    public Long getIdBeneficiario() { return idBeneficiario; }

    public void setIdBeneficiario(Long idBeneficiario) { this.idBeneficiario = idBeneficiario; }

    public LocalDate getFechaProgramada() { return fechaProgramada; }

    public void setFechaProgramada(LocalDate fechaProgramada) { this.fechaProgramada = fechaProgramada; }

    public String getEstado() { return estado; }

    public void setEstado(String estado) { this.estado = estado; }
}