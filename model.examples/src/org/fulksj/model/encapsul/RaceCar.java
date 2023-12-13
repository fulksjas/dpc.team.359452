package org.fulksj.model.encapsul;

public class RaceCar  extends Vehicle {

    public RaceCar(String name, String sponsor) {
        super(name);
    }

    public void startRacer() {
        setSpeed(90);
        this.race();
    }
}
