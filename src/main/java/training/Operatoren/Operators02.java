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

        a = 3 * ++b; //a=3, b=1
        c = 3 * a++; //a=4, c=9

        d *= 6 + ++e; 
        e = --f - 5 - f--;
        f = f + d % (e * 2);

        g = (h-- + 2) * (1 + --h);

        System.out.println("a=4: " + a);
        System.out.println("b=1: " + b);
        System.out.println("c=9: " + c);
        System.out.println("d=34: " + d);
        System.out.println("e=-4: " + e);
        System.out.println("f=3: " + f);
        System.out.println("g=2: " + g);
        System.out.println("h=2: " + h);
    }
}
