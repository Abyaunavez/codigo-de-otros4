package org.generaton.codigoOtro6;
import java.util.Scanner;


public class codigoOtro6 {
	
	 public static void main(String[] args) { // Añadir el método main para ejecutar el programa

	        int[] n = new int[20]; // Inicializar el array correctamente

	        for (int i = 0; i < 20; i++) { // Corregi "i+" a "i++"
	            n[i] = (int)(Math.random() * 381) + 20; // Generar números aleatorios entre 20 y 400
	            System.out.print(n[i] + " "); // Corregir "System.out.print"
	        }

	        System.out.println("\n¿Qué números quiere resaltar? "); // Corregi "System.out.println"
	        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	        Scanner s = new Scanner(System.in); // Añadi Scanner para leer la entrada del usuario
	        int opcion = Integer.parseInt(s.nextLine()); // Corregi entrada de consola

	        int multiplo = (opcion == 1) ? 5 : 7; // Corregi operador ternario

	        for (int e : n) { // Corregi "foreach" a "for" y tipo de datos de char a int
	            if (e % multiplo == 0) {
	                System.out.print("[" + e + "] ");
	            } else {
	                System.out.print(e + " "); // Corregi "System.in.print" a "System.out.print"
	            }
	        }

	    }
	}



