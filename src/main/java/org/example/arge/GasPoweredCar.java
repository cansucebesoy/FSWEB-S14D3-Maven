package org.example.arge;

public class GasPoweredCar extends CarSkeleton{

    private double avgKmPerLiter;
    private int cylinders;

    public GasPoweredCar( String name, String description,  double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " start engine just for Gas powered car");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + "drive just for gas powered car");
        runEngine();
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }
}
