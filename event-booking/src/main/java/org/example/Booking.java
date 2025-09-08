package org.example;

import java.util.List;

enum BookingStatus{
    PENDING_PAYEMENT,
    CONFIRMED,
    CANCELLED
}

public class Booking {
    private String bookingId;
    private String bookingUserId;
    private String showId;
    private List<Seat> seatList;
    private BookingStatus bookingStatus;
    private int amountToBePayed;

    public Booking(String bookingId, String bookingUserId, String showId, List<Seat> seatList, BookingStatus bookingStatus, int amountToBePayed) {
        this.bookingId = bookingId;
        this.bookingUserId = bookingUserId;
        this.showId = showId;
        this.seatList = seatList;
        this.bookingStatus = bookingStatus;
        this.amountToBePayed = amountToBePayed;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getBookingUserId() {
        return bookingUserId;
    }

    public void setBookingUserId(String bookingUserId) {
        this.bookingUserId = bookingUserId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public BookingStatus getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(BookingStatus bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public int getAmountToBePayed() {
        return amountToBePayed;
    }

    public void setAmountToBePayed(int amountToBePayed) {
        this.amountToBePayed = amountToBePayed;
    }
}
