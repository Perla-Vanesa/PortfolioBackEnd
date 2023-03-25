package com.ejemplo.Portfolio.service;

import com.ejemplo.Portfolio.model.Proyecto;
import com.ejemplo.Portfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proyRepo;
    
    @Override
    public List<Proyecto> verProyecto() {
        return proyRepo.findAll();
    }
    
    @Override
    public void crearProyecto(Proyecto pro) {
        proyRepo.save(pro);
    }
    
    @Override
    public void borrarProyecto(Long id) {
        proyRepo.deleteById(id);
    }

    @Override
    public Proyecto encontrarProyecto(Long id) {
        Proyecto pro = proyRepo.findById(id).orElse(null);
        return pro;
    }
    
}
