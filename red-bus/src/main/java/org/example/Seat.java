package org.example;

enum SeatType{
    NORMAL,
    DELUXE
}

enum SeatStatus{
    AVAILABLE,
    ACQUIRED,
    BOOKED
}

public class Seat {
    String seatId;
    SeatType seatType;
    SeatStatus seatStatus;

    public Seat(String seatId, SeatType seatType) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.seatStatus = SeatStatus.AVAILABLE;
    }
}
