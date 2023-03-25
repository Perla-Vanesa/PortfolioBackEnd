package com.ejemplo.Portfolio.repository;

import com.ejemplo.Portfolio.model.Header;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeaderRepository extends JpaRepository <Header, Long>{
    
}
