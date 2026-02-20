package training.ObjektorientierteProgrammierung.OO01;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();

        car.setMake("Porsche");
        car.setModel("911");
        car.accelerate(30);
        car.accelerate(30);
        car.brake(20);
        car.accelerate(40);

        // System.out.printf("%s %s beschleuningt auf %d%n", car.getMake(), car.getModel());


        // System.out.println(car.toString());
    }
}
