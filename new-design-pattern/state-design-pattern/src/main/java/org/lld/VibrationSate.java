package org.lld;

public class VibrationSate implements MobileAlertState{

    public VibrationSate() {
    }

    @Override
    public void alert(AlertState alertState) {
        System.out.println("Vibration State");
    }

    @Override
    public void vibration(AlertState alertState) {
        System.out.println("Already in Vibration");
    }

    @Override
    public void silent(AlertState alertState) {
        alertState.setMobileAlertState(new SilentState());
        System.out.println("Set in Silent");

    }
}
