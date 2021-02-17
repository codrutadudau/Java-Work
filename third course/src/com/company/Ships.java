package com.company;

public class Ships extends Vehicle implements Behaviour, Horn {
    Ships(int year) {
        super(year);
    }

    @Override
    public void start() {

        System.out.println("Starting ship engine...");
    }

    @Override
    public void stop() {

        System.out.println("Stopping ship engine...");
    }

    @Override
    public String getColour() {
        return super.getColour();
    }

    @Override
    public void setColour(String colour) {
        super.setColour(colour);
    }

    public String toString() {
        return super.toString();
    }
}
