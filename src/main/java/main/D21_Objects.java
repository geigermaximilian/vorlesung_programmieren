package main;

import model.LightBulb;
import model.TableLight;

public class D21_Objects {
    public static void main(String[] args) {
        
        int i = 0;
        TableLight light1 = null;

        i=5;
        light1 = new TableLight();
        LightBulb redLightBulb = new LightBulb();

        // redLightBulb.color = "rot"; //ausführlich: redLightBulb.color = new String("rot");
        light1.changeLightBulb(redLightBulb);

        int x = 1;

        TableLight light2 = light1;

        i=7;
        light2.plugIn();
        light1.switchOn();


        System.out.println("i: " + i);
        System.out.println("x: " + x);
        System.out.println("light1: " + light1);
        System.out.println("light2: " + light2);
        System.out.println("light2: " + light2);
        System.out.println(light1.isShining());
        System.out.println(light2.isShining());


    }


}
