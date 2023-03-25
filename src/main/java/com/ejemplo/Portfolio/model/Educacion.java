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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreInst;
    private String urlLogo;
    private String carrera;
    private String inicio;
    private String fin;

    public Educacion() {
    }

    public Educacion(String nombreInst, String urlLogo, String carrera, String inicio, String fin) {
        this.nombreInst = nombreInst;
        this.urlLogo = urlLogo;
        this.carrera = carrera;
        this.inicio = inicio;
        this.fin = fin;
    }

    public Educacion(Long id, String nombreInst, String urlLogo, String carrera, String inicio, String fin) {
        this.id = id;
        this.nombreInst = nombreInst;
        this.urlLogo = urlLogo;
        this.carrera = carrera;
        this.inicio = inicio;
        this.fin = fin;
    }
    
    
    
}
