/*
 * Paquete que contiene ...
 */
package com.sow.jordan.servicios;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.modelos.Lugar;
import java.util.List;

/**
 * 
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
public interface ServicioLocal {
    
    public void guardarLocal(Local local);
    
    public void guardarLugar(Lugar lugar);
    
    public void eliminarLocal(Local local);
    
    List<Local> cargarLocales();
    
    List<Lugar> cargarLugares();
    
}
