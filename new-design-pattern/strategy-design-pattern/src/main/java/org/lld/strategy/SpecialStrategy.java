package org.lld.strategy;

import org.lld.DrivingStrategy;

public class SpecialStrategy implements DrivingStrategy {
    @Override
    public void drive()
    {
        System.out.println("Special Strategy");
    }
}
