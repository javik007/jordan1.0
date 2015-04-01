/*
 * Paquete en el que se implementan los Servicios
 */
package com.sow.jordan.servicios.implementacion;

import com.sow.jordan.modelos.Local;
import com.sow.jordan.repositorios.RepositorioLocal;
import com.sow.jordan.servicios.ServicioLocal;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author GARCÍA CASTRO HÉCTOR JAVIER
 * @author LARA RAMÍREZ JOSÉ JAVIER
 * @author OLIVOS NAVARRO CESAR JONATHAN
 * @author VILLEGAS MORENO ZEUXIS DANIEL
 */
public class ServicioLocalImplementacion implements ServicioLocal{

    @Autowired
    private RepositorioLocal repositorioLocal; 
            
    @Override
    public void guardarLocal(Local local) {
        repositorioLocal.save(local);
    }

    @Override
    public List<Local> cargarLocales() {
        return repositorioLocal.cargarLocales();
    }
    
    
    
}
