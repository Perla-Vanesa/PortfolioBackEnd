package com.ejemplo.Portfolio.Security.SecurityRepository;

import com.ejemplo.Portfolio.Security.Entity.Rol;
import com.ejemplo.Portfolio.Security.Enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IRolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
    
}
