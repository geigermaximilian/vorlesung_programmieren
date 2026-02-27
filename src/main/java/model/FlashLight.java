package model;

public class FlashLight extends Light {

    private double energyLevel;

    public FlashLight() {
        energyLevel = 1;
    }

    public void switchOn() {
        energyLevel -= 0.1;
        isOn = true;
    }

    public void recharge() {
        energyLevel = 1;
    }

    @Override
    public boolean isShining() {
        if (isOn() && energyLevel > 0) {
            return true;
        } else {
            return false;
        }

        // return isOn && energylevel > 0;
    }

    @Override
    public String toString() {
        return "FlashLight [isOn = " + isOn() + ", energyLevel = " + energyLevel + "]";
    }

}
