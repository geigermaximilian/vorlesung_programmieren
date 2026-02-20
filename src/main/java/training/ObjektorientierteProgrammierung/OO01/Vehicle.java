package training.ObjektorientierteProgrammierung.OO01;

public class Vehicle {
    private String make;
    private String model;
    private double speedInKmh;

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getSpeedInKmh() {
        return speedInKmh;
    }

    public void accelerate(int valueInKmh) {
        speedInKmh += valueInKmh;
        System.out.printf("%s %s beschleunigt auf %.1fkm/h%n", getMake(), getModel(), speedInKmh);
    }

    public void brake(int valueInKmh) {
        speedInKmh -= valueInKmh;
        System.out.printf("%s %s bremst auf %.1fkm/h ab%n", getMake(), getModel(), speedInKmh);
    }

    public String toString() {
        return make + " " + model;
    }
}
