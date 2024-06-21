package org.exception;

public class Exercice3 {
    public static void start() {
        int[] tab = { 1, 2, 3, 4, 5 };
        try{
            System.out.println(tab[4]);
            System.out.println(tab[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("L'index [5] n'existe pas. Il est en dehors des limites du tableau.");
        }
    }
}
