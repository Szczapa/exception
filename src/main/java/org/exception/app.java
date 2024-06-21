package org.exception;

import org.exception.exercice4.Exercice4;

import java.util.Scanner;

public class app {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selectionnez le numéro d'exercice que vous voulez exécuter :");
        int choice;
        do {
            System.out.println(" ");
            System.out.println("1. Exercice 1");
            System.out.println("2. Exercice 2");
            System.out.println("3. Exercice 3");
            System.out.println("4. Exercice 4");
            System.out.println("0. Quitter");
            try {
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Exercice 1 : ");
                        Exercice1.start();
                        break;
                    case 2:
                        System.out.println("Exercice 2 : ");
                        Exercice2.start();
                        break;
                    case 3:
                        System.out.println("Exercice 3 : ");
                        Exercice3.start();
                        break;
                    case 4:
                        System.out.println("Exercice 4 : ");
                        Exercice4.start();
                        break;
                    case 0:
                        System.out.println("Au revoir !");
                        break;
                    default:
                        throw new IllegalArgumentException("Choix invalide.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
                return;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        } while (choice != 0);
        scanner.close();
    }
}