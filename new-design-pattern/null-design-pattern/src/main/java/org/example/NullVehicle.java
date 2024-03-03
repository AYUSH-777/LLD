package org.example;

public class NullVehicle implements Vehicle{

    public NullVehicle()
    {

    }

    @Override
    public int getFuelPrice() {
        return 0;
    }
}
