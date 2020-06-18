package pl.wsb.model;

import pl.wsb.model.device.Device;

public class Phone extends Device {
    @Override
    public void turnOn() {
        System.out.println("Uruchamiam telefon");
    }
}
