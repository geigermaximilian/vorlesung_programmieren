package main;

public class D04_DataObjects {

    /*Konstanten */
    public final static double PI = 3.14159265359; //Ausgabe in line 30.

    public static void main(String[] args) {
        /*Deklarieren */
        int age;
        String name, firstName, familyName, firstNameAndFamilyName;
        double sizeInM;
        boolean isMale;

        /*Initialisieren */
        age = 18;
        firstName = "Angelo";
        sizeInM = 1.79;
        isMale = true;



        /*Ausgabe */
        System.out.println("Age: " + age);
        System.out.println("firstName: " + firstName);
        System.out.println("sizeInM: " + sizeInM);
        System.out.println("isMale: " + isMale);
        
        
        System.out.println("PI: " + D04_DataObjects.PI);
        



        /*Veränderliche Datenobjekte */
        age = 44;
        System.out.println("age: " + age);

        /*Unveränderliche Datenobjekte */
        final String text = "Java";   //final davor --> Datentyp fix - nicht mehr änderbar
        // text = "Python";
    }
}
