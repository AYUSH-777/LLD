package org.example;

import java.util.*;

public class BookingService {

    private Map<String,Seat> seatsMap = new HashMap<>();

    public static int bookingId = 0;

    public BookingService(Map<String, Seat> seats) {
        this.seatsMap = seats;
    }

    public Map<String, Seat> getSeatsMap() {
        return seatsMap;
    }

    public void setSeatsMap(Map<String, Seat> seatsMap) {
        this.seatsMap = seatsMap;
    }

    public Booking book(String bookingUserId, String showId, List<String> seatIds)
    {
        for(String seatId:seatIds)
        {
            Seat seat = seatsMap.get(seatId);
            if(seat.getSeatStatus()!=SeatStatus.FREE)
            {
                throw new RuntimeException("Seat not Available");
            }
        }

        int amount = 0;

        List<Seat> bookedSeats = new ArrayList<>();
        for(String seatId:seatIds)
        {
            Seat seat = seatsMap.get(seatId);
            seat.setSeatStatus(SeatStatus.ACQUIRED);
            amount+=seat.getPriceOfSeat();
            bookedSeats.add(seat);
        }

        return new Booking(UUID.randomUUID().toString(),bookingUserId,showId,bookedSeats,BookingStatus.PENDING_PAYEMENT,amount);
    }

    public Booking bookConcurrentOptimistic(String bookingUserId, String showId, List<String> seatIds)
    {
        List<Seat> bookedSeats = new ArrayList<>();
        int amount = 0;

        for(String seatId:seatIds)
        {
            Seat seat = seatsMap.get(seatId);
            int currentVersion = seat.getVersion();
            if(seat.getSeatStatus()!=SeatStatus.FREE||seat.getVersion()!=currentVersion)
            {
                throw new RuntimeException("Seat not Available");
            }
            seat.setSeatStatus(SeatStatus.ACQUIRED);
            seat.incrementVersion();
            amount += seat.getPriceOfSeat();
            bookedSeats.add(seat);
        }

        return new Booking(UUID.randomUUID().toString(),bookingUserId,showId,bookedSeats,BookingStatus.PENDING_PAYEMENT,amount);
    }

    public Booking bookConcurrentPessimistic(String bookingUserId, String showId, List<String> seatIds)
    {
        List<Seat> bookedSeats = new ArrayList<>();
        int amount = 0;

        for(String seatId:seatIds)
        {
            Seat seat = seatsMap.get(seatId);
            synchronized (seat){
                if(seat.getSeatStatus()!=SeatStatus.FREE)
                {
                    throw new RuntimeException("Seat not Available");
                }
                seat.setSeatStatus(SeatStatus.ACQUIRED);
            }
            amount += seat.getPriceOfSeat();
            bookedSeats.add(seat);
        }

        return new Booking(UUID.randomUUID().toString(),bookingUserId,showId,bookedSeats,BookingStatus.PENDING_PAYEMENT,amount);
    }
}
