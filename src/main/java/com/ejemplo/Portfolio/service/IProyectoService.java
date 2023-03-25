package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Proyecto;
import java.util.List;

public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    
    public void crearProyecto(Proyecto pro);
    
    public void borrarProyecto(Long id);
    
    public Proyecto encontrarProyecto(Long id);
    
}
