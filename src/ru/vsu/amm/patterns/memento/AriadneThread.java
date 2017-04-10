package ru.vsu.amm.patterns.memento;

public class AriadneThread {

    private int turn;

    int getTurn () {
        return turn;
    }

    public void setTurn (int turn) {
        this.turn = turn;
    }

    AriadneThread windOff (int turn) {
        this.turn = turn;
        return this;
    }
}
