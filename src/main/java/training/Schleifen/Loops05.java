package training.Schleifen;

import java.util.Random;
import java.util.Scanner;

public class Loops05 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int gedachteZahl = random.nextInt(1, 100);

        int versuche = 0;

        while (true) {
            versuche++;
            System.out.print("Gib bitte Deinen Tipp ein: ");
            int eingegebeneZahl = scanner.nextInt();
            if (gedachteZahl != eingegebeneZahl) {
                if (gedachteZahl < eingegebeneZahl) {
                    System.out.println("Leider falsch. Die gesuchte Zahl ist kleiner.");
                } else if (gedachteZahl > eingegebeneZahl) {
                    System.out.println("Leider falsch. Die gesuchte Zahl ist größer.");
                }

                System.out.println("Möchtest Du nochmals raten (true, false)?: ");
                boolean answer = scanner.nextBoolean();

                if (answer) {
                    continue;
                } else {
                    System.out.println("Spiel beendet.");
                    break;
                }
            } else {
                System.out.printf("Richtig geraten! Du hast %d Versuche gebraucht.%n", versuche);
                break;
            }
        }
    }
}