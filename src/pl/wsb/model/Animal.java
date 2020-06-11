package pl.wsb.model;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(species, animal.species) &&
                Objects.equals(weight, animal.weight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(species, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "species='" + species + '\'' +
                ", weight=" + weight +
                '}';
    }
}
