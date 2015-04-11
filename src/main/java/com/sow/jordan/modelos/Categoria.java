/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sow.jordan.modelos;

/**
 *
 * @author HectorJavier
 */
//@Entity
//@Table(name="Categoria")
public class Categoria {
    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    
    //@NotNull
    private String nombre;
    
    //@NotNull
    private float precioMin;
    
    //@NotNull
    private float precioMax;

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

    public float getPrecioMin() {
        return precioMin;
    }

    public void setPrecioMin(float precioMin) {
        this.precioMin = precioMin;
    }

    public float getPrecioMax() {
        return precioMax;
    }

    public void setPrecioMax(float precioMax) {
        this.precioMax = precioMax;
    }    
}
