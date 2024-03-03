package org.lld;

public class AlertState {
    private MobileAlertState mobileAlertState;

    public AlertState(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public MobileAlertState getMobileAlertState() {
        return mobileAlertState;
    }

    public void setMobileAlertState(MobileAlertState mobileAlertState) {
        this.mobileAlertState = mobileAlertState;
    }

    public void alert()
    {
        mobileAlertState.alert(this);
    }

    public void setVibrate()
    {
        mobileAlertState.vibration(this);
    }

    public void setSilent()
    {
        mobileAlertState.silent(this);
    }
}
