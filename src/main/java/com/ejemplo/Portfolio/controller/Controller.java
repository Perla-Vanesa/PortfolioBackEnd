package com.ejemplo.Portfolio.controller;

import com.ejemplo.Portfolio.model.Educacion;
import com.ejemplo.Portfolio.model.Experiencia;
import com.ejemplo.Portfolio.model.Habilidad;
import com.ejemplo.Portfolio.model.Header;
import com.ejemplo.Portfolio.model.Persona;
import com.ejemplo.Portfolio.model.Proyecto;
import com.ejemplo.Portfolio.service.IEducacionService;
import com.ejemplo.Portfolio.service.IExperienciaService;
import com.ejemplo.Portfolio.service.IHabilidadService;
import com.ejemplo.Portfolio.service.IHeaderService;
import com.ejemplo.Portfolio.service.IPersonaService;
import com.ejemplo.Portfolio.service.IProyectoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins = "http://localhost:4200/")
@CrossOrigin(origins = "https://portfolio-perla-vanesa.web.app")

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService perServ;
    
    @PostMapping("/new/persona")//Modificar para que se agregue mediante URL
    public void agregarPersona(@RequestBody Persona per){
        perServ.crearPersona(per);}
    
    @GetMapping("/ver/persona")
    @ResponseBody
    public List<Persona> verPersona(){
        return perServ.verPersona();
    }
    
    @DeleteMapping("/delete/persona/{id}")
    public void borrarPersona (@PathVariable Long id){
        perServ.borrarPersona(id);
    }
    
    @PutMapping("/edit/persona/{id}")
    public Persona editPersona (@PathVariable Long id,
                                @RequestParam ("name")String newName,
                                @RequestParam ("sobre_mi")String newSobreMi,
                                @RequestParam ("url_foto")String newUrlFoto,
                                @RequestParam ("title")String newTitle){
        Persona per=perServ.encontrarPersona(id);
        per.setName(newName);
        per.setSobreMi(newSobreMi);
        per.setUrlFoto(newUrlFoto);
        per.setTitle(newTitle);
        
        perServ.crearPersona(per);
        
        return per;
    }
    
    @Autowired
    private IHeaderService headServ;
    
    @PostMapping("/new/header")
    public void agregarHeader(@RequestBody Header head){
        headServ.crearHeader(head);}
    
    @GetMapping("/ver/header")
    @ResponseBody
    public List<Header> verHeader(){
        return headServ.verHeader();
    }
    
    @PutMapping("/edit/header/{id}")
    public Header editHeader (@PathVariable Long id,
                                @RequestParam ("ap_logo")String newApLogo,
                                @RequestParam ("nombre_programa")String newNombrePrograma,
                                @RequestParam ("login")String newLogin,
                                @RequestParam ("banner")String newBanner){
        Header head=headServ.encontrarHeader(id);
        head.setApLogo(newApLogo);
        head.setNombrePrograma(newNombrePrograma);
        head.setLogin(newLogin);
        head.setBanner(newBanner);
        
        headServ.crearHeader(head);
        
        return head;
    }
    
    @Autowired
    private IExperienciaService expoServ;
    
    @PostMapping("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp){
        expoServ.crearExperiencia(exp);}
    
    @PostMapping("/new/experiencia/")
    public void agregarExperiencia(@RequestParam ("nombre_empresa")String nombreEmpresa,
                                @RequestParam ("puesto")String puesto,
                                @RequestParam ("inicio")String inicio,
                                @RequestParam ("fin")String fin,
                                @RequestParam ("descripcion")String descripcion,
                                @RequestParam ("url_logo")String urlLogo){
        Experiencia exp=new Experiencia(nombreEmpresa,puesto,inicio,fin,descripcion,urlLogo);
        expoServ.crearExperiencia(exp);}
    
    @GetMapping("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> verExperiencia(){
        return expoServ.verExperiencia();
    }
    
    @DeleteMapping("/delete/experiencia/{id}")
    public void borrarExperiencia (@PathVariable Long id){
        expoServ.borrarExperiencia(id);
    }
    
    @PutMapping("/edit/experiencia/{id}")
    public Experiencia editExperiencia (@PathVariable Long id,
                                @RequestParam ("nombre_empresa")String newNombreEmpresa,
                                @RequestParam ("puesto")String newPuesto,
                                @RequestParam ("inicio")String newInicio,
                                @RequestParam ("fin")String newFin,
                                @RequestParam ("descripcion")String newDescripcion,
                                @RequestParam ("url_logo")String newUrlLogo){
        Experiencia exp=expoServ.encontrarExperiencia(id);
        exp.setNombreEmpresa(newNombreEmpresa);
        exp.setPuesto(newPuesto);
        exp.setInicio(newInicio);
        exp.setFin(newFin);
        exp.setDescripcion(newDescripcion);
        exp.setUrlLogo(newUrlLogo);
        
        expoServ.crearExperiencia(exp);
        
        return exp;
    }
    
    @Autowired
    private IEducacionService educServ;
    
    @PostMapping("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion edu){
        educServ.crearEducacion(edu);}
    
    @PostMapping("/new/educacion/")
    public void agregarEducacion(@RequestParam ("nombre_inst")String nombreInst,
                                @RequestParam ("url_logo")String urlLogo,
                                @RequestParam ("carrera")String carrera,
                                @RequestParam ("inicio")String inicio,
                                @RequestParam ("fin")String fin){
        Educacion edu=new Educacion(nombreInst,urlLogo,carrera,inicio,fin);
        educServ.crearEducacion(edu);}
    
    @GetMapping("/ver/educacion")
    @ResponseBody
    public List<Educacion> verEducacion(){
        return educServ.verEducacion();
    }
    
    @DeleteMapping("/delete/educacion/{id}")
    public void borrarEducacion (@PathVariable Long id){
        educServ.borrarEducacion(id);
    }
    
    @PutMapping("/edit/educacion/{id}")
    public Educacion editEducacion (@PathVariable Long id,
                                @RequestParam ("nombre_inst")String newNombreInst,
                                @RequestParam ("url_logo")String newUrlLogo,
                                @RequestParam ("carrera")String newCarrera,
                                @RequestParam ("inicio")String newInicio,
                                @RequestParam ("fin")String newFin){
        Educacion edu=educServ.encontrarEducacion(id);
        edu.setNombreInst(newNombreInst);
        edu.setUrlLogo(newUrlLogo);
        edu.setCarrera(newCarrera);
        edu.setInicio(newInicio);
        edu.setFin(newFin);
        
        educServ.crearEducacion(edu);
        
        return edu;
    }
    
    @Autowired
    private IHabilidadService habiServ;
    
    @PostMapping("/new/habilidad")
    public void agregarHabilidad(@RequestBody Habilidad hab){
        habiServ.crearHabilidad(hab);}
    
    @PostMapping("/new/habilidad/")
    public void agregarHabilidad(@RequestParam("nombre_habilidad")String nombreHabilidad,
                                @RequestParam("dominio")Long dominio){
        Habilidad hab = new Habilidad(nombreHabilidad,dominio);
        habiServ.crearHabilidad(hab);}
    
    @GetMapping("/ver/habilidad")
    @ResponseBody
    
    public List<Habilidad> verHabilidad(){
        return habiServ.verHabilidad();
    }
    
    @DeleteMapping("/delete/habilidad/{id}")
    public void borrarHabilidad (@PathVariable Long id){
        habiServ.borrarHabilidad(id);
    }
    
    @PutMapping("/edit/habilidad/{id}")
    public Habilidad editHabilidad (@PathVariable Long id,
                                @RequestParam ("nombre_habilidad")String newNombreHabilidad,
                                @RequestParam ("dominio")Long newDominio){
        Habilidad hab=habiServ.encontrarHabilidad(id);
        hab.setNombreHabilidad(newNombreHabilidad);
        hab.setDominio(newDominio);
        
        habiServ.crearHabilidad(hab);
        
        return hab;
    }
    
    @Autowired
    private IProyectoService proyServ;
    
    @PostMapping("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto pro){
        proyServ.crearProyecto(pro);}
    
    @PostMapping("/new/proyecto/")
    public void agregarProyecto(@RequestParam ("nombre_proyecto")String nombreProyecto,
                                @RequestParam ("inicio")String inicio,
                                @RequestParam ("fin")String fin,
                                @RequestParam ("descripcion")String descripcion,
                                @RequestParam ("url_proyecto")String urlProyecto){
        Proyecto pro=new Proyecto(nombreProyecto,inicio,fin,descripcion,urlProyecto);
        proyServ.crearProyecto(pro);}
    
    @GetMapping("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto(){
        return proyServ.verProyecto();
    }
    
    @DeleteMapping("/delete/proyecto/{id}")
    public void borrarProyecto (@PathVariable Long id){
        proyServ.borrarProyecto(id);
    }
    
    @PutMapping("/edit/proyecto/{id}")
    public Proyecto editProyecto (@PathVariable Long id,
                                @RequestParam ("nombre_proyecto")String newNombreProyecto,
                                @RequestParam ("inicio")String newInicio,
                                @RequestParam ("fin")String newFin,
                                @RequestParam ("descripcion")String newDescripcion,
                                @RequestParam ("url_proyecto")String newUrlProyecto){
        Proyecto pro=proyServ.encontrarProyecto(id);
        pro.setNombreProyecto(newNombreProyecto);
        pro.setInicio(newInicio);
        pro.setFin(newFin);
        pro.setDescripcion(newDescripcion);
        pro.setUrlProyecto(newUrlProyecto);
        
        proyServ.crearProyecto(pro);
        
        return pro;
    }
    
    
}
