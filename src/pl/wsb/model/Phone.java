package pl.wsb.model;

import pl.wsb.model.device.Device;

import java.net.URL;
import java.util.List;

public class Phone extends Device {

    private static final String address = "localhost";
    private static final String protocol = "HTTP";
    private static final String version = "1.0.0";


    @Override
    public void turnOn() {
        System.out.println("Uruchamiam telefon");
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

    public void installAnnApp(String appName) {
        System.out.println("Instaluje " + appName + " ...");
    }

    public void installAnnApp(String appName, double version) {
        System.out.println("Instaluje " + appName + ", version " + version + "...");
    }

    public void installAnnApp(String appName, double version, String server) {

    }

    public void installAnnApp(List<String> listApps) {

    }

    public void installAnnApp(URL address) {

    }
}
