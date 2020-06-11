package pl.wsb.model;

import java.util.Objects;

public class Car {

    private final String brand;
    private final String model;
    private final String producer;
    private final String value;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(brand, car.brand) &&
                Objects.equals(model, car.model) &&
                Objects.equals(producer, car.producer) &&
                Objects.equals(value, car.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, producer, value);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", producer='" + producer + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}
