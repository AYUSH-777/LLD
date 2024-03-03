package org.example;

public class Factory {
    public Factory()
    {

    }

    public Vehicle getVehicle(String vehicleType)
    {
        if(vehicleType.equals("Car"))
        {
            return new Car();
        }
        else {
            return new NullVehicle();
        }
    }
}
