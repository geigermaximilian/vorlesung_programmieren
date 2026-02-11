package training.Konsolenanwendungen;

import java.util.Scanner;

public class ConsoleApplications01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib bitte eine ganze Zahl ein: ");
        int a = scanner.nextInt();

        System.out.print("Gib bitte eine weitere ganze Zahl ein: ");
        int b = scanner.nextInt();

        System.out.printf("Ergebnis %d + %d = %d%n", a, b, (a + b));
    }
}