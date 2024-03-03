package org.lld;

import java.util.Random;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class RedBus {
    public static void main(String[] args) {
        Random random = new Random();
        Passenger p1 = new Passenger(String.valueOf(random.nextInt(100)),"Ayush");
        Passenger p2 = new Passenger(String.valueOf(random.nextInt(100)),"Vidhi");
        Seat s1 = new Seat(String.valueOf(random.nextInt(100)),SeatType.AVAILABLE, true,null);
        Bus bus = new Bus(String.valueOf(random.nextInt(100)),BusType.NON_AC);
          bus.addSeat(s1);
//          bus.addSeat(new Seat(String.valueOf(random.nextInt(100)),SeatType.AVAILABLE, true));
          bus.getBusDetails();

          boolean isAvailable = bus.checkAvailibility();
          System.out.println("isAvailable : "+isAvailable);

         Booking booking1 = bus.makeBooking(p1,s1);
         bus.cancelBooking(s1,p1);

    }
}