package org.example;

public class Main {
    public static void main(String[] args) {
        TrafficSignal trafficSignal = new TrafficSignal();

        for(int i=0;i<10;i++)
        {
            trafficSignal.handleSignal();
        }
    }
}