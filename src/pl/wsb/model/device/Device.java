package pl.wsb.model.device;

import pl.wsb.model.creatures.Salleable;

public abstract class Device implements Salleable {
    protected String producer;
    protected String model;
    protected int yearOfProduction;
    public Double value;
    public abstract void turnOn();

    @Override
    public String toString() {
        return "Device{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
