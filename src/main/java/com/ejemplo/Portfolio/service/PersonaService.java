package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Persona;
import com.ejemplo.Portfolio.repository.PersonaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaService implements IPersonaService{
    
    @Autowired
    public PersonaRepository persoRepo;
    
    @Override
    public List<Persona> verPersona() {
        return persoRepo.findAll();
    }
    
    @Override
    public void crearPersona(Persona per) {
        persoRepo.save(per);//ver de agregar una lista de personas en base a la id
    }
    
    @Override
    public void borrarPersona(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public Persona encontrarPersona(Long id) {
        Persona per = persoRepo.findById(id).orElse(null);
        return per;
    }

    
}
