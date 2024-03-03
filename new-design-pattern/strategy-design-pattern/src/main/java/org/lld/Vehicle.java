package org.lld;


public abstract class Vehicle {
    private DrivingStrategy drivingStrategy;

    public Vehicle(DrivingStrategy drivingStrategy)
    {
        this.drivingStrategy = drivingStrategy;
    }

    public void drive()
    {
        drivingStrategy.drive();
    }
}
