package org.example;

public class RedSignal implements State{
    @Override
    public void handle(TrafficSignal trafficSignal) {
        System.out.println("STOP - Signal is Red");
        trafficSignal.setCurrentTrafficSignalState(new GreenSignal());
    }
}
