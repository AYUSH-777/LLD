package org.lld;

public class FourWheelerChargeStrategy implements ParkingChargeStrategy{
    @Override
    public int getCharge(long hours) {
        return (int) (100 * hours);
    }
}
