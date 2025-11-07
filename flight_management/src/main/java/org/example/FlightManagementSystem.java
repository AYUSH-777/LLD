package org.example;

import java.util.*;

public class FlightManagementSystem {

    Map<String,List<Flight>>flightMap;
    SearchStrategy searchStrategy;

    public FlightManagementSystem(SearchStrategy searchStrategy)
    {
        this.searchStrategy = searchStrategy;
        flightMap = new HashMap<>();
    }

    public void addFlight(Flight flight)
    {
//          Pair flightRoute = new Pair(flight.source,flight.destination);
          String routeKey = flight.source + " : " +flight.destination;
          List<Flight> flightList = new ArrayList<>();
          if(flightMap.containsKey(routeKey))
          {
              flightList = flightMap.get(routeKey);
          }
          flightList.add(flight);
          flightMap.put(routeKey,flightList);
    }

    public List<Flight> getFlightsByCost(String source, String destination)
    {
//        for(Map.Entry<Pair,List<Flight>>entry:flightMap.entrySet())
//        {
//            System.out.println(entry.getKey().first+" : "+entry.getKey().second + " : "+entry.getValue().get(0).flightId);
//        }
        return searchStrategy.getFlights(source, destination, flightMap);
    }
}
