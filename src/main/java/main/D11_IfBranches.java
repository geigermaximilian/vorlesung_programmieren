package main;

import java.util.Scanner;

public class D11_IfBranches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Alter eingeben: ");
        int age = scanner.nextInt();

        /* EInfachverzweigung */
        if (age < 18) {
            System.out.println("Du bist Minderjährig.");
        } else {
            System.out.println("Du bist volljährig.");
        }

        /* Mehrfachverzweigung */
        if (age < 12) {
            System.out.println("Du bist ein Kind.");
        } else if (age < 18) {
            System.out.println("Du bist ein Jugendlicher.");
        } else if (age < 65) {
            System.out.println("Du bist ein Erwachsenser.");
        } else {
            System.out.println("Du bist ein alter Mensch.");
        }


        /* Vergleichs-Operatoren: <, <=, >, >=, ==, != */ 

        /* Logische Operatoren: && (logisches Und), || (logisches Oder), ! (logische Verneinung) */
    }
}
