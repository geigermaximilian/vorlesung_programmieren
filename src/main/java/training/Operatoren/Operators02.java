package training.Operatoren;

/**
 * Aufgabe:
 * https://jappuccini.github.io/java-docs/production/exercises/operators/operators02
 */

public class Operators02 {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 5;
        int e = 3;
        int f = 4;
        int g = 0;
        int h = 2;

        a = 3 * ++b; // a=3, b=1
        c = 3 * a++; // a=4, c=9

        d *= 6 + ++e; // d=d*(6+4), e=4
        e = --f - 5 - f--; // e=-4, f=2
        f = f + d % (e * 2); // f=4
        g = (h-- + 2) * (1 + --h); // g=2, h=0

        System.out.println("a=4: " + a);
        System.out.println("b=1: " + b);
        System.out.println("c=9: " + c);
        System.out.println("d=50: " + d);
        System.out.println("e=-5: " + e);
        System.out.println("f=2: " + f);
        System.out.println("g=4: " + g);
        System.out.println("h=0: " + h);
    }
}
