package ru.vsu.amm.patterns.factory_method;

public class Main {
    public static void main (String[] args) {
        PetCreator[] creators = { new dogCreator(), new catCreator() };
        for (PetCreator c : creators) {
            System.out.println(c.factoryMethod().sayHi());
        }
    }
}
