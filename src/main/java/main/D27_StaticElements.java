package main;

import model.TableLight;

public class D27_StaticElements {
    public static void main(String[] args) {
        int numberOfTableLights = TableLight.getNumberOfTableLights();

        System.out.println(numberOfTableLights);

        TableLight light1 = new TableLight();
        TableLight light2 = new TableLight();
        TableLight light3 = new TableLight();

        numberOfTableLights = TableLight.getNumberOfTableLights();
        System.out.println(numberOfTableLights);
    }
}
