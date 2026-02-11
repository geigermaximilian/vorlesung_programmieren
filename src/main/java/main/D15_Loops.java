package main;

import java.util.Scanner;

public class D15_Loops {
    public static void main(String[] args) {

        /* while-Schleife (kopfgesteuerte Schleifen) */

        Scanner scanner = new Scanner(System.in);

       System.out.print("Startwert: ");
        int i = scanner.nextInt();

       System.out.print("Endwert: ");
        int z = scanner.nextInt();

        while (i <= z) {
            System.out.println(i);
            i++;

        }




        /* do-while-Schleife (fußgesteuerte Schleife) */

        int x = 1;

        do {
            System.out.println(x);
            x++;
        } while (x <= 100);



        /* for-Schleife (Zählschleife) */

        for(int m=1 /*wird bei Beginn initialisiert */; m<100 /*wird dann geprüft */; m++/*wird nach jedem Durchlauf durchgeführt */){
            System.out.println(m);
        }



        /* Endlosschleife */
        while(true){
            System.out.println("Schleife beenden (true oder false)?: ");
            boolean answer = scanner.nextBoolean();
            if(answer){
                break;
            }
            System.out.println(System.currentTimeMillis());

            System.out.print("Uhrzeit ausgeben (true oder false)?: ");
            answer = scanner.nextBoolean();
            if (!answer){
                continue;
            }
            System.out.println(System.currentTimeMillis());
        }


    
}
}
