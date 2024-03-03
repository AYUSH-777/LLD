package org.example;

public class Booking {
    private String bookingId;
    private User bookingUser;
    private Show show;
    private String cinemaId;
    private Seat bookingSeat;

    public Booking(String bookingId, User bookingUser, Show show, String cinemaId, Seat bookingSeat) {
        this.bookingId = bookingId;
        this.bookingUser = bookingUser;
        this.show = show;
        this.cinemaId = cinemaId;
        this.bookingSeat = bookingSeat;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public User getBookingUser() {
        return bookingUser;
    }

    public void setBookingUser(User bookingUser) {
        this.bookingUser = bookingUser;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Seat getBookingSeat() {
        return bookingSeat;
    }

    public void setBookingSeat(Seat bookingSeat) {
        this.bookingSeat = bookingSeat;
    }
}
