package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Educacion;
import com.ejemplo.Portfolio.repository.EducacionRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EducacionService implements IEducacionService{
    
    @Autowired
    public EducacionRepository educRepo;
    
    @Override
    public List<Educacion> verEducacion() {
        return educRepo.findAll();
    }
    
    @Override
    public void crearEducacion(Educacion edu) {
        educRepo.save(edu);
    }
    
    @Override
    public void borrarEducacion(Long id) {
        educRepo.deleteById(id);
    }

    @Override
    public Educacion encontrarEducacion(Long id) {
        Educacion edu = educRepo.findById(id).orElse(null);
        return edu;
    }
    
}
