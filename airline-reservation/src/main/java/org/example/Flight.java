package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Flight {
    String flightId;
    String source;
    String destination;
    Map<String,Seat> seatMap;

    public Flight(String flightId, String source, String destination) {
        this.flightId = flightId;
        this.source = source;
        this.destination = destination;
        this.seatMap = new HashMap<>();
    }
}
