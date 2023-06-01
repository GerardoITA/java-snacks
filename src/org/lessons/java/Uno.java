package org.lessons.java;

import java.util.Scanner;
public class Uno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = scanner.nextInt();

        if ( numero % 2 == 0 ) {
            System.out.println(numero);
        } else {
            System.out.println(numero + 1);
        }
    }
}
