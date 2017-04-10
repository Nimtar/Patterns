package ru.vsu.amm.patterns.factory_method;

public class dogCreator implements PetCreator {
    @Override
    public Pet factoryMethod () {
        return new Dog();
    }
}
