package ru.vsu.amm.patterns.memento;

import java.util.Deque;
import java.util.LinkedList;

class Theseus {
    private final Labyrinth labyrinth;
    private final Deque<AriadneThread> AriadneThread;

    Theseus (Labyrinth labyrinth) {
        this.labyrinth = labyrinth;
        this.AriadneThread = new LinkedList<>();
        this.AriadneThread.add(labyrinth.saveTurn());
    }

    Theseus passLabyrinth () {
        while (!labyrinth.isPassed()) {
            labyrinth.turn();
            String message = "Turn on. ";
            if (labyrinth.inDeadEnd()) {
                labyrinth.revertTo(AriadneThread.pollLast());
                message += "It's dead end. Revert! ";
            } else {
                AriadneThread.add(labyrinth.saveTurn());
            }
            System.out.println(message);
        }
        return this;
    }
}
