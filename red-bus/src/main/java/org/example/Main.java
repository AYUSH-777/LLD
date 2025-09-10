package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        BusController busController = new BusController();

        List<Seat> seatList = new ArrayList<>();
        seatList.add(new Seat("S1", SeatType.NORMAL));
        seatList.add(new Seat("S2", SeatType.DELUXE));

        busController.addBus(new Bus("B1",BusType.NORMAL,seatList));

        Booking booking1 = busController.book("B1", "S1", "U1");

        System.out.println("After Booking Status => booking1 : "+booking1.bookingStatus+" seat1 : "+ seatList.get(0).seatStatus);

        busController.cancelBooking(booking1.bookingId);

        System.out.println("After Cancel Status => booking1 : "+booking1.bookingStatus+" seat1 : "+ seatList.get(0).seatStatus);
    }
}