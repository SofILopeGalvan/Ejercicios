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
public class MaximoComunMultiplo {
    /**
     * 
     * @param m
     * @param n
     * @return 
     * 
     * Creacion de metodo recursivo deonde se clacula el numero comun multiplo de 2 numeros 
     */ 
static int mcd(int m, int n) {
		if (n <= m && m % n == 0)//Compra si el numero 1 es menor al numero 2 y si el residuo de el num 2 / numero 1 es igual a 0 
			return n;// Entonces regres el numero 1
		else if (m < n) // de lo contrario compra si el numro 2 es menor al numero 1 
			return mcd(n, m); ///regresa el numero comun multpli de numero 1 y numero 2
		else// de lo contrario 
			return mcd(n, m % n);// calcula el residuo de numero 2 / umero 1
	}


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println(mcd(124,6));// imprime el comun multiplio de los numero 124 y 6 
        // TODO code application logic here
    }
    
}
