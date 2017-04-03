package ru.vsu.amm.patterns.bridge;

public class Lun implements Dragon {
    private Breath breath = new WisdomBreath();
    public Lun () {
        System.out.println("Lun constructor.");
    }
    @Override
    public void breathe () {

    }
}
