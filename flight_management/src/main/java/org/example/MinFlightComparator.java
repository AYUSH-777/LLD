package org.example;

import java.util.Comparator;

public class MinFlightComparator implements Comparator<Flight> {

    @Override
    public int compare(Flight f1, Flight f2) {
        if (f1.price == f2.price) {
            return f1.flightId.compareTo(f2.flightId);
        } else {
            return Integer.compare(f1.price, f2.price);
        }
    }
}
