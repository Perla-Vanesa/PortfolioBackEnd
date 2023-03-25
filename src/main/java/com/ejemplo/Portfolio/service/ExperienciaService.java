package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Experiencia;
import com.ejemplo.Portfolio.repository.ExperienciaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienciaService implements IExperienciaService{
    
    @Autowired
    public ExperienciaRepository expoRepo;
    
    @Override
    public List<Experiencia> verExperiencia() {
        return expoRepo.findAll();
    }
    
    @Override
    public void crearExperiencia(Experiencia exp) {
        expoRepo.save(exp);
    }
    
    @Override
    public void borrarExperiencia(Long id) {
        expoRepo.deleteById(id);
    }

    @Override
    public Experiencia encontrarExperiencia(Long id) {
        Experiencia exp = expoRepo.findById(id).orElse(null);
        return exp;
    }
    
}
