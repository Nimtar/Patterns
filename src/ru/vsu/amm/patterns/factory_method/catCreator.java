package ru.vsu.amm.patterns.factory_method;

public class catCreator implements PetCreator {
    @Override
    public Pet factoryMethod () {
        return new Cat();
    }
}
