package main;

import java.util.Scanner;

public class D11_IfBranches {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte Alter eingeben: ");
        int age = scanner.nextInt();

        if(age<18){
            System.out.println("Du bist Minderjährig.");
        } else {
            System.out.println("Du bist volljährig.");
        }
    }
}
