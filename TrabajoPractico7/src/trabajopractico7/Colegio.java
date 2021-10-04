/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopractico7;

/**
 *
 * @author magus919
 */
public class Colegio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Materia m1=new Materia(1,"Ingles 1",1);
        Materia m2=new Materia(2,"Matemacicas",1);
        Materia m3=new Materia(3,"Labiratirio 1",1);
        
        Alumno a1=new Alumno(1001,"Lopez","Martin");
        Alumno a2=new Alumno(1002,"Martinez","Brenda");
        
        a1.agregarMaterias(m1);
        a1.agregarMaterias(m2);
        a1.agregarMaterias(m3);
        
        a2.agregarMaterias(m1);
        a2.agregarMaterias(m2);
        a2.agregarMaterias(m3);
        a2.agregarMaterias(m3);
        
        System.out.println(a1.cantidadMaterias());
        System.out.println(a2.cantidadMaterias());
    }
    
}
