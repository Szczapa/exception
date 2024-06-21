package org.exception;

import java.util.Scanner;

public class Exercice1 {
    public static void start() {
        do {
            Scanner scanner = new Scanner(System.in);
            String saisie;
            System.out.println(" ");
            System.out.println("Entrez un nombre ou tapez 'break' pour quitter.");
            try {
                saisie = scanner.nextLine();
                if (saisie.equals("break")) {
                    System.out.println("Au revoir !");
                    System.out.println(" ");
                    break;
                }
                int nombre = Integer.parseInt(saisie);
                System.out.println("Le nombre est : " + nombre);

            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");

            }
        } while (true);

    }
}
