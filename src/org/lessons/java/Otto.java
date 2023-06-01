package org.lessons.java;
import java.util.Arrays;
import java.util.Scanner;

public class Otto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero di 4 cifre");
        String numero = scanner.next();

        char[] numeroArray = numero.toCharArray();
        int somma = 0;
        if ( numeroArray.length > 3 ) {
            for (char n : numeroArray) {
                int nNum = Character.getNumericValue(n);
                somma += nNum;
            }
            System.out.println("La somma è " + somma );
        } else {
            System.out.println("Spiacente, il numero non è di 4 cifre");
        }



    }
}
