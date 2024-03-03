package org.lld;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Bus {
    private String busId;
    private BusType busType;
    private List<Seat> seatList;
    private Random random;

    public Bus(String busId, BusType busType) {
        this.busId = busId;
        this.busType = busType;
        this.seatList=new ArrayList<>();
        random = new Random();
    }

    public String getBusId() {
        return busId;
    }

    public void setBusId(String busId) {
        this.busId = busId;
    }

    public BusType getBusType() {
        return busType;
    }

    public void setBusType(BusType busType) {
        this.busType = busType;
    }

    public List<Seat> getSeatList() {
        return seatList;
    }

    public void setSeatList(List<Seat> seatList) {
        this.seatList = seatList;
    }

    public void addSeat(Seat seat)
    {
        seatList.add(seat);
    }

    public void getBusDetails()
    {
        System.out.println("busId : "+busId+" busType : "+busType);
    }

    public boolean checkAvailibility()
    {
        for(Seat curSeat:seatList)
        {
            if(curSeat.getAvailable())
            {
                return true;
            }
        }
        return false;
    }

    public Booking makeBooking(Passenger passenger,Seat seat)
    {
          if(seat.getAvailable())
          {
              seat.setAvailable(false);
              seat.setPassenger(passenger);
              return new Booking(String.valueOf(random.nextInt(100)),passenger,seat,busId);
          }
          return null;
    }

    public void cancelBooking(Seat seat,Passenger passenger)
    {
        seat.setPassenger(null);
        seat.setAvailable(true);
    }
}
