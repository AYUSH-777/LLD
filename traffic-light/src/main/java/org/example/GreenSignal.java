package org.example;

public class GreenSignal implements State{

    @Override
    public void handle(TrafficSignal trafficSignal) {
       System.out.println("GO - Signal is Green");
       trafficSignal.setCurrentTrafficSignalState(new YellowSignal());
    }
}
