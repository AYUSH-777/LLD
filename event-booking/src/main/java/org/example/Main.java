package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String,Seat> seatsMap = new HashMap<>();
        seatsMap.put("1", new Seat("1", "S1", SeatType.NORMAL, SeatStatus.FREE, 400, 0));
        seatsMap.put("2", new Seat("2", "S1", SeatType.DELUXE, SeatStatus.FREE, 600, 0));

        BookingService bookingService = new BookingService(seatsMap);

        List<String> seatIds = new ArrayList<>();

        seatIds.add("1");
        seatIds.add("2");

//        Booking booking = bookingService.book("U1", "S1", seatIds);
//        Booking booking = bookingService.bookConcurrentPessimistic("U1", "S1", seatIds);
        Booking booking = bookingService.bookConcurrentOptimistic("U1", "S1", seatIds);

        System.out.println("BookingId : "+ booking.getBookingId() + " Booking Status : "+ booking.getBookingStatus());

        System.out.println("Seat  Status : "+seatsMap.get("1").getSeatStatus());

        PaymentService paymentService = new PaymentService();

        Payment payment = paymentService.makePayment(booking, 1000);

        System.out.println("PaymentId : "+ payment.getPaymentId());

        System.out.println("BookingId : "+ booking.getBookingId() + " Booking Status : "+ booking.getBookingStatus());

        System.out.println("Seat  Status : "+seatsMap.get("1").getSeatStatus());

    }
}