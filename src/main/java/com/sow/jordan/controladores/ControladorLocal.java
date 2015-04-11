/*
 * Paquete que contiene los controladores del sistema Jordan
 */
package com.sow.jordan.controladores;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.modelos.Lugar;
import com.sow.jordan.servicios.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Clase que ...
 *
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
@Controller("controladorLocal") //Indica que la clase es un controlador
@Scope("session")
public class ControladorLocal implements Serializable {

    @Autowired
    private ServicioLocal servicioLocal;

    private List<Local> locales;

    private Local local;
    
    private List<Lugar> lugares;
    
    private Lugar lugar;

    @PostConstruct //Indica que se ejecutara despues de la inyeccion de dependencias
    public void inicia() {
        lugares = servicioLocal.cargarLugares();
        locales = servicioLocal.cargarLocales();
    }

    public void guardarLocal() {
        this.servicioLocal.guardarLocal(local);
        this.locales = servicioLocal.cargarLocales();
        this.local = new Local();
    }
    
    public void guardarLugar(){
        this.servicioLocal.guardarLugar(lugar);
        this.lugares = servicioLocal.cargarLugares();
        this.lugar = new Lugar();
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

    public List<Lugar> getLugares() {
        return lugares;
    }

    public void setLugares(List<Lugar> lugares) {
        this.lugares = lugares;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public List<Local> getTop5() {
        return locales;
    }

}
