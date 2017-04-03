package ru.vsu.amm.patterns.bridge;

public class Main {
    public static void main (String[] args) {
        Dragon icy = new IceFlame();
        Dragon firy = new NightHunter();
        Dragon chiny = new Lun();

        icy.breathe();
        firy.breathe();
        chiny.breathe();
    }
}
