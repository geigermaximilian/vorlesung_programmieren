package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import model.Person;

public class D29_JavaApi {
    public static void main(String[] args) throws FileNotFoundException{
        ArrayList<Person> persons = new ArrayList<>();

        //File file = new File("/Users/maximiliangeiger/DHBW/Programmieren/vorlesung_programmieren/src/main/ressources/persons.txt");
        File file = new File("src/main/ressources/persons.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            String[] tokens = line.split(";");
            String name = tokens[0];
            char gender = tokens[1].charAt(0);
            int year = Integer.parseInt(tokens[2]);
            int month = Integer.parseInt(tokens[3]);
            int day = Integer.parseInt(tokens[4]);

            LocalDate birDate = LocalDate.of(year, month, day);

            Person person = new Person(name, gender, birDate);
            persons.add(person);
        }

        scanner.close();
        System.out.println(persons);
    }
}
