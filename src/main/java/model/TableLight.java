package model;

public class TableLight {
    private boolean isConnected;
    private boolean isOn;
    private LightBulb lightBulb;

    public void plugIn() {
        isConnected = true;
    }

    public void pullThePluf() {
        isConnected = false;
    }

    public void switchOn() {
        isOn = true;
    }

    public void switchOff() {
        isOn = false;
    }

    public LightBulb changeLightBulb(LightBulb newLightBulb) {
        LightBulb oldLightBulb = lightBulb;
        lightBulb = newLightBulb;

        return oldLightBulb;
    }

    public boolean isShining() {
        if (isConnected == true && isOn == true && lightBulb != null) {
            return true;
        } else {
            return false;
        }

        //oder:
        //return isConnected && isOn && lightBulb != null;
    }

    public boolean isConnected(){
        return isConnected;
    }

    public boolean isOn(){
        return isOn;
    }
    

    public LightBulb geLightBulb(){
        return lightBulb;
    }

}
