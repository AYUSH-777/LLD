package org.lld;

public class Seat {
    private String seatId;
    private SeatType seatType;
    private Boolean isAvailable;
    private Passenger passenger;

    public Seat(String seatId, SeatType seatType, Boolean isAvailable, Passenger passenger) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.isAvailable = isAvailable;
        this.passenger = passenger;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
