package org.lld.strategy;

import org.lld.DrivingStrategy;

public class NormalStrategy implements DrivingStrategy {
    @Override
    public void drive()
    {
        System.out.println("Normal Strategy");
    }
}
