package com.company;

public class Magic extends Hero implements HavingSuperAbility{
    @Override
    public void applySuperAbility() {
        System.out.println("Magic used ability: Fire ball");
    }
}
