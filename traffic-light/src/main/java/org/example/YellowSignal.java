package org.example;

public class YellowSignal implements State{
    @Override
    public void handle(TrafficSignal trafficSignal) {
        System.out.println("Wait - Signal is Yellow");
        trafficSignal.setCurrentTrafficSignalState(new RedSignal());
    }
}
