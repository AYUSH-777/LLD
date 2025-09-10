package org.example;

import java.util.List;

enum BusType{
    AC,
    NORMAL
}

public class Bus {
    String busId;
    BusType busType;
    List<Seat> seatList;

    public Bus(String busId, BusType busType, List<Seat> seatList) {
        this.busId = busId;
        this.busType = busType;
        this.seatList = seatList;
    }
}
