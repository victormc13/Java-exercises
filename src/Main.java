// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        Car mycar = new Car();

        changeVelocity(mycar);
        changeVelocity(mycar);
        changeVelocity(mycar);
        changeVelocity(mycar);

        System.out.println(mycar.velocity);
    }

    public static void changeVelocity(Car car) { //parameters by reference
        car.velocity += 15;
    }

    public static int suma(int a, int b) { //parameters by valor
        return a + b;
    }
}

interface Vehicle {
    void SpeedUp(int quantity);
    void SlowDown(int quantity);
}
class Car implements Vehicle {
    int velocity = 0;

    public void SpeedUp(int quantity) {
        System.out.println("Car() --> SpeedUp");
    }

    public void SlowDown(int quantity) {
        System.out.println("Car() --> SpeedUp");
    }
}