package com.ejemplo.Portfolio.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Header {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String apLogo;
    private String nombrePrograma;
    private String login;
    private String banner;

    public Header() {
    }

    public Header(Long id, String apLogo, String nombrePrograma, String login, String banner) {
        this.id = id;
        this.apLogo = apLogo;
        this.nombrePrograma = nombrePrograma;
        this.login = login;
        this.banner = banner;
    }
    
    
    
    
    
}
