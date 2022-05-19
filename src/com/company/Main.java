package com.company;

public class Main {

    public static void main(String[] args) {
        Medic medic = new Medic();

        Magic magic = new Magic();

        Warrior warrior = new Warrior();

        HavingSuperAbility[] abilities = {warrior, magic, medic};
        for (int i = 0; i < abilities.length; i++) {
            abilities[i].applySuperAbility();

        }

    }

}