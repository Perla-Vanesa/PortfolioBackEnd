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
public class Habilidad {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreHabilidad;
    private Long dominio;

    public Habilidad() {
    }

    public Habilidad(String nombreHabilidad, Long dominio) {
        this.nombreHabilidad = nombreHabilidad;
        this.dominio = dominio;
    }
    
    public Habilidad(Long id, String nombreHabilidad, Long dominio) {
        this.id = id;
        this.nombreHabilidad = nombreHabilidad;
        this.dominio = dominio;
    }

    
    
    
    
}
