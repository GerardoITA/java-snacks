package org.lessons.java;
import java.util.Arrays;
import java.util.Scanner;

public class Cinque {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean keepGoing = true;
        char[] arrayAlfabetici = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] arrayNumerici = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};

        while (keepGoing) {
            System.out.println("Inserisci una parola");
            String parola = scanner.next();
            char[] parolaArray = parola.toUpperCase().toCharArray();
            int alfabetici = 0;
            int numerici = 0;
            int nonAlfanumerici = 0;
            for (char c: parolaArray) {
                if ( c == '0') {
                    keepGoing = false;
                }
                boolean alfanumerico = false;
                for ( char z: arrayAlfabetici) {
                    if (z == c ) {
                        alfabetici++;
                        alfanumerico = true;
                        break;
                    }
                }
                for ( char z: arrayNumerici) {
                    if (z == c) {
                        numerici++;
                        alfanumerico = true;
                        break;
                    }
                }
                if (!alfanumerico) {
                    nonAlfanumerici++;
                }
            }
            System.out.println("Alfabetici = " + alfabetici);
            System.out.println("Numerici = " + numerici);
            System.out.println("Non alfanumerici = " + nonAlfanumerici);
        }


    }
}
