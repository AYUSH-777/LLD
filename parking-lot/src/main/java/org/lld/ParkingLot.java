package org.lld;

import java.util.*;

public class ParkingLot implements Parking{

    private static ParkingLot parkingLot = null;
    private List<Slot> twoWheelerSlot = new ArrayList<>();
    private List<Slot> fourWheelerSlot = new ArrayList<>();

    public static ParkingLot getParkingLot()
    {
        if(parkingLot==null)
        {
            return new ParkingLot();
        }
        else
        {
            return parkingLot;
        }
    }

    public void initialiseSlots()
    {
        for(int i=0;i<10;i++)
        {
            Slot slot = new Slot(String.valueOf(i),true,null);
            twoWheelerSlot.add(slot);
            fourWheelerSlot.add(slot);
        }
    }

    @Override
    public Ticket parkVehicle(Vehicle vehicle) {
        Slot slot = null;
        if(vehicle.getVehicleType()==VehicleType.TWO_WHEELER)
        {
            slot = getNextAvailableSlot(twoWheelerSlot);
        }
        else
        {
            slot = getNextAvailableSlot(fourWheelerSlot);
        }
        Random rand = new Random();
        slot.parkVehicle(vehicle);
        // Generate random integers in range 0 to 999
        return new Ticket(String.valueOf(rand.nextInt(1000)), slot.getSlotId(), vehicle,new Date());
    }

    @Override
    public int unParkVehicle(Ticket ticket, ParkingChargeStrategy parkingChargeStrategy) {
        int cost = 0;
        Slot occSlot = null;
        if(ticket.getParkedVehicle().getVehicleType()==VehicleType.TWO_WHEELER)
        {
            occSlot = getSlotByVehicleId(ticket.getParkedVehicle(),twoWheelerSlot);
        }
        else
        {
            occSlot = getSlotByVehicleId(ticket.getParkedVehicle(),fourWheelerSlot);
        }
        occSlot.unParkVehicle();
        long totalHrs = getInHrs(ticket.getEntryTime(),new Date());
        return parkingChargeStrategy.getCharge(totalHrs);
    }

    public Slot getNextAvailableSlot(List<Slot> slotList)
    {
        for(Slot curSlot:slotList)
        {
            if(curSlot.getEmpty())
            {
                return curSlot;
            }
        }
        return null;
    }

    public long getInHrs(Date startDate,Date endDate)
    {
        return (endDate.getTime()- startDate.getTime())/1000;
    }

    public Slot getSlotByVehicleId(Vehicle vehicle,List<Slot> slotList)
    {
        for(Slot curSlot:slotList)
        {
           if(curSlot.getParkedVehicle()!=null&&Objects.equals(curSlot.getParkedVehicle().getVehicleId(), vehicle.getVehicleId()))
           {
               return curSlot;
           }
        }
        return null;
    }
}
