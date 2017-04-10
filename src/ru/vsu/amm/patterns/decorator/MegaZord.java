package ru.vsu.amm.patterns.decorator;

public class MegaZord extends Zord {
    private Zord decorated;

    MegaZord (Zord decorated) {
        super();
        this.decorated = decorated;
    }

    @Override
    public String toString () {
        return "Mega" + decorated + "And he has the sword. ";
    }
}
