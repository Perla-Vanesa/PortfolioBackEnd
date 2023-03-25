package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Habilidad;
import java.util.List;

public interface IHabilidadService {
    
    public List<Habilidad> verHabilidad();
    
    public void crearHabilidad(Habilidad hab);
    
    public void borrarHabilidad(Long id);
    
    public Habilidad encontrarHabilidad(Long id);
    
}
