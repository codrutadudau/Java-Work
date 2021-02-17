package com.company;

public class Main {

    public static void main(String[] args) {
        Bicycles bike = new Bicycles(2012);
        bike.setColour("Red");
        System.out.println("Bike -> " + bike);


        Cars car = new Cars(2010);
        car.setColour("Blue");
        System.out.println("Car -> " + car);

        Ships ship = new Ships(1995);
        ship.setColour("White");
        System.out.println("Ship -> " + ship);
        System.out.println(" ");
        car.start();
        ship.start();
        ship.blowHorn();
        System.out.println(" ");
        ship.stop();
        car.stop();


    }
}
