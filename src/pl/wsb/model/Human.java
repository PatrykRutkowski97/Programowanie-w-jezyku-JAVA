package pl.wsb.model;

import pl.wsb.model.compant.CarComparator;

import java.util.Arrays;
import java.util.Objects;

public class Human {

    private static final int cars = 2;
    private Animal pet;
    private Double salary;
    private double cash;
    public Car[] garage;
    protected Phone phone;
    public String firstName;
    public String lastName;

    public Human() {
        garage = new Car[cars];
    }

    public Human(String firstName, String lastName, Double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        garage = new Car[cars];
    }

    public Human(String firstName, String lastName, Double salary, Double cash, Animal pet) {
        this.salary = salary;
        this.cash = cash;
        this.pet = pet;
        garage = new Car[cars];
    }

    public Human(String firstName, String lastName, Double salary, Double cash, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.cash = cash;
        garage = new Car[garageSize];
    }

    public Double getSalary() {
        System.out.println("Wypłata: " + this.salary);
        return salary;
    }

    public void setSalary(double newSalary) {
        if(newSalary < 0) {
            System.err.println("Nie można podać ujemnej wartośći");
        } else {
            System.out.println("Nowe dane zostały wysłane");
            System.out.println("Proszę odebrać aneks do umowy");
            salary = newSalary;
        }
    }

    public Car getCar(int position) {
            return garage[position];
        }

    public void setCar(Car car, int carPosition) {
        if (car == null) {
            this.garage[carPosition] = null;
            System.out.println("Error! Car not exist");
        } else if (this.salary > car.getValue()) {
            this.garage[carPosition] = car;
            System.out.println("Congratulations " + this.firstName + "! You bought " + car.producer + " " + car.model + "for cash!");
        } else if (this.salary > car.getValue() / 12) {
            this.garage[carPosition] = car;
            System.out.println("Congratulations " + this.firstName + "! You bought " + car.producer + " " + car.model + " on instalments!");
        } else
            System.out.println("Sorry " + this.firstName + ".. You can't afford a car. You should change job or go to university.");


    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public double calculateSumOfCarsValue() {
        double sumOfValue = 0;
        for (Car car : garage
        ) {
            if (car != null)
                sumOfValue += car.getValue();
        }
        return sumOfValue;
    }

    public void sortGarageByOldCar() {
        Arrays.sort(garage, new CarComparator());
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public Animal getPet() {
        return pet;
    }

    public double getCash() {
        return cash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Objects.equals(pet, human.pet) &&
                Objects.equals(salary, human.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet, salary);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + salary + " " + cash + " " + Arrays.asList(garage);
    }
}
