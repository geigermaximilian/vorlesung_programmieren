package main;

import java.util.Scanner;

public class D15_Loops {
    public static void main(String[] args) {

        /* while-Schleife (kopfgesteuerte Schleifen) */

        Scanner scanner = new Scanner(System.in);

       System.out.print("Startwert: ");
        int i = scanner.nextInt();

       System.out.print("Endwert: ");
        int z = scanner.nextInt();

        while (i <= z) {
            System.out.println(i);
            i++;

        }




        /* do-while-Schleife (fußgesteuerte Schleife) */

        int x = 1;

        do {
            System.out.println(x);
            x++;
        } while (x <= 100);

    }
}
