package org.example;

public class Seat {
    private String seatId;
    private SeatType seatType;
    private boolean isAvailable;
    private Integer price;

    public Seat(String seatId, SeatType seatType, Integer price) {
        this.seatId = seatId;
        this.seatType = seatType;
        this.price = price;
        this.isAvailable = true;
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

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
