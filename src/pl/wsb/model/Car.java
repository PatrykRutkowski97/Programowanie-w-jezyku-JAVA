package pl.wsb.model;

import pl.wsb.model.device.Device;

import java.util.Objects;

public abstract class Car extends Device {

    private double value;

    public Car(Double value) {
        this.value = value;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(producer, car.producer) &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(producer, model, producer, value);
    }

    @Override
    public void turnOn() {
        System.out.println("Odpalam samochod");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value='" + value + '\'' +
                '}';
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {

    }

    public abstract void refuel();
}
