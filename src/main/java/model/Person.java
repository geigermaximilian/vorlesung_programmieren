package model;

import java.time.LocalDate;

public class Person {
    private String name;
    private char gender;
    private final LocalDate birthdate;

    public Person(String name, char gender, LocalDate birthdate){
        this.name = name;
        this.gender = gender;
        this.birthdate = birthdate;

    }


    public String toString(){
        return "Person [name= " + name + ", gender= " +gender + ", birthdate= " +birthdate +"]\n";
    }

}
