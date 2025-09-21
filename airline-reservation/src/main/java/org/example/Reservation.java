package org.example;

import java.util.List;

public class Reservation {
    String reservationId;
    String userId;
    String airLineId;
    String flightId;
    String source;
    String destination;
    List<String> seatList;
    int amountToBePayed;

    public Reservation(String reservationId, String userId, String airLineId, String flightId, String source, String destination, List<String> seatList, int amountToBePayed) {
        this.reservationId = reservationId;
        this.userId = userId;
        this.airLineId = airLineId;
        this.source = source;
        this.destination = destination;
        this.seatList = seatList;
        this.amountToBePayed = amountToBePayed;
        this.flightId = flightId;
    }
}
