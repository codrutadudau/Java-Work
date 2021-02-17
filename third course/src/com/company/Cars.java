package com.company;

public class Cars extends Vehicle implements Behaviour, Horn {
    Cars(int year) {
        super(year);
    }

    @Override
    public void start() {

        System.out.println("Starting car engine...");
    }

    @Override
    public void stop() {

        System.out.println("Stopping car engine...");
    }

    public final String getColour() {
        return super.getColour();
    }

    @Override
    public final void setColour(String colour) {
        super.setColour(colour);
    }

    public String toString() {
        return super.toString();
    }
}
