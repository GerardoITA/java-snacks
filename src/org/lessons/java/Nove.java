package org.lessons.java;
import java.util.Scanner;
public class Nove {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int quantiNumeri = 10;

        double somma = 0;
        double media = 0;
        for (int i = 0; i < quantiNumeri; i++) {
            System.out.println("Inserisci un numero intero");
            double numero = scanner.nextDouble();

            somma += numero;

        }
        media = somma / quantiNumeri;

        System.out.println("La somma è " + somma + " mentre la media è " + media );

    }
}
