/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicios;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *          UTNG
 *   Carrera:   Sistemas Informaticos
 *   Materia: Estructura de base de datos
 * @author Sofia López Galván 1215100883
 * 
 */
public class Ejercicio1 {
    static final String DATA_PATH="DatosFile.txt";
    public static void main(String[] args) {
	 Scanner fileReader=null;
	 try{
		 fileReader=new Scanner(new File(DATA_PATH));
		
	System.out.println("Archivo Abierto: "+ fileReader); 
	 }catch(FileNotFoundException e)
	 {
		 
			System.out.print("El archivo  "+ DATA_PATH + "No se encontro" );
			System.out.print("Programa terminado");
			System.exit(0); 
	 }
	 
	 int contador=1;
	 int datoLeido=fileReader.nextInt();
	 System.out.println(" ");
		System.out.println(" \t PAlas cargadoras 78345");
		while(datoLeido ==78345){
			datoLeido=fileReader.nextInt();
			System.out.println(contador +": Serie "+datoLeido); 
			
			datoLeido=fileReader.nextInt();
			contador++;
		}
		 System.out.println(" ");
		System.out.println(" \t Retoexcabadora 33287");
		while(datoLeido ==33287){
			datoLeido=fileReader.nextInt();
			System.out.println(contador +": Serie "+datoLeido); 
			
			datoLeido=fileReader.nextInt();
			contador++;
		}
		
		 System.out.println(" ");
			System.out.println(" \t Dumper 63287");
			while(datoLeido ==63287){
				datoLeido=fileReader.nextInt();
				System.out.println(contador +": Serie "+datoLeido); 
				try{
				datoLeido=fileReader.nextInt();
				}
			catch(Exception e){	
				System.out.println(" Se ha terminado ");
			}
				contador++;
			}
		
    
}
}