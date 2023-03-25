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
public class Persona {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String sobreMi;
    private String urlFoto;
    private String title;

    public Persona() {
    }

    public Persona(Long id, String name, String sobreMi, String urlFoto, String title) {
        this.id = id;
        this.name = name;
        this.sobreMi = sobreMi;
        this.urlFoto = urlFoto;
        this.title = title;
    }
    
    
    
    
}
