package com.company;

public class Bicycles extends Vehicle implements Horn {
    Bicycles(int year) {
        super(year);
    }

    @Override
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
