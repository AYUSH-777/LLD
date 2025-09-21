package org.example;

import java.util.*;

public class AirLineReservation {
    Map<String,Airline> airLineMap;
    List<Reservation> reservationList;

    public AirLineReservation(Map<String, Airline> airLineMap) {
        this.airLineMap = airLineMap;
        this.reservationList = new ArrayList<>();
    }

    public List<Flight> getFlights(String airLineId, String src , String des)
    {
        if(!airLineMap.containsKey(airLineId))
        {
            return new ArrayList<>();
        }
        Airline airline = airLineMap.get(airLineId);
        List<Flight> flightList = airline.flightList;

        List<Flight> ans = new ArrayList<>();

        for(Flight flight:flightList)
        {
            if(flight.source.equals(src)&&flight.destination.equals(des))
            {
                ans.add(flight);
            }
        }

        return ans;
    }

    public Reservation bookFlight(String bookingUserId, String airLineId, String flightId, List<String>seatIds)
    {
        if(!airLineMap.containsKey(airLineId))
        {
            return null;
        }
        Airline airline = airLineMap.get(airLineId);
        List<Flight> flightList = airline.flightList;

        for(Flight flight:flightList)
        {
            if(flight.flightId.equals(flightId))
            {
                Map<String,Seat> stringSeatMap = flight.seatMap;
                int price = 0;
                for(String seat:seatIds)
                {
                    if(!stringSeatMap.containsKey(seat)||stringSeatMap.get(seat).seatStatus.equals(SeatStatus.BOOKED))
                    {
                        return null;
                    }
                    price = price + stringSeatMap.get(seat).price;
                }
                return new Reservation(UUID.randomUUID().toString(),bookingUserId,airLineId,flightId, flight.source, flight.destination, seatIds, price);
            }
        }

        return null;
    }
}
