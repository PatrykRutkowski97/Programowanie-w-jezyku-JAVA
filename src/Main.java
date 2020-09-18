import pl.wsb.model.*;

import java.net.MalformedURLException;

public class Main {
    public static void main(String[] args) {

        Human human2 = new Human("Janusz", "Nosacz", 400.0);
        human2.setCar(pasek);
        human2.setCar(pasek, 1);

        // przypadek 2
        Human human3 = new Human("Jan", "Sąsiad", 2500.0);
        human3.setCar(pasek);
        human3.setCar(pasek, 0);

        // przypadek 3
        Human human4 = new Human("Andrzej", "Bogacz", 20000.0);
        human4.setCar(pasek);
        human4.setCar(pasek, 0);

        System.out.println("----------------------------- ZADANIE 6 -----------------------------");

        @@ -90,8 +88,8 @@ public static void main(String[] args) throws MalformedURLException {
            Human buyer1 = new Human("Marcin", "Kowalski", 2000.0, 600.0);
            Human seller1 = new Human("Krzysztof", "Krawczyk", 35000.0, 2000.0, petForSale);
            Human buyer2 = new Human("Marcin", "Marciniak", 2000.0, 5500.0);
            Human seller2 = new Human("Tomasz", "Adamek", 40000.0, 1000.0, carForSale);

            Human seller2 = new Human("Tomasz", "Adamek", 40000.0, 1000.0, 2);
            seller2.setCar(carForSale, 1);

            System.out.println("\n-------- ANIMAL TRADE ---------");

            @@ -128,18 +126,18 @@ public static void main(String[] args) throws MalformedURLException {

                System.out.println("\nBefore transaction:" +
                        "\nBuyer cash: " + buyer2.getCash() +
                        "\nBuyer car: " + buyer2.getCar() +
                        "\nBuyer car: " + buyer2.getCar(0) +
                        "\nSeller cash: " + seller2.getCash() +
                        "\nSeller car: " + seller2.getCar() +
                        "\nSeller car: " + seller2.getCar(0) +
                        "\n");

                carForSale.sell(seller2, buyer2, 3000.0);

                System.out.println("\nAfter transaction:" +
                        "\nBuyer cash: " + buyer2.getCash() +
                        "\nBuyer car: " + buyer2.getCar() +
                        "\nBuyer car: " + buyer2.getCar(0) +
                        "\nSeller cash: " + seller2.getCash() +
                        "\nSeller car: " + seller2.getCar() +
                        "\nSeller car: " + seller2.getCar(0) +
                        "\n");


                @@ -215,6 +213,52 @@ public static void main(String[] args) throws MalformedURLException {
                    car1.refuel();


                    System.out.println("----------------------------- ZADANIE 11 -----------------------------");

                    Human humanA = new Human("Jan", "Nowak", 2000.0, 5000.0);
                    Human humanB = new Human("Adam", "Blady", 30000.0, 190000.0, 5);
                    Car carS1 = new LPG("Fiat", "Multipla", 135, "Blue", 2000.0, 1998);
                    Car carB2 = new Electric("BMW", "M5", 270, "Black Pearl", 222000.0, 2019);
                    Car carB3 = new LPG("Ford", "Fiesta", 190, "Yellow", 4000.0, 2005);
                    Car carWithoutOwner = new Electric("VW", "Golf", 210, "Blue", 11200.0, 2018);
                    humanA.setCar(carS1, 0);
                    humanA.setCar(carS2, 1);
                    humanB.setCar(carB1, 0);
                    humanB.setCar(carB2, 1);
                    humanB.setCar(carB3, 2);
                    humanB.setCar(carB4, 3);

                    System.out.println("\n\n---- car.sell() ----");
                    System.out.println("\n-- checking the case if the buyer does not own the car being sold: --");
                    carWithoutOwner.sell(humanA, humanB, 2000.0);

                    System.out.println("\n-- checking the case if the buyer has not a free garage space: --");
                    carB4.sell(humanB, humanA, 1000.0);

                    System.out.println("\n-- checking the case if the buyer does not have enough money: --");
                    carS2.sell(humanA, humanB, 200000.0);

                    System.out.println("\nSeller data before transaction: " + humanA);
                    System.out.println("Seller garage value: " + humanA.calculateSumOfCarsValue());
                    System.out.println("Buyer data before transaction: " + humanB);
                    System.out.println("Buyer garage value: " + humanB.calculateSumOfCarsValue() +"\n");

                    carS1.sell(humanA, humanB, 5000.0);

                    System.out.println("\nSeller data after transaction: " + humanA);
                    System.out.println("Seller garage value: " + humanA.calculateSumOfCarsValue());
                    System.out.println("Buyer data after transaction: " + humanB);
                    System.out.println("Buyer garage value: " + humanB.calculateSumOfCarsValue() +"");

                    System.out.println("\n\n---- sorting the garage by car year ----");
                    System.out.println("\nunsorted garage:");
                    System.out.println(Arrays.asList(humanB.garage));

                    System.out.println("\nsorted garage:");
                    humanB.sortGarageByOldCar();
                    System.out.println(Arrays.asList(humanB.garage));
    }
}

