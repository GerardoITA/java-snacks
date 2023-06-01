package org.lessons.java;
import java.util.Scanner;

public class Tre {
    public static void main(String[] args) {
        int quantiNumeri = 10;
        Scanner scanner = new Scanner(System.in);
        int[] numeri = new int[quantiNumeri];
        int somma = 0;


        for (int i = 0; i < quantiNumeri; i++) {

            System.out.println("Inserisci un numero");
            int numero = scanner.nextInt();

            numeri[i] = numero;

            if ( i % 2 != 0 ) {
                somma += numero;
            }

        }

        // L'uso di array è ridondante in questo caso credo, potrei fare un ciclo sull'array generato
        // ma in pratica sarebbe uguale al ciclo sopra perché tanto l'array è lungo quanto "quantiNumeri"
        // non ho capito se dovevo crearne uno statico








        System.out.println("La somma degli elementi in posizione dispari è " + somma);




    }
}
