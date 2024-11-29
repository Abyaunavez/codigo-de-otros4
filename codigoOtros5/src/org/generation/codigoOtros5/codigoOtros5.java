package org.generation.codigoOtros5;

import java.util.Scanner;

public class codigoOtros5 {

	    public static void main(String[] args) { // Añadi el método main para ejecutar el programa

	        Scanner s = new Scanner(System.in); // Corregi "nuevo Scanner()" a "new Scanner(System.in)"
	        
	        System.out.print("Introduza un número: "); // Corregi comillas simples a comillas dobles
	        String ni = s.nextLine(); // Corregi "Cadena" a "String"
	        int c = Integer.parseInt(ni); // Converti el String a un número entero
	        
	        int afo = 0;
	        int noAfo = 0;
	        
	        while (c > 0) { // Use la variable entera en el bucle en lugar del String
	            int digito = c % 10; // Calcula el último dígito del número
	            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
	                afo++;
	            } else {
	                noAfo++;
	            }
	            c /= 10; // Dividir el número por 10 para eliminar el último dígito
	        }
	        if (afo > noAfo) {
	            System.out.println("El " + ni + " es un número afortunado."); // Corregi  "System.out.println"
	        } else {
	            System.out.println("El " + ni + " no es un número afortunado.");
	        }
	        
	    }
	}



