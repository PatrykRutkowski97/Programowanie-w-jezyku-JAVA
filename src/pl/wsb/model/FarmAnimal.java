package pl.wsb.model;

import pl.wsb.model.creatures.Edbile;

public class FarmAnimal extends Animal implements Edbile {

    public FarmAnimal(String species) {
        super(species);
    }

    @Override
    public void beEaten() {

    }

    @Override
    public void feed(double foodWeight) {

    }
}
