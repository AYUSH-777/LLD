package org.example;

public class TrafficSignal {
    private State currentTrafficSignalState;

    public TrafficSignal()
    {
        this.currentTrafficSignalState = new RedSignal();
    }

    public void handleSignal()
    {
       currentTrafficSignalState.handle(this);
    }

    public void setCurrentTrafficSignalState(State currentTrafficSignalState)
    {
        this.currentTrafficSignalState = currentTrafficSignalState;
    }

    public State getCurrentTrafficSignalState() {
        return currentTrafficSignalState;
    }
}
