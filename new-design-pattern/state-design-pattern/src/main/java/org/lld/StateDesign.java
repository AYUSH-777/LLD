package org.lld;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class StateDesign {
    public static void main(String[] args) {
        AlertState alertState = new AlertState(new VibrationSate());
        alertState.setSilent();
        alertState.setSilent();
        alertState.setVibrate();
        alertState.setVibrate();
    }
}