package pl.wsb.model;

import java.util.Objects;

public class Human {

    private Animal pet;
    private Car car;
    private Double salary;
    private double cash;

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

    public Car getCar() {
        return car;
    }

    public void setCar() {
        if(salary > 50000) {
            System.out.println("Udało się kupić za gotówkę");
        } else if(salary > (50000/12)) {
            System.out.println("Udało się kupić na kredyt");
        } else {
            System.out.println("Nie stać cię mordo");
        }
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public void setCar(Car car) {
        this.car = car;
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
                Objects.equals(car, human.car) &&
                Objects.equals(salary, human.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pet, car, salary);
    }

    @Override
    public String toString() {
        return "Human{" +
                "pet=" + pet +
                ", car=" + car +
                ", salary=" + salary +
                '}';
    }
}
