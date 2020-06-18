package pl.wsb.model.creatures;

import pl.wsb.model.Human;

public interface Salleable {
    void sell(Human seller, Human buyer, Double price);
}
