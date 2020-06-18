package pl.wsb.model;

import pl.wsb.model.device.Device;

public class Phone extends Device {
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
}
