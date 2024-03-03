package org.lld;

public interface MobileAlertState {
    void alert(AlertState alertState);
    void vibration(AlertState alertState);
    void silent(AlertState alertState);
}
