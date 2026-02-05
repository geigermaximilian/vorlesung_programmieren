package main;

import java.util.Locale;

public class D10_ConsoleOutputs {
    public static void main(String[] args) {
        System.out.println("Text 1");
        System.out.print("Text 2");
        System.out.println("Text 3");
        System.out.println(true);
        System.out.println(44);

        System.out.println();


        /* printf-Methode */
        //Aufbau einer Formatierungs-Regel: %[flags][width][.precision]conversion.character
        
        //String-Formatierung (conversion-character s)
        System.out.printf("");
        String text = "Hallo";
        String name = "Jürgen";
        System.out.printf("%s %s%n", text, name); //%s s = String
        System.out.printf("%S %S%n", text, name); //%S S = String in UpperCase
        System.out.printf("%20s %s%n", text, name); //%20s 20s = Festlegen der Ausgabenlänge
        System.out.printf("%-20s %s%n", text, name); //linksbündige Ausgabe

        System.out.println();

        //Dezimalzahlenformatierungen (conversion-character d) --> d=decimal (byte, short, ...)
        System.out.println(1_000_000_000);
        System.out.printf("%,d%n", 1_000_000_000); //, = Tausender-Trennzeichen ❗nach Systemeinstellungen
        System.out.printf(Locale.JAPAN,"%,d%n", 1_000_000_000); //, = Tausender-Trennzeichen ❗nach Systemeinstellungen


        // Gleitkommazahlen-Formatierung (conversion-character f) --> f=
        System.out.printf("%.2f%n", 3.53585487);

        System.out.println();

        System.out.printf("%-10s %s%n", "Name", "Note");
        System.out.println("---------------");
        System.out.printf("%-10s %.1f%n", "Hans", 2.5);
        System.out.printf("%-10s %.1f%n", "Jürgen", 1.5);
        System.out.printf("%-10s %.1f%n", "Peter", 3.5);
        System.out.printf("%-10s %.1f%n", "Harald", 4.5);
    }
}
