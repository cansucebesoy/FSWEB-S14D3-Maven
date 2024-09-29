package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(5, "bmw");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(8, "VRX");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");

        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
       System.out.println(ford.brake());

        Car holden = new Holden(8, "Holden Commodore");

        System.out.println(holden.startEngine());

        System.out.println(holden.accelerate());

        System.out.println(holden.brake());

        CarSkeleton gasPoweredCar = new GasPoweredCar("DS","gas-powered",5.9, 8);
        CarSkeleton electricCar = new ElectricCar("OPEL", "electric", 8.9, 15);
        CarSkeleton hybridCar = new HybridCar("hyundai", "hybrid",9, 5, 6 );

        gasPoweredCar.startEngine();
        gasPoweredCar.drive();

        electricCar.startEngine();
        electricCar.drive();

        hybridCar.startEngine();
        hybridCar.drive();

    }
}