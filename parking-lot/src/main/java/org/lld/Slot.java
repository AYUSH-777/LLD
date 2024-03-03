package org.lld;

public class Slot {
    private String slotId;
    private Boolean isEmpty;
    private Vehicle parkedVehicle;

    public Slot(String slotId, Boolean isEmpty, Vehicle parkedVehicle) {
        this.slotId = slotId;
        this.isEmpty = isEmpty;
        this.parkedVehicle = parkedVehicle;
    }

    public String getSlotId() {
        return slotId;
    }

    public Boolean getEmpty() {
        return isEmpty;
    }

    public Vehicle getParkedVehicle() {
        return parkedVehicle;
    }

    public void parkVehicle(Vehicle vehicle)
    {
        this.parkedVehicle = vehicle;
        this.isEmpty = false;
    }

    public void unParkVehicle()
    {
        this.parkedVehicle = null;
        this.isEmpty = true;
    }
}
