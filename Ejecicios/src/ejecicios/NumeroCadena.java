/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicios;

import java.util.Scanner;

/**
 *
 * @author sofilop
 */
public class NumeroCadena {
   static String numeroLetra = "";
    static int i = 0;
    
    
    public static String entroCadena(int n) {
        
        String numero = String.valueOf(n);
        char simple = numero.charAt(i);
        
        switch (simple) {
            case '0':
                numeroLetra = numeroLetra + "cero ";
                break;
            case '1':
                numeroLetra = numeroLetra + "uno ";
                break;

            case '2':
                numeroLetra = numeroLetra + "dos ";

                break;

            case '3':
                numeroLetra = numeroLetra + "tres ";
                break;

            case '4':
                numeroLetra = numeroLetra + "cuatro ";
                break;

            case '5':
                numeroLetra = numeroLetra + "cinco ";
                break;

            case '6':
                numeroLetra = numeroLetra + "seis ";
                break;

            case '7':
                numeroLetra = numeroLetra + "siete ";
                break;

            case '8':
                numeroLetra = numeroLetra + "ocho ";
                break;

            case '9':
                numeroLetra = numeroLetra + "nueve ";
                break;
        }
        i++;
         if(i < numero.length()){
            NumeroCadena.entroCadena(n);
        }
        
        
        return numeroLetra.toLowerCase();
    }
      public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese  un numero entre 1 y 9999: ");
        int numero = leer.nextInt();

        //String cadena = entroCadena(numero);
        if (numero > 0 && numero < 10000) {
           NumeroCadena objeto = new NumeroCadena();
            objeto.entroCadena(numero);
            System.out.println(numeroLetra);
        } else {
            System.out.println("***ERROR***");
        }

    }
 
}
