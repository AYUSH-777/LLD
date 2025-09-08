package org.example;

enum SeatType{
    NORMAL,
    DELUXE
}

enum SeatStatus{
    FREE,
    ACQUIRED,
    BOOKED
}

public class Seat {
    private String seatId;
    private String showId;
    private SeatType seatType;
    private SeatStatus seatStatus;
    private int priceOfSeat;
    private int version;

    public Seat(String seatId, String showId, SeatType seatType, SeatStatus seatStatus, int priceOfSeat, int version) {
        this.seatId = seatId;
        this.showId = showId;
        this.seatType = seatType;
        this.seatStatus = seatStatus;
        this.priceOfSeat = priceOfSeat;
        this.version = version;
    }

    public String getSeatId() {
        return seatId;
    }

    public void setSeatId(String seatId) {
        this.seatId = seatId;
    }

    public String getShowId() {
        return showId;
    }

    public void setShowId(String showId) {
        this.showId = showId;
    }

    public SeatType getSeatType() {
        return seatType;
    }

    public void setSeatType(SeatType seatType) {
        this.seatType = seatType;
    }

    public SeatStatus getSeatStatus() {
        return seatStatus;
    }

    public void setSeatStatus(SeatStatus seatStatus) {
        this.seatStatus = seatStatus;
    }

    public int getPriceOfSeat() {
        return priceOfSeat;
    }

    public void setPriceOfSeat(int priceOfSeat) {
        this.priceOfSeat = priceOfSeat;
    }

    public synchronized int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public synchronized void incrementVersion()
    {
        version++;
    }
}
