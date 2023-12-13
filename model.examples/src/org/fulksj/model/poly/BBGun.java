package org.fulksj.model.poly;

public class BBGun extends Gun {
   // need to make an override so the shotgun makes a smalll noise
    @Override
    public void shoot() {
        System.out.println("BB Gun goes: plink!");
    }
}
