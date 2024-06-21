package org.exception.exercice4;

import java.util.Scanner;

public class Exercice4 {
    public static void start() {
        Scanner scanner = new Scanner(System.in);
        Student student = new Student();

        int age;
        do {
            System.out.println("Entrez l'âge de l'étudiant : ");
            try {
                age = Integer.parseInt(scanner.nextLine());
                if (age < 0) {
                    throw new InvalidAgeException("L'âge doit être positif.");
                }
                break;
            } catch (NumberFormatException e) {
                System.out.println("Veuillez entrer un nombre valide.");
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
                System.out.println(" ");
            }
        } while (true);

        System.out.println("Entrez le nom de l'étudiant : ");
        String name = scanner.nextLine();
        student.createStudent(name, age);
        System.out.println("L'étudiant " + name + " a été créé avec succès.");
        student.afficherStudents();
    }
}
