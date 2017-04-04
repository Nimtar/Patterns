package ru.vsu.amm.patterns.bridge;

public class IceFlame implements  Dragon {
    private Breath breath = new IceBreath();
    private int bloodcurdliness;

    public IceFlame () {
        System.out.println("IceFlame constructor.");
    }
    @Override
    public void breathe () {
        ((IceBreath)breath).freeze();
        bloodcurdliness++;
    }
}
