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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombreProyecto;
    private String inicio;
    private String fin;
    private String descripcion;
    private String urlProyecto;

    public Proyecto() {
    }

    public Proyecto(String nombreProyecto, String inicio, String fin, String descripcion, String urlProyecto) {
        this.nombreProyecto = nombreProyecto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
    }

    public Proyecto(Long id, String nombreProyecto, String inicio, String fin, String descripcion, String urlProyecto) {
        this.id = id;
        this.nombreProyecto = nombreProyecto;
        this.inicio = inicio;
        this.fin = fin;
        this.descripcion = descripcion;
        this.urlProyecto = urlProyecto;
    }
    
    
    
}
