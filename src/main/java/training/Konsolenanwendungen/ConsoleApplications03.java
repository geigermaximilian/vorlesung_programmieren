package training.Konsolenanwendungen;

import java.util.Random;
import java.util.Scanner;

public class ConsoleApplications03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        /* Spieler und Kämpfer */
        // LP=Lebenspunkte
        String player1Name, player2Name;
        String player1Fighter, player2Fighter;
        int player1FighterLP, player2FighterLP;

        System.out.print("Spieler 1, Name: ");
        player1Name = scanner.next();

        System.out.print("Spieler 1, Kämpfer 1, Name: ");
        player1Fighter = scanner.next();

        System.out.print("Spieler 1, Kämpfer 1, LP: ");
        player1FighterLP = scanner.nextInt();

        System.out.print("Spieler 2, Name: ");
        player2Name = scanner.next();

        System.out.print("Spieler 2, Kämpfer 1, Name: ");
        player2Fighter = scanner.next();

        System.out.print("Spieler 2, Kämpfer 1, LP: ");
        player2FighterLP = scanner.nextInt();

        /* Würfel */

        int player1Dice1, player1Dice2, player1Dice3, player1Dice4, player1Dice5;
        int player2Dice1, player2Dice2, player2Dice3, player2Dice4, player2Dice5;

        player1Dice1 = random.nextInt(1, 7);
        player1Dice2 = random.nextInt(1, 7);
        player1Dice3 = random.nextInt(1, 7);
        player1Dice4 = random.nextInt(1, 7);
        player1Dice5 = random.nextInt(1, 7);
        player2Dice1 = random.nextInt(1, 7);
        player2Dice2 = random.nextInt(1, 7);
        player2Dice3 = random.nextInt(1, 7);
        player2Dice4 = random.nextInt(1, 7);
        player2Dice5 = random.nextInt(1, 7);

        System.out.println();
        System.out.println("*-------*");
        System.out.println("* Zug 1 *");
        System.out.println("*-------*");
        System.out.printf("Kämpfer von %s: %s (%d LP)%n", player1Name, player1Fighter, player1FighterLP);
        System.out.printf("Kämpfer von %s: %s (%d LP)%n", player2Name, player2Fighter, player2FighterLP);
        System.out.println();

        System.out.printf("%s greift %s an.%n", player1Fighter, player2Fighter);

        int sumPlayer1Hits = (player1Dice1 + player1Dice2 + player1Dice3 + player1Dice4);
        System.out.printf("%s würfelt %d, %d, %d und %d.%n", player1Fighter, player1Dice1, player1Dice2, player1Dice3, player1Dice4);
        System.out.printf("%s erzielt %d Treffer.%n", player1Fighter, sumPlayer1Hits);

        int sumPlayer2Blocks = (player2Dice1 + player2Dice2 + player2Dice3);
        System.out.printf("%s würfelt %d, %d und %d.%n", player2Fighter, player2Dice1, player2Dice2, player2Dice3);
        System.out.printf("%s erzielt %d Blocks.%n", player2Fighter, sumPlayer2Blocks);

        int damageToPlayer2 = sumPlayer1Hits - sumPlayer2Blocks;
        player2FighterLP = player2FighterLP - damageToPlayer2;
        System.out.printf("%s erleidet %d Schaden und hat noch %d LP.%n", player2Fighter, damageToPlayer2, player2FighterLP);

        System.out.println();
        System.out.println("*-------*");
        System.out.println("* Zug 2 *");
        System.out.println("*-------*");
        System.out.printf("Kämpfer von %s: %s (%d LP)%n", player1Name, player1Fighter, player1FighterLP);
        System.out.printf("Kämpfer von %s: %s (%d LP)%n", player2Name, player2Fighter, player2FighterLP);
        System.out.println();

        System.out.printf("%s greift %s an.%n", player2Fighter, player1Fighter);

        int sumPlayer2Hits = (player2Dice4 + player2Dice5 + random.nextInt(1, 7) + random.nextInt(1, 7));
        int p2d6 = sumPlayer2Hits; // nur für Ausgabe konsistent berechnen wir einzeln
        int p2d1 = player2Dice4;
        int p2d2 = player2Dice5;
        int p2d3 = random.nextInt(1, 7);
        int p2d4 = random.nextInt(1, 7);
        sumPlayer2Hits = p2d1 + p2d2 + p2d3 + p2d4;

        System.out.printf("%s würfelt %d, %d, %d und %d.%n", player2Fighter, p2d1, p2d2, p2d3, p2d4);
        System.out.printf("%s erzielt %d Treffer.%n", player2Fighter, sumPlayer2Hits);

        int p1b1 = player1Dice5;
        int p1b2 = random.nextInt(1, 7);
        int p1b3 = random.nextInt(1, 7);
        int sumPlayer1Blocks = p1b1 + p1b2 + p1b3;

        System.out.printf("%s würfelt %d, %d und %d.%n", player1Fighter, p1b1, p1b2, p1b3);
        System.out.printf("%s erzielt %d Blocks.%n", player1Fighter, sumPlayer1Blocks);

        int damageToPlayer1 = sumPlayer2Hits - sumPlayer1Blocks;
        player1FighterLP = player1FighterLP - damageToPlayer1;
        System.out.printf("%s erleidet %d Schaden und hat noch %d LP.%n", player1Fighter, damageToPlayer1, player1FighterLP);
    }
}
