package Practice;

/**
 * Created by Михаил on 26.11.2016.
 */
public class CarTester {
    public static void main(String[] args) {
        Car c = new Car(50);
        c.addGas(20);
        c.drive(100);
        System.out.println(c.getGasLevel());
    }
}
