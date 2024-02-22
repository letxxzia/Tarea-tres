package com.example.Tarea3backend.model;

import jakarta.persistence.*;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double importeTotal;

    @ManyToOne
    @JoinColumn(name = "clientes_id")
    private Cliente cliente;

    public Factura() {

    }

    public Factura(Long id, double importeTotal, Cliente cliente) {
        this.id = id;
        this.importeTotal = importeTotal;
        this.cliente = cliente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getImporteTotal() {
        return importeTotal;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}