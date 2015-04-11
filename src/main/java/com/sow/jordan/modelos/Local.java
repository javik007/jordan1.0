/*
 * Paquete que contiene los modelos del sistema Jordan
 */
package com.sow.jordan.modelos;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 *
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
@Entity
@Table(name = "Local")
public class Local implements Serializable{
    
    @Id //indica que es la llave de la tabla
    @GeneratedValue(strategy=GenerationType.AUTO)// Indica que se va a auto incrementar
    private Integer id;
    
    @NotNull
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "alias")
    private String alias;
    
    @ManyToOne
    private Lugar lugar;
    
    @Column(name = "latitud")
    private Double latitud;
    
    @Column(name = "longitud")
    private Double longitud;
    
    @Column(name = "especialidad")
    private String especialidad;
    
    @Column(name = "precioMin")
    private Double precioMin;
    
    @Column(name = "precioMax")
    private Double precioMax;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    private List<Categoria> menu;

    public List<Categoria> getMenu() {
        return menu;
    }

    public void setMenu(List<Categoria> menu) {
        this.menu = menu;
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
    
    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Double getLatitud() {
        return latitud;
    }

    public void setLatitud(Double latitud) {
        this.latitud = latitud;
    }

    public Double getLongitud() {
        return longitud;
    }

    public void setLongitud(Double longitud) {
        this.longitud = longitud;
    }

    public Double getPrecioMin() {
        return precioMin;
    }

    public void setPrecioMin(Double precioMin) {
        this.precioMin = precioMin;
    }

    public Double getPrecioMax() {
        return precioMax;
    }

    public void setPrecioMax(Double precioMax) {
        this.precioMax = precioMax;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + Objects.hashCode(this.nombre);
        hash = 53 * hash + Objects.hashCode(this.alias);
        hash = 53 * hash + Objects.hashCode(this.especialidad);
        hash = 53 * hash + Objects.hashCode(this.latitud);
        hash = 53 * hash + Objects.hashCode(this.longitud);
        hash = 53 * hash + Objects.hashCode(this.precioMin);
        hash = 53 * hash + Objects.hashCode(this.precioMax);
        hash = 53 * hash + Objects.hashCode(this.descripcion);
        return hash;
    }    
    
    public int getCalificacion(){
        return 5;
    }
    
}