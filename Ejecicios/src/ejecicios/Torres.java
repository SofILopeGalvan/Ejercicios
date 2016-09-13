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

public class Torres {
private static int movimientos = 0;//Declaracion de varible estatica de tipo entero igualadaa 0 

	public static int mover(int n, char a, char b, char c) {//Declaracion de metodo donde se le dan 4 parametros de entrada 
            
		if (n > 0) {//Compra si el numero es mayor a  
			mover(n - 1, a, c, b);// Si es mayoy a cerpo en la variable mover se resta un numero a n y se moveran los datos 
			System.out.println("mover disco "+ a + " a " + c);//Imprimero las pociones en las que se debe mover el disco 
			movimientos++;//se incrementa la variable de numero 
			mover(n - 1, b, a, c);//Se mueve el numero meno 1 
                        //i++;
		}
		return movimientos;/// regresa los movimientos 
	}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
             java.util.Scanner leer = new java.util.Scanner(System.in);//Declaracion para poder leer los datos desde el teclado 
	     int movimientos;//Declaracion de variable para indicar el numero de discos 
	     System.out.println("Numero de discos: ");//Pide que ingrese el numero de discos 
	     int n=leer.nextInt();//Guarda el valor de el numero de discos 
	     movimientos = Torres.mover(n, 'A', 'B', 'C');///Imprime los datos d¿haca donde se debe mover los discos
	     System.out.println("\nMovimientos efectuados: "+movimientos);///Imprime los movimientos 

        // TODO code application logic here
    }
    
}
