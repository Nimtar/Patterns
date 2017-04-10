package ru.vsu.amm.patterns.memento;

public class Main {
    public static void main (String[] args) {
        new Theseus(new Labyrinth()).passLabyrinth();
    }
}
