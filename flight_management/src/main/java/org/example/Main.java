package org.example;

import java.util.List;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
        FlightManagementSystem flightManagementSystem = new FlightManagementSystem(new MinCostSearchStrategy());
        flightManagementSystem.addFlight(new Flight("Air India", "DEL", "BLR",6000));
        flightManagementSystem.addFlight(new Flight("SpiceJet", "DEL", "BLR",5000));
        flightManagementSystem.addFlight(new Flight("Indigo", "DEL", "BLR",4300));
        List<Flight> flightList = flightManagementSystem.getFlightsByCost("DEL", "BLR");
        for(Flight curFlight: flightList)
        {
            System.out.println(curFlight.flightId);
        }
    }
}
