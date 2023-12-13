package org.fulksj.model.encapsul;

public class Speedboat extends Vehicle {
    private boolean useTurbo;

    public Speedboat(String name, boolean hasTurbo) {
        super(name);
        this.useTurbo = hasTurbo;
    }

    public void startRace(boolean startWithTurbo){
        setSpeed(30);
        if(startWithTurbo){
            this.setSpeed(this.getSpeed()+20);
        }
        this.race();
    }
}
