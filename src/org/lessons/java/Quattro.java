package org.lessons.java;
import java.util.Arrays;
import java.util.Scanner;

public class Quattro {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci una parola");
        String parola = scanner.next();

        char[] parolaArray = parola.toCharArray();
        char[] parolaInversa = new char[parolaArray.length];

        int count = 0;
        for (int i = parolaArray.length -1 ; i >= 0; i-- ) {
            parolaInversa[count] = parolaArray[i];
            count++;
        }

        if (Arrays.equals(parolaInversa, parolaArray)) {
            System.out.println("Palindroma");
        } else {
            System.out.println("Non palindroma");
        }


    }
}
