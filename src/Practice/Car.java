package Practice;

/**
 * Created by Михаил on 26.11.2016.
 */
public class Car {

    private double Efficiency;
    private double fuelLevel;


    public Car(double efn) {
        Efficiency = efn;
        fuelLevel = 0;
    }

    public void drive(int miles) {
         fuelLevel -= (miles/Efficiency);
    }

    public double getGasLevel() {
        return fuelLevel;
    }

    public void addGas(double gal) {
        fuelLevel += gal;
    }
}
