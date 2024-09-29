package org.example.arge;

public class ElectricCar extends CarSkeleton {

    private double avgKmPerLiter;
    private int batterySize;


    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " start engine just for electric car");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + "drive just for electric car");
        runEngine();
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
