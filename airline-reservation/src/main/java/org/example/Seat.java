package org.example;

enum SeatStatus{
    AVAILABLE,
    BOOKED
}

public class Seat {
    String seatId;
    SeatStatus seatStatus;
    int price;

    public Seat(String seatId, int price) {
        this.seatId = seatId;
        this.seatStatus = SeatStatus.AVAILABLE;
        this.price = price;
    }
}
