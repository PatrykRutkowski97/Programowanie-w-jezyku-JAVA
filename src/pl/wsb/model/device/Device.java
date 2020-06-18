package pl.wsb.model.device;

public abstract class Device {
    protected String producer;
    protected String model;
    protected int yearOfProduction;

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
