package training.Verzweigungen;

import java.util.Scanner;

public class Cases02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Gib bitte den ersten Operanden ein: ");
        int firstOperant = scanner.nextInt();

        System.out.print("Gib bitte den Operator ein: ");
        char operator = scanner.next().charAt(0);

        System.out.print("Gib bitte den zweiten Operanden ein: ");
        int secondOperant = scanner.nextInt();

        if (operator=='+') {
            System.out.printf("Ergebnis: %d %c %d = %.2f%n", firstOperant, operator, secondOperant, (float)(firstOperant + secondOperant));
        } else if (operator=='-') {
            System.out.printf("Ergebnis: %d %c %d = %.2f%n", firstOperant, operator, secondOperant, (float)(firstOperant - secondOperant));
        } else if (operator=='*') {
            System.out.printf("Ergebnis: %d %c %d = %.2f%n", firstOperant, operator, secondOperant, (float)(firstOperant * secondOperant));
        } else if (operator=='/') {
            System.out.printf("Ergebnis: %d %c %d = %.2f%n", firstOperant, operator, secondOperant, ((float)firstOperant / secondOperant));
        } else {
            System.out.println("Es wurde weder \"+\", \"-\", \"*\" noch \"/\" eingeben");
        }

    }
}
