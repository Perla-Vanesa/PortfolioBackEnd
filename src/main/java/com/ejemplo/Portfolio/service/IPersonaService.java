package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Persona;
import java.util.List;

public interface IPersonaService {
    
    public List<Persona> verPersona();
    
    public void crearPersona(Persona per);
    
    public void borrarPersona(Long id);
    
    public Persona encontrarPersona(Long id);
}
