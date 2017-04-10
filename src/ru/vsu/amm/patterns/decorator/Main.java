package ru.vsu.amm.patterns.decorator;

public class Main {
    public static void main (String[] args) {
        System.out.println(new MegaZord(new Zord()));
        System.out.println(new UltraZord(new Zord()));
        System.out.println(new MegaZord(new UltraZord(new Zord())));
        System.out.println(new UltraZord(new MegaZord(new Zord())));
    }
}
