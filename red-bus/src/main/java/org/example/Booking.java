package org.example;

enum BookingStatus{
    PENDING_PAYMENT,
    CANCELLED,
    CONFIRMED
}

public class Booking {
    String bookingId;
    String bookingUserId;
    String busId;
    String seatId;
    BookingStatus bookingStatus;

    public Booking(String bookingId, String bookingUserId, String busId, String seatId) {
        this.bookingId = bookingId;
        this.bookingUserId = bookingUserId;
        this.busId = busId;
        this.seatId = seatId;
        this.bookingStatus = BookingStatus.PENDING_PAYMENT;
    }
}
