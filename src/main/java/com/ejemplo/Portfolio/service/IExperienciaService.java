package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Experiencia;
import java.util.List;

public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    
    public void crearExperiencia(Experiencia exp);
    
    public void borrarExperiencia(Long id);
    
    public Experiencia encontrarExperiencia(Long id);
    
}
