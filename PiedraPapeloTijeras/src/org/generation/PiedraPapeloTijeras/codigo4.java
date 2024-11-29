package org.generation.PiedraPapeloTijeras;



import java.util.Scanner;

public class codigo4 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
        String j1 = s.nextLine();

        System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
        Scanner s2 = new Scanner(System.in);
        String j2 = s2.nextLine();

        if (j1.equalsIgnoreCase(j2)) {
            System.out.println("Empate");
        } else {
            int g = 2;
            switch (j1.toLowerCase()) {
                case "piedra":
                    if (j2.equalsIgnoreCase("tijeras")) {
                        g = 1;
                    }
                    break;
                case "papel":
                    if (j2.equalsIgnoreCase("piedra")) {
                        g = 1;
                    }
                    break;
                case "tijeras":
                    if (j2.equalsIgnoreCase("papel")) {
                        g = 1;
                    }
                    break;
                default:
                    System.out.println("Opción no válida");
                    return;
            }
            System.out.println("Gana el jugador " + g);
        }
    }
}

