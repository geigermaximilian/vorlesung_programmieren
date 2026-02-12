package training.Arrays;

import java.util.Random;

public class Arrays07{
    public static void main(String[] args){

        Random random = new Random();

        int laenge = 5;

        int[] arrayOne = new int[laenge];
        int[] arrayTwo = new int[laenge];

        for(int i=0; i<laenge-1; i++){
            arrayOne[i] = random.nextInt(1,10);
            arrayTwo[i] = random.nextInt(1,10);
        }

        for(int i=0; i<laenge-1; i++){
            System.out.println("1: " + arrayOne[i]);
        }
        for(int i=0; i<laenge-1; i++){
            System.out.println("2: " + arrayTwo[i]);
        }
    }
}