/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp5;

/**
 *
 * @author magus919
 */
public class Arreglo {
    public static void sumarLista(int numeros[]){
        int suma=0;
        int cant=0;
       for(int i=0; i<numeros.length;i++){
           suma+=numeros[i];
           cant++;
}
        System.out.println("La suma es:"+suma);
        System.out.println("El promedio es:"+(suma/cant));
    }
    public static void buscarMayor(int num[][]){
      int mayor = 0;  
      for(int i=0;i<num.length;i++){
      for(int j=0;j<num[i].length;j++){
          if(num[i][j]>mayor){
              mayor = num[i][j];
}
      
    }
    }
      System.out.println("El numero mas grande es:"+mayor);
    }
    public static void cuentaVocales(String voc){
        int vocales=0;
        char vocal[]={'a','e','i','o','u','A','E','I','O','U'};
        for(int i=0;i<voc.length();i++){
            for(int j=0;j<vocal.length;j++){
                if(voc.charAt(i) == vocal[j]){
                    vocales++;
                }
            }
        }
        System.out.println("La cantidad de vocales es:"+vocales);
    }
    public static void cuentaCaracter(String caracteres, char caracter){
        int repeticion=0;
        for(int i=0;i<caracteres.length();i++){
            if(caracteres.charAt(i)==caracter){
                repeticion++;
            }
        }
        System.out.println("La cantidad de veces que se repite el caracter es:"+repeticion);
    }
                                    
}

