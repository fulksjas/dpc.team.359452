package org.fulksj.model.inherit;

public class Mammal {
    private final boolean hasFur;
    private final Integer numberLegs;

    //sort of doing some encapsulation

    public Mammal(boolean hasFur, Integer numberLegs) {
        this.hasFur = hasFur;
        this.numberLegs = numberLegs;
    }
}
