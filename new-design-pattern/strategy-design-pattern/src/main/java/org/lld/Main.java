package org.lld;

import org.lld.strategy.NormalStrategy;
import org.lld.strategy.SpecialStrategy;
import org.lld.vehicle.NormalCar;
import org.lld.vehicle.SpecialCar;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      DrivingStrategy normalStrategy = new NormalStrategy();
      DrivingStrategy specialStrategy = new SpecialStrategy();
      Vehicle normalVehicle = new NormalCar(normalStrategy);
      Vehicle specialVehicle = new SpecialCar(specialStrategy);
      normalVehicle.drive();
      specialVehicle.drive();
    }
}