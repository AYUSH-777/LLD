package org.example;

import java.util.List;

public class Airline {
    String airLineId;
    List<Flight> flightList;

    public Airline(String name, List<Flight> flightList) {
        this.airLineId = name;
        this.flightList = flightList;
    }
}
