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
public class ControlDeSueldo {

    /**
     * @param args the command line arguments
     */
    /**
     * Metodo estatico para calcular  el sueldo de los empleados 
     * @param args 
     */
    public static void main(String[] args) {
        String[] nom=new String [10];// Declaracion de arreglo timpo String para saber el nombre de los empleados   que gana mas segun su horas trabajadas 
        String nomMay = null;// Variable que almaceara el Nombre con mayor horas trabajadas 
        String nomMenor = null;// Variable que almacena el nombre de empleados con menor horas 
   
        double may=0;// variable donde se almacena el sueldo mayor 
        String []nompro=new String [10];////Nombre donde se almacenar los nombres para posterirormente comparar quien gano mayor o mnos que el promedio 
        double meo=1000222;//Variable para almacenar el sueldo menor 
        double [] hora=new double[10];//variable que almacena la hora 
        String  categoria = null;//variable donde almacenera el caracter
        double [] sueldo=new double[10];//variable donde se almacenara el sueldo 
        
        double horMax=0;// se almacena la hora maxima 
        String nomHoraMax = null;//nombre del empleado con mayor hora
         double  horMin=5962;// horas minas del empleado 
        String nomHoraMin = null;//nombre del empleado con horas minimas 
        
        double p = 0;
         java.util.Scanner leer = new java.util.Scanner(System.in);
         int i;
        for ( i = 0; i < 10; i++) {
           System.out.println("Ingrese el nombre del empleado  ");//Pide el nombre del 
	     nom[i]=leer.next();//Almacena el nombre del empleado 
             System.out.println("Ingres la categoria ");// Pide la categoria 
             categoria=leer.next();//Leer el categoria y la almacena 
             System.out.println("Ingreselas hora del empleado ");// Pide que ingrese el las horas del empleado 
             hora[i]=leer.nextDouble();//leer las horas empleados 
             
             if(categoria.equalsIgnoreCase("A")){// copara la categoria 
                 sueldo[i]=hora[i]*150;
             }
             if(categoria.equalsIgnoreCase("B")){//Compara la categoria
                  sueldo[i]=hora[i]*250;
             }
             if(categoria.equalsIgnoreCase("C")){//Compara la categoria
                  sueldo[i]=hora[i]*500;
             }
             
             if(sueldo[i]>=may){//Comprara si el sueldo es mayor 
                 may=sueldo[i];
                 nomMay=nom[i];
             }
             if(sueldo[i]<=meo){//Compara si el sueldo es menor 
                 meo=sueldo[i];
                 nomMenor=nom[i];
             }
             if(hora[i]>=horMax){///Compara para sacar las horas maximas 
                 horMax=hora[i];
                 nomHoraMax=nom[i];
             }
             if(hora[i]<=horMin){//Compara las horas menor 
                 horMin=hora[i];
                 nomHoraMin=nom[i];
             }
             
            p=p+sueldo[i];// Acumula el sueldo 
            nompro=nom;//Acumula el nombre 
        }
        double promedio=p/i;//Calcula elpromedio 
        String nomPromedioMayor=null,nomProMenor=null;///Variables para los nombres de los empleados que gana menor o mayor igual al promedio 
        
        for (int j = 0; j < 10; j++) {//ciclo para poder mostrar el nombre del empleado que gana menor  o mayor igual promedio 
            if(sueldo[j]>=promedio){
                nomPromedioMayor=nompro[j];
            }
             if(sueldo[j]<promedio){
                nomProMenor=nompro[j];
            }
            
        }
      
        System.out.println("El sueldo mayor es "+may +"Del empleado "+nomMay);
        System.out.println("El sueldo menor es "+meo+"Del empleado  "+nomMenor);
        System.out.println("El promedio del sueldo semanal es "+promedio);
        System.out.println("El nombre del empleado con mas horas trabajadas son "+nomHoraMax +" las horas son "+ horMax);
        System.out.println("El nombre del empleado con menos horas trabajadas son "+nomHoraMin+"  y las horas son  "+ horMin);
        System.out.println("Nombre del empleado que gana igual o mas que el promedio "+ nomPromedioMayor);
        System.out.println("Nombre del empleado que gana meno que el promedio "+nomProMenor);
       
    }
    
}
