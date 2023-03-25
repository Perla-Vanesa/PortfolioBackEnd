package com.ejemplo.Portfolio.repository;

import com.ejemplo.Portfolio.model.Habilidad;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HabilidadRepository extends JpaRepository <Habilidad, Long>{
    
}
