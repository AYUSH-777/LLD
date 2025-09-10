package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class BusController {
    List<Bus> busList;
    List<Booking> bookingList;

    public BusController()
    {
        this.busList = new ArrayList<>();
        this.bookingList = new ArrayList<>();
    }

    public void addBus(Bus bus)
    {
        busList.add(bus);
    }

    public Bus getBusDetails(String busId)
    {
        for(Bus curBus:busList)
        {
            if(curBus.busId.equals(busId))
            {
                return curBus;
            }
        }
        return null;
    }

    public boolean checkAvailability(String busId){
        Bus bus = getBusDetails(busId);
        if(bus==null)
        {
            System.out.println("Bus doesn't exist");
            return false;
        }
        List<Seat> seatList = bus.seatList;
        for(Seat curSeat:seatList)
        {
            if(curSeat.seatStatus.equals(SeatStatus.AVAILABLE))
            {
                return true;
            }
        }
        return false;
    }

    public Booking book(String busId, String seatId, String userId)
    {
        Bus bus = getBusDetails(busId);
        if(bus==null)
        {
            throw new RuntimeException("Invalid busId");
        }
        List<Seat> seatList = bus.seatList;
        for(Seat curSeat:seatList)
        {
            if (curSeat.seatId.equals(seatId)&&curSeat.seatStatus.equals(SeatStatus.AVAILABLE))
            {
                curSeat.seatStatus=SeatStatus.ACQUIRED;
                Booking curBooking = new Booking(UUID.randomUUID().toString(),userId, busId, curSeat.seatId);
                bookingList.add(curBooking);
                return curBooking;
            }
        }
        throw new RuntimeException("Invalid seatId");
    }

    public void cancelBooking(String bookingId){
        Booking booking = null;
        for(Booking curBooking:bookingList)
        {
            if(curBooking.bookingId.equals(bookingId))
            {
                booking = curBooking;
                break;
            }
        }
        if(booking==null)
        {
            throw new RuntimeException("Invalid BookingId");
        }
        booking.bookingStatus = BookingStatus.CANCELLED;
        Bus bus = getBusDetails(booking.busId);
        List<Seat> seatList = bus.seatList;

        for(Seat curSeat:seatList)
        {
            if(curSeat.seatId.equals(booking.seatId))
            {
                curSeat.seatStatus = SeatStatus.AVAILABLE;
                break;
            }
        }
    }
}
