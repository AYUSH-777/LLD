package org.lld;

public class SilentState implements MobileAlertState{

    public SilentState() {
    }

    @Override
    public void alert(AlertState alertState) {
        System.out.println("Silent State");
    }

    @Override
    public void vibration(AlertState alertState) {
        alertState.setMobileAlertState(new VibrationSate());
        System.out.println("Set in Vibration");
    }

    @Override
    public void silent(AlertState alertState) {
        System.out.println("Already in Silent");
    }
}
