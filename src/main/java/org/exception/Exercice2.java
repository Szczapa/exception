package org.exception;

import java.util.Scanner;

public class Exercice2 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        int a;
        do {
            try {
                System.out.println("Entrez un nombre : ");
                a = Integer.parseInt(scanner.nextLine());
                if (a < 0) {
                    throw new IllegalArgumentException("Le nombre doit être positif.");
                }
                System.out.println("La racine carrée de " + a + " est : " + Math.sqrt(a));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        } while (true);
    }
}
