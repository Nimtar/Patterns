package ru.vsu.amm.patterns.bridge;

public class IceBreath implements Breath {
    public IceBreath () {
        System.out.println("IceBreath constructor");
    }

    public void freeze () {
        System.out.println("FREEZING WITH ICE!");
    }
}
