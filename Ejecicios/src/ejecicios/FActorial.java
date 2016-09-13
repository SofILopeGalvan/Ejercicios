/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicios;

/**
 *          UTNG
 *   Carrera:   Sistemas Informaticos
 *   Materia: Estructura de base de datos
 * @author Sofia López Galván 1215100883
 * 
 */
public class FActorial {

    /**
     * @param args the command line arguments
     */
    /**
     * Metodo recursivo  para calcular el factorial de numero 
     * @param numero
     * @return 
     */
    static int factorial(int numero){
          if ( numero <= 1 ) {//Condicion que copara si el numero es menor a 1 
              return 1;
          } else {
              return numero*factorial(numero-1);// Si el numero no es menor a 1 se realizara la operacion 
          }
     }

    public static void main(String[] args) {
                 System.out.println(factorial(5));// imprime el resultado del numero factorial llamado del metodo recursivo 
        // TODO code application logic here
    }
    
}
