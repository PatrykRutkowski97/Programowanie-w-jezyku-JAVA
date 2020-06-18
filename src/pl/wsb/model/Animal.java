package pl.wsb.model;

import pl.wsb.model.creatures.Feedable;
import pl.wsb.model.creatures.Salleable;

import java.util.Objects;

public abstract class Animal implements Salleable, Feedable {

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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if(seller == null || buyer == null || price < 0){
            throw new IllegalArgumentException("Złe dane");
        }

        if(seller.getPet() != null || seller.getCar() != null)
        {
            if(buyer.getCash() >= 1000)
            {
                buyer.setCash(buyer.getCash() - 1000);
                seller.setCash(seller.getCash() + 1000);
                System.out.println("Transakacja przeprwoadzona. Kwota 1000 PLN");
            }
        }
    }
}
