/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico7;

import java.util.Objects;

/**
 *
 * @author magus919
 */
public class Materia {
    private int idMateria;
    private String nombre;
    private int anio;

    public Materia(int idMateria, String nombre, int anio) {
        this.idMateria = idMateria;
        this.nombre = nombre;
        this.anio = anio;
    }

    public int getIdMateria() {
        return idMateria;
    }

    public void setIdMateria(int idMateria) {
        this.idMateria = idMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public int hashCode() {
        return idMateria;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null||!(obj instanceof Materia)) {
            return false;
        
    }else{
            return idMateria==((Materia)obj).idMateria;
        }
    
}

    @Override
    public String toString() {
        return idMateria + " " + nombre + " " + anio;
    }
    
}
