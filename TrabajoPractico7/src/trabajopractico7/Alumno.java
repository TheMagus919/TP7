/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico7;

import java.util.HashSet;
import java.util.Objects;

/**
 *
 * @author magus919
 */
public class Alumno {
    private int legajo;
    private String apellido;
    private String nombre;
    private HashSet<Materia> materias= new HashSet<>();

    public HashSet<Materia> getMaterias() {
        return materias;
    }

    public Alumno(){
        
    }
    public Alumno(int legajo, String apellido, String nombre) {
        this.legajo = legajo;
        this.apellido = apellido;
        this.nombre = nombre;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public boolean agregarMaterias(Materia m){
        //HashSet<Materia> materias= new HashSet<>();
        if(materias.equals(m)){
            return false;
        }else{
            materias.add(m);
            return true;
        }
    }
    public int cantidadMaterias(){
        
        return materias.size();
    }

    @Override
    public int hashCode() {
        return legajo;
    }



    @Override
    public boolean equals(Object obj) {
        if (obj == null||!(obj instanceof Alumno)) {
            return false;
        
    }else{
            return(legajo==((Alumno)obj).legajo);
        }
    }

    @Override
    public String toString() {
        return apellido + " " + nombre+",legajo=" + legajo;
    }

    
}
