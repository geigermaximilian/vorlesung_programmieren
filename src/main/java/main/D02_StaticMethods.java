package main;

import main.helper.Printer;
import utility.Calculator;

public class D02_StaticMethods {

    public static void main(String[] args){
        Printer.printHelloWorld();
        Printer.printText("test");

        int result = Calculator.add(5, 3);
        System.out.println(result);
    }
}
