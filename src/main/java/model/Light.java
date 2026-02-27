package model;

public class Light {
    protected boolean isOn;

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }

    public boolean isShining() {
        if (isOn) {
            return true;
        } else {
            return false;
        }

        // retrun switchOn;
    }

    @Override
    public String toString() {
        return "Light [isON = " + isOn + "]";
    }
}
