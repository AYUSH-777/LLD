package org.lld;

public class TwoWheelerChargeStrategy implements ParkingChargeStrategy{

    @Override
    public int getCharge(long hours) {
        return (int) (50 * hours);
    }
}
