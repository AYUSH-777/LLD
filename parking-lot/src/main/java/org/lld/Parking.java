package org.lld;

public interface Parking {
    Ticket parkVehicle(Vehicle vehicle);
    int unParkVehicle(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy);
}
