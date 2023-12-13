package org.fulksj.model.encapsul;

public class Vehicle {
    //the type of racing vehicle
    private String name;
    private int speed;

    public Vehicle(String name) {
        this.name = name;
        this.speed = 0; // every race vechile will start at 0
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }


    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Method to start the race
    public void race() {
        System.out.println(name + " is racing!");
        System.out.println("Current speed: " + speed + " km/h");
    }
}
