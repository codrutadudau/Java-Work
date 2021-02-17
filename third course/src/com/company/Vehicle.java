package com.company;

public class Vehicle {
    private String colour;
    private int year;

    Vehicle(int year) {
        this.year = year;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String toString() {
        return "Colour: " + getColour() + ", " + "Year: " + year;
    }
}
