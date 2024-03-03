package org.lld;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class PLD {
    public static void main(String[] args) {
      ParkingLot parkingLot = ParkingLot.getParkingLot();
      parkingLot.initialiseSlots();
      Random random = new Random();

      Vehicle vehicle1 = new Vehicle(String.valueOf(random.nextInt(1000)),VehicleType.FOUR_WHEELER);
        Vehicle vehicle2 = new Vehicle(String.valueOf(random.nextInt(1000)),VehicleType.FOUR_WHEELER);
        Ticket ticket1 = parkingLot.parkVehicle(vehicle1);
        Ticket ticket2 = parkingLot.parkVehicle(vehicle2);
      ParkingChargeStrategy parkingChargeStrategy1 = new FourWheelerChargeStrategy();
      ParkingChargeStrategy parkingChargeStrategy2 = new FourWheelerChargeStrategy();
      System.out.println(ticket1.getTicketId()+":"+ticket1.getSlotId()+":"+ticket1.getParkedVehicle().getVehicleId()+":"+ticket1.getEntryTime());
        System.out.println(ticket2.getTicketId()+":"+ticket2.getSlotId()+":"+ticket2.getParkedVehicle().getVehicleId()+":"+ticket2.getEntryTime());

        int cost1 = parkingLot.unParkVehicle(ticket1,parkingChargeStrategy1);
        int cost2 = parkingLot.unParkVehicle(ticket2,parkingChargeStrategy2);

        System.out.println(cost1+":"+cost2);

    }
}