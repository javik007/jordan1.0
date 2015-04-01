/*
 * Paquete que contiene los controladores del sistema Jordan
 */
package com.sow.jordan.controladores;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.servicios.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Clase que ...
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
@Controller("controladorLocal") //Indica que la clase es un controlador
@Scope("session") //
@ManagedBean
@SessionScoped
public class ControladorLocal implements Serializable{
    
    @Autowired
    private ServicioLocal servicioLocal;
    
    private List<Local> locales;
    private Local local;
    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    @PostConstruct //Indica que se ejecutara despues de la inyeccion de dependencias
    public void inicia(){
        locales = servicioLocal.cargarLocales();  
        nombre = "nuevo";
    }
    
    public void guardarLocal(){
        servicioLocal.guardarLocal(local);
        locales = servicioLocal.cargarLocales();
        //local=new Local();
    }

    public List<Local> getLocales() {
        return locales;
    }

    public void setLocales(List<Local> locales) {
        this.locales = locales;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
}
