// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Car mycar = new Car();
        Motorcycle moto = new Motorcycle();
        RunSpeedUp(mycar);
        RunSpeedUp(moto);
        SlowDown(mycar);
        SlowDown(moto);
    }
    public static void RunSpeedUp (Vehicle vehicle) {
        vehicle.SpeedUp(15);
    }

    public static void SlowDown (Vehicle vehicle) {
        vehicle.SlowDown(5);
    }
}

interface Vehicle {
    void SpeedUp(int velocity);
    void SlowDown(int velocity);
}

class Car implements Vehicle {
    public void SpeedUp(int velocity) {
        System.out.println("Car() ---> SpeedUp()");
    }
    public void SlowDown(int velocity) {
        System.out.println("Car() ---> SlowDown()");
    }
}

class Motorcycle implements Vehicle {
    public void SpeedUp(int velocity) {
        System.out.println("Moto(RMMM) ---> SpeedUp()");
    }
    public void SlowDown(int velocity) {
        System.out.println("Moto() ---> SlowDown()");
    }
}