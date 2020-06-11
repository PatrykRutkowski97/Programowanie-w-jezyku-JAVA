package pl.wsb.model;

public class Animal {

    private String species;
    private Double weight;

    public Animal(String species) {
        weight = 10.0;
    }

    public void feed() {
        weight += 1;
    }

    public void takeForAWalk() {
        if(weight == 0) {
            throw new IllegalArgumentException("Zwierze nie żyje");
        } else {
            weight -= 1;
        }
    }
}
