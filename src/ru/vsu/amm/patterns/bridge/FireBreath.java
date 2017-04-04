package ru.vsu.amm.patterns.bridge;

public class FireBreath implements Breath {
    public FireBreath () {
        System.out.println("FireBreath constructor.");
    }

    public void incinerate () {
        System.out.println("INCINERATION WITH FIRE!");
    }
}
