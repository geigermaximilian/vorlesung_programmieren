package main;

import java.util.Arrays;
import java.util.Random;

public class D16_Arrays {
    public static void main(String[] args) {

        Random random = new Random();

        /* Deklaration und Initialisierung */
        int[] numbers = new int[10]; // würde auch mit Strings funktionieren
        String[] names = { "Hans", "Peter", "Lisa" }; // würde auch mit Zahlen funktionieren

        names[1] = "Petra";

        int randomNumber = random.nextInt(0, names.length);
        System.out.println("names[randomNumber]: " + names[randomNumber]);

        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");

        /* Mit for-Schleife */

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(1, 10);
            System.out.printf("Person%d ist %d Jahre alt.%n", i, numbers[i]);
        }

        System.out.println("--------------------");

        /* mit while-Schleife */

        int y = 0;

        while (y < numbers.length) {
            System.out.printf("Person%d ist %d Jahre alt.%n", y, numbers[y]);
            y++;
        }

        System.out.println("-----------------");
        System.out.println("-----------------");
        System.out.println("-----------------");

        System.out.println(Arrays.toString(names));

    }
}
