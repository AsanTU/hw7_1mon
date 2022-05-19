package com.company;

public class Medic extends Hero implements HavingSuperAbility{

    @Override
    public void applySuperAbility() {
        System.out.println("Medic used ability: + 10HP");
    }
}
