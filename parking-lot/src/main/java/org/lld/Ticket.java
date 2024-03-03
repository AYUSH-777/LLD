package org.lld;

import java.util.Date;

public class Ticket {
    private  String ticketId;
    private  String slotId;
    private  Vehicle parkedVehicle;
    private  Date entryTime;

    public Ticket(String ticketId, String slotId, Vehicle parkedVehicle, Date entryTime) {
        this.ticketId = ticketId;
        this.slotId = slotId;
        this.parkedVehicle = parkedVehicle;
        this.entryTime = entryTime;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getSlotId() {
        return slotId;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public Date getEntryTime() {
        return entryTime;
    }
}
