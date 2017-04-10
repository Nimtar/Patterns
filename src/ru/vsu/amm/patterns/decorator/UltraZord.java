package ru.vsu.amm.patterns.decorator;

public class UltraZord extends Zord {
    private Zord decorated;

    @Override
    public String toString () {
        return "Ultra" + decorated + "He is extremely cool! ";
    }

    UltraZord (Zord decorated) {
        super();
        this.decorated = decorated;
    }
}
