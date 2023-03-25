package com.ejemplo.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreEmpresa;
    private String puesto;
    private String inicio;
    private String fin;
    private String descripcion;
    private String urlLogo;

    public Experiencia() {
    }

    public Experiencia(String nombreEmpresa, String puesto, String inicio, String fin, String descripcion, String urlLogo) {
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.urlLogo = urlLogo;
    }

    public Experiencia(Long id, String nombreEmpresa, String puesto, String inicio, String fin, String descripcion, String urlLogo) {
        this.id = id;
        this.nombreEmpresa = nombreEmpresa;
        this.puesto = puesto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.urlLogo = urlLogo;
    }
    
    
    
}
