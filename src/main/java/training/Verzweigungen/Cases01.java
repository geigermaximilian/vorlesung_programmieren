package training.Verzweigungen;

import java.util.Scanner;

public class Cases01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Gib bitte eine ganze Zahl ein: ");
        int a = scanner.nextInt();
        String s;

        if(a%2==0){
            s="gerade";
        } else {
            s="ungerade";
        }

        System.out.printf("Ergebnis: die eingegebene Zahl ist %s%n", s);
    }
}
