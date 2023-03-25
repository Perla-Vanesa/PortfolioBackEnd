package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Educacion;
import java.util.List;

public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    
    public void crearEducacion(Educacion edu);
    
    public void borrarEducacion(Long id);
    
    public Educacion encontrarEducacion(Long id);
    
}
