package ru.vsu.amm.patterns.bridge;

public class NightHunter implements  Dragon {
    private Breath breath = new FireBreath();
    public NightHunter () {
        System.out.println("NightHunter constructor.");
    }
    @Override
    public void breathe () {
        ((FireBreath) breath).incinerate();
    }
}
