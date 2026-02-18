package training.Arrays;

import java.util.Scanner;

public class Array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean terminate = false;
        int arrLength = 10;
        int freeTasks = 0;
        int nextFreeBone = 0;

        String[] tasks = new String[arrLength];

        System.out.println(nextFreeBone);

        System.out.printf("Du kannst noch %d Aufgaben hinzufügen.%n%n", freeTasks);

        do {

            for (int i = 0; i <= tasks.length - 1; i++) {
                if (tasks[i] == null) {
                    freeTasks++;
                }

                if (tasks[i] != null) {
                    nextFreeBone++;
                }
            }
            System.out.println("Optionen");
            System.out.println("1: Aufgabe hinzufügen");
            System.out.println("2: Aufgabe löschen");
            System.out.println("3: Aufgaben ausgeben");
            System.out.println("4: Beenden");
            System.out.println("");
            System.out.print("Wähle eine Option: ");

            int choosenOption = scanner.nextInt();


            switch (choosenOption) {
                case 1:
                    System.out.println("Gebe die Aufgabe ein: ");
                    tasks[nextFreeBone] = scanner.next();
                    continue;
                case 2:

                    if (freeTasks == arrLength) {
                        System.out.println("Du hast noch keine Aufgaben hinzugefügt.");
                        System.err.println();
                    } else {
                        System.out.print("Welche Aufgabe möchtest du löschen?: ");
                        tasks[scanner.nextInt()] = null;
                    }

                case 3:
                    for (int i = 0; i < tasks.length; i++) {
                        if (tasks[i] != null) {
                            System.out.printf("%d: %s%n%n", i, tasks[i]);

                        }

                    }

                    if (freeTasks == arrLength) {
                        System.out.println("Du hast noch keine Aufgaben hinzugefügt.");
                        System.err.println();
                    }
                    continue;

                case 4:
                    terminate = true;

 
            }

        } while (!terminate);

    }
}
