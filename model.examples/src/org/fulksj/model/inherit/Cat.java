package org.fulksj.model.inherit;

public class Cat extends Mammal {
    public Cat(boolean hasFur, Integer numberLegs) {
        super(true, 4);
    }
    private boolean indoor;
    private String color;
}
