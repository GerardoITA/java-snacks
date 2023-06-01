package org.lessons.java;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Due {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero di invitati");
        int numero = scanner.nextInt();

        String[] cognomi = new String[] {"Rossi", "Ughi", "Bianco", "Ferrari", "Russo", "Esposito", "Bianchi", "Romano", "Colombo", "Ricci", "Marino", "Greco", "Bruno", "Gallo", "Conti", "De Luca", "Mancini", "Costa", "Giordano", "Rizzo", "Lombardi", "Moretti", "Barbieri", "Fontana", "Santoro", "Mariani", "Rinaldi", "Caruso", "Ferrara", "Galli","Silvestri", "Mazza", "Serra", "Marchetti", "Fabbri", "Monti", "De Santis", "Sorrentino", "D'Amico", "Longo", "Cattaneo", "Guerini", "Pellegrini", "Valentini", "D'Angelo", "Ferri", "Riva", "Lorenzi", "Fumagalli", "Pagano"};
        String[] nomi = new String[] {"Mario", "Luca", "Giulia", "Francesca", "Alessandro", "Martina", "Lorenzo", "Sofia", "Matteo", "Chiara", "Gabriele", "Giorgia", "Andrea", "Emma", "Riccardo", "Alice", "Giovanni", "Valentina", "Filippo", "Elena", "Davide", "Laura", "Simone", "Federica", "Nicola", "Beatrice", "Marco", "Camilla", "Stefano", "Alessia", "Gabriel", "Isabella", "Leonardo", "Marta", "Samuele", "Greta", "Daniele", "Elisa", "Tommaso", "Silvia"};

        String[] invitati = new String[numero];

        Random random = new Random();


        for (int i = 0; i < numero; i++) {
            int n1 = random.nextInt(nomi.length);
            int n2 = random.nextInt(cognomi.length);

            String nomeCognome = nomi[n1] + " "+ cognomi[n2];

            invitati[i] = nomeCognome;

        }

        System.out.println(Arrays.toString(invitati));




    }
}
