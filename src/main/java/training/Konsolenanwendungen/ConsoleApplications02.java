package training.Konsolenanwendungen;

import java.util.Scanner;

public class ConsoleApplications02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib bitte eine ganze Zahl ein: ");
        int a = scanner.nextInt();

        System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
        int b = scanner.nextInt();

        System.out.printf("Ergebnis: %d von %d sind %.2f%%%n", a, b, (a * 100.0 / b));
    }
}
