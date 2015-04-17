/*
 * Paquete que contiene los controladores del sistema Jordan
 */
package com.sow.jordan.controladores;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.modelos.Lugar;
import com.sow.jordan.servicios.ServicioLocal;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.annotation.PostConstruct;
import javax.enterprise.context.SessionScoped;
import org.primefaces.event.map.OverlaySelectEvent;
import org.primefaces.model.map.DefaultMapModel;
import org.primefaces.model.map.LatLng;
import org.primefaces.model.map.MapModel;
import org.primefaces.model.map.Marker;
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
    
    private MapModel advancedModel;
    
    private Marker marker;

    @PostConstruct //Indica que se ejecutara despues de la inyeccion de dependencias
    public void inicia() {
        lugares = servicioLocal.cargarLugares();
        locales = servicioLocal.cargarLocales();
        advancedModel = new DefaultMapModel();
        
        //Coordenadas
        LatLng inicio = new LatLng(19.332734, -99.188601);
        //Marcador
        advancedModel.addOverlay(new Marker(inicio, "Rectoria"));
    }

    public void guardarLocal() {
        this.servicioLocal.guardarLocal(local);
        this.locales = servicioLocal.cargarLocales();
        this.local = new Local();
    }
    
    public void eliminarLocal(Local local){
        this.servicioLocal.eliminarLocal(local);
        this.locales = servicioLocal.cargarLocales();
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
    
    public MapModel getAdvancedModel() {
        return advancedModel;
    }

    public void setAdvancedModel(MapModel advancedModel) {
        this.advancedModel = advancedModel;
    } //set?
    
    public void onMarkerSelect(OverlaySelectEvent event) {
        marker = (Marker) event.getOverlay();
    }
      
    public Marker getMarker() {
        return marker;
    }

}
