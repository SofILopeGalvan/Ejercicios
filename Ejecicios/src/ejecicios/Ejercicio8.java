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
public class Ejercicio8 {

    static int i = 0;
    /**
     * 
     * @param arr
     * @param i
     * @return 
     * Metodo  recursivo donde se calcula el numero mayor
     */
	public static int maxArray(int arr[], int i) {
		int num= arr.length-1;// Declaracion de variables dende se almacena el arrglo 
		int max;// Declaracion de variable donde se almacenara el maximo 
		int aux;//variable auxiliar que nos ayuda a guardar el numero mayor 
		
		if(i==num){// Compra  si i es igual al numero donde numero gurada el arreglo 
			return max=arr[i];// returna el numero maximo 
		}else{
			max = maxArray(arr, i+1);// La variable max se igual al dato que contien maxArray segun deonde se encntre la posicion del arreglo
			if(arr[i]>max){//compra si el arreglo es mayor al numero que se almaceno en max 
				aux=arr[i];// se alamcena en la variable max el numero que contiene arr segun se la posicion en la que valla el arrglo 
			}else{
				aux=max;// Se igual el auxiliar al numero maximo 
			}
		}
		return aux;		//Regresa el aux donde se guarda el mayor 
	}
    
       /**
        * 
        * @param arr
        * @return 
        * metodo recursivo para imprimir el numero mayor 
        */ 
	public static int numMayor(int arr[]) {
	return  maxArray(arr, i);	/// Se imprime el numero mayor 
	}
	
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
int arreglo[]={8,253,56,89,-5};// Declaracion del arreglo con valores ya definidos 
		System.out.println("El dato mayor es: " + Ejercicio8.numMayor(arreglo));   //Imprime el numero mayor del meodod numMayor con los valores definidos en el arrglo      
// TODO code application logic here
    }
    
}
