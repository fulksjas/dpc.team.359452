package org.fulksj.model.poly;

public class Shotgun extends Gun {
   // need to make an override so the shotgun makes a bigger noise
    @Override
    public void shoot() {
        System.out.println("Shotgun goes: BaBOOM!");
    }
}
