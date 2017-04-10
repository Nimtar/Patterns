package ru.vsu.amm.patterns.memento;

import java.util.Random;

class Labyrinth {
    private AriadneThread ariadneThread = new AriadneThread();
    private byte passed = (byte)(new Random().nextInt(10));
    private boolean previousDead;
    private int currentTurn;

    boolean isPassed () {
        return passed <= currentTurn;
    }

    AriadneThread saveTurn () {
        return ariadneThread.windOff(currentTurn);
    }

    Labyrinth turn () {
        currentTurn++;
        return this;
    }

    boolean inDeadEnd () {
        if (previousDead) {
            return false;
        }
        previousDead = new Random().nextBoolean();
        return previousDead;
    }

    Labyrinth revertTo (AriadneThread ariadneThread) {
        currentTurn = ariadneThread == null ? 0 : ariadneThread.getTurn();
        return this;
    }
}
