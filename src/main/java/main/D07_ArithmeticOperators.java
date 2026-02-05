package main;
public class D07_ArithmeticOperators {
    public static void main(String[] args) {
        
        /*Grundrechenarten */
        int a = 5, b = 3;

        int c1 = a + b; //Addition
        int c2 = a - b; //Subtraktion
        int c3 = a * b; //Multiplikation
        int c4 = a / b; //Ganzzahlige Division (Quotient)
        
        /*"Ungenaue" Division */
        int c5 = a % b; //Ganzzahlige Division (Divisionsrest)
        double c6 = (double)a / b; //Sobald eines der beiden Operaten eine Kommazahl ist, ist das Ergbnis auch eine Kommazahl
        
        /*Exakte Division */
        float c7 = (float)a / b; //Sobald eines der beiden Operaten eine Kommazahl ist, ist das Ergbnis auch eine Kommazahl

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);
        System.out.println("c3: " + c3);
        System.out.println("c4 und c5: " + c4 + " R"+c5);
        System.out.println("c6: " + c6);
        System.out.println("c7: " + c7);




        /* Inkrementieren (hochzählen)*/
        int c = 0;
        c = c+1;
        c+=1;
        c++;

        System.out.println("c: "+c);


        /* Dekrementieren */
        c = c - 1;
        c -= 1;
        c--;

        System.out.println("c: "+c);

        /* Postinkrement vs Preinkrement */
        c = 0;
        a = 1;
        c = a++;
        System.out.println("c:" + c);
        System.out.println("a:" + a);
        
        c = 0;
        a = 1;
        c = ++a;
        System.out.println("c:" + c);
        System.out.println("a:" + a);


        /* Teilen durch Null */
        double d1 = 1.0 / 0.0;
        double d2 = 1.0 / -0.0;
        double d3 = 0.0 / 0.0;
        double d4 = 0.0 / -0.0;

        int i1 = 1 / 0;
        int i2 = 1 / -0;

        System.out.println("d1: " +d1);
        System.out.println("d2: " +d2);
        System.out.println("d3: " +d3);
        System.out.println("d4: " +d4);

        System.out.println("d3 2: " +(d3+3)); //Zum Berechnen mit Klammer, sonst wird einfach zusammengehängt.
    }
}
