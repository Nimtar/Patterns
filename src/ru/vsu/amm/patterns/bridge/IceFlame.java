package ru.vsu.amm.patterns.bridge;

public class IceFlame implements  Dragon {
    private int bellyfull;
    private int bloodcurdliness;

    public IceFlame () {
        System.out.println("IceFlame constructor.");
    }
    @Override
    public void breathe () {
        bellyfull += 2;
        bloodcurdliness++;
    }
}
