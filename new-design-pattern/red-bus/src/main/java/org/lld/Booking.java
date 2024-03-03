package org.lld;

public class Booking {
    private String bookingId;
    private Passenger passenger;
    private Seat seat;
    private String busId;

    public Booking(String bookingId, Passenger passenger, Seat seat, String busId) {
        this.bookingId = bookingId;
        this.passenger = passenger;
        this.seat = seat;
        this.busId = busId;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public String getBus() {
        return busId;
    }

    public void setBus(String busId) {
        this.busId = busId;
    }
}
