package ru.netology.domein;


public class Conditioner {
    private String name;
    private int maxTemperature;
    private int minTemperature;
    private int currentTemperature;
    private boolean on;

    public String getName() {

        return name;
    }

    public void setName(String newName) {

        name = newName;
    }

    public int getMaxTemperature() {

        return maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {

        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {

        return minTemperature;
    }

    public void setMinTemperature(int minTemperature) {

        this.minTemperature = minTemperature;
    }

    public int getCurrentTemperature() {

        return currentTemperature;
    }

    public void setCurrentTemperature(int currentTemperature) {

        this.currentTemperature = currentTemperature;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {

        this.on = on;
    }

    public void increaseCurrentTemperature(int currentTemperature) {

        if (currentTemperature < maxTemperature) {
        }
        this.currentTemperature = currentTemperature++;

    }

    public void decreaseCurrentTemperature() {
        if (currentTemperature > minTemperature) {
            this.currentTemperature = currentTemperature - 1;

        }
    }
}








