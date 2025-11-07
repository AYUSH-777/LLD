package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MinCostSearchStrategy implements SearchStrategy{

    @Override
    public List<Flight> getFlights(String source, String destination, Map<String,List<Flight>> flightMap) {
        String flightRoute = source + " : "+ destination;
        if(!flightMap.containsKey(flightRoute))
        {
            System.out.println("Returning empty list");
            return new ArrayList<>();
        }
        List<Flight> flightList = flightMap.get(flightRoute);
        flightList.sort(new MinFlightComparator());
        return flightList;
    }
}
